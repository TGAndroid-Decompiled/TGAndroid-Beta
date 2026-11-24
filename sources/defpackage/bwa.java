package defpackage;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class bwa implements Runnable {
    public final byte a;
    public final EditTextBoldCursor b;
    public final my0[] c;

    public bwa(my0[] my0VarArr, EditTextBoldCursor editTextBoldCursor) {
        this.a = (byte) 0;
        this.c = my0VarArr;
        this.b = editTextBoldCursor;
    }

    @Override
    public final void run() {
        byte b = this.a;
        my0[] my0VarArr = this.c;
        EditTextBoldCursor editTextBoldCursor = this.b;
        switch (b) {
            case 0:
                my0VarArr[0].v0(true);
                editTextBoldCursor.requestFocus();
                gm.c3(new l(editTextBoldCursor, (byte) 9));
                return;
            case 1:
                gm.t1(editTextBoldCursor);
                my0VarArr[0].dismiss();
                return;
            default:
                gm.t1(editTextBoldCursor);
                my0VarArr[0].dismiss();
                return;
        }
    }

    public bwa(EditTextBoldCursor editTextBoldCursor, my0[] my0VarArr, byte b) {
        this.a = b;
        this.b = editTextBoldCursor;
        this.c = my0VarArr;
    }
}
