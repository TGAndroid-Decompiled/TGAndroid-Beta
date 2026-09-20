package k6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f13503a;
    public DialogInterface.OnCancelListener f13504b;
    public AlertDialog f13505c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f13504b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f13503a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f13505c == null) {
                Activity activity = getActivity();
                n6.l.h(activity);
                this.f13505c = new AlertDialog.Builder(activity).create();
            }
            return this.f13505c;
        }
        return dialog;
    }
}
