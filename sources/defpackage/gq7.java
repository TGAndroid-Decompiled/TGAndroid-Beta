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
public final class gq7 implements p8c {
    public final byte a;
    public final long b;
    public final int c;
    public final KeyEvent.Callback d;

    public gq7(KeyEvent.Callback callback, long j, int i, byte b) {
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
                iq7 iq7Var = (iq7) callback;
                Long l = (Long) obj;
                if (!iq7Var.J) {
                    final Context context = iq7Var.getContext();
                    final int i2 = iq7Var.a;
                    final TL_stars.TL_starGiftUnique tL_starGiftUnique = iq7Var.l1;
                    final long j = iq7Var.m1;
                    long longValue = l.longValue();
                    final wjb wjbVar = iq7Var.J0;
                    u41 u41Var = iq7Var.v1;
                    Objects.requireNonNull(u41Var);
                    final zf7 zf7Var = new zf7(u41Var, (byte) 6);
                    final u21 u21Var = new u21(iq7Var.c, iq7Var.J0);
                    final fq7 fq7Var = new fq7(iq7Var, (byte) 1);
                    final fq7 fq7Var2 = new fq7(iq7Var, (byte) 2);
                    HashMap hashMap = vp7.a;
                    TL_stars.sendStarGiftOnchainOffer sendstargiftonchainoffer = new TL_stars.sendStarGiftOnchainOffer();
                    sendstargiftonchainoffer.slug = tL_starGiftUnique.slug;
                    final long j2 = this.b;
                    sendstargiftonchainoffer.amount = j2;
                    sendstargiftonchainoffer.duration = i;
                    sendstargiftonchainoffer.random_id = longValue;
                    cq7.h(tL_starGiftUnique);
                    zf7Var.a(Boolean.TRUE);
                    ConnectionsManager.getInstance(i2).sendRequestTyped(sendstargiftonchainoffer, new hc((byte) 0), new i8c() {
                        @Override
                        public final void a(Object obj2, Object obj3) {
                            String str;
                            String a0;
                            mp7 mp7Var;
                            TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) obj2;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                            zf7.this.a(Boolean.FALSE);
                            int i3 = i2;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                            Context context2 = context;
                            wjb wjbVar2 = wjbVar;
                            u21 u21Var2 = u21Var;
                            if (tL_payments_starGiftOnchainOfferTx != null && tL_payments_starGiftOnchainOfferTx.message != null) {
                                w05 p = vp7.p(context2, wjbVar2, u21Var2, i3, tL_payments_starGiftOnchainOfferTx);
                                if (p == null) {
                                    return;
                                }
                                String h = cq7.h(tL_starGiftUnique2);
                                mp7 mp7Var2 = new mp7(context2, i3, tL_starGiftUnique2, wjbVar2);
                                long j3 = j;
                                if (j3 != 0) {
                                    str = cf3.r(i3, j3);
                                } else {
                                    str = null;
                                }
                                String M0 = k96.M0(2131749606, null);
                                int i4 = 0;
                                if (!TextUtils.isEmpty(str)) {
                                    a0 = k96.a0(null, null, 2131749607, str, h);
                                } else {
                                    a0 = k96.a0(null, null, 2131749608, h);
                                }
                                mp7Var2.e1(gl.S2(a0), M0);
                                int f = cq7.f(tL_starGiftUnique2);
                                long j4 = j2;
                                long n = cq7.n(f, j4);
                                long j5 = p.b;
                                long j6 = ((j5 + 99999) / 100000) * 100000;
                                long max = Math.max(0L, j6 - j4);
                                ?? r13 = 0;
                                String M02 = k96.M0(2131749573, null);
                                SpannableStringBuilder i5 = cq7.i(j4 - n);
                                mfb mfbVar = mp7Var2.Y1;
                                mfbVar.f(M02, i5, null, null);
                                if (n > 0) {
                                    r13 = 0;
                                    mfbVar.f(k96.M0(2131749575, null), TextUtils.concat(cq7.i(n), " ", r41.b(cq7.g(f), null, wjbVar2, null)), null, null);
                                }
                                if (j5 > j4) {
                                    mfbVar.f(k96.M0(2131749540, r13), cq7.i(max), r13, r13);
                                }
                                mfbVar.f(k96.M0(2131749574, r13), cq7.i(j6), r13, r13);
                                mfbVar.f(k96.M0(2131749532, r13), h, r13, r13);
                                int i6 = tL_payments_starGiftOnchainOfferTx.expires_at;
                                if (i6 > 0) {
                                    mp7Var = mp7Var2;
                                    mfbVar.f(k96.M0(2131749576, r13), k96.x(i6, true), r13, r13);
                                } else {
                                    mp7Var = mp7Var2;
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
                                SpannableStringBuilder S2 = gl.S2(k96.M0(2131749579, null));
                                mp7 mp7Var3 = mp7Var;
                                l46 l46Var = mp7Var3.Z1;
                                l46Var.setText(S2);
                                if (TextUtils.isEmpty(S2)) {
                                    i4 = 8;
                                }
                                l46Var.setVisibility(i4);
                                mp7Var3.p2 = 2131749614;
                                mp7Var3.d1(p);
                                mp7Var3.s2 = new j45(fq7Var2, p, i6, (byte) 18);
                                mp7Var3.c1(new vl6(fq7Var, (byte) 28), new zf7(tL_starGiftUnique2, (byte) 5), new np7(context2, i3, wjbVar2, mp7Var3, (byte) 1));
                                mp7Var3.show();
                                return;
                            }
                            if (tL_error != null && "STARGIFT_ONCHAIN_OFFER_INTENT_CONFLICT".equals(tL_error.text)) {
                                String str2 = tL_starGiftUnique2.slug;
                                ad7 Y = ad7.Y(i3);
                                Y.a.c(new t67(Y, str2, (byte) 24));
                            }
                            cq7.r(context2, i3, wjbVar2, u21Var2, tL_error, null);
                        }
                    });
                    return;
                }
                return;
            default:
                ((nfa) callback).D0(i, this.b, (ArrayList) obj);
                return;
        }
    }
}
