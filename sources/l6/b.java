package l6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f16923a;
    public DialogInterface.OnCancelListener f16924b;
    public AlertDialog f16925c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f16924b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f16923a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f16925c == null) {
                Activity activity = getActivity();
                o6.l.h(activity);
                this.f16925c = new AlertDialog.Builder(activity).create();
            }
            return this.f16925c;
        }
        return dialog;
    }
}
