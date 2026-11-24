package defpackage;

import org.telegram.tgnet.TLRPC;
public final class n2c implements jac {
    public final byte a;
    public final b3c b;
    public final nac c;
    public final boolean d;
    public final int e;
    public final String f;
    public final long g;

    public n2c(b3c b3cVar, nac nacVar, boolean z, int i, String str, long j, byte b) {
        this.a = b;
        this.b = b3cVar;
        this.c = nacVar;
        this.d = z;
        this.e = i;
        this.f = str;
        this.g = j;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        int i = 2131743633;
        long j = this.g;
        String str = this.f;
        int i2 = this.e;
        boolean z = this.d;
        nac nacVar = this.c;
        b3c b3cVar = this.b;
        switch (b) {
            case 0:
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (str2 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities.text = str2;
                    nacVar.a(Boolean.valueOf(z), Integer.valueOf(i2), tL_textWithEntities, str);
                    return;
                }
                b3cVar.K(j, false);
                nm7 e = nm7.e();
                if (bool.booleanValue()) {
                    i = 2131743634;
                }
                e.k(297, 1, jb6.M0(i, null));
                return;
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                if (str3 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities2.text = str3;
                    nacVar.a(Boolean.valueOf(z), Integer.valueOf(i2), tL_textWithEntities2, str);
                    return;
                }
                b3cVar.K(j, false);
                nm7 e2 = nm7.e();
                if (bool2.booleanValue()) {
                    i = 2131743634;
                }
                e2.k(297, 1, jb6.M0(i, null));
                return;
        }
    }
}
