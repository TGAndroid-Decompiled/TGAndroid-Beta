package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
public final class we3 implements DialogInterface.OnCancelListener {
    public final ze3 a;

    public we3(ze3 ze3Var) {
        this.a = ze3Var;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        ze3 ze3Var = this.a;
        Dialog dialog = ze3Var.w0;
        if (dialog != null) {
            ze3Var.onCancel(dialog);
        }
    }
}
