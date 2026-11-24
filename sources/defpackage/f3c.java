package defpackage;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class f3c implements Runnable {
    public final byte a;
    public final p3c b;

    public f3c(p3c p3cVar, byte b) {
        this.a = b;
        this.b = p3cVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = 0;
        p3c p3cVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor = p3cVar.n;
                if (editTextBoldCursor != null) {
                    if (editTextBoldCursor.length() != 0) {
                        p3cVar.g0[2].K(49);
                        p3cVar.g0[2].O(false, 0.0f);
                        p3cVar.a.d();
                        return;
                    }
                    p3cVar.J0(true);
                    return;
                }
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor2 = p3cVar.n;
                if (editTextBoldCursor2 != null && editTextBoldCursor2.getVisibility() == 0) {
                    p3cVar.n.requestFocus();
                    gl.E3(p3cVar.n);
                    return;
                }
                return;
            case 3:
                yc6 yc6Var = p3cVar.x;
                if (yc6Var != null && yc6Var.getVisibility() == 0) {
                    p3cVar.x.f[0].requestFocus();
                    return;
                }
                return;
            case 4:
                if (p3cVar.h0 != null) {
                    p3cVar.J0(false);
                    return;
                }
                return;
            case 5:
                p3cVar.u0();
                return;
            case 6:
                gl.d3(new f3c(p3cVar, (byte) 7), 150L);
                return;
            default:
                sj2[] sj2VarArr = p3cVar.x.f;
                int length = sj2VarArr.length;
                while (i < length) {
                    sj2VarArr[i].A(0.0f);
                    i++;
                }
                return;
        }
        while (true) {
            sj2[] sj2VarArr2 = p3cVar.x.f;
            if (i < sj2VarArr2.length) {
                sj2VarArr2[i].A(0.0f);
                i++;
            } else {
                return;
            }
        }
    }
}
