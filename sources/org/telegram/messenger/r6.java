package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ra0;
public final class r6 implements org.telegram.ui.ActionBar.q1, ResultCallback {
    public final boolean f26252a;
    public final int f26253b;
    public final Object f26254c;
    public final Object d;
    public final Object f26255e;

    public r6(x6 x6Var, t6 t6Var, int i7, gj gjVar, boolean z10) {
        this.f26254c = x6Var;
        this.d = t6Var;
        this.f26253b = i7;
        this.f26255e = gjVar;
        this.f26252a = z10;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        String charSequence;
        x6 x6Var = (x6) this.f26254c;
        t6 t6Var = (t6) this.d;
        gj gjVar = (gj) this.f26255e;
        if (t6Var.getText().toString().length() > this.f26253b) {
            g0.E3(t6Var);
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {t6Var.getText()};
        tL_textWithEntities.entities = si.b0(x6Var.f27467a).W(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        x6Var.a(gjVar, tL_textWithEntities, this.f26252a);
        t1Var.dismiss();
    }

    @Override
    public void onComplete(Object obj) {
        org.telegram.ui.ym ymVar = (org.telegram.ui.ym) this.f26254c;
        org.telegram.ui.ActionBar.p3 p3Var = (org.telegram.ui.ActionBar.p3) this.d;
        ra0 ra0Var = (ra0) this.f26255e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((gg.a) pair.second).f13295a;
            org.telegram.ui.ActionBar.p3 p3Var2 = ymVar.f53545f;
            if (p3Var2 != null && longValue == p3Var2.h(ymVar.f53555q ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = ymVar.f53547i;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i7 = p3Var.j(this.f26252a ? 1 : 0).settings.intensity;
                List list = ((gg.a) pair.second).f13296b;
                ra0Var.R = list;
                long j3 = ymVar.G.f45298nb;
                if (list != null) {
                    ra0Var.S = new Random(j3).nextInt(ra0Var.R.size());
                }
                ra0Var.s(i7, bitmap);
                ra0Var.t(this.f26253b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ymVar.f53547i = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.um(ra0Var, 2));
                ymVar.f53547i.setDuration(250L);
                ymVar.f53547i.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public r6(org.telegram.ui.ym ymVar, org.telegram.ui.ActionBar.p3 p3Var, boolean z10, ra0 ra0Var, int i7) {
        this.f26254c = ymVar;
        this.d = p3Var;
        this.f26252a = z10;
        this.f26255e = ra0Var;
        this.f26253b = i7;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }
}
