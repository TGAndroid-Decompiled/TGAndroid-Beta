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
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.ff;
import org.telegram.ui.kg0;
import org.telegram.ui.r71;
import org.telegram.ui.yz0;
public final class s5 implements mb, OnFailureListener, org.telegram.ui.ActionBar.z1, sd0, c5.q, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy {
    public final Object f3631a;
    public final Object f3632b;
    public final Object f3633c;
    public final Object d;
    public final Object e;

    public s5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f3631a = obj;
        this.f3632b = obj2;
        this.f3633c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override
    public void b(c5.i iVar, List list) {
        AndroidUtilities.runOnUIThread(new ff((Object) ((kg0) this.f3631a), (Object) iVar, (Object) list, (String) this.f3632b, (Object) ((TLRPC.TL_inputStorePaymentAuthCode) this.f3633c), (Object) ((TLRPC.TL_payments_canPurchaseStore) this.d), (Object) ((gq0) this.e), 4));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) this.f3631a;
        ((boolean[]) this.f3632b)[0] = true;
        m3Var.h(m3Var.f20533w, (org.telegram.ui.ActionBar.l3) this.f3633c, true);
        ((Utilities.Callback) this.d).run(Boolean.TRUE);
        ((org.telegram.ui.ActionBar.a2[]) this.e)[0].dismiss();
    }

    @Override
    public void h(float f7, Canvas canvas, RectF rectF, boolean z10) {
        ya.c cVar = (ya.c) this.f3631a;
        RectF rectF2 = (RectF) this.f3632b;
        t5 t5Var = (t5) this.d;
        RectF rectF3 = (RectF) this.f3633c;
        t5 t5Var2 = (t5) this.e;
        RectF rectF4 = t5Var.f3746m;
        rectF2.set(rectF4);
        RectF rectF5 = t5Var2.f3746m;
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
        int i10 = ProfileStoriesView.f32809s0;
        ((yz0) cVar.f48732b).a(canvas, t5Var, t5Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override
    public void onFailure(Exception e) {
        v0.n request = (v0.n) this.f3631a;
        f1.b bVar = (f1.b) this.f3632b;
        v0.i iVar = (v0.i) this.f3633c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.e;
        kotlin.jvm.internal.i.e(e, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        kotlin.jvm.internal.i.e(request, "request");
        for (v0.p pVar : request.f46470a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new c1.e(bVar.e).g(request, cancellationSignal, executor, iVar);
    }

    @Override
    public void onProductDetailsResponse(c5.i iVar, List list) {
        AndroidUtilities.runOnUIThread(new ff((zh.n5) this.f3631a, list, (d90) this.f3632b, (TLRPC.TL_inputStorePaymentStarsGift) this.f3633c, (TL_stars.TL_starsGiftOption) this.d, iVar, (Activity) this.e, 15));
    }

    @Override
    public void r(ud0 ud0Var, int i10) {
        org.telegram.ui.Components.g5.b((di.d) this.f3631a, (ud0) this.f3632b, (ud0) this.f3633c, (ud0) this.d, (ud0) this.e);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        TLRPC.TL_availableReaction tL_availableReaction;
        r71 r71Var = (r71) this.f3631a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f3632b;
        HashMap hashMap = (HashMap) this.f3633c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.e;
        r71Var.getClass();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.substring(9))));
                } else {
                    int i11 = r71Var.W;
                    if ((i11 == 1 || i11 == 11 || i11 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji)) != null) {
                        arrayList2.add(ah.i1.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    public s5(ya.c cVar, RectF rectF, t5 t5Var, RectF rectF2, t5 t5Var2) {
        this.f3631a = cVar;
        this.f3632b = rectF;
        this.d = t5Var;
        this.f3633c = rectF2;
        this.e = t5Var2;
    }
}
