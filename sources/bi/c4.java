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
import org.telegram.ui.Components.n31;
public final class c4 implements x10 {
    public final int f3488a = 0;
    public final Context f3489b;
    public final int f3490c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final Object f3491e;
    public final TLObject f3492f;
    public final Object f3493g;
    public final Object h;

    public c4(Context context, int i7, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer, TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx, org.telegram.ui.Wallet.p0 p0Var, org.telegram.ui.ActionBar.i6 i6Var, lc lcVar) {
        this.f3489b = context;
        this.f3490c = i7;
        this.f3491e = tL_messageActionStarGiftOnchainOffer;
        this.f3492f = tL_payments_starGiftOnchainOfferTx;
        this.f3493g = p0Var;
        this.d = i6Var;
        this.h = lcVar;
    }

    @Override
    public final void a(Object obj) {
        long j3;
        String a02;
        String M0;
        int i7 = this.f3488a;
        Object obj2 = this.h;
        Object obj3 = this.f3493g;
        TLObject tLObject = this.f3492f;
        Object obj4 = this.f3491e;
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
                    a02 = gd.a0(null, null, 2131749550, u4.k(j10), u4.k(max));
                } else {
                    j3 = 0;
                    a02 = gd.a0(null, null, 2131749548, u4.k(max));
                }
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(a02);
                if (i10 > 0) {
                    M0 = gd.a0(null, null, 2131749549, u4.k(j10));
                } else {
                    M0 = gd.M0(2131749552, null);
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
                p0Var.f44737i = starGift;
                final long j12 = tL_messageActionStarGiftOnchainOffer.offer_id;
                final boolean[] zArr = new boolean[1];
                e4.j(j12, Long.MAX_VALUE);
                final Context context = this.f3489b;
                final org.telegram.ui.ActionBar.i6 i6Var = this.d;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
                u3 u3Var = new u3(zArr, j12, 0);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                u1Var.setOnDismissListener(u3Var);
                u1Var.S = gd.M0(2131749546, null);
                u1Var.U = W2;
                alertDialog$Builder.h(gd.M0(2131752578, null), null);
                final int i12 = this.f3490c;
                alertDialog$Builder.k(M0, new org.telegram.ui.ActionBar.r1() {
                    @Override
                    public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i13) {
                        org.telegram.ui.Wallet.p0 p0Var2 = p0Var;
                        Context context2 = context;
                        int i14 = i12;
                        org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                        if (!o3.e1(context2, i14, i6Var2, p0Var2.f44732b + longValue, 2131749615)) {
                            return;
                        }
                        vf.b h = u1Var2.h(i13, true, true);
                        h.d();
                        aa.r rVar = new aa.r(new boolean[1], h, u1Var2, 9);
                        zArr[0] = true;
                        HashSet hashSet = e4.f3544b;
                        long j13 = j12;
                        hashSet.add(Long.valueOf(j13));
                        e4.j(j13, 300000L);
                        org.telegram.ui.Wallet.u0.D(i14).o0(p0Var2, new w3(j13, rVar, context2, i14, i6Var2, lcVar), new x3(rVar, j13, tL_messageActionStarGiftOnchainOffer), new y3(j13, rVar));
                    }
                });
                alertDialog$Builder.p();
                return;
            default:
                String str = (String) obj;
                org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, this.f3489b, null);
                u1Var2.r(200L);
                TLRPC.TL_messages_checkUrlAuthMatchCode tL_messages_checkUrlAuthMatchCode = new TLRPC.TL_messages_checkUrlAuthMatchCode();
                ((String[]) obj4)[0] = str;
                tL_messages_checkUrlAuthMatchCode.match_code = str;
                tL_messages_checkUrlAuthMatchCode.url = ((TLRPC.TL_messages_requestUrlAuth) tLObject).url;
                ConnectionsManager.getInstance(this.f3490c).sendRequestTyped(tL_messages_checkUrlAuthMatchCode, new d3.b(1), new di.e2(u1Var2, (n31) obj3, (String) obj2, this.d, 2));
                return;
        }
    }

    public c4(Context context, String[] strArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, int i7, n31 n31Var, String str, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f3489b = context;
        this.f3491e = strArr;
        this.f3492f = tL_messages_requestUrlAuth;
        this.f3490c = i7;
        this.f3493g = n31Var;
        this.h = str;
        this.d = i6Var;
    }
}
