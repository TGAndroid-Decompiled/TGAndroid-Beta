package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.messenger.rq;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.ci;
public final class y4 implements x10 {
    public final int f4278a;
    public final int f4279b;
    public final long f4280c;
    public final Object d;

    public y4(int i7, gc gcVar, long j3) {
        this.f4278a = 1;
        this.f4279b = i7;
        this.d = gcVar;
        this.f4280c = j3;
    }

    @Override
    public final void a(Object obj) {
        Object M0;
        TLRPC.StickerSet stickerSet;
        int i7 = this.f4278a;
        long j3 = this.f4280c;
        int i10 = this.f4279b;
        Object obj2 = this.d;
        switch (i7) {
            case 0:
                a5 a5Var = (a5) obj2;
                Long l10 = (Long) obj;
                if (!a5Var.J) {
                    final Context context = a5Var.getContext();
                    final int i11 = a5Var.f30189a;
                    final TL_stars.TL_starGiftUnique tL_starGiftUnique = a5Var.f3402m1;
                    final long j10 = a5Var.n1;
                    long longValue = l10.longValue();
                    final org.telegram.ui.ActionBar.i6 i6Var = a5Var.J0;
                    hi.d dVar = a5Var.f3411w1;
                    Objects.requireNonNull(dVar);
                    final ai.g0 g0Var = new ai.g0(dVar, 3);
                    final lc lcVar = new lc(a5Var.f30195c, a5Var.J0);
                    final x4 x4Var = new x4(a5Var, 1);
                    final x4 x4Var2 = new x4(a5Var, 2);
                    HashMap hashMap = f4.f3607a;
                    TL_stars.sendStarGiftOnchainOffer sendstargiftonchainoffer = new TL_stars.sendStarGiftOnchainOffer();
                    sendstargiftonchainoffer.slug = tL_starGiftUnique.slug;
                    final long j11 = this.f4280c;
                    sendstargiftonchainoffer.amount = j11;
                    sendstargiftonchainoffer.duration = i10;
                    sendstargiftonchainoffer.random_id = longValue;
                    v4.h(tL_starGiftUnique);
                    g0Var.a(Boolean.TRUE);
                    ConnectionsManager.getInstance(i11).sendRequestTyped(sendstargiftonchainoffer, new d3.b(1), new q10() {
                        @Override
                        public final void a(Object obj3, Object obj4) {
                            String str;
                            String a02;
                            org.telegram.ui.ActionBar.i6 i6Var2;
                            o3 o3Var;
                            int i12;
                            TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) obj3;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                            ai.g0.this.a(Boolean.FALSE);
                            int i13 = i11;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                            Context context2 = context;
                            org.telegram.ui.ActionBar.i6 i6Var3 = i6Var;
                            lc lcVar2 = lcVar;
                            if (tL_payments_starGiftOnchainOfferTx != null && tL_payments_starGiftOnchainOfferTx.message != null) {
                                org.telegram.ui.Wallet.p0 o4 = f4.o(context2, i6Var3, lcVar2, i13, tL_payments_starGiftOnchainOfferTx);
                                if (o4 == null) {
                                    return;
                                }
                                String h = v4.h(tL_starGiftUnique2);
                                o3 o3Var2 = new o3(i13, context2, tL_starGiftUnique2, i6Var3);
                                long j12 = j10;
                                if (j12 != 0) {
                                    str = org.telegram.messenger.n5.s(i13, j12);
                                } else {
                                    str = null;
                                }
                                String M02 = gd.M0(2131749606, null);
                                if (!TextUtils.isEmpty(str)) {
                                    a02 = gd.a0(null, null, 2131749607, str, h);
                                } else {
                                    a02 = gd.a0(null, null, 2131749608, h);
                                }
                                o3Var2.k1(org.telegram.messenger.g0.W2(a02), M02);
                                int f10 = v4.f(tL_starGiftUnique2);
                                long j13 = j11;
                                long n10 = v4.n(f10, j13);
                                long j14 = o4.f44732b;
                                long j15 = ((j14 + 99999) / 100000) * 100000;
                                long max = Math.max(0L, j15 - j13);
                                ?? r13 = 0;
                                String M03 = gd.M0(2131749573, null);
                                SpannableStringBuilder i14 = v4.i(j13 - n10);
                                cy0 cy0Var = o3Var2.Z1;
                                cy0Var.e(M03, i14, null, null);
                                if (n10 > 0) {
                                    r13 = 0;
                                    cy0Var.e(gd.M0(2131749575, null), TextUtils.concat(v4.i(n10), " ", oc.b(v4.g(f10), null, i6Var3, null)), null, null);
                                }
                                if (j14 > j13) {
                                    cy0Var.e(gd.M0(2131749540, r13), v4.i(max), r13, r13);
                                }
                                cy0Var.e(gd.M0(2131749574, r13), v4.i(j15), r13, r13);
                                cy0Var.e(gd.M0(2131749532, r13), h, r13, r13);
                                int i15 = tL_payments_starGiftOnchainOfferTx.expires_at;
                                if (i15 > 0) {
                                    o3Var = o3Var2;
                                    i6Var2 = i6Var3;
                                    cy0Var.e(gd.M0(2131749576, r13), gd.x(i15, true), r13, r13);
                                } else {
                                    i6Var2 = i6Var3;
                                    o3Var = o3Var2;
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
                                o4.h = walletonchaingiftactionoffercreate;
                                o4.f44737i = tL_starGiftUnique2;
                                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.M0(2131749579, null));
                                k80 k80Var = o3Var.f3925a2;
                                k80Var.setText(W2);
                                if (TextUtils.isEmpty(W2)) {
                                    i12 = 8;
                                } else {
                                    i12 = 0;
                                }
                                k80Var.setVisibility(i12);
                                o3Var.f3940q2 = 2131749614;
                                o3Var.j1(o4);
                                o3Var.f3943t2 = new ai.a1(x4Var2, o4, i15, 2);
                                o3 o3Var3 = o3Var;
                                o3Var3.i1(new a3.f(x4Var, 25), new ai.g0(tL_starGiftUnique2, 2), new s3(context2, i13, i6Var2, o3Var3, 1));
                                o3Var3.show();
                                return;
                            }
                            if (tL_error != null && "STARGIFT_ONCHAIN_OFFER_INTENT_CONFLICT".equals(tL_error.text)) {
                                String str2 = tL_starGiftUnique2.slug;
                                tr a03 = tr.a0(i13);
                                a03.f27054a.c(new rq(6, a03, str2));
                            }
                            v4.r(context2, i13, i6Var3, lcVar2, tL_error, null);
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
                        M0 = org.telegram.messenger.g0.W2(gd.a0("TopicContainsEmojiPackSingle", null, 2131743787, stickerSet.title));
                    } else if (i10 == 2) {
                        M0 = org.telegram.messenger.g0.W2(gd.a0("StoryContainsEmojiPackSingle", null, 2131744464, stickerSet.title));
                    } else {
                        M0 = org.telegram.messenger.g0.W2(gd.a0("MessageContainsEmojiPackSingle", null, 2131748404, stickerSet.title));
                    }
                } else {
                    M0 = gd.M0(2131754433, null);
                }
                org.telegram.messenger.g0.h3(new ci(18, gcVar, M0), Math.max(1L, 750 - (System.currentTimeMillis() - j3)));
                return;
            default:
                ((gt0) obj2).getStoriesController().b(i10, j3, (ArrayList) obj);
                return;
        }
    }

    public y4(KeyEvent.Callback callback, long j3, int i7, int i10) {
        this.f4278a = i10;
        this.d = callback;
        this.f4280c = j3;
        this.f4279b = i7;
    }
}
