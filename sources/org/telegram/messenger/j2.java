package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.tn;
import org.telegram.ui.xn;
public final class j2 implements org.telegram.ui.ActionBar.a2, ResultCallback {
    public final boolean f16694a;
    public final int f16695b;
    public final Object f16696c;
    public final Object d;
    public final Object e;

    public j2(FactCheckController factCheckController, bu buVar, int i10, MessageObject messageObject, boolean z10) {
        this.f16696c = factCheckController;
        this.d = buVar;
        this.f16695b = i10;
        this.e = messageObject;
        this.f16694a = z10;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean z10 = this.f16694a;
        ((FactCheckController) this.f16696c).lambda$openFactCheckEditor$8((bu) this.d, this.f16695b, (MessageObject) this.e, z10, b2Var, i10);
    }

    @Override
    public void onComplete(Object obj) {
        xn xnVar = (xn) this.f16696c;
        org.telegram.ui.ActionBar.d4 d4Var = (org.telegram.ui.ActionBar.d4) this.d;
        nc0 nc0Var = (nc0) this.e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((dg.a) pair.second).f7726b;
            org.telegram.ui.ActionBar.d4 d4Var2 = xnVar.f39650f;
            if (d4Var2 != null && longValue == d4Var2.i(xnVar.G ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = xnVar.f39652r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = d4Var.k(this.f16694a ? 1 : 0).settings.intensity;
                List list = ((dg.a) pair.second).f7727c;
                nc0Var.R = list;
                long j3 = xnVar.V.Qa;
                if (list != null) {
                    nc0Var.S = new Random(j3).nextInt(nc0Var.R.size());
                }
                nc0Var.t(bitmap, i10);
                nc0Var.u(this.f16695b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                xnVar.f39652r = ofFloat;
                ofFloat.addUpdateListener(new tn(nc0Var, 2));
                xnVar.f39652r.setDuration(250L);
                xnVar.f39652r.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    public j2(xn xnVar, org.telegram.ui.ActionBar.d4 d4Var, boolean z10, nc0 nc0Var, int i10) {
        this.f16696c = xnVar;
        this.d = d4Var;
        this.f16694a = z10;
        this.e = nc0Var;
        this.f16695b = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }
}
