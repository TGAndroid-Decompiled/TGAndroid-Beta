package k6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f15011a;
    public DialogInterface.OnCancelListener f15012b;
    public AlertDialog f15013c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f15012b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f15011a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f15013c == null) {
                Activity activity = getActivity();
                n6.l.h(activity);
                this.f15013c = new AlertDialog.Builder(activity).create();
            }
            return this.f15013c;
        }
        return dialog;
    }
}
