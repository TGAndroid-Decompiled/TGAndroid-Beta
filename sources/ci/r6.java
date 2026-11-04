package ci;

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
import org.telegram.messenger.hi;
import org.telegram.messenger.ii;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.v60;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.g11;
import org.telegram.ui.id0;
import org.telegram.ui.tu0;
public final class r6 implements org.telegram.messenger.q1, ei.l9, OnFailureListener, org.telegram.ui.ActionBar.p1, ab0, e5.m, ii {
    public final Object f5896a;
    public final Object f5897b;
    public final Object f5898c;
    public final Object d;
    public final Object f5899e;

    public r6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f5896a = obj;
        this.f5897b = obj2;
        this.f5898c = obj3;
        this.d = obj4;
        this.f5899e = obj5;
    }

    @Override
    public void a(e5.f fVar, List list) {
        org.telegram.messenger.g0.h3(new s6((id0) this.f5896a, fVar, list, (String) this.f5897b, (TLRPC.TL_inputStorePaymentAuthCode) this.f5898c, (TLRPC.TL_payments_canPurchaseStore) this.d, (v60) this.f5899e, 8));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) this.f5896a;
        ((boolean[]) this.f5897b)[0] = true;
        b3Var.h(b3Var.f27408x, (org.telegram.ui.ActionBar.a3) this.f5898c, true);
        ((u10) this.d).a(Boolean.TRUE);
        ((org.telegram.ui.ActionBar.s1[]) this.f5899e)[0].dismiss();
    }

    @Override
    public void h(String str, ArrayList arrayList) {
        TLRPC.TL_availableReaction tL_availableReaction;
        g11 g11Var = (g11) this.f5896a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f5897b;
        HashMap hashMap = (HashMap) this.f5898c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.f5899e;
        g11Var.getClass();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            try {
                if (((hi) arrayList.get(i3)).f22931a.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((hi) arrayList.get(i3)).f22931a.substring(9))));
                } else {
                    int i10 = g11Var.f45435a0;
                    if ((i10 == 1 || i10 == 11 || i10 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((hi) arrayList.get(i3)).f22931a)) != null) {
                        arrayList2.add(dh.n0.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override
    public void i(float f10, Canvas canvas, RectF rectF, boolean z10) {
        c6.i iVar = (c6.i) this.f5896a;
        RectF rectF2 = (RectF) this.f5897b;
        ei.l4 l4Var = (ei.l4) this.f5898c;
        RectF rectF3 = (RectF) this.d;
        ei.l4 l4Var2 = (ei.l4) this.f5899e;
        RectF rectF4 = l4Var.f10615m;
        rectF2.set(rectF4);
        RectF rectF5 = l4Var2.f10615m;
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
        int i3 = ProfileStoriesView.f42008t0;
        ((tu0) iVar.f4235b).a(canvas, l4Var, l4Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override
    public void k(e5.f fVar, List list) {
        org.telegram.messenger.g0.h3(new s6((e9) this.f5896a, list, (ai.d6) this.f5897b, (TLRPC.TL_inputStorePaymentStarsGift) this.f5898c, (TL_stars.TL_starsGiftOption) this.d, fVar, (Activity) this.f5899e, 1));
    }

    @Override
    public void l(cb0 cb0Var, int i3) {
        org.telegram.ui.Components.t4.c((gi.d) this.f5896a, (cb0) this.f5897b, (cb0) this.f5898c, (cb0) this.d, (cb0) this.f5899e);
    }

    @Override
    public void onFailure(Exception e10) {
        v0.m request = (v0.m) this.f5896a;
        f1.a aVar = (f1.a) this.f5897b;
        v0.h hVar = (v0.h) this.f5898c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.f5899e;
        kotlin.jvm.internal.j.e(e10, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        kotlin.jvm.internal.j.e(request, "request");
        for (v0.o oVar : request.f56431a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new c1.e(aVar.f11335e).g(request, cancellationSignal, executor, hVar);
    }
}
