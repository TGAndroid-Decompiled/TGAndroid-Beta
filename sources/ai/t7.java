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
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.b61;
import org.telegram.ui.rf0;
import org.telegram.ui.yy0;
public final class t7 implements BillingController.ProductDetailsResponseListenerLegacy, ci.t9, OnFailureListener, org.telegram.ui.ActionBar.z1, od0, c5.q, MediaDataController.KeywordResultCallback {
    public final Object f2217a;
    public final Object f2218b;
    public final Object f2219c;
    public final Object d;
    public final Object e;

    public t7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f2217a = obj;
        this.f2218b = obj2;
        this.f2219c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override
    public void a(c5.i iVar, List list) {
        AndroidUtilities.runOnUIThread(new v7((rf0) this.f2217a, iVar, list, (String) this.f2218b, (TLRPC.TL_inputStorePaymentAuthCode) this.f2219c, (TLRPC.TL_payments_canPurchaseStore) this.d, (j90) this.e, 8));
    }

    @Override
    public void e(float f7, Canvas canvas, RectF rectF, boolean z10) {
        a4.l lVar = (a4.l) this.f2217a;
        RectF rectF2 = (RectF) this.f2218b;
        ci.r4 r4Var = (ci.r4) this.f2219c;
        RectF rectF3 = (RectF) this.d;
        ci.r4 r4Var2 = (ci.r4) this.e;
        RectF rectF4 = r4Var.f5866m;
        rectF2.set(rectF4);
        RectF rectF5 = r4Var2.f5866m;
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
        int i10 = ProfileStoriesView.f34167s0;
        ((yy0) lVar.f279b).a(canvas, r4Var, r4Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        org.telegram.ui.ActionBar.q3 q3Var = (org.telegram.ui.ActionBar.q3) this.f2217a;
        ((boolean[]) this.f2218b)[0] = true;
        q3Var.h(q3Var.f21794w, (org.telegram.ui.ActionBar.p3) this.f2219c, true);
        ((Utilities.Callback) this.d).run(Boolean.TRUE);
        ((org.telegram.ui.ActionBar.c2[]) this.e)[0].dismiss();
    }

    @Override
    public void n(qd0 qd0Var, int i10) {
        org.telegram.ui.Components.f5.c((ei.d) this.f2217a, (qd0) this.f2218b, (qd0) this.f2219c, (qd0) this.d, (qd0) this.e);
    }

    @Override
    public void onFailure(Exception e) {
        v0.o request = (v0.o) this.f2217a;
        f1.a aVar = (f1.a) this.f2218b;
        v0.i iVar = (v0.i) this.f2219c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.e;
        kotlin.jvm.internal.i.e(e, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        kotlin.jvm.internal.i.e(request, "request");
        for (v0.q qVar : request.f48306a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new c1.e(aVar.e).g(request, cancellationSignal, executor, iVar);
    }

    @Override
    public void onProductDetailsResponse(c5.i iVar, List list) {
        AndroidUtilities.runOnUIThread(new v7((ha) this.f2217a, list, (uc) this.f2218b, (TLRPC.TL_inputStorePaymentStarsGift) this.f2219c, (TL_stars.TL_starsGiftOption) this.d, iVar, (Activity) this.e, 2));
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        TLRPC.TL_availableReaction tL_availableReaction;
        b61 b61Var = (b61) this.f2217a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f2218b;
        HashMap hashMap = (HashMap) this.f2219c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.e;
        b61Var.getClass();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.substring(9))));
                } else {
                    int i11 = b61Var.W;
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
