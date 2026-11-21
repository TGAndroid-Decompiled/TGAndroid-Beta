package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class l00 implements q10 {
    public final int f25337a;
    public final z00 f25338b;
    public final u10 f25339c;
    public final boolean d;
    public final int f25340e;
    public final String f25341f;
    public final long f25342g;

    public l00(z00 z00Var, u10 u10Var, boolean z10, int i7, String str, long j3, int i10) {
        this.f25337a = i10;
        this.f25338b = z00Var;
        this.f25339c = u10Var;
        this.d = z10;
        this.f25340e = i7;
        this.f25341f = str;
        this.f25342g = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f25337a;
        int i10 = 2131743703;
        long j3 = this.f25342g;
        String str = this.f25341f;
        int i11 = this.f25340e;
        boolean z10 = this.d;
        u10 u10Var = this.f25339c;
        z00 z00Var = this.f25338b;
        switch (i7) {
            case 0:
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (str2 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities.text = str2;
                    u10Var.a(Boolean.valueOf(z10), Integer.valueOf(i11), tL_textWithEntities, str);
                    return;
                }
                z00Var.K(j3, false);
                ks e10 = ks.e();
                if (bool.booleanValue()) {
                    i10 = 2131743704;
                }
                e10.k(295, 1, gd.N0(i10, null));
                return;
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                if (str3 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities2.text = str3;
                    u10Var.a(Boolean.valueOf(z10), Integer.valueOf(i11), tL_textWithEntities2, str);
                    return;
                }
                z00Var.K(j3, false);
                ks e11 = ks.e();
                if (bool2.booleanValue()) {
                    i10 = 2131743704;
                }
                e11.k(295, 1, gd.N0(i10, null));
                return;
        }
    }
}
