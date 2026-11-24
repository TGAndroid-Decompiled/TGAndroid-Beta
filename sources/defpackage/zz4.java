package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;
public final class zz4 implements Runnable {
    public final p8c E;
    public final v25 F;
    public final byte a;
    public final c b;
    public final String c;
    public final p8c d;
    public final TL_wallet.nftItem e;
    public final String f;
    public final String h;
    public final byte[] n;
    public final long r;
    public final w05 s;
    public final v25 w;
    public final TLRPC.User x;
    public final String y;

    public zz4(c cVar, String str, p8c p8cVar, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j, w05 w05Var, v25 v25Var, TLRPC.User user, String str4, p8c p8cVar2, v25 v25Var2, byte b) {
        this.a = b;
        this.b = cVar;
        this.c = str;
        this.d = p8cVar;
        this.e = nftitem;
        this.f = str2;
        this.h = str3;
        this.n = bArr;
        this.r = j;
        this.s = w05Var;
        this.w = v25Var;
        this.x = user;
        this.y = str4;
        this.E = p8cVar2;
        this.F = v25Var2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                c cVar = this.b;
                String str = this.c;
                p8c p8cVar = this.d;
                zz4 zz4Var = new zz4(cVar, str, p8cVar, this.e, this.f, this.h, this.n, this.r, this.s, this.w, this.x, this.y, this.E, this.F, (byte) 1);
                if (cVar.R() && !cVar.Q()) {
                    c.O("send " + str + ": asking passcode");
                    d S = LaunchActivity.S();
                    if (S == 0) {
                        p8cVar.a("PASSCODE_FAILED");
                        return;
                    }
                    ?? obj = new Object();
                    obj.a = true;
                    boolean[] zArr = {false};
                    n05 n05Var = new n05(zArr, p8cVar);
                    n05Var.W = new vc4(zArr, zz4Var, (byte) 20);
                    S.showAsSheet(n05Var, obj);
                    return;
                }
                zz4Var.run();
                return;
            default:
                StringBuilder sb = new StringBuilder("send ");
                final String str2 = this.c;
                sb.append(str2);
                sb.append(": ready, get secret phrase");
                c.O(sb.toString());
                final c cVar2 = this.b;
                final p8c p8cVar2 = this.d;
                final TL_wallet.nftItem nftitem = this.e;
                final String str3 = this.f;
                final String str4 = this.h;
                final byte[] bArr = this.n;
                final long j = this.r;
                final w05 w05Var = this.s;
                final v25 v25Var = this.w;
                final TLRPC.User user = this.x;
                final String str5 = this.y;
                final p8c p8cVar3 = this.E;
                final v25 v25Var2 = this.F;
                cVar2.E(false, true, true, new i8c() {
                    @Override
                    public final void a(java.lang.Object r38, java.lang.Object r39) {
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.b05.a(java.lang.Object, java.lang.Object):void");
                    }
                });
                return;
        }
    }
}
