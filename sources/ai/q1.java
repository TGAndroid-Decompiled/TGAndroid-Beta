package ai;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import bi.c4;
import bi.e4;
import bi.o3;
import bi.u4;
import java.util.ArrayList;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.lc;
public final class q1 implements q10 {
    public final int f1476a = 1;
    public final long f1477b;
    public final int f1478c;
    public final Object d;
    public final Object f1479e;
    public final Object f1480f;
    public final Object f1481g;

    public q1(long j3, Context context, int i7, i6 i6Var, lc lcVar, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        this.f1477b = j3;
        this.d = context;
        this.f1478c = i7;
        this.f1479e = i6Var;
        this.f1480f = lcVar;
        this.f1481g = tL_messageActionStarGiftOnchainOffer;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i7 = this.f1476a;
        Object obj3 = this.f1481g;
        Object obj4 = this.f1480f;
        Object obj5 = this.f1479e;
        Object obj6 = this.d;
        long j3 = this.f1477b;
        switch (i7) {
            case 0:
                c2 c2Var = (c2) obj6;
                String str2 = (String) obj5;
                String str3 = (String) obj4;
                String str4 = (String) obj3;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                c2Var.S = false;
                c2Var.U = -1;
                if (!c2Var.f1153j) {
                    if (tL_composedMessageWithAI != null && (tL_textWithEntities = tL_composedMessageWithAI.result_text) != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                        Log.d("Dictation", "clean done in " + (SystemClock.elapsedRealtime() - j3) + " ms: " + i2.c(tL_composedMessageWithAI.result_text.text));
                        String n10 = c2Var.f1148g.n();
                        int i10 = this.f1478c;
                        if (n10.startsWith(str2, i10)) {
                            ArrayList arrayList = c2Var.Q;
                            StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str3);
                            m10.append(tL_composedMessageWithAI.result_text.text.trim());
                            m10.append(str4);
                            arrayList.add(new z1(i10, str2, m10.toString()));
                            c2Var.R = str2.length() + i10;
                            c2Var.e();
                            return;
                        }
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder("clean failed: ");
                    if (tL_error != null) {
                        str = tL_error.text;
                    } else {
                        str = null;
                    }
                    p5.c.t(sb2, str, "Dictation");
                    return;
                }
                return;
            default:
                Context context = (Context) obj6;
                i6 i6Var = (i6) obj5;
                lc lcVar = (lc) obj4;
                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj3;
                TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i11 = this.f1478c;
                if (tL_payments_starGiftOnchainOfferTx != null && tL_payments_starGiftOnchainOfferTx.message != null) {
                    org.telegram.ui.Wallet.p0 q10 = e4.q(context, i6Var, lcVar, i11, tL_payments_starGiftOnchainOfferTx);
                    if (q10 == null) {
                        e4.g(j3);
                        return;
                    }
                    c4 c4Var = new c4(context, i11, tL_messageActionStarGiftOnchainOffer, tL_payments_starGiftOnchainOfferTx, q10, i6Var, lcVar);
                    int i12 = o3.f3890x2;
                    boolean[] zArr = new boolean[1];
                    aa.r rVar = new aa.r(zArr, r4, c4Var, 8);
                    org.telegram.messenger.g0.h3(rVar, 5000L);
                    Runnable[] runnableArr = {org.telegram.ui.Wallet.u0.D(i11).l(q10, new bi.h0(zArr, rVar, c4Var, 1))};
                    return;
                }
                e4.g(j3);
                u4.r(context, i11, i6Var, lcVar, tL_error2, null);
                return;
        }
    }

    public q1(c2 c2Var, long j3, String str, int i7, String str2, String str3) {
        this.d = c2Var;
        this.f1477b = j3;
        this.f1479e = str;
        this.f1478c = i7;
        this.f1480f = str2;
        this.f1481g = str3;
    }
}
