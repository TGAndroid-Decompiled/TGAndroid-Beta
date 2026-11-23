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
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.q20;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.dv0;
import org.telegram.ui.ld0;
import org.telegram.ui.r11;
public final class l6 implements org.telegram.messenger.q1, OnFailureListener, fi.z8, org.telegram.ui.ActionBar.q1, rb0, f5.n, pi {
    public final Object f9254a;
    public final Object f9255b;
    public final Object f9256c;
    public final Object d;
    public final Object f9257e;

    public l6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f9254a = obj;
        this.f9255b = obj2;
        this.f9256c = obj3;
        this.d = obj4;
        this.f9257e = obj5;
    }

    @Override
    public void a(f5.f fVar, List list) {
        org.telegram.messenger.g0.g3(new m6((y8) this.f9254a, list, (bi.h8) this.f9255b, (TLRPC.TL_inputStorePaymentStarsGift) this.f9256c, (TL_stars.TL_starsGiftOption) this.d, fVar, (Activity) this.f9257e, 1));
    }

    @Override
    public void b(f5.f fVar, List list) {
        org.telegram.messenger.g0.g3(new m6((ld0) this.f9254a, fVar, list, (String) this.f9255b, (TLRPC.TL_inputStorePaymentAuthCode) this.f9256c, (TLRPC.TL_payments_canPurchaseStore) this.d, (q20) this.f9257e, 8));
    }

    @Override
    public void e(String str, ArrayList arrayList) {
        TLRPC.TL_availableReaction tL_availableReaction;
        r11 r11Var = (r11) this.f9254a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f9255b;
        HashMap hashMap = (HashMap) this.f9256c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.f9257e;
        r11Var.getClass();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            try {
                if (((oi) arrayList.get(i7)).f26090a.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((oi) arrayList.get(i7)).f26090a.substring(9))));
                } else {
                    int i10 = r11Var.f51401a0;
                    if ((i10 == 1 || i10 == 11 || i10 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((oi) arrayList.get(i7)).f26090a)) != null) {
                        arrayList2.add(ch.p0.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f9254a;
        ((boolean[]) this.f9255b)[0] = true;
        f3Var.h(f3Var.f28921x, (org.telegram.ui.ActionBar.e3) this.f9256c, true);
        ((y10) this.d).a(Boolean.TRUE);
        ((org.telegram.ui.ActionBar.t1[]) this.f9257e)[0].dismiss();
    }

    @Override
    public void n(tb0 tb0Var, int i7) {
        org.telegram.ui.Components.c5.c((hi.d) this.f9254a, (tb0) this.f9255b, (tb0) this.f9256c, (tb0) this.d, (tb0) this.f9257e);
    }

    @Override
    public void o(float f10, Canvas canvas, RectF rectF, boolean z10) {
        d6.i iVar = (d6.i) this.f9254a;
        RectF rectF2 = (RectF) this.f9255b;
        fi.b4 b4Var = (fi.b4) this.f9256c;
        RectF rectF3 = (RectF) this.d;
        fi.b4 b4Var2 = (fi.b4) this.f9257e;
        RectF rectF4 = b4Var.f11770m;
        rectF2.set(rectF4);
        RectF rectF5 = b4Var2.f11770m;
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
        int i7 = ProfileStoriesView.f43807t0;
        ((dv0) iVar.f7873b).a(canvas, b4Var, b4Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override
    public void onFailure(Exception e10) {
        v0.m request = (v0.m) this.f9254a;
        f1.a aVar = (f1.a) this.f9255b;
        v0.g gVar = (v0.g) this.f9256c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.f9257e;
        kotlin.jvm.internal.j.e(e10, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        kotlin.jvm.internal.j.e(request, "request");
        for (v0.h hVar : request.f59031a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new c1.f(aVar.f11011e).h(request, cancellationSignal, executor, gVar);
    }
}
