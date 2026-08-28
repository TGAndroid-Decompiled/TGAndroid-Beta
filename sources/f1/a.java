package f1;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bg.k0;
import c1.e;
import com.google.android.gms.tasks.OnFailureListener;
import fh.w5;
import gh.v7;
import hg.r0;
import ih.g9;
import ih.k4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import k5.i;
import kh.d;
import n2.g;
import n2.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.l3;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.b61;
import org.telegram.ui.of0;
import org.telegram.ui.oy0;
import v0.o;
import v0.q;
public final class a implements OnFailureListener, BillingController.ProductDetailsResponseListenerLegacy, g9, b2, zb0, m, MediaDataController.KeywordResultCallback {
    public final Object f5298a;
    public final Object f5299b;
    public final Object f5300c;
    public final Object d;
    public final Object f5301e;

    public a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f5298a = obj;
        this.f5299b = obj2;
        this.f5300c = obj3;
        this.d = obj4;
        this.f5301e = obj5;
    }

    @Override
    public void c(g gVar, List list) {
        AndroidUtilities.runOnUIThread(new k0((of0) this.f5298a, gVar, list, (String) this.f5299b, (TLRPC.TL_inputStorePaymentAuthCode) this.f5300c, (TLRPC.TL_payments_canPurchaseStore) this.d, (no0) this.f5301e, 10));
    }

    @Override
    public void f(c2 c2Var, int i9) {
        m3 m3Var = (m3) this.f5298a;
        ((boolean[]) this.f5299b)[0] = true;
        m3Var.h(m3Var.f23665w, (l3) this.f5300c, true);
        ((Utilities.Callback) this.d).run(Boolean.TRUE);
        ((c2[]) this.f5301e)[0].dismiss();
    }

    @Override
    public void g(float f10, Canvas canvas, RectF rectF, boolean z10) {
        i iVar = (i) this.f5298a;
        RectF rectF2 = (RectF) this.f5299b;
        k4 k4Var = (k4) this.f5300c;
        RectF rectF3 = (RectF) this.d;
        k4 k4Var2 = (k4) this.f5301e;
        RectF rectF4 = k4Var.f11681m;
        rectF2.set(rectF4);
        RectF rectF5 = k4Var2.f11681m;
        rectF3.set(rectF5);
        rectF4.set(rectF);
        try {
            float width = rectF.width() / rectF2.width();
            float centerX = rectF.centerX() - ((((1.0f - f10) * 2.0f) + width) * (rectF2.centerX() - rectF3.centerX()));
            float centerY = rectF.centerY();
            float width2 = (rectF3.width() / 2.0f) * width;
            float height = (rectF3.height() / 2.0f) * width;
            rectF5.set(centerX - width2, centerY - height, centerX + width2, centerY + height);
        } catch (Exception unused) {
        }
        int i9 = ProfileStoriesView.f36197o0;
        ((oy0) iVar.f14659b).a(canvas, k4Var, k4Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override
    public void m(bc0 bc0Var, int i9) {
        y4.c((d) this.f5298a, (bc0) this.f5299b, (bc0) this.f5300c, (bc0) this.d, (bc0) this.f5301e);
    }

    @Override
    public void onFailure(Exception e10) {
        o request = (o) this.f5298a;
        b bVar = (b) this.f5299b;
        v0.i iVar = (v0.i) this.f5300c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.f5301e;
        kotlin.jvm.internal.i.e(e10, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        kotlin.jvm.internal.i.e(request, "request");
        for (q qVar : request.f48239a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new e(bVar.f5302e).g(request, cancellationSignal, executor, iVar);
    }

    @Override
    public void onProductDetailsResponse(g gVar, List list) {
        AndroidUtilities.runOnUIThread(new k0((v7) this.f5298a, list, (w5) this.f5299b, (TLRPC.TL_inputStorePaymentStarsGift) this.f5300c, (TL_stars.TL_starsGiftOption) this.d, gVar, (Activity) this.f5301e, 4));
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        TLRPC.TL_availableReaction tL_availableReaction;
        b61 b61Var = (b61) this.f5298a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f5299b;
        HashMap hashMap = (HashMap) this.f5300c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.f5301e;
        b61Var.getClass();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            try {
                if (((MediaDataController.KeywordResult) arrayList.get(i9)).emoji.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((MediaDataController.KeywordResult) arrayList.get(i9)).emoji.substring(9))));
                } else {
                    int i10 = b61Var.S;
                    if ((i10 == 1 || i10 == 11 || i10 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((MediaDataController.KeywordResult) arrayList.get(i9)).emoji)) != null) {
                        arrayList2.add(r0.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }
}
