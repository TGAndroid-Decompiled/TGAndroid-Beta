package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
public final class jg3 implements DialogInterface.OnCancelListener {
    public final mg3 a;

    public jg3(mg3 mg3Var) {
        this.a = mg3Var;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        mg3 mg3Var = this.a;
        Dialog dialog = mg3Var.w0;
        if (dialog != null) {
            mg3Var.onCancel(dialog);
        }
    }
}
