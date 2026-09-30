package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.qn;
import org.telegram.ui.un;
public final class j2 implements org.telegram.ui.ActionBar.z1, ResultCallback {
    public final boolean f16716a;
    public final int f16717b;
    public final Object f16718c;
    public final Object d;
    public final Object e;

    public j2(FactCheckController factCheckController, eu euVar, int i10, MessageObject messageObject, boolean z10) {
        this.f16718c = factCheckController;
        this.d = euVar;
        this.f16717b = i10;
        this.e = messageObject;
        this.f16716a = z10;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        boolean z10 = this.f16716a;
        ((FactCheckController) this.f16718c).lambda$openFactCheckEditor$8((eu) this.d, this.f16717b, (MessageObject) this.e, z10, a2Var, i10);
    }

    @Override
    public void onComplete(Object obj) {
        un unVar = (un) this.f16718c;
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) this.d;
        pc0 pc0Var = (pc0) this.e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((dg.a) pair.second).f7721b;
            org.telegram.ui.ActionBar.b4 b4Var2 = unVar.f38598f;
            if (b4Var2 != null && longValue == b4Var2.i(unVar.G ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = unVar.f38600r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = b4Var.k(this.f16716a ? 1 : 0).settings.intensity;
                List list = ((dg.a) pair.second).f7722c;
                pc0Var.R = list;
                long j3 = unVar.V.Qa;
                if (list != null) {
                    pc0Var.S = new Random(j3).nextInt(pc0Var.R.size());
                }
                pc0Var.t(bitmap, i10);
                pc0Var.u(this.f16717b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                unVar.f38600r = ofFloat;
                ofFloat.addUpdateListener(new qn(pc0Var, 2));
                unVar.f38600r.setDuration(250L);
                unVar.f38600r.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    public j2(un unVar, org.telegram.ui.ActionBar.b4 b4Var, boolean z10, pc0 pc0Var, int i10) {
        this.f16718c = unVar;
        this.d = b4Var;
        this.f16716a = z10;
        this.e = pc0Var;
        this.f16717b = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }
}
