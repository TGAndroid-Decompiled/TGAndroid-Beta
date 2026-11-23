package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class m00 implements r10 {
    public final int f25502a;
    public final a10 f25503b;
    public final v10 f25504c;
    public final boolean d;
    public final int f25505e;
    public final String f25506f;
    public final long f25507g;

    public m00(a10 a10Var, v10 v10Var, boolean z10, int i7, String str, long j3, int i10) {
        this.f25502a = i10;
        this.f25503b = a10Var;
        this.f25504c = v10Var;
        this.d = z10;
        this.f25505e = i7;
        this.f25506f = str;
        this.f25507g = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f25502a;
        int i10 = 2131743701;
        long j3 = this.f25507g;
        String str = this.f25506f;
        int i11 = this.f25505e;
        boolean z10 = this.d;
        v10 v10Var = this.f25504c;
        a10 a10Var = this.f25503b;
        switch (i7) {
            case 0:
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (str2 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities.text = str2;
                    v10Var.a(Boolean.valueOf(z10), Integer.valueOf(i11), tL_textWithEntities, str);
                    return;
                }
                a10Var.K(j3, false);
                ls e10 = ls.e();
                if (bool.booleanValue()) {
                    i10 = 2131743702;
                }
                e10.k(295, 1, hd.N0(i10, null));
                return;
            default:
                String str3 = (String) obj;
                Boolean bool2 = (Boolean) obj2;
                if (str3 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    tL_textWithEntities2.text = str3;
                    v10Var.a(Boolean.valueOf(z10), Integer.valueOf(i11), tL_textWithEntities2, str);
                    return;
                }
                a10Var.K(j3, false);
                ls e11 = ls.e();
                if (bool2.booleanValue()) {
                    i10 = 2131743702;
                }
                e11.k(295, 1, hd.N0(i10, null));
                return;
        }
    }
}
