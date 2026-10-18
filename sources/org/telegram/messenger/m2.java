package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.mn;
import org.telegram.ui.qn;
public final class m2 implements org.telegram.ui.ActionBar.a2, ResultCallback {
    public final boolean f18929a;
    public final int f18930b;
    public final Object f18931c;
    public final Object d;
    public final Object e;

    public m2(FactCheckController factCheckController, iu iuVar, int i10, MessageObject messageObject, boolean z10) {
        this.f18931c = factCheckController;
        this.d = iuVar;
        this.f18930b = i10;
        this.e = messageObject;
        this.f18929a = z10;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean z10 = this.f18929a;
        ((FactCheckController) this.f18931c).lambda$openFactCheckEditor$8((iu) this.d, this.f18930b, (MessageObject) this.e, z10, b2Var, i10);
    }

    @Override
    public void onComplete(Object obj) {
        qn qnVar = (qn) this.f18931c;
        org.telegram.ui.ActionBar.c4 c4Var = (org.telegram.ui.ActionBar.c4) this.d;
        wc0 wc0Var = (wc0) this.e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((eg.a) pair.second).f8648b;
            org.telegram.ui.ActionBar.c4 c4Var2 = qnVar.f40477f;
            if (c4Var2 != null && longValue == c4Var2.h(qnVar.G ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = qnVar.f40479r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = c4Var.j(this.f18929a ? 1 : 0).settings.intensity;
                List list = ((eg.a) pair.second).f8649c;
                wc0Var.R = list;
                long j10 = qnVar.V.Ra;
                if (list != null) {
                    wc0Var.S = new Random(j10).nextInt(wc0Var.R.size());
                }
                wc0Var.s(bitmap, i10);
                wc0Var.t(this.f18930b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                qnVar.f40479r = ofFloat;
                ofFloat.addUpdateListener(new mn(wc0Var, 2));
                qnVar.f40479r.setDuration(250L);
                qnVar.f40479r.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public m2(qn qnVar, org.telegram.ui.ActionBar.c4 c4Var, boolean z10, wc0 wc0Var, int i10) {
        this.f18931c = qnVar;
        this.d = c4Var;
        this.f18929a = z10;
        this.e = wc0Var;
        this.f18930b = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }
}
