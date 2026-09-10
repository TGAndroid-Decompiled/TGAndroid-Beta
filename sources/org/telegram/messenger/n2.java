package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.bo;
import org.telegram.ui.xn;
public final class n2 implements org.telegram.ui.ActionBar.c2, ResultCallback {
    public final boolean f15821a;
    public final int f15822b;
    public final Object f15823c;
    public final Object d;
    public final Object e;

    public n2(FactCheckController factCheckController, fu fuVar, int i10, MessageObject messageObject, boolean z10) {
        this.f15823c = factCheckController;
        this.d = fuVar;
        this.f15822b = i10;
        this.e = messageObject;
        this.f15821a = z10;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        boolean z10 = this.f15821a;
        ((FactCheckController) this.f15823c).lambda$openFactCheckEditor$8((fu) this.d, this.f15822b, (MessageObject) this.e, z10, d2Var, i10);
    }

    @Override
    public void onComplete(Object obj) {
        bo boVar = (bo) this.f15823c;
        org.telegram.ui.ActionBar.f4 f4Var = (org.telegram.ui.ActionBar.f4) this.d;
        lc0 lc0Var = (lc0) this.e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((cg.a) pair.second).f4676b;
            org.telegram.ui.ActionBar.f4 f4Var2 = boVar.f31302f;
            if (f4Var2 != null && longValue == f4Var2.i(boVar.G ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = boVar.f31304r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = f4Var.k(this.f15821a ? 1 : 0).settings.intensity;
                List list = ((cg.a) pair.second).f4677c;
                lc0Var.R = list;
                long j3 = boVar.V.Qa;
                if (list != null) {
                    lc0Var.S = new Random(j3).nextInt(lc0Var.R.size());
                }
                lc0Var.t(bitmap, i10);
                lc0Var.u(this.f15822b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                boVar.f31304r = ofFloat;
                ofFloat.addUpdateListener(new xn(lc0Var, 2));
                boVar.f31304r.setDuration(250L);
                boVar.f31304r.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.o.a(this, th2);
    }

    public n2(bo boVar, org.telegram.ui.ActionBar.f4 f4Var, boolean z10, lc0 lc0Var, int i10) {
        this.f15823c = boVar;
        this.d = f4Var;
        this.f15821a = z10;
        this.e = lc0Var;
        this.f15822b = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.o.b(this, tL_error);
    }
}
