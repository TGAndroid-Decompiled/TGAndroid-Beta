package f1;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.util.Log;
import android.view.KeyEvent;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.d;
import c1.e;
import c5.h;
import c5.p;
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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.p3;
import org.telegram.ui.ActionBar.q3;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.q01;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.bf;
import org.telegram.ui.fg0;
import org.telegram.ui.l71;
import org.telegram.ui.vz0;
import v0.i;
import v0.n;
import xh.v5;
import yg.p0;
import zh.d3;
import zh.e3;
import zh.o7;
public final class a implements OnFailureListener, c2, bd0, p, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, o7 {
    public final Object f7673a;
    public final Object f7674b;
    public final Object f7675c;
    public final Object d;
    public final Object e;

    public a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f7673a = obj;
        this.f7674b = obj2;
        this.f7675c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override
    public void a(h hVar, List list) {
        AndroidUtilities.runOnUIThread(new bf((KeyEvent.Callback) ((fg0) this.f7673a), (Object) hVar, (Object) list, (String) this.f7674b, (Object) ((TLRPC.TL_inputStorePaymentAuthCode) this.f7675c), (TLObject) ((TLRPC.TL_payments_canPurchaseStore) this.d), (Object) ((q01) this.e), 4));
    }

    @Override
    public void f(d2 d2Var, int i10) {
        q3 q3Var = (q3) this.f7673a;
        ((boolean[]) this.f7674b)[0] = true;
        q3Var.h(q3Var.f18581w, (p3) this.f7675c, true);
        ((Utilities.Callback) this.d).run(Boolean.TRUE);
        ((d2[]) this.e)[0].dismiss();
    }

    @Override
    public void g(float f7, Canvas canvas, RectF rectF, boolean z10) {
        d3 d3Var = (d3) this.f7673a;
        RectF rectF2 = (RectF) this.f7674b;
        e3 e3Var = (e3) this.f7675c;
        RectF rectF3 = (RectF) this.d;
        e3 e3Var2 = (e3) this.e;
        RectF rectF4 = e3Var.f48378m;
        rectF2.set(rectF4);
        RectF rectF5 = e3Var2.f48378m;
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
        int i10 = ProfileStoriesView.f30630s0;
        ((vz0) d3Var.f48346a).a(canvas, e3Var, e3Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override
    public void onFailure(Exception e) {
        n request = (n) this.f7673a;
        b bVar = (b) this.f7674b;
        i iVar = (i) this.f7675c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.e;
        kotlin.jvm.internal.i.e(e, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        kotlin.jvm.internal.i.e(request, "request");
        for (v0.p pVar : request.f42837a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new e(bVar.e).g(request, cancellationSignal, executor, iVar);
    }

    @Override
    public void onProductDetailsResponse(h hVar, List list) {
        AndroidUtilities.runOnUIThread(new bf((v5) this.f7673a, list, (n80) this.f7674b, (TLRPC.TL_inputStorePaymentStarsGift) this.f7675c, (TL_stars.TL_starsGiftOption) this.d, hVar, (Activity) this.e, 12));
    }

    @Override
    public void q(dd0 dd0Var, int i10) {
        d5.c((d) this.f7673a, (dd0) this.f7674b, (dd0) this.f7675c, (dd0) this.d, (dd0) this.e);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        TLRPC.TL_availableReaction tL_availableReaction;
        l71 l71Var = (l71) this.f7673a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f7674b;
        HashMap hashMap = (HashMap) this.f7675c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.e;
        l71Var.getClass();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.substring(9))));
                } else {
                    int i11 = l71Var.W;
                    if ((i11 == 1 || i11 == 11 || i11 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji)) != null) {
                        arrayList2.add(p0.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }
}
