package n6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f21425a;
    public DialogInterface.OnCancelListener f21426b;
    public AlertDialog f21427c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f21426b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f21425a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f21427c == null) {
                Activity activity = getActivity();
                q6.m.h(activity);
                this.f21427c = new AlertDialog.Builder(activity).create();
            }
            return this.f21427c;
        }
        return dialog;
    }
}
