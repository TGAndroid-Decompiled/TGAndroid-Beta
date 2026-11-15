package n6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f21061a;
    public DialogInterface.OnCancelListener f21062b;
    public AlertDialog f21063c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f21062b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f21061a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f21063c == null) {
                Activity activity = getActivity();
                q6.m.g(activity);
                this.f21063c = new AlertDialog.Builder(activity).create();
            }
            return this.f21063c;
        }
        return dialog;
    }
}
