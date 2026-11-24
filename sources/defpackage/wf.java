package defpackage;

import android.content.DialogInterface;
import android.widget.EditText;
public final class wf implements DialogInterface.OnDismissListener {
    public final byte a;
    public final EditText b;

    public wf(EditText editText, byte b) {
        this.a = b;
        this.b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        EditText editText = this.b;
        switch (b) {
            case 0:
                gm.t1(editText);
                return;
            default:
                gm.t1(editText);
                return;
        }
    }
}
