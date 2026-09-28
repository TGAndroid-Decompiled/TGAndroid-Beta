package k6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f13489a;
    public DialogInterface.OnCancelListener f13490b;
    public AlertDialog f13491c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f13490b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f13489a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f13491c == null) {
                Activity activity = getActivity();
                n6.l.h(activity);
                this.f13491c = new AlertDialog.Builder(activity).create();
            }
            return this.f13491c;
        }
        return dialog;
    }
}
