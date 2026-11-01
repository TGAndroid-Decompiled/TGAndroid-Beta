package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class g10 implements k20 {
    public final int f15840a;
    public final u10 f15841b;
    public final o20 f15842c;
    public final boolean d;
    public final int e;
    public final String f15843f;
    public final long f15844g;

    public g10(u10 u10Var, o20 o20Var, boolean z10, int i10, String str, long j10, int i11) {
        this.f15840a = i11;
        this.f15841b = u10Var;
        this.f15842c = o20Var;
        this.d = z10;
        this.e = i10;
        this.f15843f = str;
        this.f15844g = j10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i10 = this.f15840a;
        int i11 = 2131743971;
        long j10 = this.f15844g;
        String str = this.f15843f;
        int i12 = this.e;
        boolean z10 = this.d;
        o20 o20Var = this.f15842c;
        u10 u10Var = this.f15841b;
        switch (i10) {
            case 0:
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (str2 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities.text = str2;
                    o20Var.a(Boolean.valueOf(z10), Integer.valueOf(i12), tL_textWithEntities, str);
                    return;
                }
                u10Var.K(j10, false);
                at e = at.e();
                if (bool.booleanValue()) {
                    i11 = 2131743972;
                }
                e.k(292, 1, dd.L0(i11, null));
                return;
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                if (str3 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities2.text = str3;
                    o20Var.a(Boolean.valueOf(z10), Integer.valueOf(i12), tL_textWithEntities2, str);
                    return;
                }
                u10Var.K(j10, false);
                at e7 = at.e();
                if (bool2.booleanValue()) {
                    i11 = 2131743972;
                }
                e7.k(292, 1, dd.L0(i11, null));
                return;
        }
    }
}
