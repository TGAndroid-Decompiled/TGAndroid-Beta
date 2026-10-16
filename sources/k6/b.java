package k6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f14164a;
    public DialogInterface.OnCancelListener f14165b;
    public AlertDialog f14166c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f14165b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f14164a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f14166c == null) {
                Activity activity = getActivity();
                n6.l.h(activity);
                this.f14166c = new AlertDialog.Builder(activity).create();
            }
            return this.f14166c;
        }
        return dialog;
    }
}
