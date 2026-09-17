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
public final class j2 implements org.telegram.ui.ActionBar.b2, ResultCallback {
    public final boolean f16458a;
    public final int f16459b;
    public final Object f16460c;
    public final Object d;
    public final Object e;

    public j2(FactCheckController factCheckController, bu buVar, int i10, MessageObject messageObject, boolean z10) {
        this.f16460c = factCheckController;
        this.d = buVar;
        this.f16459b = i10;
        this.e = messageObject;
        this.f16458a = z10;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        boolean z10 = this.f16458a;
        ((FactCheckController) this.f16460c).lambda$openFactCheckEditor$8((bu) this.d, this.f16459b, (MessageObject) this.e, z10, c2Var, i10);
    }

    @Override
    public void onComplete(Object obj) {
        zn znVar = (zn) this.f16460c;
        org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) this.d;
        cc0 cc0Var = (cc0) this.e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((dg.a) pair.second).f7727b;
            org.telegram.ui.ActionBar.e4 e4Var2 = znVar.f40280f;
            if (e4Var2 != null && longValue == e4Var2.i(znVar.G ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = znVar.f40282r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = e4Var.k(this.f16458a ? 1 : 0).settings.intensity;
                List list = ((dg.a) pair.second).f7728c;
                cc0Var.R = list;
                long j3 = znVar.V.Qa;
                if (list != null) {
                    cc0Var.S = new Random(j3).nextInt(cc0Var.R.size());
                }
                cc0Var.t(bitmap, i10);
                cc0Var.u(this.f16459b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                znVar.f40282r = ofFloat;
                ofFloat.addUpdateListener(new vn(cc0Var, 2));
                znVar.f40282r.setDuration(250L);
                znVar.f40282r.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    public j2(zn znVar, org.telegram.ui.ActionBar.e4 e4Var, boolean z10, cc0 cc0Var, int i10) {
        this.f16460c = znVar;
        this.d = e4Var;
        this.f16458a = z10;
        this.e = cc0Var;
        this.f16459b = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }
}
