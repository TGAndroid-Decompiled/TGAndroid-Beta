package n6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f21422a;
    public DialogInterface.OnCancelListener f21423b;
    public AlertDialog f21424c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f21423b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f21422a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f21424c == null) {
                Activity activity = getActivity();
                q6.m.h(activity);
                this.f21424c = new AlertDialog.Builder(activity).create();
            }
            return this.f21424c;
        }
        return dialog;
    }
}
