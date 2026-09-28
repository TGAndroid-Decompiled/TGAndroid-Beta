package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.qn;
import org.telegram.ui.un;
public final class j2 implements org.telegram.ui.ActionBar.z1, ResultCallback {
    public final boolean f16700a;
    public final int f16701b;
    public final Object f16702c;
    public final Object d;
    public final Object e;

    public j2(FactCheckController factCheckController, du duVar, int i10, MessageObject messageObject, boolean z10) {
        this.f16702c = factCheckController;
        this.d = duVar;
        this.f16701b = i10;
        this.e = messageObject;
        this.f16700a = z10;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        boolean z10 = this.f16700a;
        ((FactCheckController) this.f16702c).lambda$openFactCheckEditor$8((du) this.d, this.f16701b, (MessageObject) this.e, z10, a2Var, i10);
    }

    @Override
    public void onComplete(Object obj) {
        un unVar = (un) this.f16702c;
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) this.d;
        oc0 oc0Var = (oc0) this.e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((dg.a) pair.second).f7709b;
            org.telegram.ui.ActionBar.b4 b4Var2 = unVar.f38507f;
            if (b4Var2 != null && longValue == b4Var2.i(unVar.G ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = unVar.f38509r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = b4Var.k(this.f16700a ? 1 : 0).settings.intensity;
                List list = ((dg.a) pair.second).f7710c;
                oc0Var.R = list;
                long j3 = unVar.V.Qa;
                if (list != null) {
                    oc0Var.S = new Random(j3).nextInt(oc0Var.R.size());
                }
                oc0Var.t(bitmap, i10);
                oc0Var.u(this.f16701b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                unVar.f38509r = ofFloat;
                ofFloat.addUpdateListener(new qn(oc0Var, 2));
                unVar.f38509r.setDuration(250L);
                unVar.f38509r.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    public j2(un unVar, org.telegram.ui.ActionBar.b4 b4Var, boolean z10, oc0 oc0Var, int i10) {
        this.f16702c = unVar;
        this.d = b4Var;
        this.f16700a = z10;
        this.e = oc0Var;
        this.f16701b = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }
}
