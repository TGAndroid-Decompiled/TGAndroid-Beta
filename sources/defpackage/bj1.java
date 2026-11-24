package defpackage;

import android.view.View;
public final class bj1 extends n41 {
    public final byte k;
    public final Object l;

    public bj1(uo8 uo8Var) {
        super((View) null);
        this.k = (byte) 2;
        this.l = uo8Var;
    }

    @Override
    public final void b() {
        byte b = this.k;
        Object obj = this.l;
        switch (b) {
            case 0:
                ((gb2) obj).r2();
                return;
            case 1:
                ((gb2) obj).r2();
                return;
            default:
                ((uo8) obj).invalidateSelf();
                return;
        }
    }

    public bj1(gb2 gb2Var, gb2 gb2Var2, byte b) {
        super(gb2Var);
        this.k = b;
        this.l = gb2Var2;
    }
}
