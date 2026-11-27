package defpackage;

import android.view.View;
public final class kj1 extends v41 {
    public final byte k;
    public final Object l;

    public kj1(gs8 gs8Var) {
        super((View) null);
        this.k = (byte) 2;
        this.l = gs8Var;
    }

    @Override
    public final void b() {
        byte b = this.k;
        Object obj = this.l;
        switch (b) {
            case 0:
                ((wb2) obj).r2();
                return;
            case 1:
                ((wb2) obj).r2();
                return;
            default:
                ((gs8) obj).invalidateSelf();
                return;
        }
    }

    public kj1(wb2 wb2Var, wb2 wb2Var2, byte b) {
        super(wb2Var);
        this.k = b;
        this.l = wb2Var2;
    }
}
