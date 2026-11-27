package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
public final class qf3 implements DialogInterface.OnCancelListener {
    public final tf3 a;

    public qf3(tf3 tf3Var) {
        this.a = tf3Var;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        tf3 tf3Var = this.a;
        Dialog dialog = tf3Var.w0;
        if (dialog != null) {
            tf3Var.onCancel(dialog);
        }
    }
}
