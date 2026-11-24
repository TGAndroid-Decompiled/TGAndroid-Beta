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
public final class qn7 implements p8c {
    public final byte a = 1;
    public final Context b;
    public final int c;
    public final wjb d;
    public final Object e;
    public final TLObject f;
    public final Object g;
    public final Object h;

    public qn7(Context context, int i, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer, TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx, w05 w05Var, wjb wjbVar, u21 u21Var) {
        this.b = context;
        this.c = i;
        this.e = tL_messageActionStarGiftOnchainOffer;
        this.f = tL_payments_starGiftOnchainOfferTx;
        this.g = w05Var;
        this.d = wjbVar;
        this.h = u21Var;
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
                hd hdVar = new hd(3, null, this.b);
                hdVar.q(200L);
                TLRPC.TL_messages_checkUrlAuthMatchCode tL_messages_checkUrlAuthMatchCode = new TLRPC.TL_messages_checkUrlAuthMatchCode();
                ((String[]) obj4)[0] = str;
                tL_messages_checkUrlAuthMatchCode.match_code = str;
                tL_messages_checkUrlAuthMatchCode.url = ((TLRPC.TL_messages_requestUrlAuth) tLObject).url;
                ConnectionsManager.getInstance(this.c).sendRequestTyped(tL_messages_checkUrlAuthMatchCode, new hc((byte) 0), new eu0(hdVar, (r15) obj3, (String) obj2, this.d, (byte) 13));
                return;
            default:
                final TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj4;
                TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) tLObject;
                final w05 w05Var = (w05) obj3;
                final u21 u21Var = (u21) obj2;
                final long longValue = ((Long) obj).longValue();
                long j = tL_payments_starGiftOnchainOfferTx.fine;
                if (j <= 0) {
                    j = 0;
                }
                long max = Math.max(0L, tL_messageActionStarGiftOnchainOffer.amount - j);
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i > 0) {
                    b = 0;
                    a0 = k96.a0(null, null, 2131749550, cq7.k(j), cq7.k(max));
                } else {
                    b = 0;
                    a0 = k96.a0(null, null, 2131749548, cq7.k(max));
                }
                SpannableStringBuilder T2 = gl.T2(a0);
                if (i > 0) {
                    String k = cq7.k(j);
                    Object[] objArr = new Object[1];
                    objArr[b] = k;
                    M0 = k96.a0(null, null, 2131749549, objArr);
                } else {
                    M0 = k96.M0(2131749552, null);
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
                w05Var.h = walletonchaingiftactionoffercancel;
                w05Var.i = starGift;
                final long j3 = tL_messageActionStarGiftOnchainOffer.offer_id;
                final boolean[] zArr = new boolean[1];
                vp7.j(j3, Long.MAX_VALUE);
                final wjb wjbVar = this.d;
                final Context context = this.b;
                byte b3 = b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b3, wjbVar, context);
                pp7 pp7Var = new pp7(zArr, j3, b3);
                hd hdVar2 = alertDialog$Builder.a;
                hdVar2.setOnDismissListener(pp7Var);
                hdVar2.S = k96.M0(2131749546, null);
                hdVar2.U = T2;
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                final int i3 = this.c;
                alertDialog$Builder.j(M0, new ed() {
                    @Override
                    public final void u(hd hdVar3, int i4) {
                        w05 w05Var2 = w05Var;
                        Context context2 = context;
                        int i5 = i3;
                        wjb wjbVar2 = wjbVar;
                        if (!mp7.Y0(context2, i5, wjbVar2, w05Var2.b + longValue, 2131749615)) {
                            return;
                        }
                        c01 g = hdVar3.g(i4, true, true);
                        g.d();
                        pc7 pc7Var = new pc7(new boolean[1], g, hdVar3, (byte) 7);
                        zArr[0] = true;
                        HashSet hashSet = vp7.b;
                        long j4 = j3;
                        hashSet.add(Long.valueOf(j4));
                        vp7.j(j4, 300000L);
                        c.C(i5).n0(w05Var2, new sf1(j4, pc7Var, context2, i5, wjbVar2, u21Var), new p0c(pc7Var, j4, tL_messageActionStarGiftOnchainOffer, (byte) 5), new et(j4, pc7Var, (byte) 22));
                    }
                });
                alertDialog$Builder.o();
                return;
        }
    }

    public qn7(Context context, String[] strArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, int i, r15 r15Var, String str, wjb wjbVar) {
        this.b = context;
        this.e = strArr;
        this.f = tL_messages_requestUrlAuth;
        this.c = i;
        this.g = r15Var;
        this.h = str;
        this.d = wjbVar;
    }
}
