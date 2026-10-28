package bi;

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
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.ld0;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.dz0;
import org.telegram.ui.f61;
import org.telegram.ui.qf0;
public final class p7 implements BillingController.ProductDetailsResponseListenerLegacy, di.s9, OnFailureListener, org.telegram.ui.ActionBar.b2, ld0, d5.p, MediaDataController.KeywordResultCallback {
    public final Object f5232a;
    public final Object f5233b;
    public final Object f5234c;
    public final Object d;
    public final Object e;

    public p7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f5232a = obj;
        this.f5233b = obj2;
        this.f5234c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override
    public void a(d5.i iVar, List list) {
        AndroidUtilities.runOnUIThread(new r7((qf0) this.f5232a, iVar, list, (String) this.f5233b, (TLRPC.TL_inputStorePaymentAuthCode) this.f5234c, (TLRPC.TL_payments_canPurchaseStore) this.d, (e10) this.e, 8));
    }

    @Override
    public void d(float f7, Canvas canvas, RectF rectF, boolean z10) {
        rb.c cVar = (rb.c) this.f5232a;
        RectF rectF2 = (RectF) this.f5233b;
        di.s4 s4Var = (di.s4) this.f5234c;
        RectF rectF3 = (RectF) this.d;
        di.s4 s4Var2 = (di.s4) this.e;
        RectF rectF4 = s4Var.f9153m;
        rectF2.set(rectF4);
        RectF rectF5 = s4Var2.f9153m;
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
        int i10 = ProfileStoriesView.f36256s0;
        ((dz0) cVar.f47358b).a(canvas, s4Var, s4Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        org.telegram.ui.ActionBar.s3 s3Var = (org.telegram.ui.ActionBar.s3) this.f5232a;
        ((boolean[]) this.f5233b)[0] = true;
        s3Var.h(s3Var.f23080w, (org.telegram.ui.ActionBar.r3) this.f5234c, true);
        ((Utilities.Callback) this.d).run(Boolean.TRUE);
        ((org.telegram.ui.ActionBar.e2[]) this.e)[0].dismiss();
    }

    @Override
    public void onFailure(Exception e) {
        v0.n request = (v0.n) this.f5232a;
        f1.a aVar = (f1.a) this.f5233b;
        v0.i iVar = (v0.i) this.f5234c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.e;
        kotlin.jvm.internal.i.e(e, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        kotlin.jvm.internal.i.e(request, "request");
        for (v0.p pVar : request.f50014a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new c1.e(aVar.e).g(request, cancellationSignal, executor, iVar);
    }

    @Override
    public void onProductDetailsResponse(d5.i iVar, List list) {
        AndroidUtilities.runOnUIThread(new r7((ca) this.f5232a, list, (lc) this.f5233b, (TLRPC.TL_inputStorePaymentStarsGift) this.f5234c, (TL_stars.TL_starsGiftOption) this.d, iVar, (Activity) this.e, 2));
    }

    @Override
    public void q(nd0 nd0Var, int i10) {
        org.telegram.ui.Components.g5.c((fi.d) this.f5232a, (nd0) this.f5233b, (nd0) this.f5234c, (nd0) this.d, (nd0) this.e);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        TLRPC.TL_availableReaction tL_availableReaction;
        f61 f61Var = (f61) this.f5232a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f5233b;
        HashMap hashMap = (HashMap) this.f5234c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.e;
        f61Var.getClass();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.substring(9))));
                } else {
                    int i11 = f61Var.W;
                    if ((i11 == 1 || i11 == 11 || i11 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji)) != null) {
                        arrayList2.add(bh.x0.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }
}
