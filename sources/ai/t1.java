package ai;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import bi.g4;
import bi.i4;
import bi.s3;
import bi.x4;
import java.util.ArrayList;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.lc;
public final class t1 implements r10 {
    public final int f1526a = 1;
    public final long f1527b;
    public final int f1528c;
    public final Object d;
    public final Object f1529e;
    public final Object f1530f;
    public final Object f1531g;

    public t1(long j3, Context context, int i7, h6 h6Var, lc lcVar, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        this.f1527b = j3;
        this.d = context;
        this.f1528c = i7;
        this.f1529e = h6Var;
        this.f1530f = lcVar;
        this.f1531g = tL_messageActionStarGiftOnchainOffer;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i7 = this.f1526a;
        Object obj3 = this.f1531g;
        Object obj4 = this.f1530f;
        Object obj5 = this.f1529e;
        Object obj6 = this.d;
        long j3 = this.f1527b;
        switch (i7) {
            case 0:
                f2 f2Var = (f2) obj6;
                String str2 = (String) obj5;
                String str3 = (String) obj4;
                String str4 = (String) obj3;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                f2Var.S = false;
                f2Var.U = -1;
                if (!f2Var.f1193j) {
                    if (tL_composedMessageWithAI != null && (tL_textWithEntities = tL_composedMessageWithAI.result_text) != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                        Log.d("Dictation", "clean done in " + (SystemClock.elapsedRealtime() - j3) + " ms: " + l2.c(tL_composedMessageWithAI.result_text.text));
                        String n10 = f2Var.f1188g.n();
                        int i10 = this.f1528c;
                        if (n10.startsWith(str2, i10)) {
                            ArrayList arrayList = f2Var.Q;
                            StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str3);
                            m10.append(tL_composedMessageWithAI.result_text.text.trim());
                            m10.append(str4);
                            arrayList.add(new c2(i10, str2, m10.toString()));
                            f2Var.R = str2.length() + i10;
                            f2Var.f();
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
                h6 h6Var = (h6) obj5;
                lc lcVar = (lc) obj4;
                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj3;
                TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i11 = this.f1528c;
                if (tL_payments_starGiftOnchainOfferTx != null && tL_payments_starGiftOnchainOfferTx.message != null) {
                    org.telegram.ui.Wallet.p0 q10 = i4.q(context, h6Var, lcVar, i11, tL_payments_starGiftOnchainOfferTx);
                    if (q10 == null) {
                        i4.g(j3);
                        return;
                    }
                    g4 g4Var = new g4(context, i11, tL_messageActionStarGiftOnchainOffer, tL_payments_starGiftOnchainOfferTx, q10, h6Var, lcVar);
                    int i12 = s3.f4064x2;
                    boolean[] zArr = new boolean[1];
                    aa.r rVar = new aa.r(zArr, r4, g4Var, 9);
                    org.telegram.messenger.g0.h3(rVar, 5000L);
                    Runnable[] runnableArr = {org.telegram.ui.Wallet.u0.D(i11).l(q10, new bi.h0(zArr, rVar, g4Var, 1))};
                    return;
                }
                i4.g(j3);
                x4.r(context, i11, h6Var, lcVar, tL_error2, null);
                return;
        }
    }

    public t1(f2 f2Var, long j3, String str, int i7, String str2, String str3) {
        this.d = f2Var;
        this.f1527b = j3;
        this.f1529e = str;
        this.f1528c = i7;
        this.f1530f = str2;
        this.f1531g = str3;
    }
}
