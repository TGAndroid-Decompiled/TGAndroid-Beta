package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;
public final class d25 implements Runnable {
    public final pcc E;
    public final z45 F;
    public final byte a;
    public final c b;
    public final String c;
    public final pcc d;
    public final TL_wallet.nftItem e;
    public final String f;
    public final String h;
    public final byte[] n;
    public final long r;
    public final a35 s;
    public final z45 w;
    public final TLRPC.User x;
    public final String y;

    public d25(c cVar, String str, pcc pccVar, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j, a35 a35Var, z45 z45Var, TLRPC.User user, String str4, pcc pccVar2, z45 z45Var2, byte b) {
        this.a = b;
        this.b = cVar;
        this.c = str;
        this.d = pccVar;
        this.e = nftitem;
        this.f = str2;
        this.h = str3;
        this.n = bArr;
        this.r = j;
        this.s = a35Var;
        this.w = z45Var;
        this.x = user;
        this.y = str4;
        this.E = pccVar2;
        this.F = z45Var2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                c cVar = this.b;
                String str = this.c;
                pcc pccVar = this.d;
                d25 d25Var = new d25(cVar, str, pccVar, this.e, this.f, this.h, this.n, this.r, this.s, this.w, this.x, this.y, this.E, this.F, (byte) 1);
                if (cVar.S() && !cVar.R()) {
                    c.P("send " + str + ": asking passcode");
                    e S = LaunchActivity.S();
                    if (S == 0) {
                        pccVar.a("PASSCODE_FAILED");
                        return;
                    }
                    ?? obj = new Object();
                    obj.a = true;
                    boolean[] zArr = {false};
                    r25 r25Var = new r25(zArr, pccVar);
                    r25Var.W = new se4(zArr, d25Var, (byte) 17);
                    S.showAsSheet(r25Var, obj);
                    return;
                }
                d25Var.run();
                return;
            default:
                StringBuilder sb = new StringBuilder("send ");
                final String str2 = this.c;
                sb.append(str2);
                sb.append(": ready, get secret phrase");
                c.P(sb.toString());
                final c cVar2 = this.b;
                final pcc pccVar2 = this.d;
                final TL_wallet.nftItem nftitem = this.e;
                final String str3 = this.f;
                final String str4 = this.h;
                final byte[] bArr = this.n;
                final long j = this.r;
                final a35 a35Var = this.s;
                final z45 z45Var = this.w;
                final TLRPC.User user = this.x;
                final String str5 = this.y;
                final pcc pccVar3 = this.E;
                final z45 z45Var2 = this.F;
                cVar2.E(false, true, true, new icc() {
                    @Override
                    public final void a(java.lang.Object r38, java.lang.Object r39) {
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.f25.a(java.lang.Object, java.lang.Object):void");
                    }
                });
                return;
        }
    }
}
