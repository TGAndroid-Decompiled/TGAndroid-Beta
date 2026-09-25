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
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.ed0;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.a71;
import org.telegram.ui.iz0;
import org.telegram.ui.ye;
import org.telegram.ui.zf0;
public final class g6 implements dc, OnFailureListener, org.telegram.ui.ActionBar.z1, cd0, c5.p, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy {
    public final Object f899a;
    public final Object f900b;
    public final Object f901c;
    public final Object d;
    public final Object e;

    public g6(a6.i iVar, RectF rectF, h6 h6Var, RectF rectF2, h6 h6Var2) {
        this.f899a = iVar;
        this.f900b = rectF;
        this.d = h6Var;
        this.f901c = rectF2;
        this.e = h6Var2;
    }

    @Override
    public void a(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new ye((KeyEvent.Callback) ((zf0) this.f899a), (Object) hVar, (Object) list, (String) this.f900b, (Object) ((TLRPC.TL_inputStorePaymentAuthCode) this.f901c), (TLObject) ((TLRPC.TL_payments_canPurchaseStore) this.d), (Object) ((vn0) this.e), 4));
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) this.f899a;
        ((boolean[]) this.f900b)[0] = true;
        m3Var.h(m3Var.f19648w, (org.telegram.ui.ActionBar.l3) this.f901c, true);
        ((Utilities.Callback) this.d).run(Boolean.TRUE);
        ((org.telegram.ui.ActionBar.a2[]) this.e)[0].dismiss();
    }

    @Override
    public void g(float f7, Canvas canvas, RectF rectF, boolean z10) {
        a6.i iVar = (a6.i) this.f899a;
        RectF rectF2 = (RectF) this.f900b;
        h6 h6Var = (h6) this.d;
        RectF rectF3 = (RectF) this.f901c;
        h6 h6Var2 = (h6) this.e;
        RectF rectF4 = h6Var.f954m;
        rectF2.set(rectF4);
        RectF rectF5 = h6Var2.f954m;
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
        int i10 = ProfileStoriesView.f31805s0;
        ((iz0) iVar.f303b).a(canvas, h6Var, h6Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override
    public void onFailure(Exception e) {
        v0.n request = (v0.n) this.f899a;
        f1.a aVar = (f1.a) this.f900b;
        v0.i iVar = (v0.i) this.f901c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.e;
        kotlin.jvm.internal.i.e(e, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        kotlin.jvm.internal.i.e(request, "request");
        for (v0.p pVar : request.f44100a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new c1.e(aVar.e).g(request, cancellationSignal, executor, iVar);
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new ye((yh.s5) this.f899a, list, (o80) this.f900b, (TLRPC.TL_inputStorePaymentStarsGift) this.f901c, (TL_stars.TL_starsGiftOption) this.d, hVar, (Activity) this.e, 12));
    }

    @Override
    public void q(ed0 ed0Var, int i10) {
        org.telegram.ui.Components.e5.c((ci.d) this.f899a, (ed0) this.f900b, (ed0) this.f901c, (ed0) this.d, (ed0) this.e);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        TLRPC.TL_availableReaction tL_availableReaction;
        a71 a71Var = (a71) this.f899a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f900b;
        HashMap hashMap = (HashMap) this.f901c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.e;
        a71Var.getClass();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.substring(9))));
                } else {
                    int i11 = a71Var.W;
                    if ((i11 == 1 || i11 == 11 || i11 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji)) != null) {
                        arrayList2.add(zg.o0.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    public g6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f899a = obj;
        this.f900b = obj2;
        this.f901c = obj3;
        this.d = obj4;
        this.e = obj5;
    }
}
