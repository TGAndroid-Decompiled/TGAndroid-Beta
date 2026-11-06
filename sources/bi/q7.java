package bi;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.messenger.c20;
import org.telegram.messenger.qi;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.fb0;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.bv0;
import org.telegram.ui.ld0;
import org.telegram.ui.q11;
public final class q7 implements org.telegram.messenger.q1, di.j9, OnFailureListener, org.telegram.ui.ActionBar.r1, fb0, f5.m, ri {
    public final Object f4575a;
    public final Object f4576b;
    public final Object f4577c;
    public final Object d;
    public final Object f4578e;

    public q7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f4575a = obj;
        this.f4576b = obj2;
        this.f4577c = obj3;
        this.d = obj4;
        this.f4578e = obj5;
    }

    @Override
    public void a(f5.f fVar, List list) {
        org.telegram.messenger.g0.h3(new r7((ea) this.f4575a, list, (mc) this.f4576b, (TLRPC.TL_inputStorePaymentStarsGift) this.f4577c, (TL_stars.TL_starsGiftOption) this.d, fVar, (Activity) this.f4578e, 1));
    }

    @Override
    public void b(f5.f fVar, List list) {
        org.telegram.messenger.g0.h3(new r7((ld0) this.f4575a, fVar, list, (String) this.f4576b, (TLRPC.TL_inputStorePaymentAuthCode) this.f4577c, (TLRPC.TL_payments_canPurchaseStore) this.d, (kn0) this.f4578e, 8));
    }

    @Override
    public void e(String str, ArrayList arrayList) {
        TLRPC.TL_availableReaction tL_availableReaction;
        q11 q11Var = (q11) this.f4575a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f4576b;
        HashMap hashMap = (HashMap) this.f4577c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.f4578e;
        q11Var.getClass();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            try {
                if (((qi) arrayList.get(i7)).f24690a.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((qi) arrayList.get(i7)).f24690a.substring(9))));
                } else {
                    int i10 = q11Var.W;
                    if ((i10 == 1 || i10 == 11 || i10 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((qi) arrayList.get(i7)).f24690a)) != null) {
                        arrayList2.add(ch.o0.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        org.telegram.ui.ActionBar.d3 d3Var = (org.telegram.ui.ActionBar.d3) this.f4575a;
        ((boolean[]) this.f4576b)[0] = true;
        d3Var.h(d3Var.f27433x, (org.telegram.ui.ActionBar.c3) this.f4577c, true);
        ((c20) this.d).a(Boolean.TRUE);
        ((org.telegram.ui.ActionBar.u1[]) this.f4578e)[0].dismiss();
    }

    @Override
    public void k(float f10, Canvas canvas, RectF rectF, boolean z9) {
        aa.n nVar = (aa.n) this.f4575a;
        RectF rectF2 = (RectF) this.f4576b;
        di.k4 k4Var = (di.k4) this.f4577c;
        RectF rectF3 = (RectF) this.d;
        di.k4 k4Var2 = (di.k4) this.f4578e;
        RectF rectF4 = k4Var.f9296m;
        rectF2.set(rectF4);
        RectF rectF5 = k4Var2.f9296m;
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
        int i7 = ProfileStoriesView.f41951s0;
        ((bv0) nVar.f825b).a(canvas, k4Var, k4Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override
    public void n(hb0 hb0Var, int i7) {
        org.telegram.ui.Components.v4.c((fi.d) this.f4575a, (hb0) this.f4576b, (hb0) this.f4577c, (hb0) this.d, (hb0) this.f4578e);
    }

    @Override
    public void onFailure(Exception e10) {
        v0.n request = (v0.n) this.f4575a;
        f1.a aVar = (f1.a) this.f4576b;
        v0.g gVar = (v0.g) this.f4577c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.f4578e;
        kotlin.jvm.internal.j.e(e10, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        kotlin.jvm.internal.j.e(request, "request");
        for (v0.h hVar : request.f56857a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new c1.e(aVar.f10883e).h(request, cancellationSignal, executor, gVar);
    }
}
