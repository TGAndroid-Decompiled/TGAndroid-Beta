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
public final class ki implements jp7, eu2, ee, OnFailureListener, xw8, iab, es6, bj0 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ki(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override
    public final void a(fj0 fj0Var, List list) {
        gm.c3(new ja7((wg6) this.a, fj0Var, list, (String) this.b, (TLRPC.TL_inputStorePaymentAuthCode) this.c, (TLRPC.TL_payments_canPurchaseStore) this.d, (d65) this.e, (byte) 13));
    }

    @Override
    public final void b(fj0 fj0Var, List list) {
        gm.c3(new ja7((jva) this.a, list, (fv4) this.b, (TLRPC.TL_inputStorePaymentStarsGift) this.c, (TL_stars.TL_starsGiftOption) this.d, fj0Var, (Activity) this.e, (byte) 19));
    }

    @Override
    public final void e(fj0 fj0Var) {
        Purchase purchase = (Purchase) this.a;
        ArrayList arrayList = (ArrayList) this.b;
        String str = (String) this.c;
        AtomicInteger atomicInteger = (AtomicInteger) this.d;
        e77 e77Var = (e77) this.e;
        if (fj0Var.a == 0) {
            fc4.b("BillingController.launchBillingFlow, consumed " + purchase.b() + ": OK");
            arrayList.add(str);
            if (atomicInteger.get() == arrayList.size()) {
                e77Var.run();
                return;
            }
            return;
        }
        fc4.b("BillingController.launchBillingFlow, consumed " + purchase.b() + ": " + fj0Var.a + " " + fj0Var.c);
        arrayList.add(null);
        if (atomicInteger.get() == arrayList.size()) {
            e77Var.run();
        }
    }

    @Override
    public final void f(String str, ArrayList arrayList) {
        TLRPC.TL_availableReaction tL_availableReaction;
        vz9 vz9Var = (vz9) this.a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        HashMap hashMap = (HashMap) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.e;
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                if (((ds6) arrayList.get(i)).a.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((ds6) arrayList.get(i)).a.substring(9))));
                } else {
                    int i2 = vz9Var.a0;
                    if ((i2 == 1 || i2 == 11 || i2 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((ds6) arrayList.get(i)).a)) != null) {
                        arrayList2.add(k39.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override
    public final void g(lp7 lp7Var, int i) {
        ik.c((b61) this.a, (lp7) this.b, (lp7) this.c, (lp7) this.d, (lp7) this.e);
    }

    @Override
    public final void j(float f, Canvas canvas, RectF rectF, boolean z) {
        lj4 lj4Var = (lj4) this.a;
        RectF rectF2 = (RectF) this.b;
        au8 au8Var = (au8) this.c;
        RectF rectF3 = (RectF) this.d;
        au8 au8Var2 = (au8) this.e;
        RectF rectF4 = au8Var.m;
        rectF2.set(rectF4);
        RectF rectF5 = au8Var2.m;
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
        ((bp8) lj4Var.a).a(canvas, au8Var, au8Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override
    public final void onFailure(Exception exc) {
        xu4 xu4Var = (xu4) this.a;
        tu4 tu4Var = (tu4) this.b;
        a33 a33Var = (a33) this.c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.e;
        exc.getClass();
        CredentialProviderPlayServicesImpl.Companion.getClass();
        xu4Var.getClass();
        for (c33 c33Var : xu4Var.a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new h33(tu4Var.e).g(xu4Var, cancellationSignal, executor, a33Var);
    }

    @Override
    public final void r(he heVar, int i) {
        xy0 xy0Var = (xy0) this.a;
        ((boolean[]) this.b)[0] = true;
        xy0Var.h(xy0Var.x, (wy0) this.c, true);
        ((qac) this.d).a(Boolean.TRUE);
        ((he[]) this.e)[0].dismiss();
    }
}
