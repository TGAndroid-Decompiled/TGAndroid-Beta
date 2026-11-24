package defpackage;

import com.google.android.gms.tasks.OnFailureListener;
public final class ec1 implements OnFailureListener {
    public final byte a;
    public final gc1 b;

    public ec1(gc1 gc1Var, byte b) {
        this.a = b;
        this.b = gc1Var;
    }

    @Override
    public final void onFailure(Exception exc) {
        byte b = this.a;
        String str = "MSG_NULL";
        gc1 gc1Var = this.b;
        switch (b) {
            case 0:
                fc4.e("CaptchaController: getTasksClient failure", exc);
                StringBuilder sb = new StringBuilder("RECAPTCHA_FAILED_GETCLIENT_EXCEPTION_");
                if (exc == null) {
                    str = "NULL";
                } else if (exc.getMessage() != null) {
                    str = exc.getMessage().replaceAll(" ", "_").toUpperCase();
                }
                sb.append(str);
                gc1Var.a(sb.toString());
                return;
            default:
                fc4.e("CaptchaController: executeTask failure", exc);
                StringBuilder sb2 = new StringBuilder("RECAPTCHA_FAILED_TASK_EXCEPTION_");
                if (exc == null) {
                    str = "NULL";
                } else if (exc.getMessage() != null) {
                    str = exc.getMessage().replaceAll(" ", "_").toUpperCase();
                }
                sb2.append(str);
                gc1Var.a(sb2.toString());
                return;
        }
    }
}
