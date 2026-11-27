package defpackage;

import com.google.android.gms.tasks.OnFailureListener;
public final class eb1 implements OnFailureListener {
    public final byte a;
    public final gb1 b;

    public eb1(gb1 gb1Var, byte b) {
        this.a = b;
        this.b = gb1Var;
    }

    @Override
    public final void onFailure(Exception exc) {
        byte b = this.a;
        String str = "MSG_NULL";
        gb1 gb1Var = this.b;
        switch (b) {
            case 0:
                cc4.e("CaptchaController: getTasksClient failure", exc);
                StringBuilder sb = new StringBuilder("RECAPTCHA_FAILED_GETCLIENT_EXCEPTION_");
                if (exc == null) {
                    str = "NULL";
                } else if (exc.getMessage() != null) {
                    str = exc.getMessage().replaceAll(" ", "_").toUpperCase();
                }
                sb.append(str);
                gb1Var.a(sb.toString());
                return;
            default:
                cc4.e("CaptchaController: executeTask failure", exc);
                StringBuilder sb2 = new StringBuilder("RECAPTCHA_FAILED_TASK_EXCEPTION_");
                if (exc == null) {
                    str = "NULL";
                } else if (exc.getMessage() != null) {
                    str = exc.getMessage().replaceAll(" ", "_").toUpperCase();
                }
                sb2.append(str);
                gb1Var.a(sb2.toString());
                return;
        }
    }
}
