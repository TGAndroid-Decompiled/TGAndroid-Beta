package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.ut;
import org.telegram.ui.tn;
import org.telegram.ui.xn;
public final class k2 implements org.telegram.ui.ActionBar.c2, ResultCallback {
    public final boolean f17601a;
    public final int f17602b;
    public final Object f17603c;
    public final Object d;
    public final Object e;

    public k2(FactCheckController factCheckController, ut utVar, int i10, MessageObject messageObject, boolean z4) {
        this.f17603c = factCheckController;
        this.d = utVar;
        this.f17602b = i10;
        this.e = messageObject;
        this.f17601a = z4;
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        boolean z4 = this.f17601a;
        ((FactCheckController) this.f17603c).lambda$openFactCheckEditor$8((ut) this.d, this.f17602b, (MessageObject) this.e, z4, d2Var, i10);
    }

    @Override
    public void onComplete(Object obj) {
        xn xnVar = (xn) this.f17603c;
        org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) this.d;
        ec0 ec0Var = (ec0) this.e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((pf.a) pair.second).f41225b;
            org.telegram.ui.ActionBar.e4 e4Var2 = xnVar.f40028f;
            if (e4Var2 != null && longValue == e4Var2.i(xnVar.D ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = xnVar.f40030r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = e4Var.k(this.f17601a ? 1 : 0).settings.intensity;
                List list = ((pf.a) pair.second).f41226c;
                ec0Var.R = list;
                long j10 = xnVar.S.Na;
                if (list != null) {
                    ec0Var.S = new Random(j10).nextInt(ec0Var.R.size());
                }
                ec0Var.t(bitmap, i10);
                ec0Var.u(this.f17602b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                xnVar.f40030r = ofFloat;
                ofFloat.addUpdateListener(new tn(ec0Var, 2));
                xnVar.f40030r.setDuration(250L);
                xnVar.f40030r.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public k2(xn xnVar, org.telegram.ui.ActionBar.e4 e4Var, boolean z4, ec0 ec0Var, int i10) {
        this.f17603c = xnVar;
        this.d = e4Var;
        this.f17601a = z4;
        this.e = ec0Var;
        this.f17602b = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }
}
