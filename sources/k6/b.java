package k6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f10929a;
    public DialogInterface.OnCancelListener f10930b;
    public AlertDialog f10931c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f10930b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f10929a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f10931c == null) {
                Activity activity = getActivity();
                n6.l.g(activity);
                this.f10931c = new AlertDialog.Builder(activity).create();
            }
            return this.f10931c;
        }
        return dialog;
    }
}
