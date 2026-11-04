package m6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f19180a;
    public DialogInterface.OnCancelListener f19181b;
    public AlertDialog f19182c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f19181b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f19180a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f19182c == null) {
                Activity activity = getActivity();
                p6.m.g(activity);
                this.f19182c = new AlertDialog.Builder(activity).create();
            }
            return this.f19182c;
        }
        return dialog;
    }
}
