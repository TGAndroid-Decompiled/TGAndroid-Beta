package k6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f13491a;
    public DialogInterface.OnCancelListener f13492b;
    public AlertDialog f13493c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f13492b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f13491a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f13493c == null) {
                Activity activity = getActivity();
                n6.l.h(activity);
                this.f13493c = new AlertDialog.Builder(activity).create();
            }
            return this.f13493c;
        }
        return dialog;
    }
}
