package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class o00 implements s10 {
    public final int f25690a;
    public final c10 f25691b;
    public final w10 f25692c;
    public final boolean d;
    public final int f25693e;
    public final String f25694f;
    public final long f25695g;

    public o00(c10 c10Var, w10 w10Var, boolean z10, int i7, String str, long j3, int i10) {
        this.f25690a = i10;
        this.f25691b = c10Var;
        this.f25692c = w10Var;
        this.d = z10;
        this.f25693e = i7;
        this.f25694f = str;
        this.f25695g = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f25690a;
        int i10 = 2131743946;
        long j3 = this.f25695g;
        String str = this.f25694f;
        int i11 = this.f25693e;
        boolean z10 = this.d;
        w10 w10Var = this.f25692c;
        c10 c10Var = this.f25691b;
        switch (i7) {
            case 0:
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (str2 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities.text = str2;
                    w10Var.a(Boolean.valueOf(z10), Integer.valueOf(i11), tL_textWithEntities, str);
                    return;
                }
                c10Var.K(j3, false);
                ns e10 = ns.e();
                if (bool.booleanValue()) {
                    i10 = 2131743947;
                }
                e10.k(292, 1, hd.M0(i10, null));
                return;
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                if (str3 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities2.text = str3;
                    w10Var.a(Boolean.valueOf(z10), Integer.valueOf(i11), tL_textWithEntities2, str);
                    return;
                }
                c10Var.K(j3, false);
                ns e11 = ns.e();
                if (bool2.booleanValue()) {
                    i10 = 2131743947;
                }
                e11.k(292, 1, hd.M0(i10, null));
                return;
        }
    }
}
