package k6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
public class b extends DialogFragment {
    public Dialog f14808a;
    public DialogInterface.OnCancelListener f14809b;
    public AlertDialog f14810c;

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f14809b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f14808a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f14810c == null) {
                Activity activity = getActivity();
                n6.l.h(activity);
                this.f14810c = new AlertDialog.Builder(activity).create();
            }
            return this.f14810c;
        }
        return dialog;
    }
}
