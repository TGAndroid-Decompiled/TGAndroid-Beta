package org.telegram.messenger;

import android.app.Activity;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.SQLite.SQLitePreparedStatement$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;

public class CaptchaController {
    public static HashMap<Integer, Request> currentRequests;

    public static class Request {
        public String action;
        public int currentAccount;
        public String key_id;
        public HashSet<Integer> requestTokens = new HashSet<>();

        public Request(int i, String str, String str2) {
            this.currentAccount = i;
            this.action = str;
            this.key_id = str2;
        }

        public void done(String str) {
            CaptchaController.currentRequests.remove(Integer.valueOf(hashCode()));
            int[] iArr = new int[this.requestTokens.size()];
            Iterator<Integer> it = this.requestTokens.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().intValue();
                i++;
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
        return exc.getMessage() == null ? "MSG_NULL" : exc.getMessage().replaceAll(" ", "_").toUpperCase();
    }

    private static RecaptchaAction getAction(String str) {
        str.getClass();
        switch (str) {
            case "SIGNUP":
            case "signup":
                return RecaptchaAction.SIGNUP;
            case "LOGIN":
            case "login":
                return RecaptchaAction.LOGIN;
            default:
                return RecaptchaAction.custom(str);
        }
    }

    public static void lambda$request$0(String str, String str2, Request request, String str3) {
        SQLitePreparedStatement$$ExternalSyntheticOutline0.m(str3, RendererCapabilities.CC.m("CaptchaController: got token for {action=", str, ", key_id=", str2, "}: "));
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
        recaptchaTasksClient.executeTask(getAction(str)).addOnSuccessListener(new CaptchaController$$ExternalSyntheticLambda0(str, str2, request, 1)).addOnFailureListener(new CaptchaController$$ExternalSyntheticLambda1(request, 1));
    }

    public static void lambda$request$3(Request request, Exception exc) {
        FileLog.e("CaptchaController: getTasksClient failure", exc);
        request.done("RECAPTCHA_FAILED_GETCLIENT_EXCEPTION_" + formatException(exc));
    }

    public static void request(int i, int i2, String str, String str2) {
        int i3 = 0;
        if (currentRequests == null) {
            currentRequests = new HashMap<>();
        }
        Request request = currentRequests.get(Integer.valueOf(Objects.hash(Integer.valueOf(i), str, str2)));
        if (request != null) {
            request.requestTokens.add(Integer.valueOf(i2));
            return;
        }
        Request request2 = new Request(i, str, str2);
        request2.requestTokens.add(Integer.valueOf(i2));
        Activity activity = AndroidUtilities.getActivity();
        if (activity != null) {
            Recaptcha.getTasksClient(activity.getApplication(), str2).addOnSuccessListener(new CaptchaController$$ExternalSyntheticLambda0(str, str2, request2, i3)).addOnFailureListener(new CaptchaController$$ExternalSyntheticLambda1(request2, i3));
        } else {
            FileLog.e("CaptchaController: no activity found");
            request2.done("RECAPTCHA_FAILED_NO_ACTIVITY");
        }
    }
}
