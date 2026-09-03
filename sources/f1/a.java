package f1;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import c1.f;
import com.google.android.gms.tasks.OnFailureListener;
import hg.g0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import lh.i5;
import mh.t7;
import ng.q0;
import oh.c9;
import oh.h4;
import oh.i4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.ActionBar.o3;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.b30;
import org.telegram.ui.fz0;
import org.telegram.ui.w61;
import org.telegram.ui.xf0;
import p2.h;
import p2.n;
import qh.d;
import v0.i;
import v0.p;
public final class a implements OnFailureListener, BillingController.ProductDetailsResponseListenerLegacy, c9, c2, wc0, n, MediaDataController.KeywordResultCallback {
    public final Object f5717a;
    public final Object f5718b;
    public final Object f5719c;
    public final Object d;
    public final Object f5720e;

    public a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f5717a = obj;
        this.f5718b = obj2;
        this.f5719c = obj3;
        this.d = obj4;
        this.f5720e = obj5;
    }

    @Override
    public void b(h hVar, List list) {
        AndroidUtilities.runOnUIThread(new g0((xf0) this.f5717a, hVar, list, (String) this.f5718b, (TLRPC.TL_inputStorePaymentAuthCode) this.f5719c, (TLRPC.TL_payments_canPurchaseStore) this.d, (b30) this.f5720e, 10));
    }

    @Override
    public void g(float f10, Canvas canvas, RectF rectF, boolean z4) {
        h4 h4Var = (h4) this.f5717a;
        RectF rectF2 = (RectF) this.f5718b;
        i4 i4Var = (i4) this.f5719c;
        RectF rectF3 = (RectF) this.d;
        i4 i4Var2 = (i4) this.f5720e;
        RectF rectF4 = i4Var.f17219m;
        rectF2.set(rectF4);
        RectF rectF5 = i4Var2.f17219m;
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
        int i10 = ProfileStoriesView.f34841p0;
        ((fz0) h4Var.f17182b).a(canvas, i4Var, i4Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override
    public void j(d2 d2Var, int i10) {
        o3 o3Var = (o3) this.f5717a;
        ((boolean[]) this.f5718b)[0] = true;
        o3Var.h(o3Var.f22202w, (n3) this.f5719c, true);
        ((Utilities.Callback) this.d).run(Boolean.TRUE);
        ((d2[]) this.f5720e)[0].dismiss();
    }

    @Override
    public void onFailure(Exception e6) {
        v0.n request = (v0.n) this.f5717a;
        b bVar = (b) this.f5718b;
        i iVar = (i) this.f5719c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.f5720e;
        j.e(e6, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        j.e(request, "request");
        for (p pVar : request.f48873a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new f(bVar.f5721e).g(request, cancellationSignal, executor, iVar);
    }

    @Override
    public void onProductDetailsResponse(h hVar, List list) {
        AndroidUtilities.runOnUIThread(new g0((t7) this.f5717a, list, (i5) this.f5718b, (TLRPC.TL_inputStorePaymentStarsGift) this.f5719c, (TL_stars.TL_starsGiftOption) this.d, hVar, (Activity) this.f5720e, 4));
    }

    @Override
    public void q(yc0 yc0Var, int i10) {
        z4.c((d) this.f5717a, (yc0) this.f5718b, (yc0) this.f5719c, (yc0) this.d, (yc0) this.f5720e);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        TLRPC.TL_availableReaction tL_availableReaction;
        w61 w61Var = (w61) this.f5717a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f5718b;
        HashMap hashMap = (HashMap) this.f5719c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.f5720e;
        w61Var.getClass();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.substring(9))));
                } else {
                    int i11 = w61Var.T;
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
