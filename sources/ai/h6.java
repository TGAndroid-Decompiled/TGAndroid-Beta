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
import org.telegram.ui.Components.uo0;
import org.telegram.ui.Components.wd0;
import org.telegram.ui.Components.yd0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.df;
import org.telegram.ui.gg0;
import org.telegram.ui.n71;
import org.telegram.ui.tz0;
public final class h6 implements ec, OnFailureListener, org.telegram.ui.ActionBar.z1, wd0, c5.p, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy {
    public final Object f1085a;
    public final Object f1086b;
    public final Object f1087c;
    public final Object d;
    public final Object f1088e;

    public h6(a6.i iVar, RectF rectF, i6 i6Var, RectF rectF2, i6 i6Var2) {
        this.f1085a = iVar;
        this.f1086b = rectF;
        this.d = i6Var;
        this.f1087c = rectF2;
        this.f1088e = i6Var2;
    }

    @Override
    public void a(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new df((Object) ((gg0) this.f1085a), (Object) hVar, (Object) list, (String) this.f1086b, (Object) ((TLRPC.TL_inputStorePaymentAuthCode) this.f1087c), (Object) ((TLRPC.TL_payments_canPurchaseStore) this.d), (Object) ((uo0) this.f1088e), 4));
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) this.f1085a;
        ((boolean[]) this.f1086b)[0] = true;
        m3Var.h(m3Var.f21160w, (org.telegram.ui.ActionBar.l3) this.f1087c, true);
        ((Utilities.Callback) this.d).run(Boolean.TRUE);
        ((org.telegram.ui.ActionBar.a2[]) this.f1088e)[0].dismiss();
    }

    @Override
    public void g(float f7, Canvas canvas, RectF rectF, boolean z10) {
        a6.i iVar = (a6.i) this.f1085a;
        RectF rectF2 = (RectF) this.f1086b;
        i6 i6Var = (i6) this.d;
        RectF rectF3 = (RectF) this.f1087c;
        i6 i6Var2 = (i6) this.f1088e;
        RectF rectF4 = i6Var.f1148m;
        rectF2.set(rectF4);
        RectF rectF5 = i6Var2.f1148m;
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
        int i10 = ProfileStoriesView.f34336s0;
        ((tz0) iVar.f326b).a(canvas, i6Var, i6Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override
    public void onFailure(Exception e7) {
        v0.n request = (v0.n) this.f1085a;
        f1.a aVar = (f1.a) this.f1086b;
        v0.i iVar = (v0.i) this.f1087c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.f1088e;
        kotlin.jvm.internal.i.e(e7, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        kotlin.jvm.internal.i.e(request, "request");
        for (v0.p pVar : request.f49259a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new c1.e(aVar.f9551e).g(request, cancellationSignal, executor, iVar);
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new df((yh.n5) this.f1085a, list, (j90) this.f1086b, (TLRPC.TL_inputStorePaymentStarsGift) this.f1087c, (TL_stars.TL_starsGiftOption) this.d, hVar, (Activity) this.f1088e, 15));
    }

    @Override
    public void q(yd0 yd0Var, int i10) {
        org.telegram.ui.Components.g5.b((ci.d) this.f1085a, (yd0) this.f1086b, (yd0) this.f1087c, (yd0) this.d, (yd0) this.f1088e);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        TLRPC.TL_availableReaction tL_availableReaction;
        n71 n71Var = (n71) this.f1085a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f1086b;
        HashMap hashMap = (HashMap) this.f1087c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.f1088e;
        n71Var.getClass();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.substring(9))));
                } else {
                    int i11 = n71Var.W;
                    if ((i11 == 1 || i11 == 11 || i11 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji)) != null) {
                        arrayList2.add(zg.n0.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    public h6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f1085a = obj;
        this.f1086b = obj2;
        this.f1087c = obj3;
        this.d = obj4;
        this.f1088e = obj5;
    }
}
