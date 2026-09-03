package f1;

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
import kh.h5;
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
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.xc0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.c30;
import org.telegram.ui.fz0;
import org.telegram.ui.x61;
import org.telegram.ui.yf0;
import p2.h;
import p2.o;
import ph.d;
import v0.i;
import v0.n;
import v0.p;
public final class a implements OnFailureListener, BillingController.ProductDetailsResponseListenerLegacy, c9, c2, vc0, o, MediaDataController.KeywordResultCallback {
    public final Object f5637a;
    public final Object f5638b;
    public final Object f5639c;
    public final Object d;
    public final Object e;

    public a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f5637a = obj;
        this.f5638b = obj2;
        this.f5639c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override
    public void b(h hVar, List list) {
        AndroidUtilities.runOnUIThread(new g0((yf0) this.f5637a, hVar, list, (String) this.f5638b, (TLRPC.TL_inputStorePaymentAuthCode) this.f5639c, (TLRPC.TL_payments_canPurchaseStore) this.d, (c30) this.e, 10));
    }

    @Override
    public void f(float f10, Canvas canvas, RectF rectF, boolean z4) {
        bb.b bVar = (bb.b) this.f5637a;
        RectF rectF2 = (RectF) this.f5638b;
        g4 g4Var = (g4) this.f5639c;
        RectF rectF3 = (RectF) this.d;
        g4 g4Var2 = (g4) this.e;
        RectF rectF4 = g4Var.f15339m;
        rectF2.set(rectF4);
        RectF rectF5 = g4Var2.f15339m;
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
        int i10 = ProfileStoriesView.f32277p0;
        ((fz0) bVar.f1772b).a(canvas, g4Var, g4Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override
    public void l(d2 d2Var, int i10) {
        n3 n3Var = (n3) this.f5637a;
        ((boolean[]) this.f5638b)[0] = true;
        n3Var.h(n3Var.f20463w, (m3) this.f5639c, true);
        ((Utilities.Callback) this.d).run(Boolean.TRUE);
        ((d2[]) this.e)[0].dismiss();
    }

    @Override
    public void onFailure(Exception e) {
        n request = (n) this.f5637a;
        b bVar = (b) this.f5638b;
        i iVar = (i) this.f5639c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.e;
        j.e(e, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        j.e(request, "request");
        for (p pVar : request.f45611a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new f(bVar.e).g(request, cancellationSignal, executor, iVar);
    }

    @Override
    public void onProductDetailsResponse(h hVar, List list) {
        AndroidUtilities.runOnUIThread(new g0((t7) this.f5637a, list, (h5) this.f5638b, (TLRPC.TL_inputStorePaymentStarsGift) this.f5639c, (TL_stars.TL_starsGiftOption) this.d, hVar, (Activity) this.e, 4));
    }

    @Override
    public void q(xc0 xc0Var, int i10) {
        z4.c((d) this.f5637a, (xc0) this.f5638b, (xc0) this.f5639c, (xc0) this.d, (xc0) this.e);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        TLRPC.TL_availableReaction tL_availableReaction;
        x61 x61Var = (x61) this.f5637a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f5638b;
        HashMap hashMap = (HashMap) this.f5639c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.e;
        x61Var.getClass();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.substring(9))));
                } else {
                    int i11 = x61Var.T;
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
