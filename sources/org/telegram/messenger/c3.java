package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
public final class c3 implements OnSuccessListener {
    public final int f14899a;
    public final String f14900b;
    public final String f14901c;
    public final e3 d;

    public c3(String str, String str2, e3 e3Var, int i10) {
        this.f14899a = i10;
        this.f14900b = str;
        this.f14901c = str2;
        this.d = e3Var;
    }

    @Override
    public final void onSuccess(Object obj) {
        RecaptchaAction recaptchaAction;
        int i10 = this.f14899a;
        e3 e3Var = this.d;
        String str = this.f14901c;
        String str2 = this.f14900b;
        switch (i10) {
            case 0:
                RecaptchaTasksClient recaptchaTasksClient = (RecaptchaTasksClient) obj;
                str2.getClass();
                char c10 = 65535;
                switch (str2.hashCode()) {
                    case -1849137896:
                        if (str2.equals("SIGNUP")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -902467304:
                        if (str2.equals("signup")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 72611657:
                        if (str2.equals("LOGIN")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 103149417:
                        if (str2.equals("login")) {
                            c10 = 3;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                    case 1:
                        recaptchaAction = RecaptchaAction.SIGNUP;
                        break;
                    case 2:
                    case 3:
                        recaptchaAction = RecaptchaAction.LOGIN;
                        break;
                    default:
                        recaptchaAction = RecaptchaAction.custom(str2);
                        break;
                }
                recaptchaTasksClient.executeTask(recaptchaAction).addOnSuccessListener(new c3(str2, str, e3Var, 1)).addOnFailureListener(new d3(e3Var, 1));
                return;
            default:
                String str3 = (String) obj;
                a1.g.z(str3, a1.g.v("CaptchaController: got token for {action=", str2, ", key_id=", str, "}: "));
                if (str3 == null) {
                    e3Var.a("RECAPTCHA_FAILED_TOKEN_NULL");
                    return;
                } else {
                    e3Var.a(str3);
                    return;
                }
        }
    }
}
