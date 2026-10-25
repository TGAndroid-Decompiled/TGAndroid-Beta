package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.on;
import org.telegram.ui.sn;
public final class o2 implements org.telegram.ui.ActionBar.b2, ResultCallback {
    public final boolean f20823a;
    public final int f20824b;
    public final Object f20825c;
    public final Object d;
    public final Object e;

    public o2(FactCheckController factCheckController, ju juVar, int i10, MessageObject messageObject, boolean z10) {
        this.f20825c = factCheckController;
        this.d = juVar;
        this.f20824b = i10;
        this.e = messageObject;
        this.f20823a = z10;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        boolean z10 = this.f20823a;
        ((FactCheckController) this.f20825c).lambda$openFactCheckEditor$8((ju) this.d, this.f20824b, (MessageObject) this.e, z10, e2Var, i10);
    }

    @Override
    public void onComplete(Object obj) {
        sn snVar = (sn) this.f20825c;
        org.telegram.ui.ActionBar.h4 h4Var = (org.telegram.ui.ActionBar.h4) this.d;
        uc0 uc0Var = (uc0) this.e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((fg.a) pair.second).f10468b;
            org.telegram.ui.ActionBar.h4 h4Var2 = snVar.f43542f;
            if (h4Var2 != null && longValue == h4Var2.h(snVar.f43552q ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = snVar.f43544i;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = h4Var.j(this.f20823a ? 1 : 0).settings.intensity;
                List list = ((fg.a) pair.second).f10469c;
                uc0Var.R = list;
                long j10 = snVar.F.f44228db;
                if (list != null) {
                    uc0Var.S = new Random(j10).nextInt(uc0Var.R.size());
                }
                uc0Var.s(bitmap, i10);
                uc0Var.t(this.f20824b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                snVar.f43544i = ofFloat;
                ofFloat.addUpdateListener(new on(uc0Var, 2));
                snVar.f43544i.setDuration(250L);
                snVar.f43544i.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public o2(sn snVar, org.telegram.ui.ActionBar.h4 h4Var, boolean z10, uc0 uc0Var, int i10) {
        this.f20825c = snVar;
        this.d = h4Var;
        this.f20823a = z10;
        this.e = uc0Var;
        this.f20824b = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }
}
