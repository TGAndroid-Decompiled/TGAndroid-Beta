package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class f10 implements j20 {
    public final int f15494a;
    public final t10 f15495b;
    public final n20 f15496c;
    public final boolean d;
    public final int e;
    public final String f15497f;
    public final long f15498g;

    public f10(t10 t10Var, n20 n20Var, boolean z10, int i10, String str, long j10, int i11) {
        this.f15494a = i11;
        this.f15495b = t10Var;
        this.f15496c = n20Var;
        this.d = z10;
        this.e = i10;
        this.f15497f = str;
        this.f15498g = j10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i10 = this.f15494a;
        int i11 = 2131743971;
        long j10 = this.f15498g;
        String str = this.f15497f;
        int i12 = this.e;
        boolean z10 = this.d;
        n20 n20Var = this.f15496c;
        t10 t10Var = this.f15495b;
        switch (i10) {
            case 0:
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (str2 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities.text = str2;
                    n20Var.a(Boolean.valueOf(z10), Integer.valueOf(i12), tL_textWithEntities, str);
                    return;
                }
                t10Var.K(j10, false);
                zs e = zs.e();
                if (bool.booleanValue()) {
                    i11 = 2131743972;
                }
                e.k(292, 1, cd.L0(i11, null));
                return;
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                if (str3 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities2.text = str3;
                    n20Var.a(Boolean.valueOf(z10), Integer.valueOf(i12), tL_textWithEntities2, str);
                    return;
                }
                t10Var.K(j10, false);
                zs e7 = zs.e();
                if (bool2.booleanValue()) {
                    i11 = 2131743972;
                }
                e7.k(292, 1, cd.L0(i11, null));
                return;
        }
    }
}
