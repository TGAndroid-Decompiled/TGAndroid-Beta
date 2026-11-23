package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.hd;
import org.telegram.messenger.r10;
import org.telegram.messenger.sq;
import org.telegram.messenger.ur;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.oc;
import org.telegram.ui.ci;
public final class d5 implements y10 {
    public final int f3462a;
    public final int f3463b;
    public final long f3464c;
    public final Object d;

    public d5(int i7, gc gcVar, long j3) {
        this.f3462a = 1;
        this.f3463b = i7;
        this.d = gcVar;
        this.f3464c = j3;
    }

    @Override
    public final void a(Object obj) {
        Object N0;
        TLRPC.StickerSet stickerSet;
        int i7 = this.f3462a;
        long j3 = this.f3464c;
        int i10 = this.f3463b;
        Object obj2 = this.d;
        switch (i7) {
            case 0:
                f5 f5Var = (f5) obj2;
                Long l10 = (Long) obj;
                if (!f5Var.J) {
                    final Context context = f5Var.getContext();
                    final int i11 = f5Var.f30139a;
                    final TL_stars.TL_starGiftUnique tL_starGiftUnique = f5Var.f3557m1;
                    final long j10 = f5Var.n1;
                    long longValue = l10.longValue();
                    final org.telegram.ui.ActionBar.h6 h6Var = f5Var.J0;
                    hi.d dVar = f5Var.f3566w1;
                    Objects.requireNonNull(dVar);
                    final ai.c0 c0Var = new ai.c0(dVar, 3);
                    final lc lcVar = new lc(f5Var.f30145c, f5Var.J0);
                    final c5 c5Var = new c5(f5Var, 1);
                    final c5 c5Var2 = new c5(f5Var, 2);
                    HashMap hashMap = l4.f3801a;
                    TL_stars.sendStarGiftOnchainOffer sendstargiftonchainoffer = new TL_stars.sendStarGiftOnchainOffer();
                    sendstargiftonchainoffer.slug = tL_starGiftUnique.slug;
                    final long j11 = this.f3464c;
                    sendstargiftonchainoffer.amount = j11;
                    sendstargiftonchainoffer.duration = i10;
                    sendstargiftonchainoffer.random_id = longValue;
                    a5.h(tL_starGiftUnique);
                    c0Var.a(Boolean.TRUE);
                    ConnectionsManager.getInstance(i11).sendRequestTyped(sendstargiftonchainoffer, new d3.b(1), new r10() {
                        @Override
                        public final void a(Object obj3, Object obj4) {
                            String str;
                            String a02;
                            org.telegram.ui.ActionBar.h6 h6Var2;
                            u3 u3Var;
                            int i12;
                            TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) obj3;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                            ai.c0.this.a(Boolean.FALSE);
                            int i13 = i11;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                            Context context2 = context;
                            org.telegram.ui.ActionBar.h6 h6Var3 = h6Var;
                            lc lcVar2 = lcVar;
                            if (tL_payments_starGiftOnchainOfferTx != null && tL_payments_starGiftOnchainOfferTx.message != null) {
                                org.telegram.ui.Wallet.p0 q10 = l4.q(context2, h6Var3, lcVar2, i13, tL_payments_starGiftOnchainOfferTx);
                                if (q10 == null) {
                                    return;
                                }
                                String h = a5.h(tL_starGiftUnique2);
                                u3 u3Var2 = new u3(i13, context2, tL_starGiftUnique2, h6Var3);
                                long j12 = j10;
                                if (j12 != 0) {
                                    str = org.telegram.messenger.n5.s(i13, j12);
                                } else {
                                    str = null;
                                }
                                String N02 = hd.N0(2131749605, null);
                                if (!TextUtils.isEmpty(str)) {
                                    a02 = hd.a0(null, null, 2131749606, str, h);
                                } else {
                                    a02 = hd.a0(null, null, 2131749607, h);
                                }
                                u3Var2.k1(org.telegram.messenger.g0.W2(a02), N02);
                                int f10 = a5.f(tL_starGiftUnique2);
                                long j13 = j11;
                                long n10 = a5.n(f10, j13);
                                long j14 = q10.f44742b;
                                long j15 = ((j14 + 99999) / 100000) * 100000;
                                long max = Math.max(0L, j15 - j13);
                                ?? r13 = 0;
                                String N03 = hd.N0(2131749572, null);
                                SpannableStringBuilder i14 = a5.i(j13 - n10);
                                ey0 ey0Var = u3Var2.Z1;
                                ey0Var.e(N03, i14, null, null);
                                if (n10 > 0) {
                                    r13 = 0;
                                    ey0Var.e(hd.N0(2131749574, null), TextUtils.concat(a5.i(n10), " ", oc.b(a5.g(f10), null, h6Var3, null)), null, null);
                                }
                                if (j14 > j13) {
                                    ey0Var.e(hd.N0(2131749539, r13), a5.i(max), r13, r13);
                                }
                                ey0Var.e(hd.N0(2131749573, r13), a5.i(j15), r13, r13);
                                ey0Var.e(hd.N0(2131749531, r13), h, r13, r13);
                                int i15 = tL_payments_starGiftOnchainOfferTx.expires_at;
                                if (i15 > 0) {
                                    u3Var = u3Var2;
                                    h6Var2 = h6Var3;
                                    ey0Var.e(hd.N0(2131749575, r13), hd.x(i15, true), r13, r13);
                                } else {
                                    h6Var2 = h6Var3;
                                    u3Var = u3Var2;
                                }
                                TL_wallet.walletOnchainGiftActionOfferCreate walletonchaingiftactionoffercreate = new TL_wallet.walletOnchainGiftActionOfferCreate();
                                walletonchaingiftactionoffercreate.offer_address = tL_payments_starGiftOnchainOfferTx.offer_address;
                                if (!TextUtils.isEmpty(tL_starGiftUnique2.owner_address)) {
                                    walletonchaingiftactionoffercreate.flags |= 1;
                                    walletonchaingiftactionoffercreate.counterparty_address = tL_starGiftUnique2.owner_address;
                                }
                                walletonchaingiftactionoffercreate.price = j13;
                                walletonchaingiftactionoffercreate.amount = j14;
                                walletonchaingiftactionoffercreate.service_fee = n10;
                                if (i15 > 0) {
                                    walletonchaingiftactionoffercreate.flags |= 2;
                                    walletonchaingiftactionoffercreate.expires_at = i15;
                                }
                                q10.h = walletonchaingiftactionoffercreate;
                                q10.f44747i = tL_starGiftUnique2;
                                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(hd.N0(2131749578, null));
                                m80 m80Var = u3Var.f4097a2;
                                m80Var.setText(W2);
                                if (TextUtils.isEmpty(W2)) {
                                    i12 = 8;
                                } else {
                                    i12 = 0;
                                }
                                m80Var.setVisibility(i12);
                                u3Var.f4112q2 = 2131749613;
                                u3Var.j1(q10);
                                u3Var.f4115t2 = new ai.d1(c5Var2, q10, i15, 1);
                                u3 u3Var3 = u3Var;
                                u3Var3.i1(new a3.f(c5Var, 24), new ai.c0(tL_starGiftUnique2, 2), new y3(context2, i13, h6Var2, u3Var3, 1));
                                u3Var3.show();
                                return;
                            }
                            if (tL_error != null && "STARGIFT_ONCHAIN_OFFER_INTENT_CONFLICT".equals(tL_error.text)) {
                                String str2 = tL_starGiftUnique2.slug;
                                ur a03 = ur.a0(i13);
                                a03.f27214a.c(new sq(6, a03, str2));
                            }
                            a5.r(context2, i13, h6Var3, lcVar2, tL_error, null);
                        }
                    });
                    return;
                }
                return;
            case 1:
                gc gcVar = (gc) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                    if (i10 == 1) {
                        N0 = org.telegram.messenger.g0.W2(hd.a0("TopicContainsEmojiPackSingle", null, 2131743781, stickerSet.title));
                    } else if (i10 == 2) {
                        N0 = org.telegram.messenger.g0.W2(hd.a0("StoryContainsEmojiPackSingle", null, 2131744458, stickerSet.title));
                    } else {
                        N0 = org.telegram.messenger.g0.W2(hd.a0("MessageContainsEmojiPackSingle", null, 2131748403, stickerSet.title));
                    }
                } else {
                    N0 = hd.N0(2131754432, null);
                }
                org.telegram.messenger.g0.h3(new ci(18, gcVar, N0), Math.max(1L, 750 - (System.currentTimeMillis() - j3)));
                return;
            default:
                ((jt0) obj2).getStoriesController().b(i10, j3, (ArrayList) obj);
                return;
        }
    }

    public d5(KeyEvent.Callback callback, long j3, int i7, int i10) {
        this.f3462a = i10;
        this.d = callback;
        this.f3464c = j3;
        this.f3463b = i7;
    }
}
