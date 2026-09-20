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
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.hg0;
import org.telegram.ui.j71;
import org.telegram.ui.rz0;
import org.telegram.ui.ze;
public final class h6 implements dc, OnFailureListener, org.telegram.ui.ActionBar.a2, ad0, c5.p, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy {
    public final Object f947a;
    public final Object f948b;
    public final Object f949c;
    public final Object d;
    public final Object e;

    public h6(a6.i iVar, RectF rectF, i6 i6Var, RectF rectF2, i6 i6Var2) {
        this.f947a = iVar;
        this.f948b = rectF;
        this.d = i6Var;
        this.f949c = rectF2;
        this.e = i6Var2;
    }

    @Override
    public void a(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new ze((KeyEvent.Callback) ((hg0) this.f947a), (Object) hVar, (Object) list, (String) this.f948b, (Object) ((TLRPC.TL_inputStorePaymentAuthCode) this.f949c), (TLObject) ((TLRPC.TL_payments_canPurchaseStore) this.d), (Object) ((vn0) this.e), 4));
    }

    @Override
    public void f(float f7, Canvas canvas, RectF rectF, boolean z10) {
        a6.i iVar = (a6.i) this.f947a;
        RectF rectF2 = (RectF) this.f948b;
        i6 i6Var = (i6) this.d;
        RectF rectF3 = (RectF) this.f949c;
        i6 i6Var2 = (i6) this.e;
        RectF rectF4 = i6Var.f993m;
        rectF2.set(rectF4);
        RectF rectF5 = i6Var2.f993m;
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
        int i10 = ProfileStoriesView.f31802s0;
        ((rz0) iVar.f303b).a(canvas, i6Var, i6Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        org.telegram.ui.ActionBar.o3 o3Var = (org.telegram.ui.ActionBar.o3) this.f947a;
        ((boolean[]) this.f948b)[0] = true;
        o3Var.h(o3Var.f19687w, (org.telegram.ui.ActionBar.n3) this.f949c, true);
        ((Utilities.Callback) this.d).run(Boolean.TRUE);
        ((org.telegram.ui.ActionBar.b2[]) this.e)[0].dismiss();
    }

    @Override
    public void onFailure(Exception e) {
        v0.n request = (v0.n) this.f947a;
        f1.a aVar = (f1.a) this.f948b;
        v0.i iVar = (v0.i) this.f949c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.e;
        kotlin.jvm.internal.i.e(e, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        kotlin.jvm.internal.i.e(request, "request");
        for (v0.p pVar : request.f44115a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new c1.e(aVar.e).g(request, cancellationSignal, executor, iVar);
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new ze((yh.u5) this.f947a, list, (l80) this.f948b, (TLRPC.TL_inputStorePaymentStarsGift) this.f949c, (TL_stars.TL_starsGiftOption) this.d, hVar, (Activity) this.e, 12));
    }

    @Override
    public void q(cd0 cd0Var, int i10) {
        org.telegram.ui.Components.d5.c((ci.d) this.f947a, (cd0) this.f948b, (cd0) this.f949c, (cd0) this.d, (cd0) this.e);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        TLRPC.TL_availableReaction tL_availableReaction;
        j71 j71Var = (j71) this.f947a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f948b;
        HashMap hashMap = (HashMap) this.f949c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.e;
        j71Var.getClass();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.substring(9))));
                } else {
                    int i11 = j71Var.W;
                    if ((i11 == 1 || i11 == 11 || i11 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji)) != null) {
                        arrayList2.add(zg.o0.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    public h6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f947a = obj;
        this.f948b = obj2;
        this.f949c = obj3;
        this.d = obj4;
        this.e = obj5;
    }
}
