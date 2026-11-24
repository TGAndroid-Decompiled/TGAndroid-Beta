package defpackage;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class g5c implements Runnable {
    public final byte a;
    public final p5c b;

    public g5c(p5c p5cVar, byte b) {
        this.a = b;
        this.b = p5cVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = 0;
        p5c p5cVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor = p5cVar.n;
                if (editTextBoldCursor != null) {
                    if (editTextBoldCursor.length() != 0) {
                        p5cVar.g0[2].K(49);
                        p5cVar.g0[2].O(false, 0.0f);
                        p5cVar.a.d();
                        return;
                    }
                    p5cVar.K0(true);
                    return;
                }
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = p5cVar.n;
                if (editTextBoldCursor2 != null && editTextBoldCursor2.getVisibility() == 0) {
                    p5cVar.n.requestFocus();
                    gm.E3(p5cVar.n);
                    return;
                }
                return;
            case 3:
                xe6 xe6Var = p5cVar.x;
                if (xe6Var != null && xe6Var.getVisibility() == 0) {
                    p5cVar.x.f[0].requestFocus();
                    return;
                }
                return;
            case 4:
                if (p5cVar.h0 != null) {
                    p5cVar.K0(false);
                    return;
                }
                return;
            case 5:
                p5cVar.v0();
                return;
            case 6:
                gm.d3(new g5c(p5cVar, (byte) 7), 150L);
                return;
            default:
                gl2[] gl2VarArr = p5cVar.x.f;
                int length = gl2VarArr.length;
                while (i < length) {
                    gl2VarArr[i].A(0.0f);
                    i++;
                }
                return;
        }
        while (true) {
            gl2[] gl2VarArr2 = p5cVar.x.f;
            if (i < gl2VarArr2.length) {
                gl2VarArr2[i].A(0.0f);
                i++;
            } else {
                return;
            }
        }
    }
}
