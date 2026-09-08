package bi;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.util.Log;
import android.view.KeyEvent;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.tc0;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.fg0;
import org.telegram.ui.j71;
import org.telegram.ui.sz0;
import org.telegram.ui.ze;
public final class q5 implements jb, OnFailureListener, org.telegram.ui.ActionBar.a2, tc0, c5.p, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy {
    public final Object f3631a;
    public final Object f3632b;
    public final Object f3633c;
    public final Object d;
    public final Object f3634e;

    public q5(a6.i iVar, RectF rectF, r5 r5Var, RectF rectF2, r5 r5Var2) {
        this.f3631a = iVar;
        this.f3632b = rectF;
        this.d = r5Var;
        this.f3633c = rectF2;
        this.f3634e = r5Var2;
    }

    @Override
    public void b(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new ze((KeyEvent.Callback) ((fg0) this.f3631a), (Object) hVar, (Object) list, (String) this.f3632b, (Object) ((TLRPC.TL_inputStorePaymentAuthCode) this.f3633c), (TLObject) ((TLRPC.TL_payments_canPurchaseStore) this.d), (Object) ((in0) this.f3634e), 4));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        org.telegram.ui.ActionBar.o3 o3Var = (org.telegram.ui.ActionBar.o3) this.f3631a;
        ((boolean[]) this.f3632b)[0] = true;
        o3Var.h(o3Var.f21288w, (org.telegram.ui.ActionBar.n3) this.f3633c, true);
        ((Utilities.Callback) this.d).run(Boolean.TRUE);
        ((org.telegram.ui.ActionBar.b2[]) this.f3634e)[0].dismiss();
    }

    @Override
    public void h(float f7, Canvas canvas, RectF rectF, boolean z10) {
        a6.i iVar = (a6.i) this.f3631a;
        RectF rectF2 = (RectF) this.f3632b;
        r5 r5Var = (r5) this.d;
        RectF rectF3 = (RectF) this.f3633c;
        r5 r5Var2 = (r5) this.f3634e;
        RectF rectF4 = r5Var.f3665m;
        rectF2.set(rectF4);
        RectF rectF5 = r5Var2.f3665m;
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
        int i10 = ProfileStoriesView.f34169s0;
        ((sz0) iVar.f324b).a(canvas, r5Var, r5Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override
    public void onFailure(Exception e7) {
        v0.n request = (v0.n) this.f3631a;
        f1.a aVar = (f1.a) this.f3632b;
        v0.i iVar = (v0.i) this.f3633c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.f3634e;
        kotlin.jvm.internal.i.e(e7, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        kotlin.jvm.internal.i.e(request, "request");
        for (v0.p pVar : request.f47299a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new c1.e(aVar.f9194e).g(request, cancellationSignal, executor, iVar);
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new ze((zh.s5) this.f3631a, list, (d80) this.f3632b, (TLRPC.TL_inputStorePaymentStarsGift) this.f3633c, (TL_stars.TL_starsGiftOption) this.d, hVar, (Activity) this.f3634e, 12));
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        TLRPC.TL_availableReaction tL_availableReaction;
        j71 j71Var = (j71) this.f3631a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f3632b;
        HashMap hashMap = (HashMap) this.f3633c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.f3634e;
        j71Var.getClass();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.substring(9))));
                } else {
                    int i11 = j71Var.W;
                    if ((i11 == 1 || i11 == 11 || i11 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji)) != null) {
                        arrayList2.add(ah.j1.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override
    public void s(vc0 vc0Var, int i10) {
        org.telegram.ui.Components.e5.c((di.d) this.f3631a, (vc0) this.f3632b, (vc0) this.f3633c, (vc0) this.d, (vc0) this.f3634e);
    }

    public q5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f3631a = obj;
        this.f3632b = obj2;
        this.f3633c = obj3;
        this.d = obj4;
        this.f3634e = obj5;
    }
}
