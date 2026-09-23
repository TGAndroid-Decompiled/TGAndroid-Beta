package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.cu;
import org.telegram.ui.rn;
import org.telegram.ui.vn;
public final class j2 implements org.telegram.ui.ActionBar.a2, ResultCallback {
    public final boolean f16435a;
    public final int f16436b;
    public final Object f16437c;
    public final Object d;
    public final Object e;

    public j2(FactCheckController factCheckController, cu cuVar, int i10, MessageObject messageObject, boolean z10) {
        this.f16437c = factCheckController;
        this.d = cuVar;
        this.f16436b = i10;
        this.e = messageObject;
        this.f16435a = z10;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean z10 = this.f16435a;
        ((FactCheckController) this.f16437c).lambda$openFactCheckEditor$8((cu) this.d, this.f16436b, (MessageObject) this.e, z10, b2Var, i10);
    }

    @Override
    public void onComplete(Object obj) {
        vn vnVar = (vn) this.f16437c;
        org.telegram.ui.ActionBar.c4 c4Var = (org.telegram.ui.ActionBar.c4) this.d;
        bc0 bc0Var = (bc0) this.e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((dg.a) pair.second).f7710b;
            org.telegram.ui.ActionBar.c4 c4Var2 = vnVar.f38428f;
            if (c4Var2 != null && longValue == c4Var2.i(vnVar.G ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = vnVar.f38430r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = c4Var.k(this.f16435a ? 1 : 0).settings.intensity;
                List list = ((dg.a) pair.second).f7711c;
                bc0Var.R = list;
                long j3 = vnVar.V.Qa;
                if (list != null) {
                    bc0Var.S = new Random(j3).nextInt(bc0Var.R.size());
                }
                bc0Var.t(bitmap, i10);
                bc0Var.u(this.f16436b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                vnVar.f38430r = ofFloat;
                ofFloat.addUpdateListener(new rn(bc0Var, 2));
                vnVar.f38430r.setDuration(250L);
                vnVar.f38430r.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    public j2(vn vnVar, org.telegram.ui.ActionBar.c4 c4Var, boolean z10, bc0 bc0Var, int i10) {
        this.f16437c = vnVar;
        this.d = c4Var;
        this.f16435a = z10;
        this.e = bc0Var;
        this.f16436b = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }
}
