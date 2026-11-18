package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bb0;
public final class r6 implements org.telegram.ui.ActionBar.r1, ResultCallback {
    public final boolean f26543a;
    public final int f26544b;
    public final Object f26545c;
    public final Object d;
    public final Object f26546e;

    public r6(x6 x6Var, t6 t6Var, int i7, fj fjVar, boolean z10) {
        this.f26545c = x6Var;
        this.d = t6Var;
        this.f26544b = i7;
        this.f26546e = fjVar;
        this.f26543a = z10;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        String charSequence;
        x6 x6Var = (x6) this.f26545c;
        t6 t6Var = (t6) this.d;
        fj fjVar = (fj) this.f26546e;
        if (t6Var.getText().toString().length() > this.f26544b) {
            g0.D3(t6Var);
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {t6Var.getText()};
        tL_textWithEntities.entities = ri.d0(x6Var.f27821a).Y(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        x6Var.a(fjVar, tL_textWithEntities, this.f26543a);
        u1Var.dismiss();
    }

    @Override
    public void onComplete(Object obj) {
        org.telegram.ui.zm zmVar = (org.telegram.ui.zm) this.f26545c;
        org.telegram.ui.ActionBar.t3 t3Var = (org.telegram.ui.ActionBar.t3) this.d;
        bb0 bb0Var = (bb0) this.f26546e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((gg.a) pair.second).f13607a;
            org.telegram.ui.ActionBar.t3 t3Var2 = zmVar.f54538f;
            if (t3Var2 != null && longValue == t3Var2.h(zmVar.f54548q ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = zmVar.f54540i;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i7 = t3Var.j(this.f26543a ? 1 : 0).settings.intensity;
                List list = ((gg.a) pair.second).f13608b;
                bb0Var.R = list;
                long j3 = zmVar.G.f46117ob;
                if (list != null) {
                    bb0Var.S = new Random(j3).nextInt(bb0Var.R.size());
                }
                bb0Var.s(i7, bitmap);
                bb0Var.t(this.f26544b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                zmVar.f54540i = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.vm(bb0Var, 2));
                zmVar.f54540i.setDuration(250L);
                zmVar.f54540i.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public r6(org.telegram.ui.zm zmVar, org.telegram.ui.ActionBar.t3 t3Var, boolean z10, bb0 bb0Var, int i7) {
        this.f26545c = zmVar;
        this.d = t3Var;
        this.f26543a = z10;
        this.f26546e = bb0Var;
        this.f26544b = i7;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }
}
