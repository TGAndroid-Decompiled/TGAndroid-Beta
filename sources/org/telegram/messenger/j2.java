package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.rn;
import org.telegram.ui.vn;
public final class j2 implements org.telegram.ui.ActionBar.b2, ResultCallback {
    public final boolean f16692a;
    public final int f16693b;
    public final Object f16694c;
    public final Object d;
    public final Object e;

    public j2(FactCheckController factCheckController, du duVar, int i10, MessageObject messageObject, boolean z10) {
        this.f16694c = factCheckController;
        this.d = duVar;
        this.f16693b = i10;
        this.e = messageObject;
        this.f16692a = z10;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        boolean z10 = this.f16692a;
        ((FactCheckController) this.f16694c).lambda$openFactCheckEditor$8((du) this.d, this.f16693b, (MessageObject) this.e, z10, c2Var, i10);
    }

    @Override
    public void onComplete(Object obj) {
        vn vnVar = (vn) this.f16694c;
        org.telegram.ui.ActionBar.d4 d4Var = (org.telegram.ui.ActionBar.d4) this.d;
        nc0 nc0Var = (nc0) this.e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((dg.a) pair.second).f7711b;
            org.telegram.ui.ActionBar.d4 d4Var2 = vnVar.f38646f;
            if (d4Var2 != null && longValue == d4Var2.i(vnVar.G ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = vnVar.f38648r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = d4Var.k(this.f16692a ? 1 : 0).settings.intensity;
                List list = ((dg.a) pair.second).f7712c;
                nc0Var.R = list;
                long j3 = vnVar.V.Qa;
                if (list != null) {
                    nc0Var.S = new Random(j3).nextInt(nc0Var.R.size());
                }
                nc0Var.t(bitmap, i10);
                nc0Var.u(this.f16693b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                vnVar.f38648r = ofFloat;
                ofFloat.addUpdateListener(new rn(nc0Var, 2));
                vnVar.f38648r.setDuration(250L);
                vnVar.f38648r.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    public j2(vn vnVar, org.telegram.ui.ActionBar.d4 d4Var, boolean z10, nc0 nc0Var, int i10) {
        this.f16694c = vnVar;
        this.d = d4Var;
        this.f16692a = z10;
        this.e = nc0Var;
        this.f16693b = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }
}
