package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class j00 implements n10 {
    public final int f23621a;
    public final x00 f23622b;
    public final r10 f23623c;
    public final boolean d;
    public final int f23624e;
    public final String f23625f;
    public final long f23626g;

    public j00(x00 x00Var, r10 r10Var, boolean z10, int i3, String str, long j10, int i10) {
        this.f23621a = i10;
        this.f23622b = x00Var;
        this.f23623c = r10Var;
        this.d = z10;
        this.f23624e = i3;
        this.f23625f = str;
        this.f23626g = j10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i3 = this.f23621a;
        int i10 = 2131743956;
        long j10 = this.f23626g;
        String str = this.f23625f;
        int i11 = this.f23624e;
        boolean z10 = this.d;
        r10 r10Var = this.f23623c;
        x00 x00Var = this.f23622b;
        switch (i3) {
            case 0:
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (str2 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities.text = str2;
                    r10Var.a(Boolean.valueOf(z10), Integer.valueOf(i11), tL_textWithEntities, str);
                    return;
                }
                x00Var.K(j10, false);
                hs e10 = hs.e();
                if (bool.booleanValue()) {
                    i10 = 2131743957;
                }
                e10.k(292, 1, bd.M0(i10, null));
                return;
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                if (str3 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities2.text = str3;
                    r10Var.a(Boolean.valueOf(z10), Integer.valueOf(i11), tL_textWithEntities2, str);
                    return;
                }
                x00Var.K(j10, false);
                hs e11 = hs.e();
                if (bool2.booleanValue()) {
                    i10 = 2131743957;
                }
                e11.k(292, 1, bd.M0(i10, null));
                return;
        }
    }
}
