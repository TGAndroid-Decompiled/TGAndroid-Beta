package di;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a10;
import org.telegram.messenger.r10;
import org.telegram.messenger.si;
import org.telegram.messenger.ti;
import org.telegram.messenger.w00;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.TwoStepVerificationActivity;
public final class k implements Runnable {
    public final int f9154a = 0;
    public final long f9155b;
    public final boolean f9156c;
    public final Object d;
    public final Object f9157e;
    public final Object f9158f;
    public final Object h;
    public final Object f9159n;

    public k(t tVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        this.d = tVar;
        this.f9157e = tL_error;
        this.f9158f = twoStepVerificationActivity;
        this.h = activity;
        this.f9156c = z10;
        this.f9155b = j3;
        this.f9159n = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.k.run():void");
    }

    public k(y8 y8Var, r10 r10Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        this.d = y8Var;
        this.f9157e = r10Var;
        this.f9158f = tL_payments_paymentFormStarGift;
        this.h = starGift;
        this.f9155b = j3;
        this.f9159n = tL_textWithEntities;
        this.f9156c = z10;
    }

    public k(si siVar, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j3) {
        this.d = siVar;
        this.f9157e = arrayList;
        this.f9156c = z10;
        this.f9158f = arrayList2;
        this.h = arrayList3;
        this.f9159n = hVar;
        this.f9155b = j3;
    }

    public k(ti tiVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, long j3, x3 x3Var) {
        this.d = tiVar;
        this.f9157e = tL_error;
        this.f9159n = tLObject;
        this.f9158f = tL_chatInviteImporter;
        this.f9156c = z10;
        this.f9155b = j3;
        this.h = x3Var;
    }

    public k(a10 a10Var, w00 w00Var, TLObject tLObject, boolean z10, TLRPC.TL_error tL_error, long j3, HashSet hashSet) {
        this.d = a10Var;
        this.f9158f = w00Var;
        this.f9159n = tLObject;
        this.f9156c = z10;
        this.f9157e = tL_error;
        this.f9155b = j3;
        this.h = hashSet;
    }
}
