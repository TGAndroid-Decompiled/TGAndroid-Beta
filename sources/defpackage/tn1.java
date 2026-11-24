package defpackage;

import org.telegram.ui.ActionBar.d;
public final class tn1 implements p8c {
    public final byte a;
    public final long b;
    public final long c;
    public final Long d;
    public final Object e;

    public tn1(Object obj, long j, long j2, Long l, byte b) {
        this.a = b;
        this.e = obj;
        this.b = j;
        this.c = j2;
        this.d = l;
    }

    @Override
    public final void a(Object obj) {
        int i;
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                ((mu1) obj2).G9(this.b, this.c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i = ((d) ((aq1) obj2).b).currentAccount;
                boolean z = false;
                gta v = gta.v(i, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z = true;
                }
                v.g0(this.b, this.c, z, true);
                return;
        }
    }
}
