package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.mn;
import org.telegram.ui.qn;
public final class n2 implements org.telegram.ui.ActionBar.z1, ResultCallback {
    public final boolean f19083a;
    public final int f19084b;
    public final Object f19085c;
    public final Object d;
    public final Object e;

    public n2(FactCheckController factCheckController, iu iuVar, int i10, MessageObject messageObject, boolean z10) {
        this.f19085c = factCheckController;
        this.d = iuVar;
        this.f19084b = i10;
        this.e = messageObject;
        this.f19083a = z10;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        boolean z10 = this.f19083a;
        ((FactCheckController) this.f19085c).lambda$openFactCheckEditor$8((iu) this.d, this.f19084b, (MessageObject) this.e, z10, c2Var, i10);
    }

    @Override
    public void onComplete(Object obj) {
        qn qnVar = (qn) this.f19085c;
        org.telegram.ui.ActionBar.f4 f4Var = (org.telegram.ui.ActionBar.f4) this.d;
        yc0 yc0Var = (yc0) this.e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((eg.a) pair.second).f8652b;
            org.telegram.ui.ActionBar.f4 f4Var2 = qnVar.f40871f;
            if (f4Var2 != null && longValue == f4Var2.h(qnVar.f40881q ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = qnVar.f40873i;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = f4Var.j(this.f19083a ? 1 : 0).settings.intensity;
                List list = ((eg.a) pair.second).f8653c;
                yc0Var.R = list;
                long j10 = qnVar.F.db;
                if (list != null) {
                    yc0Var.S = new Random(j10).nextInt(yc0Var.R.size());
                }
                yc0Var.s(bitmap, i10);
                yc0Var.t(this.f19084b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                qnVar.f40873i = ofFloat;
                ofFloat.addUpdateListener(new mn(yc0Var, 2));
                qnVar.f40873i.setDuration(250L);
                qnVar.f40873i.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public n2(qn qnVar, org.telegram.ui.ActionBar.f4 f4Var, boolean z10, yc0 yc0Var, int i10) {
        this.f19085c = qnVar;
        this.d = f4Var;
        this.f19083a = z10;
        this.e = yc0Var;
        this.f19084b = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }
}
