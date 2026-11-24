package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
public class wdb extends mg3 {
    public AlertDialog B0;
    public DialogInterface.OnCancelListener C0;
    public AlertDialog D0;

    @Override
    public final Dialog P() {
        AlertDialog alertDialog = this.B0;
        if (alertDialog == null) {
            this.s0 = false;
            AlertDialog alertDialog2 = this.D0;
            if (alertDialog2 == null) {
                Context n = n();
                ite.h(n);
                AlertDialog create = new AlertDialog.Builder(n).create();
                this.D0 = create;
                return create;
            }
            return alertDialog2;
        }
        return alertDialog;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.C0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
