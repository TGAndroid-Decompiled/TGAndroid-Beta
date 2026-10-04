package k6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f14666a;
    public DialogInterface.OnCancelListener f14667b;
    public AlertDialog f14668c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f14667b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f14666a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f14668c == null) {
                Activity activity = getActivity();
                n6.l.h(activity);
                this.f14668c = new AlertDialog.Builder(activity).create();
            }
            return this.f14668c;
        }
        return dialog;
    }
}
