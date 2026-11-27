package defpackage;

import android.content.Context;
public final class l22 extends evc {
    public final byte x;
    public final c79 y;

    public l22(ly0 ly0Var, Context context) {
        super(context, 1);
        this.x = (byte) 0;
        this.y = ly0Var;
    }

    @Override
    public final void a(int i, Object obj) {
        byte b = this.x;
        c79 c79Var = this.y;
        switch (b) {
            case 0:
                pt2 pt2Var = ((m22) ((ly0) c79Var).f).y;
                if (pt2Var != null) {
                    pt2Var.accept(obj);
                    return;
                }
                return;
            case 1:
                ((awc) c79Var).d.F0(this, obj, i);
                return;
            default:
                ((cwc) c79Var).F.presentFragment(new pqb(obj, null, true));
                return;
        }
    }

    @Override
    public final boolean b(Object obj, int i) {
        switch (this.x) {
            case 1:
                return ((awc) this.y).d.G0(this, obj, i);
            default:
                return super.b(obj, i);
        }
    }

    public l22(c79 c79Var, Context context, byte b) {
        super(context, 5);
        this.x = b;
        this.y = c79Var;
    }
}
