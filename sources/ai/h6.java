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
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.sc0;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.fg0;
import org.telegram.ui.h71;
import org.telegram.ui.sz0;
import org.telegram.ui.ye;
public final class h6 implements dc, OnFailureListener, org.telegram.ui.ActionBar.a2, sc0, c5.p, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy {
    public final Object f944a;
    public final Object f945b;
    public final Object f946c;
    public final Object d;
    public final Object e;

    public h6(a6.i iVar, RectF rectF, i6 i6Var, RectF rectF2, i6 i6Var2) {
        this.f944a = iVar;
        this.f945b = rectF;
        this.d = i6Var;
        this.f946c = rectF2;
        this.e = i6Var2;
    }

    @Override
    public void a(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new ye((KeyEvent.Callback) ((fg0) this.f944a), (Object) hVar, (Object) list, (String) this.f945b, (Object) ((TLRPC.TL_inputStorePaymentAuthCode) this.f946c), (TLObject) ((TLRPC.TL_payments_canPurchaseStore) this.d), (Object) ((jn0) this.e), 4));
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        org.telegram.ui.ActionBar.o3 o3Var = (org.telegram.ui.ActionBar.o3) this.f944a;
        ((boolean[]) this.f945b)[0] = true;
        o3Var.h(o3Var.f19463w, (org.telegram.ui.ActionBar.n3) this.f946c, true);
        ((Utilities.Callback) this.d).run(Boolean.TRUE);
        ((org.telegram.ui.ActionBar.b2[]) this.e)[0].dismiss();
    }

    @Override
    public void g(float f7, Canvas canvas, RectF rectF, boolean z10) {
        a6.i iVar = (a6.i) this.f944a;
        RectF rectF2 = (RectF) this.f945b;
        i6 i6Var = (i6) this.d;
        RectF rectF3 = (RectF) this.f946c;
        i6 i6Var2 = (i6) this.e;
        RectF rectF4 = i6Var.f990m;
        rectF2.set(rectF4);
        RectF rectF5 = i6Var2.f990m;
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
        int i10 = ProfileStoriesView.f31515s0;
        ((sz0) iVar.f303b).a(canvas, i6Var, i6Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override
    public void onFailure(Exception e) {
        v0.o request = (v0.o) this.f944a;
        f1.a aVar = (f1.a) this.f945b;
        v0.i iVar = (v0.i) this.f946c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.e;
        kotlin.jvm.internal.i.e(e, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        kotlin.jvm.internal.i.e(request, "request");
        for (v0.q qVar : request.f43813a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new c1.e(aVar.e).g(request, cancellationSignal, executor, iVar);
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new ye((yh.u5) this.f944a, list, (d80) this.f945b, (TLRPC.TL_inputStorePaymentStarsGift) this.f946c, (TL_stars.TL_starsGiftOption) this.d, hVar, (Activity) this.e, 12));
    }

    @Override
    public void q(uc0 uc0Var, int i10) {
        org.telegram.ui.Components.c5.c((ci.d) this.f944a, (uc0) this.f945b, (uc0) this.f946c, (uc0) this.d, (uc0) this.e);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        TLRPC.TL_availableReaction tL_availableReaction;
        h71 h71Var = (h71) this.f944a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f945b;
        HashMap hashMap = (HashMap) this.f946c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.e;
        h71Var.getClass();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.substring(9))));
                } else {
                    int i11 = h71Var.W;
                    if ((i11 == 1 || i11 == 11 || i11 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji)) != null) {
                        arrayList2.add(zg.p0.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    public h6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f944a = obj;
        this.f945b = obj2;
        this.f946c = obj3;
        this.d = obj4;
        this.e = obj5;
    }
}
