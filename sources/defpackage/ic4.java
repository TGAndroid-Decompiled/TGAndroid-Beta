package defpackage;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ic4 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final EditTextBoldCursor b;

    public ic4(EditTextBoldCursor editTextBoldCursor, byte b) {
        this.a = b;
        this.b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        EditTextBoldCursor editTextBoldCursor = this.b;
        switch (b) {
            case 0:
                gl.t1(editTextBoldCursor);
                return;
            case 1:
                gl.t1(editTextBoldCursor);
                return;
            case 2:
                gl.t1(editTextBoldCursor);
                return;
            default:
                gl.t1(editTextBoldCursor);
                return;
        }
    }
}
