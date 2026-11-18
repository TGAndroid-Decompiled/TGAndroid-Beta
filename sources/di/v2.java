package di;

import android.text.TextUtils;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.p51;
public final class v2 implements x10 {
    public final f6 f9904a;
    public final long f9905b;
    public final vf.b f9906c;
    public final long d;
    public final TL_stars.TL_starGiftUnique f9907e;
    public final TL_wallet.nftItem f9908f;
    public final bi.a2 f9909g;
    public final boolean h;
    public final String f9910i;

    public v2(f6 f6Var, long j3, vf.b bVar, long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_wallet.nftItem nftitem, bi.a2 a2Var, boolean z10, String str) {
        this.f9904a = f6Var;
        this.f9905b = j3;
        this.f9906c = bVar;
        this.d = j10;
        this.f9907e = tL_starGiftUnique;
        this.f9908f = nftitem;
        this.f9909g = a2Var;
        this.h = z10;
        this.f9910i = str;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.User user;
        bi.j jVar;
        int i7;
        x10 x10Var;
        String message;
        String str;
        TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
        long max = Math.max(0L, this.f9905b) + stargiftdepositpayload.amount;
        f6 f6Var = this.f9904a;
        int i10 = (org.telegram.ui.Wallet.u0.D(f6Var.f30189a).A() > max ? 1 : (org.telegram.ui.Wallet.u0.D(f6Var.f30189a).A() == max ? 0 : -1));
        vf.b bVar = this.f9906c;
        p51 p51Var = null;
        if (i10 < 0) {
            bVar.b();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f6Var.getContext(), f6Var.J0);
            String M0 = gd.M0(2131742827, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
            u1Var.S = M0;
            u1Var.U = gd.V(null, null, 2131742826, org.telegram.ui.Wallet.u0.s(max, false));
            alertDialog$Builder.h(gd.M0(2131742825, null), null);
            alertDialog$Builder.k(gd.M0(2131742732, null), new f2(f6Var, 1));
            alertDialog$Builder.p();
            return;
        }
        final long j3 = this.d;
        if (j3 > 0) {
            user = mp.u1(f6Var.f30189a).c2(Long.valueOf(j3));
        } else {
            user = null;
        }
        final long e10 = j10.i(f6Var.f30189a).e();
        final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f9907e;
        final TLRPC.Document document = tL_starGiftUnique.getDocument();
        final int i11 = f6Var.f30189a;
        org.telegram.ui.Wallet.u0 D = org.telegram.ui.Wallet.u0.D(i11);
        bi.j jVar2 = new bi.j(f6Var, bVar, this.f9909g, 4);
        int i12 = (j3 > e10 ? 1 : (j3 == e10 ? 0 : -1));
        final boolean z10 = this.h;
        final String str2 = this.f9910i;
        if (i12 != 0) {
            jVar = jVar2;
            if (z10) {
                i7 = 4;
                x10Var = null;
            } else {
                i7 = 4;
                x10Var = new x10() {
                    @Override
                    public final void a(Object obj2) {
                        Object a02;
                        Boolean bool = (Boolean) obj2;
                        if (bool.booleanValue()) {
                            x8.y(i11, false).O(e10);
                        }
                        boolean booleanValue = bool.booleanValue();
                        String str3 = str2;
                        if (booleanValue) {
                            a02 = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749882, str3, org.telegram.messenger.n5.t(j3)));
                        } else {
                            a02 = gd.a0(null, null, 2131749620, str3);
                        }
                        org.telegram.messenger.g0.g3(new aa.r((Object) null, document, a02, 23));
                    }
                };
            }
        } else {
            jVar = jVar2;
            i7 = 4;
            x10Var = new x10() {
                @Override
                public final void a(Object obj2) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    TLRPC.Document document2 = document;
                    if (!booleanValue) {
                        if (!z10) {
                            org.telegram.messenger.g0.g3(new aa.r((Object) null, (Object) document2, (Object) gd.a0(null, null, 2131749620, str2), 23));
                            return;
                        }
                        return;
                    }
                    int i13 = i11;
                    x8 y10 = x8.y(i13, false);
                    long j10 = e10;
                    y10.O(j10);
                    String str3 = tL_starGiftUnique.slug;
                    if (!TextUtils.isEmpty(str3)) {
                        org.telegram.messenger.g0.h3(new bi.n4(i13, 0, str3, false), bi.v4.f4139b[0]);
                    }
                    org.telegram.messenger.g0.g3(new aa.r((Object) new g3(j10, 0), (Object) document2, (Object) gd.M0(2131750086, null), 23));
                }
            };
        }
        try {
            if (stargiftdepositpayload.nft_address.indexOf(58) >= 0) {
                str = org.telegram.ui.Wallet.u0.e0(stargiftdepositpayload.nft_address, true);
            } else {
                str = stargiftdepositpayload.nft_address;
            }
            String str3 = str;
            org.telegram.ui.Wallet.k2 j10 = org.telegram.ui.Wallet.u0.j(stargiftdepositpayload);
            if (x10Var != null) {
                p51Var = new p51(i7, D, x10Var);
            }
            D.n0(user, str3, 0L, null, null, this.f9908f, null, jVar, p51Var, j10, null, null);
        } catch (Exception e11) {
            bi.j jVar3 = jVar;
            org.telegram.ui.Wallet.u0.o("depositNFT: invalid payload", e11);
            if (e11.getMessage() == null) {
                message = "NULL_ERROR";
            } else {
                message = e11.getMessage();
            }
            jVar3.a(message);
        }
    }
}
