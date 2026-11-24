package defpackage;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class he4 implements DialogInterface.OnShowListener {
    public final byte a;
    public final EditTextBoldCursor b;

    public he4(EditTextBoldCursor editTextBoldCursor, byte b) {
        this.a = b;
        this.b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        EditTextBoldCursor editTextBoldCursor = this.b;
        switch (b) {
            case 0:
                gm.c3(new l(editTextBoldCursor, (byte) 4));
                return;
            case 1:
                editTextBoldCursor.requestFocus();
                gm.E3(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                return;
            case 2:
                editTextBoldCursor.requestFocus();
                gm.E3(editTextBoldCursor);
                return;
            default:
                gm.c3(new l(editTextBoldCursor, (byte) 10));
                return;
        }
    }
}
