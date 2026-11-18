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
import org.telegram.messenger.ni;
import org.telegram.messenger.oi;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.cv0;
import org.telegram.ui.ld0;
import org.telegram.ui.r11;
public final class l6 implements org.telegram.messenger.q1, OnFailureListener, fi.z8, org.telegram.ui.ActionBar.r1, qb0, f5.n, oi {
    public final Object f9258a;
    public final Object f9259b;
    public final Object f9260c;
    public final Object d;
    public final Object f9261e;

    public l6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f9258a = obj;
        this.f9259b = obj2;
        this.f9260c = obj3;
        this.d = obj4;
        this.f9261e = obj5;
    }

    @Override
    public void a(f5.f fVar, List list) {
        org.telegram.messenger.g0.g3(new m6((x8) this.f9258a, list, (bi.c8) this.f9259b, (TLRPC.TL_inputStorePaymentStarsGift) this.f9260c, (TL_stars.TL_starsGiftOption) this.d, fVar, (Activity) this.f9261e, 1));
    }

    @Override
    public void b(f5.f fVar, List list) {
        org.telegram.messenger.g0.g3(new m6((ld0) this.f9258a, fVar, list, (String) this.f9259b, (TLRPC.TL_inputStorePaymentAuthCode) this.f9260c, (TLRPC.TL_payments_canPurchaseStore) this.d, (n20) this.f9261e, 8));
    }

    @Override
    public void e(String str, ArrayList arrayList) {
        TLRPC.TL_availableReaction tL_availableReaction;
        r11 r11Var = (r11) this.f9258a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f9259b;
        HashMap hashMap = (HashMap) this.f9260c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.f9261e;
        r11Var.getClass();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            try {
                if (((ni) arrayList.get(i7)).f25929a.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((ni) arrayList.get(i7)).f25929a.substring(9))));
                } else {
                    int i10 = r11Var.f51417a0;
                    if ((i10 == 1 || i10 == 11 || i10 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((ni) arrayList.get(i7)).f25929a)) != null) {
                        arrayList2.add(ch.p0.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f9258a;
        ((boolean[]) this.f9259b)[0] = true;
        g3Var.h(g3Var.f28972x, (org.telegram.ui.ActionBar.f3) this.f9260c, true);
        ((x10) this.d).a(Boolean.TRUE);
        ((org.telegram.ui.ActionBar.u1[]) this.f9261e)[0].dismiss();
    }

    @Override
    public void n(sb0 sb0Var, int i7) {
        org.telegram.ui.Components.b5.c((hi.d) this.f9258a, (sb0) this.f9259b, (sb0) this.f9260c, (sb0) this.d, (sb0) this.f9261e);
    }

    @Override
    public void o(float f10, Canvas canvas, RectF rectF, boolean z10) {
        d6.i iVar = (d6.i) this.f9258a;
        RectF rectF2 = (RectF) this.f9259b;
        fi.b4 b4Var = (fi.b4) this.f9260c;
        RectF rectF3 = (RectF) this.d;
        fi.b4 b4Var2 = (fi.b4) this.f9261e;
        RectF rectF4 = b4Var.f11778m;
        rectF2.set(rectF4);
        RectF rectF5 = b4Var2.f11778m;
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
        int i7 = ProfileStoriesView.f43797t0;
        ((cv0) iVar.f7881b).a(canvas, b4Var, b4Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override
    public void onFailure(Exception e10) {
        v0.m request = (v0.m) this.f9258a;
        f1.a aVar = (f1.a) this.f9259b;
        v0.g gVar = (v0.g) this.f9260c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.f9261e;
        kotlin.jvm.internal.j.e(e10, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        kotlin.jvm.internal.j.e(request, "request");
        for (v0.h hVar : request.f59023a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new c1.f(aVar.f11019e).h(request, cancellationSignal, executor, gVar);
    }
}
