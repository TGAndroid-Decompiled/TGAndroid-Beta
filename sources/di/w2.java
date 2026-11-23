package di;

import android.text.TextUtils;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.p51;
public final class w2 implements y10 {
    public final f6 f9977a;
    public final long f9978b;
    public final vf.b f9979c;
    public final long d;
    public final TL_stars.TL_starGiftUnique f9980e;
    public final TL_wallet.nftItem f9981f;
    public final bi.e2 f9982g;
    public final boolean h;
    public final String f9983i;

    public w2(f6 f6Var, long j3, vf.b bVar, long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_wallet.nftItem nftitem, bi.e2 e2Var, boolean z10, String str) {
        this.f9977a = f6Var;
        this.f9978b = j3;
        this.f9979c = bVar;
        this.d = j10;
        this.f9980e = tL_starGiftUnique;
        this.f9981f = nftitem;
        this.f9982g = e2Var;
        this.h = z10;
        this.f9983i = str;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.User user;
        bi.j jVar;
        int i7;
        y10 y10Var;
        String message;
        String str;
        TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
        long max = Math.max(0L, this.f9978b) + stargiftdepositpayload.amount;
        f6 f6Var = this.f9977a;
        int i10 = (org.telegram.ui.Wallet.u0.D(f6Var.f30173a).A() > max ? 1 : (org.telegram.ui.Wallet.u0.D(f6Var.f30173a).A() == max ? 0 : -1));
        vf.b bVar = this.f9979c;
        p51 p51Var = null;
        if (i10 < 0) {
            bVar.b();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f6Var.getContext(), f6Var.J0);
            String N0 = hd.N0(2131742819, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
            t1Var.S = N0;
            t1Var.U = hd.V(null, null, 2131742818, org.telegram.ui.Wallet.u0.s(max, false));
            alertDialog$Builder.h(hd.N0(2131742817, null), null);
            alertDialog$Builder.k(hd.N0(2131742724, null), new g2(f6Var, 1));
            alertDialog$Builder.p();
            return;
        }
        final long j3 = this.d;
        if (j3 > 0) {
            user = np.u1(f6Var.f30173a).c2(Long.valueOf(j3));
        } else {
            user = null;
        }
        final long e10 = k10.i(f6Var.f30173a).e();
        final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f9980e;
        final TLRPC.Document document = tL_starGiftUnique.getDocument();
        final int i11 = f6Var.f30173a;
        org.telegram.ui.Wallet.u0 D = org.telegram.ui.Wallet.u0.D(i11);
        bi.j jVar2 = new bi.j(f6Var, bVar, this.f9982g, 4);
        int i12 = (j3 > e10 ? 1 : (j3 == e10 ? 0 : -1));
        final boolean z10 = this.h;
        final String str2 = this.f9983i;
        if (i12 != 0) {
            jVar = jVar2;
            if (z10) {
                i7 = 4;
                y10Var = null;
            } else {
                i7 = 4;
                y10Var = new y10() {
                    @Override
                    public final void a(Object obj2) {
                        Object a02;
                        Boolean bool = (Boolean) obj2;
                        if (bool.booleanValue()) {
                            y8.y(i11, false).O(e10);
                        }
                        boolean booleanValue = bool.booleanValue();
                        String str3 = str2;
                        if (booleanValue) {
                            a02 = org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749881, str3, org.telegram.messenger.n5.t(j3)));
                        } else {
                            a02 = hd.a0(null, null, 2131749619, str3);
                        }
                        org.telegram.messenger.g0.g3(new aa.r((Object) null, document, a02, 24));
                    }
                };
            }
        } else {
            jVar = jVar2;
            i7 = 4;
            y10Var = new y10() {
                @Override
                public final void a(Object obj2) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    TLRPC.Document document2 = document;
                    if (!booleanValue) {
                        if (!z10) {
                            org.telegram.messenger.g0.g3(new aa.r((Object) null, (Object) document2, (Object) hd.a0(null, null, 2131749619, str2), 24));
                            return;
                        }
                        return;
                    }
                    int i13 = i11;
                    y8 y10 = y8.y(i13, false);
                    long j10 = e10;
                    y10.O(j10);
                    String str3 = tL_starGiftUnique.slug;
                    if (!TextUtils.isEmpty(str3)) {
                        org.telegram.messenger.g0.h3(new bi.r4(i13, 0, str3, false), bi.x4.f4248b[0]);
                    }
                    org.telegram.messenger.g0.g3(new aa.r((Object) new g3(j10, 0), (Object) document2, (Object) hd.N0(2131750085, null), 24));
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
            if (y10Var != null) {
                p51Var = new p51(i7, D, y10Var);
            }
            D.n0(user, str3, 0L, null, null, this.f9981f, null, jVar, p51Var, j10, null, null);
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
