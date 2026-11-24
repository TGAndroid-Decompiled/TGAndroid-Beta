package defpackage;

import org.telegram.tgnet.TLRPC;
public final class n0c implements i8c {
    public final byte a;
    public final b1c b;
    public final m8c c;
    public final boolean d;
    public final int e;
    public final String f;
    public final long g;

    public n0c(b1c b1cVar, m8c m8cVar, boolean z, int i, String str, long j, byte b) {
        this.a = b;
        this.b = b1cVar;
        this.c = m8cVar;
        this.d = z;
        this.e = i;
        this.f = str;
        this.g = j;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        int i = 2131743707;
        long j = this.g;
        String str = this.f;
        int i2 = this.e;
        boolean z = this.d;
        m8c m8cVar = this.c;
        b1c b1cVar = this.b;
        switch (b) {
            case 0:
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (str2 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities.text = str2;
                    m8cVar.a(Boolean.valueOf(z), Integer.valueOf(i2), tL_textWithEntities, str);
                    return;
                }
                b1cVar.K(j, false);
                kk7 e = kk7.e();
                if (bool.booleanValue()) {
                    i = 2131743708;
                }
                e.k(295, 1, k96.M0(i, null));
                return;
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                if (str3 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities2.text = str3;
                    m8cVar.a(Boolean.valueOf(z), Integer.valueOf(i2), tL_textWithEntities2, str);
                    return;
                }
                b1cVar.K(j, false);
                kk7 e2 = kk7.e();
                if (bool2.booleanValue()) {
                    i = 2131743708;
                }
                e2.k(295, 1, k96.M0(i, null));
                return;
        }
    }
}
