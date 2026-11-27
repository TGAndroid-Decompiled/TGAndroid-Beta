package defpackage;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class aya implements Runnable {
    public final byte a;
    public final EditTextBoldCursor b;
    public final nx0[] c;

    public aya(nx0[] nx0VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.a = (byte) 0;
        this.c = nx0VarArr;
        this.b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        byte b = this.a;
        nx0[] nx0VarArr = this.c;
        EditTextBoldCursor editTextBoldCursor = this.b;
        switch (b) {
            case 0:
                nx0VarArr[0].w0(true);
                editTextBoldCursor.requestFocus();
                hl.c3(new l(editTextBoldCursor, (byte) 9));
                return;
            case 1:
                hl.t1(editTextBoldCursor);
                nx0VarArr[0].dismiss();
                return;
            default:
                hl.t1(editTextBoldCursor);
                nx0VarArr[0].dismiss();
                return;
        }
    }

    public aya(EditTextBoldCursor editTextBoldCursor, nx0[] nx0VarArr, byte b) {
        this.a = b;
        this.b = editTextBoldCursor;
        this.c = nx0VarArr;
    }
}
