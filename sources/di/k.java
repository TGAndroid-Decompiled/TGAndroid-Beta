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
    public final int f9128a = 0;
    public final long f9129b;
    public final boolean f9130c;
    public final Object d;
    public final Object f9131e;
    public final Object f9132f;
    public final Object h;
    public final Object f9133n;

    public k(t tVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        this.d = tVar;
        this.f9131e = tL_error;
        this.f9132f = twoStepVerificationActivity;
        this.h = activity;
        this.f9130c = z10;
        this.f9129b = j3;
        this.f9133n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.k.run():void");
    }

    public k(x8 x8Var, q10 q10Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        this.d = x8Var;
        this.f9131e = q10Var;
        this.f9132f = tL_payments_paymentFormStarGift;
        this.h = starGift;
        this.f9129b = j3;
        this.f9133n = tL_textWithEntities;
        this.f9130c = z10;
    }

    public k(ri riVar, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j3) {
        this.d = riVar;
        this.f9131e = arrayList;
        this.f9130c = z10;
        this.f9132f = arrayList2;
        this.h = arrayList3;
        this.f9133n = hVar;
        this.f9129b = j3;
    }

    public k(si siVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, long j3, x3 x3Var) {
        this.d = siVar;
        this.f9131e = tL_error;
        this.f9133n = tLObject;
        this.f9132f = tL_chatInviteImporter;
        this.f9130c = z10;
        this.f9129b = j3;
        this.h = x3Var;
    }

    public k(z00 z00Var, v00 v00Var, TLObject tLObject, boolean z10, TLRPC.TL_error tL_error, long j3, HashSet hashSet) {
        this.d = z00Var;
        this.f9132f = v00Var;
        this.f9133n = tLObject;
        this.f9130c = z10;
        this.f9131e = tL_error;
        this.f9129b = j3;
        this.h = hashSet;
    }
}
