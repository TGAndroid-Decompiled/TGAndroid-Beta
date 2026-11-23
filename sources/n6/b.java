package n6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f21518a;
    public DialogInterface.OnCancelListener f21519b;
    public AlertDialog f21520c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f21519b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f21518a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f21520c == null) {
                Activity activity = getActivity();
                q6.m.h(activity);
                this.f21520c = new AlertDialog.Builder(activity).create();
            }
            return this.f21520c;
        }
        return dialog;
    }
}
