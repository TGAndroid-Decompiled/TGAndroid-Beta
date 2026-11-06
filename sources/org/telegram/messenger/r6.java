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
    public final boolean f25236a;
    public final int f25237b;
    public final Object f25238c;
    public final Object d;
    public final Object f25239e;

    public r6(x6 x6Var, t6 t6Var, int i7, ij ijVar, boolean z9) {
        this.f25238c = x6Var;
        this.d = t6Var;
        this.f25237b = i7;
        this.f25239e = ijVar;
        this.f25236a = z9;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        String charSequence;
        x6 x6Var = (x6) this.f25238c;
        t6 t6Var = (t6) this.d;
        ij ijVar = (ij) this.f25239e;
        if (t6Var.getText().toString().length() > this.f25237b) {
            g0.F3(t6Var);
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {t6Var.getText()};
        tL_textWithEntities.entities = ui.b0(x6Var.f26428a).W(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        x6Var.a(ijVar, tL_textWithEntities, this.f25236a);
        u1Var.dismiss();
    }

    @Override
    public void onComplete(Object obj) {
        org.telegram.ui.ym ymVar = (org.telegram.ui.ym) this.f25238c;
        org.telegram.ui.ActionBar.r3 r3Var = (org.telegram.ui.ActionBar.r3) this.d;
        qa0 qa0Var = (qa0) this.f25239e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((gg.a) pair.second).f13953a;
            org.telegram.ui.ActionBar.r3 r3Var2 = ymVar.f52251f;
            if (r3Var2 != null && longValue == r3Var2.h(ymVar.f52261q ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = ymVar.f52253i;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i7 = r3Var.j(this.f25236a ? 1 : 0).settings.intensity;
                List list = ((gg.a) pair.second).f13954b;
                qa0Var.R = list;
                long j3 = ymVar.G.kb;
                if (list != null) {
                    qa0Var.S = new Random(j3).nextInt(qa0Var.R.size());
                }
                qa0Var.s(bitmap, i7);
                qa0Var.t(this.f25237b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ymVar.f52253i = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.um(qa0Var, 2));
                ymVar.f52253i.setDuration(250L);
                ymVar.f52253i.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public r6(org.telegram.ui.ym ymVar, org.telegram.ui.ActionBar.r3 r3Var, boolean z9, qa0 qa0Var, int i7) {
        this.f25238c = ymVar;
        this.d = r3Var;
        this.f25236a = z9;
        this.f25239e = qa0Var;
        this.f25237b = i7;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }
}
