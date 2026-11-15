package di;

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
import org.telegram.messenger.oi;
import org.telegram.messenger.pi;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.av0;
import org.telegram.ui.kd0;
import org.telegram.ui.n11;
public final class i6 implements org.telegram.messenger.q1, OnFailureListener, fi.c9, org.telegram.ui.ActionBar.q1, gb0, f5.n, pi {
    public final Object f8800a;
    public final Object f8801b;
    public final Object f8802c;
    public final Object d;
    public final Object f8803e;

    public i6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f8800a = obj;
        this.f8801b = obj2;
        this.f8802c = obj3;
        this.d = obj4;
        this.f8803e = obj5;
    }

    @Override
    public void a(f5.f fVar, List list) {
        org.telegram.messenger.g0.h3(new j6((u8) this.f8800a, list, (bi.v5) this.f8801b, (TLRPC.TL_inputStorePaymentStarsGift) this.f8802c, (TL_stars.TL_starsGiftOption) this.d, fVar, (Activity) this.f8803e, 1));
    }

    @Override
    public void c(String str, ArrayList arrayList) {
        TLRPC.TL_availableReaction tL_availableReaction;
        n11 n11Var = (n11) this.f8800a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f8801b;
        HashMap hashMap = (HashMap) this.f8802c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.f8803e;
        n11Var.getClass();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            try {
                if (((oi) arrayList.get(i7)).f25765a.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((oi) arrayList.get(i7)).f25765a.substring(9))));
                } else {
                    int i10 = n11Var.f49364a0;
                    if ((i10 == 1 || i10 == 11 || i10 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((oi) arrayList.get(i7)).f25765a)) != null) {
                        arrayList2.add(ch.p0.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override
    public void f(f5.f fVar, List list) {
        org.telegram.messenger.g0.h3(new j6((kd0) this.f8800a, fVar, list, (String) this.f8801b, (TLRPC.TL_inputStorePaymentAuthCode) this.f8802c, (TLRPC.TL_payments_canPurchaseStore) this.d, (u80) this.f8803e, 8));
    }

    @Override
    public void g(float f10, Canvas canvas, RectF rectF, boolean z10) {
        cb.c cVar = (cb.c) this.f8800a;
        RectF rectF2 = (RectF) this.f8801b;
        fi.d4 d4Var = (fi.d4) this.f8802c;
        RectF rectF3 = (RectF) this.d;
        fi.d4 d4Var2 = (fi.d4) this.f8803e;
        RectF rectF4 = d4Var.f11634m;
        rectF2.set(rectF4);
        RectF rectF5 = d4Var2.f11634m;
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
        int i7 = ProfileStoriesView.f43351t0;
        ((av0) cVar.f4868b).a(canvas, d4Var, d4Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) this.f8800a;
        ((boolean[]) this.f8801b)[0] = true;
        c3Var.h(c3Var.f28489x, (org.telegram.ui.ActionBar.b3) this.f8802c, true);
        ((z10) this.d).a(Boolean.TRUE);
        ((org.telegram.ui.ActionBar.t1[]) this.f8803e)[0].dismiss();
    }

    @Override
    public void m(ib0 ib0Var, int i7) {
        org.telegram.ui.Components.t4.c((hi.d) this.f8800a, (ib0) this.f8801b, (ib0) this.f8802c, (ib0) this.d, (ib0) this.f8803e);
    }

    @Override
    public void onFailure(Exception e10) {
        v0.m request = (v0.m) this.f8800a;
        f1.a aVar = (f1.a) this.f8801b;
        v0.g gVar = (v0.g) this.f8802c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.f8803e;
        kotlin.jvm.internal.j.e(e10, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        kotlin.jvm.internal.j.e(request, "request");
        for (v0.h hVar : request.f58456a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new c1.f(aVar.f10699e).h(request, cancellationSignal, executor, gVar);
    }
}
