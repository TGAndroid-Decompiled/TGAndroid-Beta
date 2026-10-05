package ai;

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
import org.telegram.ui.Components.bo0;
import org.telegram.ui.Components.ed0;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.a71;
import org.telegram.ui.bf;
import org.telegram.ui.dg0;
import org.telegram.ui.lz0;
public final class g6 implements dc, OnFailureListener, org.telegram.ui.ActionBar.a2, ed0, c5.p, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy {
    public final Object f971a;
    public final Object f972b;
    public final Object f973c;
    public final Object d;
    public final Object f974e;

    public g6(a6.i iVar, RectF rectF, h6 h6Var, RectF rectF2, h6 h6Var2) {
        this.f971a = iVar;
        this.f972b = rectF;
        this.d = h6Var;
        this.f973c = rectF2;
        this.f974e = h6Var2;
    }

    @Override
    public void a(float f7, Canvas canvas, RectF rectF, boolean z10) {
        a6.i iVar = (a6.i) this.f971a;
        RectF rectF2 = (RectF) this.f972b;
        h6 h6Var = (h6) this.d;
        RectF rectF3 = (RectF) this.f973c;
        h6 h6Var2 = (h6) this.f974e;
        RectF rectF4 = h6Var.f1036m;
        rectF2.set(rectF4);
        RectF rectF5 = h6Var2.f1036m;
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
        int i10 = ProfileStoriesView.f34507s0;
        ((lz0) iVar.f326b).a(canvas, h6Var, h6Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override
    public void b(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new bf((KeyEvent.Callback) ((dg0) this.f971a), (Object) hVar, (Object) list, (String) this.f972b, (Object) ((TLRPC.TL_inputStorePaymentAuthCode) this.f973c), (TLObject) ((TLRPC.TL_payments_canPurchaseStore) this.d), (Object) ((bo0) this.f974e), 4));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) this.f971a;
        ((boolean[]) this.f972b)[0] = true;
        n3Var.h(n3Var.f21430w, (org.telegram.ui.ActionBar.m3) this.f973c, true);
        ((Utilities.Callback) this.d).run(Boolean.TRUE);
        ((org.telegram.ui.ActionBar.b2[]) this.f974e)[0].dismiss();
    }

    @Override
    public void onFailure(Exception e7) {
        v0.o request = (v0.o) this.f971a;
        f1.a aVar = (f1.a) this.f972b;
        v0.i iVar = (v0.i) this.f973c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.f974e;
        kotlin.jvm.internal.i.e(e7, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        kotlin.jvm.internal.i.e(request, "request");
        for (v0.q qVar : request.f47766a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new c1.e(aVar.f9544e).g(request, cancellationSignal, executor, iVar);
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new bf((yh.u5) this.f971a, list, (r80) this.f972b, (TLRPC.TL_inputStorePaymentStarsGift) this.f973c, (TL_stars.TL_starsGiftOption) this.d, hVar, (Activity) this.f974e, 12));
    }

    @Override
    public void q(gd0 gd0Var, int i10) {
        org.telegram.ui.Components.e5.c((ci.d) this.f971a, (gd0) this.f972b, (gd0) this.f973c, (gd0) this.d, (gd0) this.f974e);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        TLRPC.TL_availableReaction tL_availableReaction;
        a71 a71Var = (a71) this.f971a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f972b;
        HashMap hashMap = (HashMap) this.f973c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.f974e;
        a71Var.getClass();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.substring(9))));
                } else {
                    int i11 = a71Var.W;
                    if ((i11 == 1 || i11 == 11 || i11 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji)) != null) {
                        arrayList2.add(zg.m0.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    public g6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f971a = obj;
        this.f972b = obj2;
        this.f973c = obj3;
        this.d = obj4;
        this.f974e = obj5;
    }
}
