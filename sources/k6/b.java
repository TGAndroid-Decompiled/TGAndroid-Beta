package k6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f12347a;
    public DialogInterface.OnCancelListener f12348b;
    public AlertDialog f12349c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f12348b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f12347a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f12349c == null) {
                Activity activity = getActivity();
                n6.l.h(activity);
                this.f12349c = new AlertDialog.Builder(activity).create();
            }
            return this.f12349c;
        }
        return dialog;
    }
}
