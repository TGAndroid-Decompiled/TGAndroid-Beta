package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.za0;
public final class r6 implements org.telegram.ui.ActionBar.q1, ResultCallback {
    public final boolean f26641a;
    public final int f26642b;
    public final Object f26643c;
    public final Object d;
    public final Object f26644e;

    public r6(x6 x6Var, t6 t6Var, int i7, fj fjVar, boolean z10) {
        this.f26643c = x6Var;
        this.d = t6Var;
        this.f26642b = i7;
        this.f26644e = fjVar;
        this.f26641a = z10;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        String charSequence;
        x6 x6Var = (x6) this.f26643c;
        t6 t6Var = (t6) this.d;
        fj fjVar = (fj) this.f26644e;
        if (t6Var.getText().toString().length() > this.f26642b) {
            g0.D3(t6Var);
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {t6Var.getText()};
        tL_textWithEntities.entities = ri.d0(x6Var.f27916a).Y(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        x6Var.a(fjVar, tL_textWithEntities, this.f26641a);
        t1Var.dismiss();
    }

    @Override
    public void onComplete(Object obj) {
        org.telegram.ui.zm zmVar = (org.telegram.ui.zm) this.f26643c;
        org.telegram.ui.ActionBar.s3 s3Var = (org.telegram.ui.ActionBar.s3) this.d;
        za0 za0Var = (za0) this.f26644e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((gg.a) pair.second).f13602a;
            org.telegram.ui.ActionBar.s3 s3Var2 = zmVar.f54653f;
            if (s3Var2 != null && longValue == s3Var2.h(zmVar.f54663q ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = zmVar.f54655i;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i7 = s3Var.j(this.f26641a ? 1 : 0).settings.intensity;
                List list = ((gg.a) pair.second).f13603b;
                za0Var.R = list;
                long j3 = zmVar.G.f46312ob;
                if (list != null) {
                    za0Var.S = new Random(j3).nextInt(za0Var.R.size());
                }
                za0Var.s(i7, bitmap);
                za0Var.t(this.f26642b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                zmVar.f54655i = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.vm(za0Var, 2));
                zmVar.f54655i.setDuration(250L);
                zmVar.f54655i.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    public r6(org.telegram.ui.zm zmVar, org.telegram.ui.ActionBar.s3 s3Var, boolean z10, za0 za0Var, int i7) {
        this.f26643c = zmVar;
        this.d = s3Var;
        this.f26641a = z10;
        this.f26644e = za0Var;
        this.f26642b = i7;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }
}
