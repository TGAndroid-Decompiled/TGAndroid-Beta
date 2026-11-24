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
public final class kh implements fn7, ts2, ed, OnFailureListener, wu8, g8b, eq6, bi0 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public kh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override
    public final void a(fi0 fi0Var, List list) {
        gl.d3(new i87((ve6) this.a, fi0Var, list, (String) this.b, (TLRPC.TL_inputStorePaymentAuthCode) this.c, (TLRPC.TL_payments_canPurchaseStore) this.d, (e45) this.e, (byte) 13));
    }

    @Override
    public final void b(fi0 fi0Var, List list) {
        gl.d3(new i87((gta) this.a, list, (et4) this.b, (TLRPC.TL_inputStorePaymentStarsGift) this.c, (TL_stars.TL_starsGiftOption) this.d, fi0Var, (Activity) this.e, (byte) 19));
    }

    @Override
    public final void d(fi0 fi0Var) {
        Purchase purchase = (Purchase) this.a;
        ArrayList arrayList = (ArrayList) this.b;
        String str = (String) this.c;
        AtomicInteger atomicInteger = (AtomicInteger) this.d;
        e57 e57Var = (e57) this.e;
        if (fi0Var.a == 0) {
            fa4.b("BillingController.launchBillingFlow, consumed " + purchase.b() + ": OK");
            arrayList.add(str);
            if (atomicInteger.get() == arrayList.size()) {
                e57Var.run();
                return;
            }
            return;
        }
        fa4.b("BillingController.launchBillingFlow, consumed " + purchase.b() + ": " + fi0Var.a + " " + fi0Var.c);
        arrayList.add(null);
        if (atomicInteger.get() == arrayList.size()) {
            e57Var.run();
        }
    }

    @Override
    public final void f(String str, ArrayList arrayList) {
        TLRPC.TL_availableReaction tL_availableReaction;
        tx9 tx9Var = (tx9) this.a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        HashMap hashMap = (HashMap) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.e;
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                if (((dq6) arrayList.get(i)).a.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((dq6) arrayList.get(i)).a.substring(9))));
                } else {
                    int i2 = tx9Var.a0;
                    if ((i2 == 1 || i2 == 11 || i2 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((dq6) arrayList.get(i)).a)) != null) {
                        arrayList2.add(h19.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override
    public final void g(float f, Canvas canvas, RectF rectF, boolean z) {
        pj4 pj4Var = (pj4) this.a;
        RectF rectF2 = (RectF) this.b;
        zr8 zr8Var = (zr8) this.c;
        RectF rectF3 = (RectF) this.d;
        zr8 zr8Var2 = (zr8) this.e;
        RectF rectF4 = zr8Var.m;
        rectF2.set(rectF4);
        RectF rectF5 = zr8Var2.m;
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
        ((an8) pj4Var.b).a(canvas, zr8Var, zr8Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override
    public final void i(hn7 hn7Var, int i) {
        ij.c((u41) this.a, (hn7) this.b, (hn7) this.c, (hn7) this.d, (hn7) this.e);
    }

    @Override
    public final void onFailure(Exception exc) {
        ws4 ws4Var = (ws4) this.a;
        ss4 ss4Var = (ss4) this.b;
        o13 o13Var = (o13) this.c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.e;
        exc.getClass();
        CredentialProviderPlayServicesImpl.Companion.getClass();
        ws4Var.getClass();
        for (r13 r13Var : ws4Var.a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new w13(ss4Var.e).g(ws4Var, cancellationSignal, executor, o13Var);
    }

    @Override
    public final void u(hd hdVar, int i) {
        qx0 qx0Var = (qx0) this.a;
        ((boolean[]) this.b)[0] = true;
        qx0Var.h(qx0Var.x, (px0) this.c, true);
        ((p8c) this.d).a(Boolean.TRUE);
        ((hd[]) this.e)[0].dismiss();
    }
}
