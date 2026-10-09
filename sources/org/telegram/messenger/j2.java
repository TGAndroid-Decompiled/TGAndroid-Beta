package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.tn;
import org.telegram.ui.xn;
public final class j2 implements org.telegram.ui.ActionBar.a2, ResultCallback {
    public final boolean f18209a;
    public final int f18210b;
    public final Object f18211c;
    public final Object d;
    public final Object f18212e;

    public j2(FactCheckController factCheckController, ru ruVar, int i10, MessageObject messageObject, boolean z10) {
        this.f18211c = factCheckController;
        this.d = ruVar;
        this.f18210b = i10;
        this.f18212e = messageObject;
        this.f18209a = z10;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean z10 = this.f18209a;
        ((FactCheckController) this.f18211c).lambda$openFactCheckEditor$8((ru) this.d, this.f18210b, (MessageObject) this.f18212e, z10, b2Var, i10);
    }

    @Override
    public void onComplete(Object obj) {
        xn xnVar = (xn) this.f18211c;
        org.telegram.ui.ActionBar.c4 c4Var = (org.telegram.ui.ActionBar.c4) this.d;
        cd0 cd0Var = (cd0) this.f18212e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((dg.a) pair.second).f8350b;
            org.telegram.ui.ActionBar.c4 c4Var2 = xnVar.f44070f;
            if (c4Var2 != null && longValue == c4Var2.i(xnVar.G ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = xnVar.f44072r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = c4Var.k(this.f18209a ? 1 : 0).settings.intensity;
                List list = ((dg.a) pair.second).f8351c;
                cd0Var.R = list;
                long j3 = xnVar.V.Ra;
                if (list != null) {
                    cd0Var.S = new Random(j3).nextInt(cd0Var.R.size());
                }
                cd0Var.t(bitmap, i10);
                cd0Var.u(this.f18210b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                xnVar.f44072r = ofFloat;
                ofFloat.addUpdateListener(new tn(cd0Var, 2));
                xnVar.f44072r.setDuration(250L);
                xnVar.f44072r.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    public j2(xn xnVar, org.telegram.ui.ActionBar.c4 c4Var, boolean z10, cd0 cd0Var, int i10) {
        this.f18211c = xnVar;
        this.d = c4Var;
        this.f18209a = z10;
        this.f18212e = cd0Var;
        this.f18210b = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }
}
