package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.c;
public final class pq7 implements pcc {
    public final byte a = 1;
    public final Context b;
    public final int c;
    public final vnb d;
    public final Object e;
    public final TLObject f;
    public final Object g;
    public final Object h;

    public pq7(Context context, int i, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer, TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx, a35 a35Var, vnb vnbVar, d31 d31Var) {
        this.b = context;
        this.c = i;
        this.e = tL_messageActionStarGiftOnchainOffer;
        this.f = tL_payments_starGiftOnchainOfferTx;
        this.g = a35Var;
        this.d = vnbVar;
        this.h = d31Var;
    }

    @Override
    public final void a(Object obj) {
        byte b;
        String a0;
        String M0;
        byte b2 = this.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        TLObject tLObject = this.f;
        Object obj4 = this.e;
        switch (b2) {
            case 0:
                String str = (String) obj;
                id idVar = new id(3, null, this.b);
                idVar.q(200L);
                TLRPC.TL_messages_checkUrlAuthMatchCode tL_messages_checkUrlAuthMatchCode = new TLRPC.TL_messages_checkUrlAuthMatchCode();
                ((String[]) obj4)[0] = str;
                tL_messages_checkUrlAuthMatchCode.match_code = str;
                tL_messages_checkUrlAuthMatchCode.url = ((TLRPC.TL_messages_requestUrlAuth) tLObject).url;
                ConnectionsManager.getInstance(this.c).sendRequestTyped(tL_messages_checkUrlAuthMatchCode, new ic((byte) 0), new nu0(idVar, (x35) obj3, (String) obj2, this.d, (byte) 13));
                return;
            default:
                final TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj4;
                TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) tLObject;
                final a35 a35Var = (a35) obj3;
                final d31 d31Var = (d31) obj2;
                final long longValue = ((Long) obj).longValue();
                long j = tL_payments_starGiftOnchainOfferTx.fine;
                if (j <= 0) {
                    j = 0;
                }
                long max = Math.max(0L, tL_messageActionStarGiftOnchainOffer.amount - j);
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i > 0) {
                    b = 0;
                    a0 = ob6.a0(null, null, 2131749511, it7.l(j), it7.l(max));
                } else {
                    b = 0;
                    a0 = ob6.a0(null, null, 2131749509, it7.l(max));
                }
                SpannableStringBuilder S2 = hl.S2(a0);
                if (i > 0) {
                    String l = it7.l(j);
                    Object[] objArr = new Object[1];
                    objArr[b] = l;
                    M0 = ob6.a0(null, null, 2131749510, objArr);
                } else {
                    M0 = ob6.M0(2131749513, null);
                }
                TL_wallet.walletOnchainGiftActionOfferCancel walletonchaingiftactionoffercancel = new TL_wallet.walletOnchainGiftActionOfferCancel();
                walletonchaingiftactionoffercancel.offer_address = tL_messageActionStarGiftOnchainOffer.offer_address;
                int i2 = walletonchaingiftactionoffercancel.flags;
                walletonchaingiftactionoffercancel.flags = i2 | 2;
                walletonchaingiftactionoffercancel.price = tL_messageActionStarGiftOnchainOffer.amount;
                walletonchaingiftactionoffercancel.refund_amount = max;
                long j2 = tL_payments_starGiftOnchainOfferTx.fine;
                if (j2 > 0) {
                    walletonchaingiftactionoffercancel.flags = i2 | 6;
                    walletonchaingiftactionoffercancel.fine = j2;
                }
                TL_stars.StarGift starGift = tL_messageActionStarGiftOnchainOffer.gift;
                a35Var.h = walletonchaingiftactionoffercancel;
                a35Var.i = starGift;
                final long j3 = tL_messageActionStarGiftOnchainOffer.offer_id;
                final boolean[] zArr = new boolean[1];
                vs7.j(j3, Long.MAX_VALUE);
                final vnb vnbVar = this.d;
                final Context context = this.b;
                byte b3 = b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b3, vnbVar, context);
                ps7 ps7Var = new ps7(zArr, j3, b3);
                id idVar2 = alertDialog$Builder.a;
                idVar2.setOnDismissListener(ps7Var);
                idVar2.S = ob6.M0(2131749507, null);
                idVar2.U = S2;
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                final int i3 = this.c;
                alertDialog$Builder.j(M0, new fd() {
                    @Override
                    public final void w(id idVar3, int i4) {
                        a35 a35Var2 = a35Var;
                        Context context2 = context;
                        int i5 = i3;
                        vnb vnbVar2 = vnbVar;
                        if (!ms7.Z0(context2, i5, vnbVar2, a35Var2.b + longValue, 2131749576)) {
                            return;
                        }
                        l01 g = idVar3.g(i4, true, true);
                        g.d();
                        gd7 gd7Var = new gd7(new boolean[1], g, idVar3, (byte) 15);
                        zArr[0] = true;
                        HashSet hashSet = vs7.b;
                        long j4 = j3;
                        hashSet.add(Long.valueOf(j4));
                        vs7.j(j4, 300000L);
                        c.C(i5).p0(a35Var2, new dg1(j4, gd7Var, context2, i5, vnbVar2, d31Var), new p4c(gd7Var, j4, tL_messageActionStarGiftOnchainOffer, (byte) 5), new kt(j4, gd7Var, (byte) 22));
                    }
                });
                alertDialog$Builder.o();
                return;
        }
    }

    public pq7(Context context, String[] strArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, int i, x35 x35Var, String str, vnb vnbVar) {
        this.b = context;
        this.e = strArr;
        this.f = tL_messages_requestUrlAuth;
        this.c = i;
        this.g = x35Var;
        this.h = str;
        this.d = vnbVar;
    }
}
