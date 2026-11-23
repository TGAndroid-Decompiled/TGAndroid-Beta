package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cb0;
public final class r6 implements org.telegram.ui.ActionBar.q1, ResultCallback {
    public final boolean f26529a;
    public final int f26530b;
    public final Object f26531c;
    public final Object d;
    public final Object f26532e;

    public r6(x6 x6Var, t6 t6Var, int i7, gj gjVar, boolean z10) {
        this.f26531c = x6Var;
        this.d = t6Var;
        this.f26530b = i7;
        this.f26532e = gjVar;
        this.f26529a = z10;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        String charSequence;
        x6 x6Var = (x6) this.f26531c;
        t6 t6Var = (t6) this.d;
        gj gjVar = (gj) this.f26532e;
        if (t6Var.getText().toString().length() > this.f26530b) {
            g0.D3(t6Var);
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {t6Var.getText()};
        tL_textWithEntities.entities = si.d0(x6Var.f27816a).Y(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        x6Var.a(gjVar, tL_textWithEntities, this.f26529a);
        t1Var.dismiss();
    }

    @Override
    public void onComplete(Object obj) {
        org.telegram.ui.zm zmVar = (org.telegram.ui.zm) this.f26531c;
        org.telegram.ui.ActionBar.s3 s3Var = (org.telegram.ui.ActionBar.s3) this.d;
        cb0 cb0Var = (cb0) this.f26532e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((gg.a) pair.second).f13602a;
            org.telegram.ui.ActionBar.s3 s3Var2 = zmVar.f54552f;
            if (s3Var2 != null && longValue == s3Var2.h(zmVar.f54562q ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = zmVar.f54554i;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i7 = s3Var.j(this.f26529a ? 1 : 0).settings.intensity;
                List list = ((gg.a) pair.second).f13603b;
                cb0Var.R = list;
                long j3 = zmVar.G.f46097ob;
                if (list != null) {
                    cb0Var.S = new Random(j3).nextInt(cb0Var.R.size());
                }
                cb0Var.s(i7, bitmap);
                cb0Var.t(this.f26530b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                zmVar.f54554i = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.vm(cb0Var, 2));
                zmVar.f54554i.setDuration(250L);
                zmVar.f54554i.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public r6(org.telegram.ui.zm zmVar, org.telegram.ui.ActionBar.s3 s3Var, boolean z10, cb0 cb0Var, int i7) {
        this.f26531c = zmVar;
        this.d = s3Var;
        this.f26529a = z10;
        this.f26532e = cb0Var;
        this.f26530b = i7;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }
}
