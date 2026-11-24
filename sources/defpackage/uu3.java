package defpackage;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class uu3 implements vna, ee {
    public final byte a;
    public final EditTextBoldCursor b;

    public uu3(EditTextBoldCursor editTextBoldCursor, byte b) {
        this.a = b;
        this.b = editTextBoldCursor;
    }

    @Override
    public final void d(rna rnaVar, float f, float f2) {
        this.b.i(rnaVar, f, f2);
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        EditTextBoldCursor editTextBoldCursor = this.b;
        switch (b) {
            case 1:
                gm.t1(editTextBoldCursor);
                return;
            case 2:
                gm.t1(editTextBoldCursor);
                return;
            case 3:
                gm.t1(editTextBoldCursor);
                return;
            case 4:
                gm.t1(editTextBoldCursor);
                return;
            case 5:
                gm.t1(editTextBoldCursor);
                return;
            default:
                gm.t1(editTextBoldCursor);
                return;
        }
    }
}
