package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class x34 extends DialogFragment {
    public AlertDialog a;
    public DialogInterface.OnCancelListener b;
    public AlertDialog c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.a;
        if (alertDialog == null) {
            setShowsDialog(false);
            AlertDialog alertDialog2 = this.c;
            if (alertDialog2 == null) {
                Activity activity = getActivity();
                fre.h(activity);
                AlertDialog create = new AlertDialog.Builder(activity).create();
                this.c = create;
                return create;
            }
            return alertDialog2;
        }
        return alertDialog;
    }
}
