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
public final class js7 implements qac {
    public final byte a;
    public final long b;
    public final int c;
    public final KeyEvent.Callback d;

    public js7(KeyEvent.Callback callback, long j, int i, byte b) {
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
                ls7 ls7Var = (ls7) callback;
                Long l = (Long) obj;
                if (!ls7Var.J) {
                    final Context context = ls7Var.getContext();
                    final int i2 = ls7Var.a;
                    final TL_stars.TL_starGiftUnique tL_starGiftUnique = ls7Var.l1;
                    final long j = ls7Var.m1;
                    long longValue = l.longValue();
                    final ylb ylbVar = ls7Var.J0;
                    b61 b61Var = ls7Var.v1;
                    Objects.requireNonNull(b61Var);
                    final ci7 ci7Var = new ci7(b61Var, (byte) 6);
                    final c41 c41Var = new c41(ls7Var.c, ls7Var.J0);
                    final is7 is7Var = new is7(ls7Var, (byte) 1);
                    final is7 is7Var2 = new is7(ls7Var, (byte) 2);
                    HashMap hashMap = yr7.a;
                    TL_stars.sendStarGiftOnchainOffer sendstargiftonchainoffer = new TL_stars.sendStarGiftOnchainOffer();
                    sendstargiftonchainoffer.slug = tL_starGiftUnique.slug;
                    final long j2 = this.b;
                    sendstargiftonchainoffer.amount = j2;
                    sendstargiftonchainoffer.duration = i;
                    sendstargiftonchainoffer.random_id = longValue;
                    fs7.h(tL_starGiftUnique);
                    ci7Var.a(Boolean.TRUE);
                    ConnectionsManager.getInstance(i2).sendRequestTyped(sendstargiftonchainoffer, new kc((byte) 0), new jac() {
                        @Override
                        public final void a(Object obj2, Object obj3) {
                            String str;
                            String a0;
                            pr7 pr7Var;
                            TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) obj2;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                            ci7.this.a(Boolean.FALSE);
                            int i3 = i2;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                            Context context2 = context;
                            ylb ylbVar2 = ylbVar;
                            c41 c41Var2 = c41Var;
                            if (tL_payments_starGiftOnchainOfferTx != null && tL_payments_starGiftOnchainOfferTx.message != null) {
                                w25 p = yr7.p(context2, ylbVar2, c41Var2, i3, tL_payments_starGiftOnchainOfferTx);
                                if (p == null) {
                                    return;
                                }
                                String h = fs7.h(tL_starGiftUnique2);
                                pr7 pr7Var2 = new pr7(context2, i3, tL_starGiftUnique2, ylbVar2);
                                long j3 = j;
                                if (j3 != 0) {
                                    str = pg3.r(i3, j3);
                                } else {
                                    str = null;
                                }
                                String M0 = jb6.M0(2131749555, null);
                                int i4 = 0;
                                if (!TextUtils.isEmpty(str)) {
                                    a0 = jb6.a0(null, null, 2131749556, str, h);
                                } else {
                                    a0 = jb6.a0(null, null, 2131749557, h);
                                }
                                pr7Var2.e1(gm.S2(a0), M0);
                                int f = fs7.f(tL_starGiftUnique2);
                                long j4 = j2;
                                long n = fs7.n(f, j4);
                                long j5 = p.b;
                                long j6 = ((j5 + 99999) / 100000) * 100000;
                                long max = Math.max(0L, j6 - j4);
                                ?? r13 = 0;
                                String M02 = jb6.M0(2131749522, null);
                                SpannableStringBuilder i5 = fs7.i(j4 - n);
                                mhb mhbVar = pr7Var2.Y1;
                                mhbVar.f(M02, i5, null, null);
                                if (n > 0) {
                                    r13 = 0;
                                    mhbVar.f(jb6.M0(2131749524, null), TextUtils.concat(fs7.i(n), " ", y51.b(fs7.g(f), null, ylbVar2, null)), null, null);
                                }
                                if (j5 > j4) {
                                    mhbVar.f(jb6.M0(2131749489, r13), fs7.i(max), r13, r13);
                                }
                                mhbVar.f(jb6.M0(2131749523, r13), fs7.i(j6), r13, r13);
                                mhbVar.f(jb6.M0(2131749481, r13), h, r13, r13);
                                int i6 = tL_payments_starGiftOnchainOfferTx.expires_at;
                                if (i6 > 0) {
                                    pr7Var = pr7Var2;
                                    mhbVar.f(jb6.M0(2131749525, r13), jb6.x(i6, true), r13, r13);
                                } else {
                                    pr7Var = pr7Var2;
                                }
                                TL_wallet.walletOnchainGiftActionOfferCreate walletonchaingiftactionoffercreate = new TL_wallet.walletOnchainGiftActionOfferCreate();
                                walletonchaingiftactionoffercreate.offer_address = tL_payments_starGiftOnchainOfferTx.offer_address;
                                if (!TextUtils.isEmpty(tL_starGiftUnique2.owner_address)) {
                                    walletonchaingiftactionoffercreate.flags |= 1;
                                    walletonchaingiftactionoffercreate.counterparty_address = tL_starGiftUnique2.owner_address;
                                }
                                walletonchaingiftactionoffercreate.price = j4;
                                walletonchaingiftactionoffercreate.amount = j5;
                                walletonchaingiftactionoffercreate.service_fee = n;
                                if (i6 > 0) {
                                    walletonchaingiftactionoffercreate.flags |= 2;
                                    walletonchaingiftactionoffercreate.expires_at = i6;
                                }
                                p.h = walletonchaingiftactionoffercreate;
                                p.i = tL_starGiftUnique2;
                                SpannableStringBuilder S2 = gm.S2(jb6.M0(2131749528, null));
                                pr7 pr7Var3 = pr7Var;
                                l66 l66Var = pr7Var3.Z1;
                                l66Var.setText(S2);
                                if (TextUtils.isEmpty(S2)) {
                                    i4 = 8;
                                }
                                l66Var.setVisibility(i4);
                                pr7Var3.p2 = 2131749563;
                                pr7Var3.d1(p);
                                pr7Var3.s2 = new h65(is7Var2, p, i6, (byte) 18);
                                pr7Var3.c1(new kl7(is7Var, (byte) 5), new ci7(tL_starGiftUnique2, (byte) 5), new qr7(context2, i3, ylbVar2, pr7Var3, (byte) 1));
                                pr7Var3.show();
                                return;
                            }
                            if (tL_error != null && "STARGIFT_ONCHAIN_OFFER_INTENT_CONFLICT".equals(tL_error.text)) {
                                String str2 = tL_starGiftUnique2.slug;
                                cf7 Y = cf7.Y(i3);
                                Y.a.c(new q87(Y, str2, (byte) 25));
                            }
                            fs7.r(context2, i3, ylbVar2, c41Var2, tL_error, null);
                        }
                    });
                    return;
                }
                return;
            default:
                ((nha) callback).D0(i, this.b, (ArrayList) obj);
                return;
        }
    }
}
