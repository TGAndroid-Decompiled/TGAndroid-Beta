package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jb0;
public final class u6 implements org.telegram.ui.ActionBar.u1, ResultCallback {
    public final boolean f18387a;
    public final int f18388b;
    public final Object f18389c;
    public final Object d;
    public final Object e;

    public u6(a7 a7Var, w6 w6Var, int i10, kj kjVar, boolean z10) {
        this.f18389c = a7Var;
        this.d = w6Var;
        this.f18388b = i10;
        this.e = kjVar;
        this.f18387a = z10;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        String charSequence;
        a7 a7Var = (a7) this.f18389c;
        w6 w6Var = (w6) this.d;
        kj kjVar = (kj) this.e;
        if (w6Var.getText().toString().length() > this.f18388b) {
            i0.E3(w6Var);
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {w6Var.getText()};
        tL_textWithEntities.entities = vi.b0(a7Var.f14575a).W(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        a7Var.a(kjVar, tL_textWithEntities, this.f18387a);
        x1Var.dismiss();
    }

    @Override
    public void onComplete(Object obj) {
        org.telegram.ui.sn snVar = (org.telegram.ui.sn) this.f18389c;
        org.telegram.ui.ActionBar.y3 y3Var = (org.telegram.ui.ActionBar.y3) this.d;
        jb0 jb0Var = (jb0) this.e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((wf.a) pair.second).f52852a;
            org.telegram.ui.ActionBar.y3 y3Var2 = snVar.f41401f;
            if (y3Var2 != null && longValue == y3Var2.h(snVar.f41411q ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = snVar.f41403i;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i10 = y3Var.j(this.f18387a ? 1 : 0).settings.intensity;
                List list = ((wf.a) pair.second).f52853b;
                jb0Var.R = list;
                long j10 = snVar.G.f42126kb;
                if (list != null) {
                    jb0Var.S = new Random(j10).nextInt(jb0Var.R.size());
                }
                jb0Var.s(bitmap, i10);
                jb0Var.t(this.f18388b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                snVar.f41403i = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.on(jb0Var, 2));
                snVar.f41403i.setDuration(250L);
                snVar.f41403i.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    public u6(org.telegram.ui.sn snVar, org.telegram.ui.ActionBar.y3 y3Var, boolean z10, jb0 jb0Var, int i10) {
        this.f18389c = snVar;
        this.d = y3Var;
        this.f18387a = z10;
        this.e = jb0Var;
        this.f18388b = i10;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }
}
