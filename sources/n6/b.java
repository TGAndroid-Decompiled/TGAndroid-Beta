package n6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f20489a;
    public DialogInterface.OnCancelListener f20490b;
    public AlertDialog f20491c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f20490b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f20489a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f20491c == null) {
                Activity activity = getActivity();
                q6.m.g(activity);
                this.f20491c = new AlertDialog.Builder(activity).create();
            }
            return this.f20491c;
        }
        return dialog;
    }
}
