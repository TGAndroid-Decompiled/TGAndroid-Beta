package k6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f14698a;
    public DialogInterface.OnCancelListener f14699b;
    public AlertDialog f14700c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f14699b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f14698a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f14700c == null) {
                Activity activity = getActivity();
                n6.m.h(activity);
                this.f14700c = new AlertDialog.Builder(activity).create();
            }
            return this.f14700c;
        }
        return dialog;
    }
}
