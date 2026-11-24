package defpackage;

import android.text.TextUtils;
public final class cw6 implements kw6 {
    public final byte a;
    public final lw6 b;
    public final Object c;

    public cw6(lw6 lw6Var, Object obj, byte b) {
        this.a = b;
        this.b = lw6Var;
        this.c = obj;
    }

    @Override
    public final void a(su6 su6Var) {
        byte b = this.a;
        Object obj = this.c;
        lw6 lw6Var = this.b;
        switch (b) {
            case 0:
                tv6 tv6Var = lw6Var.j;
                tv6Var.t();
                ((hm2) obj).e(tv6Var.t);
                return;
            default:
                String str = ((kq6) obj).a;
                if (TextUtils.isEmpty(str)) {
                    lad.f("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                tv6 tv6Var2 = lw6Var.j;
                tv6Var2.t();
                ad8 ad8Var = tv6Var2.t;
                if (!ad8Var.m0(17)) {
                    lad.f("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    return;
                }
                aob y0 = ad8Var.y0();
                znb znbVar = new znb();
                for (int i = 0; i < y0.o(); i++) {
                    if (TextUtils.equals(y0.m(i, znbVar, 0L).b.a, str)) {
                        ad8Var.O(i);
                        return;
                    }
                }
                return;
        }
    }
}
