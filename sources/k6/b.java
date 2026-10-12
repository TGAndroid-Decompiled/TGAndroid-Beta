package k6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f14695a;
    public DialogInterface.OnCancelListener f14696b;
    public AlertDialog f14697c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f14696b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f14695a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f14697c == null) {
                Activity activity = getActivity();
                n6.m.h(activity);
                this.f14697c = new AlertDialog.Builder(activity).create();
            }
            return this.f14697c;
        }
        return dialog;
    }
}
