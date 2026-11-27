package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class xg implements fq7, nt2, fd, OnFailureListener, fy8, fcb, is6, ci0 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public xg(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override
    public final void a(gi0 gi0Var, List list) {
        hl.c3(new ra7((zg6) this.a, gi0Var, list, (String) this.b, (TLRPC.TL_inputStorePaymentAuthCode) this.c, (TLRPC.TL_payments_canPurchaseStore) this.d, (g65) this.e, (byte) 13));
    }

    @Override
    public final void b(String str, ArrayList arrayList) {
        TLRPC.TL_availableReaction tL_availableReaction;
        n1a n1aVar = (n1a) this.a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        HashMap hashMap = (HashMap) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.e;
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                if (((hs6) arrayList.get(i)).a.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((hs6) arrayList.get(i)).a.substring(9))));
                } else {
                    int i2 = n1aVar.a0;
                    if ((i2 == 1 || i2 == 11 || i2 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((hs6) arrayList.get(i)).a)) != null) {
                        arrayList2.add(w49.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override
    public final void c(gi0 gi0Var, List list) {
        hl.c3(new ra7((jxa) this.a, list, (iv4) this.b, (TLRPC.TL_inputStorePaymentStarsGift) this.c, (TL_stars.TL_starsGiftOption) this.d, gi0Var, (Activity) this.e, (byte) 19));
    }

    @Override
    public final void e(gi0 gi0Var) {
        Purchase purchase = (Purchase) this.a;
        ArrayList arrayList = (ArrayList) this.b;
        String str = (String) this.c;
        AtomicInteger atomicInteger = (AtomicInteger) this.d;
        z87 z87Var = (z87) this.e;
        if (gi0Var.a == 0) {
            cc4.b("BillingController.launchBillingFlow, consumed " + purchase.b() + ": OK");
            arrayList.add(str);
            if (atomicInteger.get() == arrayList.size()) {
                z87Var.run();
                return;
            }
            return;
        }
        cc4.b("BillingController.launchBillingFlow, consumed " + purchase.b() + ": " + gi0Var.a + " " + gi0Var.c);
        arrayList.add(null);
        if (atomicInteger.get() == arrayList.size()) {
            z87Var.run();
        }
    }

    @Override
    public final void f(float f, Canvas canvas, RectF rectF, boolean z) {
        xh4 xh4Var = (xh4) this.a;
        RectF rectF2 = (RectF) this.b;
        iv8 iv8Var = (iv8) this.c;
        RectF rectF3 = (RectF) this.d;
        iv8 iv8Var2 = (iv8) this.e;
        RectF rectF4 = iv8Var.m;
        rectF2.set(rectF4);
        RectF rectF5 = iv8Var2.m;
        rectF3.set(rectF5);
        rectF4.set(rectF);
        try {
            float width = rectF.width() / rectF2.width();
            float centerX = rectF.centerX() - ((((1.0f - f) * 2.0f) + width) * (rectF2.centerX() - rectF3.centerX()));
            float centerY = rectF.centerY();
            float width2 = (rectF3.width() / 2.0f) * width;
            float height = (rectF3.height() / 2.0f) * width;
            rectF5.set(centerX - width2, centerY - height, centerX + width2, centerY + height);
        } catch (Exception unused) {
        }
        int i = ProfileStoriesView.t0;
        ((lq8) xh4Var.b).a(canvas, iv8Var, iv8Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override
    public final void i(hq7 hq7Var, int i) {
        jj.c((c51) this.a, (hq7) this.b, (hq7) this.c, (hq7) this.d, (hq7) this.e);
    }

    @Override
    public final void onFailure(Exception exc) {
        av4 av4Var = (av4) this.a;
        wu4 wu4Var = (wu4) this.b;
        h23 h23Var = (h23) this.c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.e;
        exc.getClass();
        CredentialProviderPlayServicesImpl.Companion.getClass();
        av4Var.getClass();
        for (j23 j23Var : av4Var.a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new o23(wu4Var.e).g(av4Var, cancellationSignal, executor, h23Var);
    }

    @Override
    public final void w(id idVar, int i) {
        yx0 yx0Var = (yx0) this.a;
        ((boolean[]) this.b)[0] = true;
        yx0Var.h(yx0Var.x, (xx0) this.c, true);
        ((pcc) this.d).a(Boolean.TRUE);
        ((id[]) this.e)[0].dismiss();
    }
}
