package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.mc0;
import org.telegram.ui.qn;
import org.telegram.ui.un;
public final class j2 implements org.telegram.ui.ActionBar.z1, ResultCallback {
    public final boolean f16695a;
    public final int f16696b;
    public final Object f16697c;
    public final Object d;
    public final Object e;

    public j2(FactCheckController factCheckController, cu cuVar, int i10, MessageObject messageObject, boolean z10) {
        this.f16697c = factCheckController;
        this.d = cuVar;
        this.f16696b = i10;
        this.e = messageObject;
        this.f16695a = z10;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        boolean z10 = this.f16695a;
        ((FactCheckController) this.f16697c).lambda$openFactCheckEditor$8((cu) this.d, this.f16696b, (MessageObject) this.e, z10, a2Var, i10);
    }

    @Override
    public void onComplete(Object obj) {
        un unVar = (un) this.f16697c;
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) this.d;
        mc0 mc0Var = (mc0) this.e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((dg.a) pair.second).f7709b;
            org.telegram.ui.ActionBar.b4 b4Var2 = unVar.f38506f;
            if (b4Var2 != null && longValue == b4Var2.i(unVar.G ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = unVar.f38508r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = b4Var.k(this.f16695a ? 1 : 0).settings.intensity;
                List list = ((dg.a) pair.second).f7710c;
                mc0Var.R = list;
                long j3 = unVar.V.Qa;
                if (list != null) {
                    mc0Var.S = new Random(j3).nextInt(mc0Var.R.size());
                }
                mc0Var.t(bitmap, i10);
                mc0Var.u(this.f16696b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                unVar.f38508r = ofFloat;
                ofFloat.addUpdateListener(new qn(mc0Var, 2));
                unVar.f38508r.setDuration(250L);
                unVar.f38508r.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    public j2(un unVar, org.telegram.ui.ActionBar.b4 b4Var, boolean z10, mc0 mc0Var, int i10) {
        this.f16697c = unVar;
        this.d = b4Var;
        this.f16695a = z10;
        this.e = mc0Var;
        this.f16696b = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }
}
