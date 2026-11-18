package di;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.q10;
import org.telegram.messenger.ri;
import org.telegram.messenger.si;
import org.telegram.messenger.v00;
import org.telegram.messenger.z00;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.TwoStepVerificationActivity;
public final class k implements Runnable {
    public final int f9131a = 0;
    public final long f9132b;
    public final boolean f9133c;
    public final Object d;
    public final Object f9134e;
    public final Object f9135f;
    public final Object h;
    public final Object f9136n;

    public k(t tVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        this.d = tVar;
        this.f9134e = tL_error;
        this.f9135f = twoStepVerificationActivity;
        this.h = activity;
        this.f9133c = z10;
        this.f9132b = j3;
        this.f9136n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.k.run():void");
    }

    public k(x8 x8Var, q10 q10Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        this.d = x8Var;
        this.f9134e = q10Var;
        this.f9135f = tL_payments_paymentFormStarGift;
        this.h = starGift;
        this.f9132b = j3;
        this.f9136n = tL_textWithEntities;
        this.f9133c = z10;
    }

    public k(ri riVar, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j3) {
        this.d = riVar;
        this.f9134e = arrayList;
        this.f9133c = z10;
        this.f9135f = arrayList2;
        this.h = arrayList3;
        this.f9136n = hVar;
        this.f9132b = j3;
    }

    public k(si siVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, long j3, x3 x3Var) {
        this.d = siVar;
        this.f9134e = tL_error;
        this.f9136n = tLObject;
        this.f9135f = tL_chatInviteImporter;
        this.f9133c = z10;
        this.f9132b = j3;
        this.h = x3Var;
    }

    public k(z00 z00Var, v00 v00Var, TLObject tLObject, boolean z10, TLRPC.TL_error tL_error, long j3, HashSet hashSet) {
        this.d = z00Var;
        this.f9135f = v00Var;
        this.f9136n = tLObject;
        this.f9133c = z10;
        this.f9134e = tL_error;
        this.f9132b = j3;
        this.h = hashSet;
    }
}
