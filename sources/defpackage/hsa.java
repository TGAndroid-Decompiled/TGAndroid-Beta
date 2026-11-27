package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.c;
public final class hsa implements pcc {
    public final wua a;
    public final long b;
    public final l01 c;
    public final long d;
    public final TL_stars.TL_starGiftUnique e;
    public final TL_wallet.nftItem f;
    public final bx4 g;
    public final boolean h;
    public final String i;

    public hsa(wua wuaVar, long j, l01 l01Var, long j2, TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_wallet.nftItem nftitem, bx4 bx4Var, boolean z, String str) {
        this.a = wuaVar;
        this.b = j;
        this.c = l01Var;
        this.d = j2;
        this.e = tL_starGiftUnique;
        this.f = nftitem;
        this.g = bx4Var;
        this.h = z;
        this.i = str;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.User user;
        pcc pccVar;
        String message;
        TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
        long max = Math.max(0L, this.b) + stargiftdepositpayload.amount;
        wua wuaVar = this.a;
        int i = (c.C(wuaVar.a).z() > max ? 1 : (c.C(wuaVar.a).z() == max ? 0 : -1));
        l01 l01Var = this.c;
        rx1 rx1Var = null;
        if (i < 0) {
            l01Var.b();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wuaVar.J0, wuaVar.getContext());
            String M0 = ob6.M0(2131742716, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.V(null, null, 2131742715, c.r(max, false));
            alertDialog$Builder.g(ob6.M0(2131742714, null), null);
            alertDialog$Builder.j(ob6.M0(2131742621, null), new yra(wuaVar, (byte) 1));
            alertDialog$Builder.o();
            return;
        }
        final long j = this.d;
        if (j > 0) {
            user = uc7.s1(wuaVar.a).X1(Long.valueOf(j));
        } else {
            user = null;
        }
        final long e = yac.h(wuaVar.a).e();
        final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.e;
        final TLRPC.Document document = tL_starGiftUnique.getDocument();
        final int i2 = wuaVar.a;
        c C = c.C(i2);
        w58 w58Var = new w58(wuaVar, l01Var, this.g, (byte) 8);
        int i3 = (j > e ? 1 : (j == e ? 0 : -1));
        final boolean z = this.h;
        final String str = this.i;
        if (i3 != 0) {
            if (z) {
                pccVar = null;
            } else {
                pccVar = new pcc() {
                    @Override
                    public final void a(Object obj2) {
                        CharSequence a0;
                        Boolean bool = (Boolean) obj2;
                        if (bool.booleanValue()) {
                            jxa.v(i2, false).M(e);
                        }
                        boolean booleanValue = bool.booleanValue();
                        String str2 = str;
                        if (booleanValue) {
                            a0 = hl.S2(ob6.a0(null, null, 2131749844, str2, wf3.s(j)));
                        } else {
                            a0 = ob6.a0(null, null, 2131749581, str2);
                        }
                        hl.c3(new jr9(null, document, a0));
                    }
                };
            }
        } else {
            pccVar = new pcc() {
                @Override
                public final void a(Object obj2) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    TLRPC.Document document2 = document;
                    if (!booleanValue) {
                        if (!z) {
                            hl.c3(new jr9(null, document2, ob6.a0(null, null, 2131749581, str)));
                            return;
                        }
                        return;
                    }
                    int i4 = i2;
                    jxa v = jxa.v(i4, false);
                    long j2 = e;
                    v.M(j2);
                    String str2 = tL_starGiftUnique.slug;
                    HashMap hashMap = it7.a;
                    if (!TextUtils.isEmpty(str2)) {
                        hl.d3(new no1(i4, 0, str2, false), it7.c[0]);
                    }
                    hl.c3(new jr9(new tz6((byte) 4, j2), document2, ob6.M0(2131750061, null)));
                }
            };
        }
        try {
            int indexOf = stargiftdepositpayload.nft_address.indexOf(58);
            String str2 = stargiftdepositpayload.nft_address;
            if (indexOf >= 0) {
                str2 = c.f0(str2, true);
            }
            String str3 = str2;
            z45 i4 = c.i(stargiftdepositpayload);
            if (pccVar != null) {
                rx1Var = new rx1(C, pccVar, (byte) 27);
            }
            C.o0(user, str3, 0L, null, null, this.f, null, w58Var, rx1Var, i4, null, null);
        } catch (Exception e2) {
            c.n("depositNFT: invalid payload", e2);
            if (e2.getMessage() == null) {
                message = "NULL_ERROR";
            } else {
                message = e2.getMessage();
            }
            w58Var.a(message);
        }
    }
}
