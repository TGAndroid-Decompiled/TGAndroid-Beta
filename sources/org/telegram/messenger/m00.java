package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class m00 implements r10 {
    public final int f25466a;
    public final a10 f25467b;
    public final v10 f25468c;
    public final boolean d;
    public final int f25469e;
    public final String f25470f;
    public final long f25471g;

    public m00(a10 a10Var, v10 v10Var, boolean z10, int i7, String str, long j3, int i10) {
        this.f25466a = i10;
        this.f25467b = a10Var;
        this.f25468c = v10Var;
        this.d = z10;
        this.f25469e = i7;
        this.f25470f = str;
        this.f25471g = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f25466a;
        int i10 = 2131743703;
        long j3 = this.f25471g;
        String str = this.f25470f;
        int i11 = this.f25469e;
        boolean z10 = this.d;
        v10 v10Var = this.f25468c;
        a10 a10Var = this.f25467b;
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
                    i10 = 2131743704;
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
                    i10 = 2131743704;
                }
                e11.k(295, 1, hd.N0(i10, null));
                return;
        }
    }
}
