package defpackage;

import android.content.Context;
public final class g32 extends ssc {
    public final byte x;
    public final q59 y;

    public g32(kz0 kz0Var, Context context) {
        super(context, 1);
        this.x = (byte) 0;
        this.y = kz0Var;
    }

    @Override
    public final void a(int i, Object obj) {
        byte b = this.x;
        q59 q59Var = this.y;
        switch (b) {
            case 0:
                gu2 gu2Var = ((h32) ((kz0) q59Var).f).y;
                if (gu2Var != null) {
                    gu2Var.accept(obj);
                    return;
                }
                return;
            case 1:
                ((otc) q59Var).d.F0(this, obj, i);
                return;
            default:
                ((qtc) q59Var).F.presentFragment(new rob(obj, null, true));
                return;
        }
    }

    @Override
    public final boolean b(Object obj, int i) {
        switch (this.x) {
            case 1:
                return ((otc) this.y).d.G0(this, obj, i);
            default:
                return super.b(obj, i);
        }
    }

    public g32(q59 q59Var, Context context, byte b) {
        super(context, 5);
        this.x = b;
        this.y = q59Var;
    }
}
