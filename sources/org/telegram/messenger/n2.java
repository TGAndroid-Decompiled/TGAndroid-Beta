package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.kn;
import org.telegram.ui.on;
public final class n2 implements org.telegram.ui.ActionBar.a2, ResultCallback {
    public final boolean f19006a;
    public final int f19007b;
    public final Object f19008c;
    public final Object d;
    public final Object e;

    public n2(FactCheckController factCheckController, iu iuVar, int i10, MessageObject messageObject, boolean z10) {
        this.f19008c = factCheckController;
        this.d = iuVar;
        this.f19007b = i10;
        this.e = messageObject;
        this.f19006a = z10;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean z10 = this.f19006a;
        ((FactCheckController) this.f19008c).lambda$openFactCheckEditor$8((iu) this.d, this.f19007b, (MessageObject) this.e, z10, b2Var, i10);
    }

    @Override
    public void onComplete(Object obj) {
        on onVar = (on) this.f19008c;
        org.telegram.ui.ActionBar.c4 c4Var = (org.telegram.ui.ActionBar.c4) this.d;
        wc0 wc0Var = (wc0) this.e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((eg.a) pair.second).f8645b;
            org.telegram.ui.ActionBar.c4 c4Var2 = onVar.f39935f;
            if (c4Var2 != null && longValue == c4Var2.h(onVar.G ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = onVar.f39937r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = c4Var.j(this.f19006a ? 1 : 0).settings.intensity;
                List list = ((eg.a) pair.second).f8646c;
                wc0Var.R = list;
                long j10 = onVar.V.Ra;
                if (list != null) {
                    wc0Var.S = new Random(j10).nextInt(wc0Var.R.size());
                }
                wc0Var.s(bitmap, i10);
                wc0Var.t(this.f19007b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                onVar.f39937r = ofFloat;
                ofFloat.addUpdateListener(new kn(wc0Var, 2));
                onVar.f39937r.setDuration(250L);
                onVar.f39937r.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public n2(on onVar, org.telegram.ui.ActionBar.c4 c4Var, boolean z10, wc0 wc0Var, int i10) {
        this.f19008c = onVar;
        this.d = c4Var;
        this.f19006a = z10;
        this.e = wc0Var;
        this.f19007b = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }
}
