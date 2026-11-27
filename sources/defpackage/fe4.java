package defpackage;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fe4 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final EditTextBoldCursor b;

    public fe4(EditTextBoldCursor editTextBoldCursor, byte b) {
        this.a = b;
        this.b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        EditTextBoldCursor editTextBoldCursor = this.b;
        switch (b) {
            case 0:
                hl.t1(editTextBoldCursor);
                return;
            case 1:
                hl.t1(editTextBoldCursor);
                return;
            case 2:
                hl.t1(editTextBoldCursor);
                return;
            default:
                hl.t1(editTextBoldCursor);
                return;
        }
    }
}
