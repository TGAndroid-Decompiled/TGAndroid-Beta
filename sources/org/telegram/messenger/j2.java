package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.zt;
import org.telegram.ui.ao;
import org.telegram.ui.wn;
public final class j2 implements org.telegram.ui.ActionBar.a2, ResultCallback {
    public final boolean f18019a;
    public final int f18020b;
    public final Object f18021c;
    public final Object d;
    public final Object f18022e;

    public j2(FactCheckController factCheckController, zt ztVar, int i10, MessageObject messageObject, boolean z10) {
        this.f18021c = factCheckController;
        this.d = ztVar;
        this.f18020b = i10;
        this.f18022e = messageObject;
        this.f18019a = z10;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean z10 = this.f18019a;
        ((FactCheckController) this.f18021c).lambda$openFactCheckEditor$8((zt) this.d, this.f18020b, (MessageObject) this.f18022e, z10, b2Var, i10);
    }

    @Override
    public void onComplete(Object obj) {
        ao aoVar = (ao) this.f18021c;
        org.telegram.ui.ActionBar.d4 d4Var = (org.telegram.ui.ActionBar.d4) this.d;
        dc0 dc0Var = (dc0) this.f18022e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((dg.a) pair.second).f6808b;
            org.telegram.ui.ActionBar.d4 d4Var2 = aoVar.f34490f;
            if (d4Var2 != null && longValue == d4Var2.i(aoVar.G ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = aoVar.f34492r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = d4Var.k(this.f18019a ? 1 : 0).settings.intensity;
                List list = ((dg.a) pair.second).f6809c;
                dc0Var.R = list;
                long j3 = aoVar.V.Qa;
                if (list != null) {
                    dc0Var.S = new Random(j3).nextInt(dc0Var.R.size());
                }
                dc0Var.t(bitmap, i10);
                dc0Var.u(this.f18020b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                aoVar.f34492r = ofFloat;
                ofFloat.addUpdateListener(new wn(dc0Var, 2));
                aoVar.f34492r.setDuration(250L);
                aoVar.f34492r.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    public j2(ao aoVar, org.telegram.ui.ActionBar.d4 d4Var, boolean z10, dc0 dc0Var, int i10) {
        this.f18021c = aoVar;
        this.d = d4Var;
        this.f18019a = z10;
        this.f18022e = dc0Var;
        this.f18020b = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }
}
