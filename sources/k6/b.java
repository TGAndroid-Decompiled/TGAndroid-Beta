package k6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f10928a;
    public DialogInterface.OnCancelListener f10929b;
    public AlertDialog f10930c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f10929b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f10928a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f10930c == null) {
                Activity activity = getActivity();
                n6.l.g(activity);
                this.f10930c = new AlertDialog.Builder(activity).create();
            }
            return this.f10930c;
        }
        return dialog;
    }
}
