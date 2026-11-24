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
public final class tp7 implements qac {
    public final byte a = 1;
    public final Context b;
    public final int c;
    public final ylb d;
    public final Object e;
    public final TLObject f;
    public final Object g;
    public final Object h;

    public tp7(Context context, int i, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer, TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx, w25 w25Var, ylb ylbVar, c41 c41Var) {
        this.b = context;
        this.c = i;
        this.e = tL_messageActionStarGiftOnchainOffer;
        this.f = tL_payments_starGiftOnchainOfferTx;
        this.g = w25Var;
        this.d = ylbVar;
        this.h = c41Var;
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
                he heVar = new he(3, null, this.b);
                heVar.q(200L);
                TLRPC.TL_messages_checkUrlAuthMatchCode tL_messages_checkUrlAuthMatchCode = new TLRPC.TL_messages_checkUrlAuthMatchCode();
                ((String[]) obj4)[0] = str;
                tL_messages_checkUrlAuthMatchCode.match_code = str;
                tL_messages_checkUrlAuthMatchCode.url = ((TLRPC.TL_messages_requestUrlAuth) tLObject).url;
                ConnectionsManager.getInstance(this.c).sendRequestTyped(tL_messages_checkUrlAuthMatchCode, new kc((byte) 0), new nv0(heVar, (r35) obj3, (String) obj2, this.d, (byte) 13));
                return;
            default:
                final TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj4;
                TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) tLObject;
                final w25 w25Var = (w25) obj3;
                final c41 c41Var = (c41) obj2;
                final long longValue = ((Long) obj).longValue();
                long j = tL_payments_starGiftOnchainOfferTx.fine;
                if (j <= 0) {
                    j = 0;
                }
                long max = Math.max(0L, tL_messageActionStarGiftOnchainOffer.amount - j);
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i > 0) {
                    b = 0;
                    a0 = jb6.a0(null, null, 2131749499, fs7.k(j), fs7.k(max));
                } else {
                    b = 0;
                    a0 = jb6.a0(null, null, 2131749497, fs7.k(max));
                }
                SpannableStringBuilder S2 = gm.S2(a0);
                if (i > 0) {
                    String k = fs7.k(j);
                    Object[] objArr = new Object[1];
                    objArr[b] = k;
                    M0 = jb6.a0(null, null, 2131749498, objArr);
                } else {
                    M0 = jb6.M0(2131749501, null);
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
                w25Var.h = walletonchaingiftactionoffercancel;
                w25Var.i = starGift;
                final long j3 = tL_messageActionStarGiftOnchainOffer.offer_id;
                final boolean[] zArr = new boolean[1];
                yr7.j(j3, Long.MAX_VALUE);
                final ylb ylbVar = this.d;
                final Context context = this.b;
                byte b3 = b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b3, ylbVar, context);
                sr7 sr7Var = new sr7(zArr, j3, b3);
                he heVar2 = alertDialog$Builder.a;
                heVar2.setOnDismissListener(sr7Var);
                heVar2.S = jb6.M0(2131749495, null);
                heVar2.U = S2;
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                final int i3 = this.c;
                alertDialog$Builder.j(M0, new ee() {
                    @Override
                    public final void r(he heVar3, int i4) {
                        w25 w25Var2 = w25Var;
                        Context context2 = context;
                        int i5 = i3;
                        ylb ylbVar2 = ylbVar;
                        if (!pr7.Y0(context2, i5, ylbVar2, w25Var2.b + longValue, 2131749564)) {
                            return;
                        }
                        k11 g = heVar3.g(i4, true, true);
                        g.d();
                        ud7 ud7Var = new ud7(new boolean[1], g, heVar3, (byte) 10);
                        zArr[0] = true;
                        HashSet hashSet = yr7.b;
                        long j4 = j3;
                        hashSet.add(Long.valueOf(j4));
                        yr7.j(j4, 300000L);
                        c.C(i5).n0(w25Var2, new ah1(j4, ud7Var, context2, i5, ylbVar2, c41Var), new p2c(ud7Var, j4, tL_messageActionStarGiftOnchainOffer, (byte) 5), new fu(j4, ud7Var, (byte) 22));
                    }
                });
                alertDialog$Builder.o();
                return;
        }
    }

    public tp7(Context context, String[] strArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, int i, r35 r35Var, String str, ylb ylbVar) {
        this.b = context;
        this.e = strArr;
        this.f = tL_messages_requestUrlAuth;
        this.c = i;
        this.g = r35Var;
        this.h = str;
        this.d = ylbVar;
    }
}
