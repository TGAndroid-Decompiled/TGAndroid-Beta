package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qa0;
public final class r6 implements org.telegram.ui.ActionBar.r1, ResultCallback {
    public final boolean f25262a;
    public final int f25263b;
    public final Object f25264c;
    public final Object d;
    public final Object f25265e;

    public r6(x6 x6Var, t6 t6Var, int i7, ij ijVar, boolean z9) {
        this.f25264c = x6Var;
        this.d = t6Var;
        this.f25263b = i7;
        this.f25265e = ijVar;
        this.f25262a = z9;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        String charSequence;
        x6 x6Var = (x6) this.f25264c;
        t6 t6Var = (t6) this.d;
        ij ijVar = (ij) this.f25265e;
        if (t6Var.getText().toString().length() > this.f25263b) {
            g0.F3(t6Var);
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {t6Var.getText()};
        tL_textWithEntities.entities = ui.b0(x6Var.f26450a).W(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        x6Var.a(ijVar, tL_textWithEntities, this.f25262a);
        u1Var.dismiss();
    }

    @Override
    public void onComplete(Object obj) {
        org.telegram.ui.an anVar = (org.telegram.ui.an) this.f25264c;
        org.telegram.ui.ActionBar.s3 s3Var = (org.telegram.ui.ActionBar.s3) this.d;
        qa0 qa0Var = (qa0) this.f25265e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((gg.a) pair.second).f13955a;
            org.telegram.ui.ActionBar.s3 s3Var2 = anVar.f43729f;
            if (s3Var2 != null && longValue == s3Var2.h(anVar.f43739q ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = anVar.f43731i;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i7 = s3Var.j(this.f25262a ? 1 : 0).settings.intensity;
                List list = ((gg.a) pair.second).f13956b;
                qa0Var.R = list;
                long j3 = anVar.G.mb;
                if (list != null) {
                    qa0Var.S = new Random(j3).nextInt(qa0Var.R.size());
                }
                qa0Var.s(i7, bitmap);
                qa0Var.t(this.f25263b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                anVar.f43731i = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.wm(qa0Var, 2));
                anVar.f43731i.setDuration(250L);
                anVar.f43731i.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public r6(org.telegram.ui.an anVar, org.telegram.ui.ActionBar.s3 s3Var, boolean z9, qa0 qa0Var, int i7) {
        this.f25264c = anVar;
        this.d = s3Var;
        this.f25262a = z9;
        this.f25265e = qa0Var;
        this.f25263b = i7;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }
}
