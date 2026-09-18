package k6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f13504a;
    public DialogInterface.OnCancelListener f13505b;
    public AlertDialog f13506c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f13505b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f13504a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f13506c == null) {
                Activity activity = getActivity();
                n6.l.h(activity);
                this.f13506c = new AlertDialog.Builder(activity).create();
            }
            return this.f13506c;
        }
        return dialog;
    }
}
