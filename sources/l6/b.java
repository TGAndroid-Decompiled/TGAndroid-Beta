package l6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f16924a;
    public DialogInterface.OnCancelListener f16925b;
    public AlertDialog f16926c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f16925b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f16924a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f16926c == null) {
                Activity activity = getActivity();
                o6.l.h(activity);
                this.f16926c = new AlertDialog.Builder(activity).create();
            }
            return this.f16926c;
        }
        return dialog;
    }
}
