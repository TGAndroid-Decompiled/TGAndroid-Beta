package defpackage;

import android.view.View;
public final class jk1 extends u51 {
    public final byte k;
    public final Object l;

    public jk1(vq8 vq8Var) {
        super((View) null);
        this.k = (byte) 2;
        this.l = vq8Var;
    }

    @Override
    public final void b() {
        byte b = this.k;
        Object obj = this.l;
        switch (b) {
            case 0:
                ((rc2) obj).r2();
                return;
            case 1:
                ((rc2) obj).r2();
                return;
            default:
                ((vq8) obj).invalidateSelf();
                return;
        }
    }

    public jk1(rc2 rc2Var, rc2 rc2Var2, byte b) {
        super(rc2Var);
        this.k = b;
        this.l = rc2Var2;
    }
}
