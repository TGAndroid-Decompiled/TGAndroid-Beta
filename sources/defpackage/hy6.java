package defpackage;

import android.text.TextUtils;
public final class hy6 implements py6 {
    public final byte a;
    public final qy6 b;
    public final Object c;

    public hy6(qy6 qy6Var, Object obj, byte b) {
        this.a = b;
        this.b = qy6Var;
        this.c = obj;
    }

    @Override
    public final void a(xw6 xw6Var) {
        byte b = this.a;
        Object obj = this.c;
        qy6 qy6Var = this.b;
        switch (b) {
            case 0:
                yx6 yx6Var = qy6Var.j;
                yx6Var.t();
                ((bn2) obj).e(yx6Var.t);
                return;
            default:
                String str = ((os6) obj).a;
                if (TextUtils.isEmpty(str)) {
                    efd.f("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                yx6 yx6Var2 = qy6Var.j;
                yx6Var2.t();
                og8 og8Var = yx6Var2.t;
                if (!og8Var.m0(17)) {
                    efd.f("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    return;
                }
                asb y0 = og8Var.y0();
                zrb zrbVar = new zrb();
                for (int i = 0; i < y0.o(); i++) {
                    if (TextUtils.equals(y0.m(i, zrbVar, 0L).b.a, str)) {
                        og8Var.O(i);
                        return;
                    }
                }
                return;
        }
    }
}
