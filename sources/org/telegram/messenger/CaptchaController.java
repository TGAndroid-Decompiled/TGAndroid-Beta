package org.telegram.messenger;

import android.app.Activity;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
public class CaptchaController {
    public static HashMap<Integer, Request> currentRequests;

    public static class Request {
        public String action;
        public int currentAccount;
        public String key_id;
        public HashSet<Integer> requestTokens = new HashSet<>();

        public Request(int i10, String str, String str2) {
            this.currentAccount = i10;
            this.action = str;
            this.key_id = str2;
        }

        public void done(String str) {
            CaptchaController.currentRequests.remove(Integer.valueOf(hashCode()));
            int[] iArr = new int[this.requestTokens.size()];
            Iterator<Integer> it = this.requestTokens.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                iArr[i10] = it.next().intValue();
                i10++;
            }
            ConnectionsManager.getInstance(this.currentAccount);
            ConnectionsManager.native_receivedCaptchaResult(this.currentAccount, iArr, str);
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.currentAccount), this.action, this.key_id);
        }
    }

    private static String formatException(Exception exc) {
        if (exc == null) {
            return "NULL";
        }
        if (exc.getMessage() == null) {
            return "MSG_NULL";
        }
        return exc.getMessage().replaceAll(" ", "_").toUpperCase();
    }

    private static RecaptchaAction getAction(String str) {
        str.getClass();
        char c3 = 65535;
        switch (str.hashCode()) {
            case -1849137896:
                if (str.equals("SIGNUP")) {
                    c3 = 0;
                    break;
                }
                break;
            case -902467304:
                if (str.equals("signup")) {
                    c3 = 1;
                    break;
                }
                break;
            case 72611657:
                if (str.equals("LOGIN")) {
                    c3 = 2;
                    break;
                }
                break;
            case 103149417:
                if (str.equals("login")) {
                    c3 = 3;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
            case 1:
                return RecaptchaAction.SIGNUP;
            case 2:
            case 3:
                return RecaptchaAction.LOGIN;
            default:
                return RecaptchaAction.custom(str);
        }
    }

    public static void lambda$request$0(String str, String str2, Request request, String str3) {
        org.telegram.ui.th.v(str3, org.telegram.ui.th.k("CaptchaController: got token for {action=", str, ", key_id=", str2, "}: "));
        if (str3 == null) {
            request.done("RECAPTCHA_FAILED_TOKEN_NULL");
        } else {
            request.done(str3);
        }
    }

    public static void lambda$request$1(Request request, Exception exc) {
        FileLog.e("CaptchaController: executeTask failure", exc);
        request.done("RECAPTCHA_FAILED_TASK_EXCEPTION_" + formatException(exc));
    }

    public static void lambda$request$2(String str, String str2, Request request, RecaptchaTasksClient recaptchaTasksClient) {
        recaptchaTasksClient.executeTask(getAction(str)).addOnSuccessListener(new q0(str, str2, request, 1)).addOnFailureListener(new r0(request, 1));
    }

    public static void lambda$request$3(Request request, Exception exc) {
        FileLog.e("CaptchaController: getTasksClient failure", exc);
        request.done("RECAPTCHA_FAILED_GETCLIENT_EXCEPTION_" + formatException(exc));
    }

    public static void request(int i10, int i11, String str, String str2) {
        if (currentRequests == null) {
            currentRequests = new HashMap<>();
        }
        Request request = currentRequests.get(Integer.valueOf(Objects.hash(Integer.valueOf(i10), str, str2)));
        if (request != null) {
            request.requestTokens.add(Integer.valueOf(i11));
            return;
        }
        Request request2 = new Request(i10, str, str2);
        request2.requestTokens.add(Integer.valueOf(i11));
        Activity activity = AndroidUtilities.getActivity();
        if (activity == null) {
            FileLog.e("CaptchaController: no activity found");
            request2.done("RECAPTCHA_FAILED_NO_ACTIVITY");
            return;
        }
        Recaptcha.getTasksClient(activity.getApplication(), str2).addOnSuccessListener(new q0(str, str2, request2, 0)).addOnFailureListener(new r0(request2, 0));
    }
}
