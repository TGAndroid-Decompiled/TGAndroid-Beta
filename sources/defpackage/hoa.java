package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.c;
public final class hoa implements p8c {
    public final vqa a;
    public final long b;
    public final c01 c;
    public final long d;
    public final TL_stars.TL_starGiftUnique e;
    public final TL_wallet.nftItem f;
    public final xu4 g;
    public final boolean h;
    public final String i;

    public hoa(vqa vqaVar, long j, c01 c01Var, long j2, TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_wallet.nftItem nftitem, xu4 xu4Var, boolean z, String str) {
        this.a = vqaVar;
        this.b = j;
        this.c = c01Var;
        this.d = j2;
        this.e = tL_starGiftUnique;
        this.f = nftitem;
        this.g = xu4Var;
        this.h = z;
        this.i = str;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.User user;
        p8c p8cVar;
        String message;
        TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
        long max = Math.max(0L, this.b) + stargiftdepositpayload.amount;
        vqa vqaVar = this.a;
        int i = (c.C(vqaVar.a).z() > max ? 1 : (c.C(vqaVar.a).z() == max ? 0 : -1));
        c01 c01Var = this.c;
        pz1 pz1Var = null;
        if (i < 0) {
            c01Var.b();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vqaVar.J0, vqaVar.getContext());
            String M0 = k96.M0(2131742822, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.V(null, null, 2131742821, c.r(max, false));
            alertDialog$Builder.g(k96.M0(2131742820, null), null);
            alertDialog$Builder.j(k96.M0(2131742727, null), new yna(vqaVar, (byte) 1));
            alertDialog$Builder.o();
            return;
        }
        final long j = this.d;
        if (j > 0) {
            user = na7.q1(vqaVar.a).V1(Long.valueOf(j));
        } else {
            user = null;
        }
        final long e = y6c.h(vqaVar.a).e();
        final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.e;
        final TLRPC.Document document = tL_starGiftUnique.getDocument();
        final int i2 = vqaVar.a;
        c C = c.C(i2);
        f28 f28Var = new f28(vqaVar, c01Var, this.g, (byte) 8);
        int i3 = (j > e ? 1 : (j == e ? 0 : -1));
        final boolean z = this.h;
        final String str = this.i;
        if (i3 != 0) {
            if (z) {
                p8cVar = null;
            } else {
                p8cVar = new p8c() {
                    @Override
                    public final void a(Object obj2) {
                        CharSequence a0;
                        Boolean bool = (Boolean) obj2;
                        if (bool.booleanValue()) {
                            gta.v(i2, false).M(e);
                        }
                        boolean booleanValue = bool.booleanValue();
                        String str2 = str;
                        if (booleanValue) {
                            a0 = gl.T2(k96.a0(null, null, 2131749882, str2, cf3.s(j)));
                        } else {
                            a0 = k96.a0(null, null, 2131749620, str2);
                        }
                        gl.d3(new q3a((Runnable) null, document, a0));
                    }
                };
            }
        } else {
            p8cVar = new p8c() {
                @Override
                public final void a(Object obj2) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    TLRPC.Document document2 = document;
                    if (!booleanValue) {
                        if (!z) {
                            gl.d3(new q3a((Runnable) null, document2, k96.a0(null, null, 2131749620, str)));
                            return;
                        }
                        return;
                    }
                    int i4 = i2;
                    gta v = gta.v(i4, false);
                    long j2 = e;
                    v.M(j2);
                    String str2 = tL_starGiftUnique.slug;
                    if (!TextUtils.isEmpty(str2)) {
                        gl.e3(new rn1(i4, 0, str2, false), cq7.b[0]);
                    }
                    gl.d3(new q3a(new px6((byte) 4, j2), document2, k96.M0(2131750086, null)));
                }
            };
        }
        try {
            int indexOf = stargiftdepositpayload.nft_address.indexOf(58);
            String str2 = stargiftdepositpayload.nft_address;
            if (indexOf >= 0) {
                str2 = c.d0(str2, true);
            }
            String str3 = str2;
            v25 i4 = c.i(stargiftdepositpayload);
            if (p8cVar != null) {
                pz1Var = new pz1(C, p8cVar, (byte) 26);
            }
            C.m0(user, str3, 0L, null, null, this.f, null, f28Var, pz1Var, i4, null, null);
        } catch (Exception e2) {
            c.n("depositNFT: invalid payload", e2);
            if (e2.getMessage() == null) {
                message = "NULL_ERROR";
            } else {
                message = e2.getMessage();
            }
            f28Var.a(message);
        }
    }
}
