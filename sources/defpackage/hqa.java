package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.c;
public final class hqa implements qac {
    public final wsa a;
    public final long b;
    public final k11 c;
    public final long d;
    public final TL_stars.TL_starGiftUnique e;
    public final TL_wallet.nftItem f;
    public final yw4 g;
    public final boolean h;
    public final String i;

    public hqa(wsa wsaVar, long j, k11 k11Var, long j2, TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_wallet.nftItem nftitem, yw4 yw4Var, boolean z, String str) {
        this.a = wsaVar;
        this.b = j;
        this.c = k11Var;
        this.d = j2;
        this.e = tL_starGiftUnique;
        this.f = nftitem;
        this.g = yw4Var;
        this.h = z;
        this.i = str;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.User user;
        qac qacVar;
        String message;
        TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
        long max = Math.max(0L, this.b) + stargiftdepositpayload.amount;
        wsa wsaVar = this.a;
        int i = (c.C(wsaVar.a).z() > max ? 1 : (c.C(wsaVar.a).z() == max ? 0 : -1));
        k11 k11Var = this.c;
        qy1 qy1Var = null;
        if (i < 0) {
            k11Var.b();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wsaVar.J0, wsaVar.getContext());
            String M0 = jb6.M0(2131742748, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.V(null, null, 2131742747, c.r(max, false));
            alertDialog$Builder.g(jb6.M0(2131742746, null), null);
            alertDialog$Builder.j(jb6.M0(2131742653, null), new ypa(wsaVar, (byte) 1));
            alertDialog$Builder.o();
            return;
        }
        final long j = this.d;
        if (j > 0) {
            user = oc7.r1(wsaVar.a).W1(Long.valueOf(j));
        } else {
            user = null;
        }
        final long e = z8c.h(wsaVar.a).e();
        final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.e;
        final TLRPC.Document document = tL_starGiftUnique.getDocument();
        final int i2 = wsaVar.a;
        c C = c.C(i2);
        i48 i48Var = new i48(wsaVar, k11Var, this.g, (byte) 8);
        int i3 = (j > e ? 1 : (j == e ? 0 : -1));
        final boolean z = this.h;
        final String str = this.i;
        if (i3 != 0) {
            if (z) {
                qacVar = null;
            } else {
                qacVar = new qac() {
                    @Override
                    public final void a(Object obj2) {
                        Object a0;
                        Boolean bool = (Boolean) obj2;
                        if (bool.booleanValue()) {
                            jva.v(i2, false).M(e);
                        }
                        boolean booleanValue = bool.booleanValue();
                        String str2 = str;
                        if (booleanValue) {
                            a0 = gm.S2(jb6.a0(null, null, 2131749831, str2, pg3.s(j)));
                        } else {
                            a0 = jb6.a0(null, null, 2131749569, str2);
                        }
                        gm.c3(new hw9((Object) null, document, a0, (byte) 19));
                    }
                };
            }
        } else {
            qacVar = new qac() {
                @Override
                public final void a(Object obj2) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    TLRPC.Document document2 = document;
                    if (!booleanValue) {
                        if (!z) {
                            gm.c3(new hw9((Object) null, document2, jb6.a0(null, null, 2131749569, str), (byte) 19));
                            return;
                        }
                        return;
                    }
                    int i4 = i2;
                    jva v = jva.v(i4, false);
                    long j2 = e;
                    v.M(j2);
                    String str2 = tL_starGiftUnique.slug;
                    if (!TextUtils.isEmpty(str2)) {
                        gm.d3(new ep1(i4, 0, str2, false), fs7.b[0]);
                    }
                    gm.c3(new hw9(new pz6((byte) 4, j2), document2, jb6.M0(2131750035, null), (byte) 19));
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
            v45 i4 = c.i(stargiftdepositpayload);
            if (qacVar != null) {
                qy1Var = new qy1(C, qacVar, (byte) 27);
            }
            C.m0(user, str3, 0L, null, null, this.f, null, i48Var, qy1Var, i4, null, null);
        } catch (Exception e2) {
            c.n("depositNFT: invalid payload", e2);
            if (e2.getMessage() == null) {
                message = "NULL_ERROR";
            } else {
                message = e2.getMessage();
            }
            i48Var.a(message);
        }
    }
}
