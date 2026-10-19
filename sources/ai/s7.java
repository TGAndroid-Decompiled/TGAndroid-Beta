package ai;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.lf0;
import org.telegram.ui.uy0;
import org.telegram.ui.x51;
public final class s7 implements BillingController.ProductDetailsResponseListenerLegacy, ci.u9, OnFailureListener, org.telegram.ui.ActionBar.a2, md0, c5.q, MediaDataController.KeywordResultCallback {
    public final Object f2165a;
    public final Object f2166b;
    public final Object f2167c;
    public final Object d;
    public final Object e;

    public s7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f2165a = obj;
        this.f2166b = obj2;
        this.f2167c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override
    public void b(c5.i iVar, List list) {
        AndroidUtilities.runOnUIThread(new u7((lf0) this.f2165a, iVar, list, (String) this.f2166b, (TLRPC.TL_inputStorePaymentAuthCode) this.f2167c, (TLRPC.TL_payments_canPurchaseStore) this.d, (i90) this.e, 8));
    }

    @Override
    public void e(float f7, Canvas canvas, RectF rectF, boolean z10) {
        a4.l lVar = (a4.l) this.f2165a;
        RectF rectF2 = (RectF) this.f2166b;
        ci.s4 s4Var = (ci.s4) this.f2167c;
        RectF rectF3 = (RectF) this.d;
        ci.s4 s4Var2 = (ci.s4) this.e;
        RectF rectF4 = s4Var.f5969m;
        rectF2.set(rectF4);
        RectF rectF5 = s4Var2.f5969m;
        rectF3.set(rectF5);
        rectF4.set(rectF);
        try {
            float width = rectF.width() / rectF2.width();
            float centerX = rectF.centerX() - ((((1.0f - f7) * 2.0f) + width) * (rectF2.centerX() - rectF3.centerX()));
            float centerY = rectF.centerY();
            float width2 = (rectF3.width() / 2.0f) * width;
            float height = (rectF3.height() / 2.0f) * width;
            rectF5.set(centerX - width2, centerY - height, centerX + width2, centerY + height);
        } catch (Exception unused) {
        }
        int i10 = ProfileStoriesView.f33857s0;
        ((uy0) lVar.f279b).a(canvas, s4Var, s4Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) this.f2165a;
        ((boolean[]) this.f2166b)[0] = true;
        n3Var.h(n3Var.f21619w, (org.telegram.ui.ActionBar.m3) this.f2167c, true);
        ((Utilities.Callback) this.d).run(Boolean.TRUE);
        ((org.telegram.ui.ActionBar.b2[]) this.e)[0].dismiss();
    }

    @Override
    public void onFailure(Exception e) {
        v0.n request = (v0.n) this.f2165a;
        f1.a aVar = (f1.a) this.f2166b;
        v0.i iVar = (v0.i) this.f2167c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.e;
        kotlin.jvm.internal.i.e(e, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        kotlin.jvm.internal.i.e(request, "request");
        for (v0.p pVar : request.f47857a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new c1.e(aVar.e).g(request, cancellationSignal, executor, iVar);
    }

    @Override
    public void onProductDetailsResponse(c5.i iVar, List list) {
        AndroidUtilities.runOnUIThread(new u7((ga) this.f2165a, list, (tc) this.f2166b, (TLRPC.TL_inputStorePaymentStarsGift) this.f2167c, (TL_stars.TL_starsGiftOption) this.d, iVar, (Activity) this.e, 2));
    }

    @Override
    public void q(od0 od0Var, int i10) {
        org.telegram.ui.Components.f5.b((ei.d) this.f2165a, (od0) this.f2166b, (od0) this.f2167c, (od0) this.d, (od0) this.e);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        TLRPC.TL_availableReaction tL_availableReaction;
        x51 x51Var = (x51) this.f2165a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f2166b;
        HashMap hashMap = (HashMap) this.f2167c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.e;
        x51Var.getClass();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.substring(9))));
                } else {
                    int i11 = x51Var.W;
                    if ((i11 == 1 || i11 == 11 || i11 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji)) != null) {
                        arrayList2.add(ah.i1.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }
}
