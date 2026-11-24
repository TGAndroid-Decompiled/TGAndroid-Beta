package defpackage;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class xta implements Runnable {
    public final byte a;
    public final EditTextBoldCursor b;
    public final fx0[] c;

    public xta(fx0[] fx0VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.a = (byte) 0;
        this.c = fx0VarArr;
        this.b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        byte b = this.a;
        fx0[] fx0VarArr = this.c;
        EditTextBoldCursor editTextBoldCursor = this.b;
        switch (b) {
            case 0:
                fx0VarArr[0].v0(true);
                editTextBoldCursor.requestFocus();
                gl.c3(new l(editTextBoldCursor, (byte) 9));
                return;
            case 1:
                gl.t1(editTextBoldCursor);
                fx0VarArr[0].dismiss();
                return;
            default:
                gl.t1(editTextBoldCursor);
                fx0VarArr[0].dismiss();
                return;
        }
    }

    public xta(EditTextBoldCursor editTextBoldCursor, fx0[] fx0VarArr, byte b) {
        this.a = b;
        this.b = editTextBoldCursor;
        this.c = fx0VarArr;
    }
}
