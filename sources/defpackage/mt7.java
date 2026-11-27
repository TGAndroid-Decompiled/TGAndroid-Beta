package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
public final class mt7 implements pcc {
    public final byte a;
    public final long b;
    public final int c;
    public final KeyEvent.Callback d;

    public mt7(KeyEvent.Callback callback, long j, int i, byte b) {
        this.a = b;
        this.d = callback;
        this.b = j;
        this.c = i;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        int i = this.c;
        KeyEvent.Callback callback = this.d;
        switch (b) {
            case 0:
                ot7 ot7Var = (ot7) callback;
                Long l = (Long) obj;
                if (!ot7Var.J) {
                    final Context context = ot7Var.getContext();
                    final int i2 = ot7Var.a;
                    final TL_stars.TL_starGiftUnique tL_starGiftUnique = ot7Var.l1;
                    final long j = ot7Var.m1;
                    long longValue = l.longValue();
                    final vnb vnbVar = ot7Var.J0;
                    c51 c51Var = ot7Var.v1;
                    Objects.requireNonNull(c51Var);
                    final ii7 ii7Var = new ii7(c51Var, (byte) 7);
                    final d31 d31Var = new d31(ot7Var.c, ot7Var.J0);
                    final lt7 lt7Var = new lt7(ot7Var, (byte) 1);
                    final lt7 lt7Var2 = new lt7(ot7Var, (byte) 2);
                    HashMap hashMap = vs7.a;
                    TL_stars.sendStarGiftOnchainOffer sendstargiftonchainoffer = new TL_stars.sendStarGiftOnchainOffer();
                    sendstargiftonchainoffer.slug = tL_starGiftUnique.slug;
                    final long j2 = this.b;
                    sendstargiftonchainoffer.amount = j2;
                    sendstargiftonchainoffer.duration = i;
                    sendstargiftonchainoffer.random_id = longValue;
                    it7.i(tL_starGiftUnique);
                    ii7Var.a(Boolean.TRUE);
                    ConnectionsManager.getInstance(i2).sendRequestTyped(sendstargiftonchainoffer, new ic((byte) 0), new icc() {
                        @Override
                        public final void a(Object obj2, Object obj3) {
                            String str;
                            String a0;
                            ms7 ms7Var;
                            TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) obj2;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                            ii7.this.a(Boolean.FALSE);
                            int i3 = i2;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                            Context context2 = context;
                            vnb vnbVar2 = vnbVar;
                            d31 d31Var2 = d31Var;
                            if (tL_payments_starGiftOnchainOfferTx != null && tL_payments_starGiftOnchainOfferTx.message != null) {
                                a35 p = vs7.p(context2, vnbVar2, d31Var2, i3, tL_payments_starGiftOnchainOfferTx);
                                if (p == null) {
                                    return;
                                }
                                String i4 = it7.i(tL_starGiftUnique2);
                                ms7 ms7Var2 = new ms7(context2, i3, tL_starGiftUnique2, vnbVar2);
                                long j3 = j;
                                if (j3 != 0) {
                                    str = wf3.r(i3, j3);
                                } else {
                                    str = null;
                                }
                                String M0 = ob6.M0(2131749567, null);
                                if (!TextUtils.isEmpty(str)) {
                                    a0 = ob6.a0(null, null, 2131749568, str, i4);
                                } else {
                                    a0 = ob6.a0(null, null, 2131749569, i4);
                                }
                                ms7Var2.h1(hl.S2(a0), M0);
                                int g = it7.g(tL_starGiftUnique2);
                                long j4 = j2;
                                long p2 = it7.p(g, j4);
                                long j5 = p.b;
                                long j6 = ((j5 + 99999) / 100000) * 100000;
                                long max = Math.max(0L, j6 - j4);
                                ?? r13 = 0;
                                String M02 = ob6.M0(2131749534, null);
                                SpannableStringBuilder j7 = it7.j(j4 - p2);
                                hjb hjbVar = ms7Var2.Y1;
                                hjbVar.f(M02, j7, null, null);
                                if (p2 > 0) {
                                    r13 = 0;
                                    hjbVar.f(ob6.M0(2131749536, null), TextUtils.concat(it7.j(p2), " ", z41.b(it7.h(g), null, vnbVar2, null)), null, null);
                                }
                                if (j5 > j4) {
                                    hjbVar.f(ob6.M0(2131749501, r13), it7.j(max), r13, r13);
                                }
                                hjbVar.f(ob6.M0(2131749535, r13), it7.j(j6), r13, r13);
                                hjbVar.f(ob6.M0(2131749493, r13), i4, r13, r13);
                                int i5 = tL_payments_starGiftOnchainOfferTx.expires_at;
                                if (i5 > 0) {
                                    ms7Var = ms7Var2;
                                    hjbVar.f(ob6.M0(2131749537, r13), ob6.x(i5, true), r13, r13);
                                } else {
                                    ms7Var = ms7Var2;
                                }
                                TL_wallet.walletOnchainGiftActionOfferCreate walletonchaingiftactionoffercreate = new TL_wallet.walletOnchainGiftActionOfferCreate();
                                walletonchaingiftactionoffercreate.offer_address = tL_payments_starGiftOnchainOfferTx.offer_address;
                                if (!TextUtils.isEmpty(tL_starGiftUnique2.owner_address)) {
                                    walletonchaingiftactionoffercreate.flags |= 1;
                                    walletonchaingiftactionoffercreate.counterparty_address = tL_starGiftUnique2.owner_address;
                                }
                                walletonchaingiftactionoffercreate.price = j4;
                                walletonchaingiftactionoffercreate.amount = j5;
                                walletonchaingiftactionoffercreate.service_fee = p2;
                                if (i5 > 0) {
                                    walletonchaingiftactionoffercreate.flags |= 2;
                                    walletonchaingiftactionoffercreate.expires_at = i5;
                                }
                                p.h = walletonchaingiftactionoffercreate;
                                p.i = tL_starGiftUnique2;
                                ms7 ms7Var3 = ms7Var;
                                ms7Var3.g1(hl.S2(ob6.M0(2131749540, null)));
                                ms7Var3.p2 = 2131749575;
                                ms7Var3.f1(p);
                                ms7Var3.s2 = new l65(lt7Var2, p, i5, (byte) 18);
                                ms7Var3.d1(new fe7(lt7Var, (byte) 13), new ii7(tL_starGiftUnique2, (byte) 6), new ns7(context2, i3, vnbVar2, ms7Var3, (byte) 1));
                                ms7Var3.show();
                                return;
                            }
                            if (tL_error != null && "STARGIFT_ONCHAIN_OFFER_INTENT_CONFLICT".equals(tL_error.text)) {
                                String str2 = tL_starGiftUnique2.slug;
                                jf7 Y = jf7.Y(i3);
                                Y.a.c(new t87(Y, str2, (byte) 23));
                            }
                            it7.u(context2, i3, vnbVar2, d31Var2, tL_error, null);
                        }
                    });
                    return;
                }
                return;
            default:
                ((eja) callback).D0(i, this.b, (ArrayList) obj);
                return;
        }
    }
}
