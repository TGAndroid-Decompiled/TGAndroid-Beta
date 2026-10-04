package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.sn;
import org.telegram.ui.wn;
public final class j2 implements org.telegram.ui.ActionBar.a2, ResultCallback {
    public final boolean f18220a;
    public final int f18221b;
    public final Object f18222c;
    public final Object d;
    public final Object f18223e;

    public j2(FactCheckController factCheckController, eu euVar, int i10, MessageObject messageObject, boolean z10) {
        this.f18222c = factCheckController;
        this.d = euVar;
        this.f18221b = i10;
        this.f18223e = messageObject;
        this.f18220a = z10;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean z10 = this.f18220a;
        ((FactCheckController) this.f18222c).lambda$openFactCheckEditor$8((eu) this.d, this.f18221b, (MessageObject) this.f18223e, z10, b2Var, i10);
    }

    @Override
    public void onComplete(Object obj) {
        wn wnVar = (wn) this.f18222c;
        org.telegram.ui.ActionBar.c4 c4Var = (org.telegram.ui.ActionBar.c4) this.d;
        pc0 pc0Var = (pc0) this.f18223e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((dg.a) pair.second).f8337b;
            org.telegram.ui.ActionBar.c4 c4Var2 = wnVar.f42539f;
            if (c4Var2 != null && longValue == c4Var2.i(wnVar.G ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = wnVar.f42541r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = c4Var.k(this.f18220a ? 1 : 0).settings.intensity;
                List list = ((dg.a) pair.second).f8338c;
                pc0Var.R = list;
                long j3 = wnVar.V.Oa;
                if (list != null) {
                    pc0Var.S = new Random(j3).nextInt(pc0Var.R.size());
                }
                pc0Var.t(bitmap, i10);
                pc0Var.u(this.f18221b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                wnVar.f42541r = ofFloat;
                ofFloat.addUpdateListener(new sn(pc0Var, 2));
                wnVar.f42541r.setDuration(250L);
                wnVar.f42541r.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    public j2(wn wnVar, org.telegram.ui.ActionBar.c4 c4Var, boolean z10, pc0 pc0Var, int i10) {
        this.f18222c = wnVar;
        this.d = c4Var;
        this.f18220a = z10;
        this.f18223e = pc0Var;
        this.f18221b = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }
}
