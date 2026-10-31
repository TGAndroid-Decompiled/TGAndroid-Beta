package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
public final class d3 implements OnFailureListener {
    public final int f15176a;
    public final e3 f15177b;

    public d3(e3 e3Var, int i10) {
        this.f15176a = i10;
        this.f15177b = e3Var;
    }

    @Override
    public final void onFailure(Exception exc) {
        String upperCase;
        String upperCase2;
        switch (this.f15176a) {
            case 0:
                f8.e("CaptchaController: getTasksClient failure", exc);
                StringBuilder sb2 = new StringBuilder("RECAPTCHA_FAILED_GETCLIENT_EXCEPTION_");
                if (exc == null) {
                    upperCase = "NULL";
                } else if (exc.getMessage() == null) {
                    upperCase = "MSG_NULL";
                } else {
                    upperCase = exc.getMessage().replaceAll(" ", "_").toUpperCase();
                }
                sb2.append(upperCase);
                this.f15177b.a(sb2.toString());
                return;
            default:
                f8.e("CaptchaController: executeTask failure", exc);
                StringBuilder sb3 = new StringBuilder("RECAPTCHA_FAILED_TASK_EXCEPTION_");
                if (exc == null) {
                    upperCase2 = "NULL";
                } else if (exc.getMessage() == null) {
                    upperCase2 = "MSG_NULL";
                } else {
                    upperCase2 = exc.getMessage().replaceAll(" ", "_").toUpperCase();
                }
                sb3.append(upperCase2);
                this.f15177b.a(sb3.toString());
                return;
        }
    }
}
