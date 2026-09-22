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
    public final boolean f16445a;
    public final int f16446b;
    public final Object f16447c;
    public final Object d;
    public final Object e;

    public j2(FactCheckController factCheckController, bu buVar, int i10, MessageObject messageObject, boolean z10) {
        this.f16447c = factCheckController;
        this.d = buVar;
        this.f16446b = i10;
        this.e = messageObject;
        this.f16445a = z10;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean z10 = this.f16445a;
        ((FactCheckController) this.f16447c).lambda$openFactCheckEditor$8((bu) this.d, this.f16446b, (MessageObject) this.e, z10, b2Var, i10);
    }

    @Override
    public void onComplete(Object obj) {
        zn znVar = (zn) this.f16447c;
        org.telegram.ui.ActionBar.d4 d4Var = (org.telegram.ui.ActionBar.d4) this.d;
        cc0 cc0Var = (cc0) this.e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((dg.a) pair.second).f7724b;
            org.telegram.ui.ActionBar.d4 d4Var2 = znVar.f40237f;
            if (d4Var2 != null && longValue == d4Var2.i(znVar.G ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = znVar.f40239r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = d4Var.k(this.f16445a ? 1 : 0).settings.intensity;
                List list = ((dg.a) pair.second).f7725c;
                cc0Var.R = list;
                long j3 = znVar.V.Qa;
                if (list != null) {
                    cc0Var.S = new Random(j3).nextInt(cc0Var.R.size());
                }
                cc0Var.t(bitmap, i10);
                cc0Var.u(this.f16446b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                znVar.f40239r = ofFloat;
                ofFloat.addUpdateListener(new vn(cc0Var, 2));
                znVar.f40239r.setDuration(250L);
                znVar.f40239r.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    public j2(zn znVar, org.telegram.ui.ActionBar.d4 d4Var, boolean z10, cc0 cc0Var, int i10) {
        this.f16447c = znVar;
        this.d = d4Var;
        this.f16445a = z10;
        this.e = cc0Var;
        this.f16446b = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }
}
