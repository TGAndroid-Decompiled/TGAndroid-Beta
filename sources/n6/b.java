package n6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f21419a;
    public DialogInterface.OnCancelListener f21420b;
    public AlertDialog f21421c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f21420b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f21419a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f21421c == null) {
                Activity activity = getActivity();
                q6.m.h(activity);
                this.f21421c = new AlertDialog.Builder(activity).create();
            }
            return this.f21421c;
        }
        return dialog;
    }
}
