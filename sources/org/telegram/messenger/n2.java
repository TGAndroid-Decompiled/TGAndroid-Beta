package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.uu;
import org.telegram.ui.bo;
import org.telegram.ui.xn;
public final class n2 implements org.telegram.ui.ActionBar.z1, ResultCallback {
    public final boolean f18337a;
    public final int f18338b;
    public final Object f18339c;
    public final Object d;
    public final Object f18340e;

    public n2(FactCheckController factCheckController, uu uuVar, int i10, MessageObject messageObject, boolean z10) {
        this.f18339c = factCheckController;
        this.d = uuVar;
        this.f18338b = i10;
        this.f18340e = messageObject;
        this.f18337a = z10;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        boolean z10 = this.f18337a;
        ((FactCheckController) this.f18339c).lambda$openFactCheckEditor$8((uu) this.d, this.f18338b, (MessageObject) this.f18340e, z10, a2Var, i10);
    }

    @Override
    public void onComplete(Object obj) {
        bo boVar = (bo) this.f18339c;
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) this.d;
        gd0 gd0Var = (gd0) this.f18340e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((dg.a) pair.second).f8347b;
            org.telegram.ui.ActionBar.b4 b4Var2 = boVar.f36218f;
            if (b4Var2 != null && longValue == b4Var2.i(boVar.G ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = boVar.f36220r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = b4Var.k(this.f18337a ? 1 : 0).settings.intensity;
                List list = ((dg.a) pair.second).f8348c;
                gd0Var.R = list;
                long j3 = boVar.V.Ra;
                if (list != null) {
                    gd0Var.S = new Random(j3).nextInt(gd0Var.R.size());
                }
                gd0Var.t(bitmap, i10);
                gd0Var.u(this.f18338b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                boVar.f36220r = ofFloat;
                ofFloat.addUpdateListener(new xn(gd0Var, 2));
                boVar.f36220r.setDuration(250L);
                boVar.f36220r.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.m.a(this, th2);
    }

    public n2(bo boVar, org.telegram.ui.ActionBar.b4 b4Var, boolean z10, gd0 gd0Var, int i10) {
        this.f18339c = boVar;
        this.d = b4Var;
        this.f18337a = z10;
        this.f18340e = gd0Var;
        this.f18338b = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.m.b(this, tL_error);
    }
}
