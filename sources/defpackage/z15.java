package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;
public final class z15 implements Runnable {
    public final qac E;
    public final v45 F;
    public final byte a;
    public final c b;
    public final String c;
    public final qac d;
    public final TL_wallet.nftItem e;
    public final String f;
    public final String h;
    public final byte[] n;
    public final long r;
    public final w25 s;
    public final v45 w;
    public final TLRPC.User x;
    public final String y;

    public z15(c cVar, String str, qac qacVar, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j, w25 w25Var, v45 v45Var, TLRPC.User user, String str4, qac qacVar2, v45 v45Var2, byte b) {
        this.a = b;
        this.b = cVar;
        this.c = str;
        this.d = qacVar;
        this.e = nftitem;
        this.f = str2;
        this.h = str3;
        this.n = bArr;
        this.r = j;
        this.s = w25Var;
        this.w = v45Var;
        this.x = user;
        this.y = str4;
        this.E = qacVar2;
        this.F = v45Var2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                c cVar = this.b;
                String str = this.c;
                qac qacVar = this.d;
                z15 z15Var = new z15(cVar, str, qacVar, this.e, this.f, this.h, this.n, this.r, this.s, this.w, this.x, this.y, this.E, this.F, (byte) 1);
                if (cVar.R() && !cVar.Q()) {
                    c.O("send " + str + ": asking passcode");
                    d S = LaunchActivity.S();
                    if (S == 0) {
                        qacVar.a("PASSCODE_FAILED");
                        return;
                    }
                    ?? obj = new Object();
                    obj.a = true;
                    boolean[] zArr = {false};
                    n25 n25Var = new n25(zArr, qacVar);
                    n25Var.W = new ve4(zArr, z15Var, (byte) 21);
                    S.showAsSheet(n25Var, obj);
                    return;
                }
                z15Var.run();
                return;
            default:
                StringBuilder sb = new StringBuilder("send ");
                final String str2 = this.c;
                sb.append(str2);
                sb.append(": ready, get secret phrase");
                c.O(sb.toString());
                final c cVar2 = this.b;
                final qac qacVar2 = this.d;
                final TL_wallet.nftItem nftitem = this.e;
                final String str3 = this.f;
                final String str4 = this.h;
                final byte[] bArr = this.n;
                final long j = this.r;
                final w25 w25Var = this.s;
                final v45 v45Var = this.w;
                final TLRPC.User user = this.x;
                final String str5 = this.y;
                final qac qacVar3 = this.E;
                final v45 v45Var2 = this.F;
                cVar2.E(false, true, true, new jac() {
                    @Override
                    public final void a(java.lang.Object r38, java.lang.Object r39) {
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.b25.a(java.lang.Object, java.lang.Object):void");
                    }
                });
                return;
        }
    }
}
