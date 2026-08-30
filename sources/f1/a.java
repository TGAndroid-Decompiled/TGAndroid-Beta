package f1;

import a3.c;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import c1.f;
import com.google.android.gms.tasks.OnFailureListener;
import gg.g0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import kh.i5;
import kotlin.jvm.internal.j;
import lh.t7;
import mg.q0;
import nh.c9;
import nh.g4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.a30;
import org.telegram.ui.q61;
import org.telegram.ui.wf0;
import org.telegram.ui.zy0;
import p2.h;
import p2.o;
import ph.d;
import v0.i;
import v0.n;
import v0.p;
public final class a implements OnFailureListener, BillingController.ProductDetailsResponseListenerLegacy, c9, c2, uc0, o, MediaDataController.KeywordResultCallback {
    public final Object f5648a;
    public final Object f5649b;
    public final Object f5650c;
    public final Object d;
    public final Object e;

    public a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f5648a = obj;
        this.f5649b = obj2;
        this.f5650c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override
    public void b(h hVar, List list) {
        AndroidUtilities.runOnUIThread(new g0((wf0) this.f5648a, hVar, list, (String) this.f5649b, (TLRPC.TL_inputStorePaymentAuthCode) this.f5650c, (TLRPC.TL_payments_canPurchaseStore) this.d, (a30) this.e, 10));
    }

    @Override
    public void g(float f10, Canvas canvas, RectF rectF, boolean z4) {
        c cVar = (c) this.f5648a;
        RectF rectF2 = (RectF) this.f5649b;
        g4 g4Var = (g4) this.f5650c;
        RectF rectF3 = (RectF) this.d;
        g4 g4Var2 = (g4) this.e;
        RectF rectF4 = g4Var.f15359m;
        rectF2.set(rectF4);
        RectF rectF5 = g4Var2.f15359m;
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
        int i10 = ProfileStoriesView.f32303p0;
        ((zy0) cVar.f46b).a(canvas, g4Var, g4Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override
    public void i(d2 d2Var, int i10) {
        n3 n3Var = (n3) this.f5648a;
        ((boolean[]) this.f5649b)[0] = true;
        n3Var.h(n3Var.f20488w, (m3) this.f5650c, true);
        ((Utilities.Callback) this.d).run(Boolean.TRUE);
        ((d2[]) this.e)[0].dismiss();
    }

    @Override
    public void onFailure(Exception e) {
        n request = (n) this.f5648a;
        b bVar = (b) this.f5649b;
        i iVar = (i) this.f5650c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.e;
        j.e(e, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        j.e(request, "request");
        for (p pVar : request.f45547a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new f(bVar.e).g(request, cancellationSignal, executor, iVar);
    }

    @Override
    public void onProductDetailsResponse(h hVar, List list) {
        AndroidUtilities.runOnUIThread(new g0((t7) this.f5648a, list, (i5) this.f5649b, (TLRPC.TL_inputStorePaymentStarsGift) this.f5650c, (TL_stars.TL_starsGiftOption) this.d, hVar, (Activity) this.e, 4));
    }

    @Override
    public void q(wc0 wc0Var, int i10) {
        z4.c((d) this.f5648a, (wc0) this.f5649b, (wc0) this.f5650c, (wc0) this.d, (wc0) this.e);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        TLRPC.TL_availableReaction tL_availableReaction;
        q61 q61Var = (q61) this.f5648a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f5649b;
        HashMap hashMap = (HashMap) this.f5650c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.e;
        q61Var.getClass();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.substring(9))));
                } else {
                    int i11 = q61Var.T;
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
