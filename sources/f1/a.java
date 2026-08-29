package f1;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import c1.e;
import com.google.android.gms.tasks.OnFailureListener;
import eg.h0;
import ha.c;
import ih.i5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import jh.s7;
import kg.q0;
import kotlin.jvm.internal.j;
import lh.c9;
import lh.g4;
import nh.d;
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
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.d61;
import org.telegram.ui.n20;
import org.telegram.ui.of0;
import org.telegram.ui.oy0;
import p2.g;
import p2.m;
import v0.i;
import v0.n;
import v0.p;
public final class a implements OnFailureListener, BillingController.ProductDetailsResponseListenerLegacy, c9, b2, oc0, m, MediaDataController.KeywordResultCallback {
    public final Object f6260a;
    public final Object f6261b;
    public final Object f6262c;
    public final Object d;
    public final Object f6263e;

    public a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f6260a = obj;
        this.f6261b = obj2;
        this.f6262c = obj3;
        this.d = obj4;
        this.f6263e = obj5;
    }

    @Override
    public void b(g gVar, List list) {
        AndroidUtilities.runOnUIThread(new h0((of0) this.f6260a, gVar, list, (String) this.f6261b, (TLRPC.TL_inputStorePaymentAuthCode) this.f6262c, (TLRPC.TL_payments_canPurchaseStore) this.d, (n20) this.f6263e, 10));
    }

    @Override
    public void f(float f9, Canvas canvas, RectF rectF, boolean z10) {
        c cVar = (c) this.f6260a;
        RectF rectF2 = (RectF) this.f6261b;
        g4 g4Var = (g4) this.f6262c;
        RectF rectF3 = (RectF) this.d;
        g4 g4Var2 = (g4) this.f6263e;
        RectF rectF4 = g4Var.f15630m;
        rectF2.set(rectF4);
        RectF rectF5 = g4Var2.f15630m;
        rectF3.set(rectF5);
        rectF4.set(rectF);
        try {
            float width = rectF.width() / rectF2.width();
            float centerX = rectF.centerX() - ((((1.0f - f9) * 2.0f) + width) * (rectF2.centerX() - rectF3.centerX()));
            float centerY = rectF.centerY();
            float width2 = (rectF3.width() / 2.0f) * width;
            float height = (rectF3.height() / 2.0f) * width;
            rectF5.set(centerX - width2, centerY - height, centerX + width2, centerY + height);
        } catch (Exception unused) {
        }
        int i10 = ProfileStoriesView.f36262o0;
        ((oy0) cVar.f7981b).a(canvas, g4Var, g4Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override
    public void g(c2 c2Var, int i10) {
        m3 m3Var = (m3) this.f6260a;
        ((boolean[]) this.f6261b)[0] = true;
        m3Var.h(m3Var.f23685w, (l3) this.f6262c, true);
        ((Utilities.Callback) this.d).run(Boolean.TRUE);
        ((c2[]) this.f6263e)[0].dismiss();
    }

    @Override
    public void onFailure(Exception e10) {
        n request = (n) this.f6260a;
        b bVar = (b) this.f6261b;
        i iVar = (i) this.f6262c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.f6263e;
        j.e(e10, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        j.e(request, "request");
        for (p pVar : request.f49315a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new e(bVar.f6264e).g(request, cancellationSignal, executor, iVar);
    }

    @Override
    public void onProductDetailsResponse(g gVar, List list) {
        AndroidUtilities.runOnUIThread(new h0((s7) this.f6260a, list, (i5) this.f6261b, (TLRPC.TL_inputStorePaymentStarsGift) this.f6262c, (TL_stars.TL_starsGiftOption) this.d, gVar, (Activity) this.f6263e, 4));
    }

    @Override
    public void q(qc0 qc0Var, int i10) {
        c5.c((d) this.f6260a, (qc0) this.f6261b, (qc0) this.f6262c, (qc0) this.d, (qc0) this.f6263e);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        TLRPC.TL_availableReaction tL_availableReaction;
        d61 d61Var = (d61) this.f6260a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f6261b;
        HashMap hashMap = (HashMap) this.f6262c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.f6263e;
        d61Var.getClass();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.substring(9))));
                } else {
                    int i11 = d61Var.S;
                    if ((i11 == 1 || i11 == 11 || i11 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji)) != null) {
                        arrayList2.add(q0.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }
}
