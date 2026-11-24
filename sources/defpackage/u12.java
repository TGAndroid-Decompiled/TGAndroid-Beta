package defpackage;

import android.content.Context;
public final class u12 extends qqc {
    public final byte x;
    public final n39 y;

    public u12(dy0 dy0Var, Context context) {
        super(context, 1);
        this.x = (byte) 0;
        this.y = dy0Var;
    }

    @Override
    public final void a(int i, Object obj) {
        byte b = this.x;
        n39 n39Var = this.y;
        switch (b) {
            case 0:
                vs2 vs2Var = ((v12) ((dy0) n39Var).f).y;
                if (vs2Var != null) {
                    vs2Var.accept(obj);
                    return;
                }
                return;
            case 1:
                ((mrc) n39Var).d.E0(this, obj, i);
                return;
            default:
                ((orc) n39Var).F.presentFragment(new qmb(obj, null, true));
                return;
        }
    }

    @Override
    public final boolean b(Object obj, int i) {
        switch (this.x) {
            case 1:
                return ((mrc) this.y).d.F0(this, obj, i);
            default:
                return super.b(obj, i);
        }
    }

    public u12(n39 n39Var, Context context, byte b) {
        super(context, 5);
        this.x = b;
        this.y = n39Var;
    }
}
