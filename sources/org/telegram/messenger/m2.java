package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.nu;
import org.telegram.ui.co;
import org.telegram.ui.yn;
public final class m2 implements org.telegram.ui.ActionBar.z1, ResultCallback {
    public final boolean f17529a;
    public final int f17530b;
    public final Object f17531c;
    public final Object d;
    public final Object e;

    public m2(FactCheckController factCheckController, nu nuVar, int i10, MessageObject messageObject, boolean z10) {
        this.f17531c = factCheckController;
        this.d = nuVar;
        this.f17530b = i10;
        this.e = messageObject;
        this.f17529a = z10;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        boolean z10 = this.f17529a;
        ((FactCheckController) this.f17531c).lambda$openFactCheckEditor$8((nu) this.d, this.f17530b, (MessageObject) this.e, z10, a2Var, i10);
    }

    @Override
    public void onComplete(Object obj) {
        co coVar = (co) this.f17531c;
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) this.d;
        cd0 cd0Var = (cd0) this.e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((eg.a) pair.second).f8767b;
            org.telegram.ui.ActionBar.b4 b4Var2 = coVar.f34740f;
            if (b4Var2 != null && longValue == b4Var2.i(coVar.G ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = coVar.f34742r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = b4Var.k(this.f17529a ? 1 : 0).settings.intensity;
                List list = ((eg.a) pair.second).f8768c;
                cd0Var.R = list;
                long j10 = coVar.V.Ra;
                if (list != null) {
                    cd0Var.S = new Random(j10).nextInt(cd0Var.R.size());
                }
                cd0Var.t(bitmap, i10);
                cd0Var.u(this.f17530b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                coVar.f34742r = ofFloat;
                ofFloat.addUpdateListener(new yn(cd0Var, 2));
                coVar.f34742r.setDuration(250L);
                coVar.f34742r.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    public m2(co coVar, org.telegram.ui.ActionBar.b4 b4Var, boolean z10, cd0 cd0Var, int i10) {
        this.f17531c = coVar;
        this.d = b4Var;
        this.f17529a = z10;
        this.e = cd0Var;
        this.f17530b = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }
}
