package n6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f20492a;
    public DialogInterface.OnCancelListener f20493b;
    public AlertDialog f20494c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f20493b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f20492a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f20494c == null) {
                Activity activity = getActivity();
                q6.m.g(activity);
                this.f20494c = new AlertDialog.Builder(activity).create();
            }
            return this.f20494c;
        }
        return dialog;
    }
}
