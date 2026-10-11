package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.su;
import org.telegram.ui.tn;
import org.telegram.ui.xn;
public final class j2 implements org.telegram.ui.ActionBar.z1, ResultCallback {
    public final boolean f18254a;
    public final int f18255b;
    public final Object f18256c;
    public final Object d;
    public final Object f18257e;

    public j2(FactCheckController factCheckController, su suVar, int i10, MessageObject messageObject, boolean z10) {
        this.f18256c = factCheckController;
        this.d = suVar;
        this.f18255b = i10;
        this.f18257e = messageObject;
        this.f18254a = z10;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        boolean z10 = this.f18254a;
        ((FactCheckController) this.f18256c).lambda$openFactCheckEditor$8((su) this.d, this.f18255b, (MessageObject) this.f18257e, z10, a2Var, i10);
    }

    @Override
    public void onComplete(Object obj) {
        xn xnVar = (xn) this.f18256c;
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) this.d;
        cd0 cd0Var = (cd0) this.f18257e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((dg.a) pair.second).f8349b;
            org.telegram.ui.ActionBar.b4 b4Var2 = xnVar.f44149f;
            if (b4Var2 != null && longValue == b4Var2.i(xnVar.G ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = xnVar.f44151r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = b4Var.k(this.f18254a ? 1 : 0).settings.intensity;
                List list = ((dg.a) pair.second).f8350c;
                cd0Var.R = list;
                long j3 = xnVar.V.Ra;
                if (list != null) {
                    cd0Var.S = new Random(j3).nextInt(cd0Var.R.size());
                }
                cd0Var.t(bitmap, i10);
                cd0Var.u(this.f18255b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                xnVar.f44151r = ofFloat;
                ofFloat.addUpdateListener(new tn(cd0Var, 2));
                xnVar.f44151r.setDuration(250L);
                xnVar.f44151r.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    public j2(xn xnVar, org.telegram.ui.ActionBar.b4 b4Var, boolean z10, cd0 cd0Var, int i10) {
        this.f18256c = xnVar;
        this.d = b4Var;
        this.f18254a = z10;
        this.f18257e = cd0Var;
        this.f18255b = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }
}
