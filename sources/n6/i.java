package n6;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.p;
public class i extends p {
    public Dialog B0;
    public DialogInterface.OnCancelListener C0;
    public AlertDialog D0;

    @Override
    public final Dialog O() {
        Dialog dialog = this.B0;
        if (dialog == null) {
            this.f2377s0 = false;
            if (this.D0 == null) {
                Context n10 = n();
                q6.m.h(n10);
                this.D0 = new AlertDialog.Builder(n10).create();
            }
            return this.D0;
        }
        return dialog;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.C0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
