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
public final class j2 implements org.telegram.ui.ActionBar.a2, ResultCallback {
    public final boolean f18213a;
    public final int f18214b;
    public final Object f18215c;
    public final Object d;
    public final Object f18216e;

    public j2(FactCheckController factCheckController, su suVar, int i10, MessageObject messageObject, boolean z10) {
        this.f18215c = factCheckController;
        this.d = suVar;
        this.f18214b = i10;
        this.f18216e = messageObject;
        this.f18213a = z10;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean z10 = this.f18213a;
        ((FactCheckController) this.f18215c).lambda$openFactCheckEditor$8((su) this.d, this.f18214b, (MessageObject) this.f18216e, z10, b2Var, i10);
    }

    @Override
    public void onComplete(Object obj) {
        xn xnVar = (xn) this.f18215c;
        org.telegram.ui.ActionBar.c4 c4Var = (org.telegram.ui.ActionBar.c4) this.d;
        dd0 dd0Var = (dd0) this.f18216e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((dg.a) pair.second).f8350b;
            org.telegram.ui.ActionBar.c4 c4Var2 = xnVar.f44116f;
            if (c4Var2 != null && longValue == c4Var2.i(xnVar.G ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = xnVar.f44118r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = c4Var.k(this.f18213a ? 1 : 0).settings.intensity;
                List list = ((dg.a) pair.second).f8351c;
                dd0Var.R = list;
                long j3 = xnVar.V.Ra;
                if (list != null) {
                    dd0Var.S = new Random(j3).nextInt(dd0Var.R.size());
                }
                dd0Var.t(bitmap, i10);
                dd0Var.u(this.f18214b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                xnVar.f44118r = ofFloat;
                ofFloat.addUpdateListener(new tn(dd0Var, 2));
                xnVar.f44118r.setDuration(250L);
                xnVar.f44118r.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    public j2(xn xnVar, org.telegram.ui.ActionBar.c4 c4Var, boolean z10, dd0 dd0Var, int i10) {
        this.f18215c = xnVar;
        this.d = c4Var;
        this.f18213a = z10;
        this.f18216e = dd0Var;
        this.f18214b = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }
}
