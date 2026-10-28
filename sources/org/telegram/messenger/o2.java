package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.qn;
import org.telegram.ui.un;
public final class o2 implements org.telegram.ui.ActionBar.b2, ResultCallback {
    public final boolean f20824a;
    public final int f20825b;
    public final Object f20826c;
    public final Object d;
    public final Object e;

    public o2(FactCheckController factCheckController, ju juVar, int i10, MessageObject messageObject, boolean z10) {
        this.f20826c = factCheckController;
        this.d = juVar;
        this.f20825b = i10;
        this.e = messageObject;
        this.f20824a = z10;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        boolean z10 = this.f20824a;
        ((FactCheckController) this.f20826c).lambda$openFactCheckEditor$8((ju) this.d, this.f20825b, (MessageObject) this.e, z10, e2Var, i10);
    }

    @Override
    public void onComplete(Object obj) {
        un unVar = (un) this.f20826c;
        org.telegram.ui.ActionBar.h4 h4Var = (org.telegram.ui.ActionBar.h4) this.d;
        vc0 vc0Var = (vc0) this.e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((fg.a) pair.second).f10467b;
            org.telegram.ui.ActionBar.h4 h4Var2 = unVar.f44059f;
            if (h4Var2 != null && longValue == h4Var2.h(unVar.f44069q ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = unVar.f44061i;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = h4Var.j(this.f20824a ? 1 : 0).settings.intensity;
                List list = ((fg.a) pair.second).f10468c;
                vc0Var.R = list;
                long j10 = unVar.F.f45148hb;
                if (list != null) {
                    vc0Var.S = new Random(j10).nextInt(vc0Var.R.size());
                }
                vc0Var.s(bitmap, i10);
                vc0Var.t(this.f20825b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                unVar.f44061i = ofFloat;
                ofFloat.addUpdateListener(new qn(vc0Var, 2));
                unVar.f44061i.setDuration(250L);
                unVar.f44061i.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public o2(un unVar, org.telegram.ui.ActionBar.h4 h4Var, boolean z10, vc0 vc0Var, int i10) {
        this.f20826c = unVar;
        this.d = h4Var;
        this.f20824a = z10;
        this.e = vc0Var;
        this.f20825b = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }
}
