package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.su;
import org.telegram.ui.tn;
import org.telegram.ui.xn;
public final class j2 implements org.telegram.ui.ActionBar.z1, ResultCallback {
    public final boolean f18218a;
    public final int f18219b;
    public final Object f18220c;
    public final Object d;
    public final Object f18221e;

    public j2(FactCheckController factCheckController, su suVar, int i10, MessageObject messageObject, boolean z10) {
        this.f18220c = factCheckController;
        this.d = suVar;
        this.f18219b = i10;
        this.f18221e = messageObject;
        this.f18218a = z10;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        boolean z10 = this.f18218a;
        ((FactCheckController) this.f18220c).lambda$openFactCheckEditor$8((su) this.d, this.f18219b, (MessageObject) this.f18221e, z10, a2Var, i10);
    }

    @Override
    public void onComplete(Object obj) {
        xn xnVar = (xn) this.f18220c;
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) this.d;
        dd0 dd0Var = (dd0) this.f18221e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((dg.a) pair.second).f8349b;
            org.telegram.ui.ActionBar.b4 b4Var2 = xnVar.f44115f;
            if (b4Var2 != null && longValue == b4Var2.i(xnVar.G ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = xnVar.f44117r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = b4Var.k(this.f18218a ? 1 : 0).settings.intensity;
                List list = ((dg.a) pair.second).f8350c;
                dd0Var.R = list;
                long j3 = xnVar.V.Ra;
                if (list != null) {
                    dd0Var.S = new Random(j3).nextInt(dd0Var.R.size());
                }
                dd0Var.t(bitmap, i10);
                dd0Var.u(this.f18219b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                xnVar.f44117r = ofFloat;
                ofFloat.addUpdateListener(new tn(dd0Var, 2));
                xnVar.f44117r.setDuration(250L);
                xnVar.f44117r.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    public j2(xn xnVar, org.telegram.ui.ActionBar.b4 b4Var, boolean z10, dd0 dd0Var, int i10) {
        this.f18220c = xnVar;
        this.d = b4Var;
        this.f18218a = z10;
        this.f18221e = dd0Var;
        this.f18219b = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }
}
