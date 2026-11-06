package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class r00 implements v10 {
    public final int f25170a;
    public final f10 f25171b;
    public final z10 f25172c;
    public final boolean d;
    public final int f25173e;
    public final String f25174f;
    public final long f25175g;

    public r00(f10 f10Var, z10 z10Var, boolean z9, int i7, String str, long j3, int i10) {
        this.f25170a = i10;
        this.f25171b = f10Var;
        this.f25172c = z10Var;
        this.d = z9;
        this.f25173e = i7;
        this.f25174f = str;
        this.f25175g = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f25170a;
        int i10 = 2131743947;
        long j3 = this.f25175g;
        String str = this.f25174f;
        int i11 = this.f25173e;
        boolean z9 = this.d;
        z10 z10Var = this.f25172c;
        f10 f10Var = this.f25171b;
        switch (i7) {
            case 0:
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (str2 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities.text = str2;
                    z10Var.a(Boolean.valueOf(z9), Integer.valueOf(i11), tL_textWithEntities, str);
                    return;
                }
                f10Var.K(j3, false);
                qs e10 = qs.e();
                if (bool.booleanValue()) {
                    i10 = 2131743948;
                }
                e10.k(292, 1, hd.M0(i10, null));
                return;
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                if (str3 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities2.text = str3;
                    z10Var.a(Boolean.valueOf(z9), Integer.valueOf(i11), tL_textWithEntities2, str);
                    return;
                }
                f10Var.K(j3, false);
                qs e11 = qs.e();
                if (bool2.booleanValue()) {
                    i10 = 2131743948;
                }
                e11.k(292, 1, hd.M0(i10, null));
                return;
        }
    }
}
