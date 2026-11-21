package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.p31;
public final class g4 implements x10 {
    public final int f3669a = 0;
    public final Context f3670b;
    public final int f3671c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final Object f3672e;
    public final TLObject f3673f;
    public final Object f3674g;
    public final Object h;

    public g4(Context context, int i7, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer, TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx, org.telegram.ui.Wallet.p0 p0Var, org.telegram.ui.ActionBar.h6 h6Var, lc lcVar) {
        this.f3670b = context;
        this.f3671c = i7;
        this.f3672e = tL_messageActionStarGiftOnchainOffer;
        this.f3673f = tL_payments_starGiftOnchainOfferTx;
        this.f3674g = p0Var;
        this.d = h6Var;
        this.h = lcVar;
    }

    @Override
    public final void a(Object obj) {
        long j3;
        String a02;
        String N0;
        int i7 = this.f3669a;
        Object obj2 = this.h;
        Object obj3 = this.f3674g;
        TLObject tLObject = this.f3673f;
        Object obj4 = this.f3672e;
        switch (i7) {
            case 0:
                final TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj4;
                TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) tLObject;
                final org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) obj3;
                final lc lcVar = (lc) obj2;
                final long longValue = ((Long) obj).longValue();
                long j10 = tL_payments_starGiftOnchainOfferTx.fine;
                if (j10 <= 0) {
                    j10 = 0;
                }
                long max = Math.max(0L, tL_messageActionStarGiftOnchainOffer.amount - j10);
                int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i10 > 0) {
                    j3 = 0;
                    a02 = gd.a0(null, null, 2131749549, y4.k(j10), y4.k(max));
                } else {
                    j3 = 0;
                    a02 = gd.a0(null, null, 2131749547, y4.k(max));
                }
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(a02);
                if (i10 > 0) {
                    N0 = gd.a0(null, null, 2131749548, y4.k(j10));
                } else {
                    N0 = gd.N0(2131749551, null);
                }
                TL_wallet.walletOnchainGiftActionOfferCancel walletonchaingiftactionoffercancel = new TL_wallet.walletOnchainGiftActionOfferCancel();
                walletonchaingiftactionoffercancel.offer_address = tL_messageActionStarGiftOnchainOffer.offer_address;
                int i11 = walletonchaingiftactionoffercancel.flags;
                walletonchaingiftactionoffercancel.flags = i11 | 2;
                walletonchaingiftactionoffercancel.price = tL_messageActionStarGiftOnchainOffer.amount;
                walletonchaingiftactionoffercancel.refund_amount = max;
                long j11 = tL_payments_starGiftOnchainOfferTx.fine;
                if (j11 > j3) {
                    walletonchaingiftactionoffercancel.flags = i11 | 6;
                    walletonchaingiftactionoffercancel.fine = j11;
                }
                TL_stars.StarGift starGift = tL_messageActionStarGiftOnchainOffer.gift;
                p0Var.h = walletonchaingiftactionoffercancel;
                p0Var.f44777i = starGift;
                final long j12 = tL_messageActionStarGiftOnchainOffer.offer_id;
                final boolean[] zArr = new boolean[1];
                i4.j(j12, Long.MAX_VALUE);
                final Context context = this.f3670b;
                final org.telegram.ui.ActionBar.h6 h6Var = this.d;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
                y3 y3Var = new y3(zArr, j12, 0);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
                t1Var.setOnDismissListener(y3Var);
                t1Var.S = gd.N0(2131749545, null);
                t1Var.U = W2;
                alertDialog$Builder.h(gd.N0(2131752577, null), null);
                final int i12 = this.f3671c;
                alertDialog$Builder.k(N0, new org.telegram.ui.ActionBar.q1() {
                    @Override
                    public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i13) {
                        org.telegram.ui.Wallet.p0 p0Var2 = p0Var;
                        Context context2 = context;
                        int i14 = i12;
                        org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                        if (!s3.e1(context2, i14, h6Var2, p0Var2.f44772b + longValue, 2131749614)) {
                            return;
                        }
                        vf.b h = t1Var2.h(i13, true, true);
                        h.d();
                        aa.r rVar = new aa.r(new boolean[1], h, t1Var2, 10);
                        zArr[0] = true;
                        HashSet hashSet = i4.f3721b;
                        long j13 = j12;
                        hashSet.add(Long.valueOf(j13));
                        i4.j(j13, 300000L);
                        org.telegram.ui.Wallet.u0.D(i14).o0(p0Var2, new a4(j13, rVar, context2, i14, h6Var2, lcVar), new b4(rVar, j13, tL_messageActionStarGiftOnchainOffer), new c4(j13, rVar));
                    }
                });
                alertDialog$Builder.p();
                return;
            default:
                String str = (String) obj;
                org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, this.f3670b, null);
                t1Var2.r(200L);
                TLRPC.TL_messages_checkUrlAuthMatchCode tL_messages_checkUrlAuthMatchCode = new TLRPC.TL_messages_checkUrlAuthMatchCode();
                ((String[]) obj4)[0] = str;
                tL_messages_checkUrlAuthMatchCode.match_code = str;
                tL_messages_checkUrlAuthMatchCode.url = ((TLRPC.TL_messages_requestUrlAuth) tLObject).url;
                ConnectionsManager.getInstance(this.f3671c).sendRequestTyped(tL_messages_checkUrlAuthMatchCode, new d3.b(1), new di.e2(t1Var2, (p31) obj3, (String) obj2, this.d, 2));
                return;
        }
    }

    public g4(Context context, String[] strArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, int i7, p31 p31Var, String str, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f3670b = context;
        this.f3672e = strArr;
        this.f3673f = tL_messages_requestUrlAuth;
        this.f3671c = i7;
        this.f3674g = p31Var;
        this.h = str;
        this.d = h6Var;
    }
}
