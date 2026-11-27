package defpackage;

import org.telegram.tgnet.TLRPC;
public final class n4c implements icc {
    public final byte a;
    public final a5c b;
    public final mcc c;
    public final boolean d;
    public final int e;
    public final String f;
    public final long g;

    public n4c(a5c a5cVar, mcc mccVar, boolean z, int i, String str, long j, byte b) {
        this.a = b;
        this.b = a5cVar;
        this.c = mccVar;
        this.d = z;
        this.e = i;
        this.f = str;
        this.g = j;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        int i = 2131743601;
        long j = this.g;
        String str = this.f;
        int i2 = this.e;
        boolean z = this.d;
        mcc mccVar = this.c;
        a5c a5cVar = this.b;
        switch (b) {
            case 0:
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (str2 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities.text = str2;
                    mccVar.a(Boolean.valueOf(z), Integer.valueOf(i2), tL_textWithEntities, str);
                    return;
                }
                a5cVar.K(j, false);
                jn7 e = jn7.e();
                if (bool.booleanValue()) {
                    i = 2131743602;
                }
                e.k(296, 1, ob6.M0(i, null));
                return;
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                if (str3 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities2.text = str3;
                    mccVar.a(Boolean.valueOf(z), Integer.valueOf(i2), tL_textWithEntities2, str);
                    return;
                }
                a5cVar.K(j, false);
                jn7 e2 = jn7.e();
                if (bool2.booleanValue()) {
                    i = 2131743602;
                }
                e2.k(296, 1, ob6.M0(i, null));
                return;
        }
    }
}
