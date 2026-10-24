package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.mn;
import org.telegram.ui.qn;
public final class n2 implements org.telegram.ui.ActionBar.z1, ResultCallback {
    public final boolean f19072a;
    public final int f19073b;
    public final Object f19074c;
    public final Object d;
    public final Object e;

    public n2(FactCheckController factCheckController, gu guVar, int i10, MessageObject messageObject, boolean z10) {
        this.f19074c = factCheckController;
        this.d = guVar;
        this.f19073b = i10;
        this.e = messageObject;
        this.f19072a = z10;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        boolean z10 = this.f19072a;
        ((FactCheckController) this.f19074c).lambda$openFactCheckEditor$8((gu) this.d, this.f19073b, (MessageObject) this.e, z10, c2Var, i10);
    }

    @Override
    public void onComplete(Object obj) {
        qn qnVar = (qn) this.f19074c;
        org.telegram.ui.ActionBar.f4 f4Var = (org.telegram.ui.ActionBar.f4) this.d;
        wc0 wc0Var = (wc0) this.e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((eg.a) pair.second).f8652b;
            org.telegram.ui.ActionBar.f4 f4Var2 = qnVar.f40882f;
            if (f4Var2 != null && longValue == f4Var2.h(qnVar.f40892q ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = qnVar.f40884i;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = f4Var.j(this.f19072a ? 1 : 0).settings.intensity;
                List list = ((eg.a) pair.second).f8653c;
                wc0Var.R = list;
                long j10 = qnVar.F.db;
                if (list != null) {
                    wc0Var.S = new Random(j10).nextInt(wc0Var.R.size());
                }
                wc0Var.s(bitmap, i10);
                wc0Var.t(this.f19073b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                qnVar.f40884i = ofFloat;
                ofFloat.addUpdateListener(new mn(wc0Var, 2));
                qnVar.f40884i.setDuration(250L);
                qnVar.f40884i.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public n2(qn qnVar, org.telegram.ui.ActionBar.f4 f4Var, boolean z10, wc0 wc0Var, int i10) {
        this.f19074c = qnVar;
        this.d = f4Var;
        this.f19072a = z10;
        this.e = wc0Var;
        this.f19073b = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }
}
