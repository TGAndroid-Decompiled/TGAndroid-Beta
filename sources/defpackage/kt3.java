package defpackage;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class kt3 implements ula, ed {
    public final byte a;
    public final EditTextBoldCursor b;

    public kt3(EditTextBoldCursor editTextBoldCursor, byte b) {
        this.a = b;
        this.b = editTextBoldCursor;
    }

    @Override
    public final void e(qla qlaVar, float f, float f2) {
        this.b.i(qlaVar, f, f2);
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        EditTextBoldCursor editTextBoldCursor = this.b;
        switch (b) {
            case 1:
                gl.t1(editTextBoldCursor);
                return;
            case 2:
                gl.t1(editTextBoldCursor);
                return;
            case 3:
                gl.t1(editTextBoldCursor);
                return;
            case 4:
                gl.t1(editTextBoldCursor);
                return;
            case 5:
                gl.t1(editTextBoldCursor);
                return;
            default:
                gl.t1(editTextBoldCursor);
                return;
        }
    }
}
