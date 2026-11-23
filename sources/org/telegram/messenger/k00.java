package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class k00 implements p10 {
    public final int f25058a;
    public final y00 f25059b;
    public final t10 f25060c;
    public final boolean d;
    public final int f25061e;
    public final String f25062f;
    public final long f25063g;

    public k00(y00 y00Var, t10 t10Var, boolean z10, int i7, String str, long j3, int i10) {
        this.f25058a = i10;
        this.f25059b = y00Var;
        this.f25060c = t10Var;
        this.d = z10;
        this.f25061e = i7;
        this.f25062f = str;
        this.f25063g = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f25058a;
        int i10 = 2131743699;
        long j3 = this.f25063g;
        String str = this.f25062f;
        int i11 = this.f25061e;
        boolean z10 = this.d;
        t10 t10Var = this.f25060c;
        y00 y00Var = this.f25059b;
        switch (i7) {
            case 0:
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (str2 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities.text = str2;
                    t10Var.a(Boolean.valueOf(z10), Integer.valueOf(i11), tL_textWithEntities, str);
                    return;
                }
                y00Var.K(j3, false);
                ks e10 = ks.e();
                if (bool.booleanValue()) {
                    i10 = 2131743700;
                }
                e10.k(295, 1, gd.N0(i10, null));
                return;
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                if (str3 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities2.text = str3;
                    t10Var.a(Boolean.valueOf(z10), Integer.valueOf(i11), tL_textWithEntities2, str);
                    return;
                }
                y00Var.K(j3, false);
                ks e11 = ks.e();
                if (bool2.booleanValue()) {
                    i10 = 2131743700;
                }
                e11.k(295, 1, gd.N0(i10, null));
                return;
        }
    }
}
