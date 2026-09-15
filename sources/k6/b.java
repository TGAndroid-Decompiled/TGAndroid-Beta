package k6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f13501a;
    public DialogInterface.OnCancelListener f13502b;
    public AlertDialog f13503c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f13502b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f13501a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f13503c == null) {
                Activity activity = getActivity();
                n6.l.h(activity);
                this.f13503c = new AlertDialog.Builder(activity).create();
            }
            return this.f13503c;
        }
        return dialog;
    }
}
