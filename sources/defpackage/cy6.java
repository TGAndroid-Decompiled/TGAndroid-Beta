package defpackage;

import android.text.TextUtils;
public final class cy6 implements ky6 {
    public final byte a;
    public final ly6 b;
    public final Object c;

    public cy6(ly6 ly6Var, Object obj, byte b) {
        this.a = b;
        this.b = ly6Var;
        this.c = obj;
    }

    @Override
    public final void a(sw6 sw6Var) {
        byte b = this.a;
        Object obj = this.c;
        ly6 ly6Var = this.b;
        switch (b) {
            case 0:
                tx6 tx6Var = ly6Var.j;
                tx6Var.t();
                ((un2) obj).e(tx6Var.t);
                return;
            default:
                String str = ((ks6) obj).a;
                if (TextUtils.isEmpty(str)) {
                    ncd.f("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                tx6 tx6Var2 = ly6Var.j;
                tx6Var2.t();
                cf8 cf8Var = tx6Var2.t;
                if (!cf8Var.m0(17)) {
                    ncd.f("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    return;
                }
                bqb y0 = cf8Var.y0();
                aqb aqbVar = new aqb();
                for (int i = 0; i < y0.o(); i++) {
                    if (TextUtils.equals(y0.m(i, aqbVar, 0L).b.a, str)) {
                        cf8Var.O(i);
                        return;
                    }
                }
                return;
        }
    }
}
