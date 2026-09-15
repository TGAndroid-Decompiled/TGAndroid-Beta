package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.vn;
import org.telegram.ui.zn;
public final class j2 implements org.telegram.ui.ActionBar.a2, ResultCallback {
    public final boolean f16449a;
    public final int f16450b;
    public final Object f16451c;
    public final Object d;
    public final Object e;

    public j2(FactCheckController factCheckController, bu buVar, int i10, MessageObject messageObject, boolean z10) {
        this.f16451c = factCheckController;
        this.d = buVar;
        this.f16450b = i10;
        this.e = messageObject;
        this.f16449a = z10;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean z10 = this.f16449a;
        ((FactCheckController) this.f16451c).lambda$openFactCheckEditor$8((bu) this.d, this.f16450b, (MessageObject) this.e, z10, b2Var, i10);
    }

    @Override
    public void onComplete(Object obj) {
        zn znVar = (zn) this.f16451c;
        org.telegram.ui.ActionBar.d4 d4Var = (org.telegram.ui.ActionBar.d4) this.d;
        cc0 cc0Var = (cc0) this.e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((dg.a) pair.second).f7722b;
            org.telegram.ui.ActionBar.d4 d4Var2 = znVar.f40244f;
            if (d4Var2 != null && longValue == d4Var2.i(znVar.G ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = znVar.f40246r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = d4Var.k(this.f16449a ? 1 : 0).settings.intensity;
                List list = ((dg.a) pair.second).f7723c;
                cc0Var.R = list;
                long j3 = znVar.V.Qa;
                if (list != null) {
                    cc0Var.S = new Random(j3).nextInt(cc0Var.R.size());
                }
                cc0Var.t(bitmap, i10);
                cc0Var.u(this.f16450b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                znVar.f40246r = ofFloat;
                ofFloat.addUpdateListener(new vn(cc0Var, 2));
                znVar.f40246r.setDuration(250L);
                znVar.f40246r.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    public j2(zn znVar, org.telegram.ui.ActionBar.d4 d4Var, boolean z10, cc0 cc0Var, int i10) {
        this.f16451c = znVar;
        this.d = d4Var;
        this.f16449a = z10;
        this.e = cc0Var;
        this.f16450b = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }
}
