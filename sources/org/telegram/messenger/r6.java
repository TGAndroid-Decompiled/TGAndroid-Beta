package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.la0;
public final class r6 implements org.telegram.ui.ActionBar.p1, ResultCallback {
    public final boolean f25084a;
    public final int f25085b;
    public final Object f25086c;
    public final Object d;
    public final Object f25087e;

    public r6(x6 x6Var, t6 t6Var, int i3, zi ziVar, boolean z10) {
        this.f25086c = x6Var;
        this.d = t6Var;
        this.f25085b = i3;
        this.f25087e = ziVar;
        this.f25084a = z10;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        String charSequence;
        x6 x6Var = (x6) this.f25086c;
        t6 t6Var = (t6) this.d;
        zi ziVar = (zi) this.f25087e;
        if (t6Var.getText().toString().length() > this.f25085b) {
            g0.F3(t6Var);
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {t6Var.getText()};
        tL_textWithEntities.entities = li.b0(x6Var.f26347a).W(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        x6Var.a(ziVar, tL_textWithEntities, this.f25084a);
        s1Var.dismiss();
    }

    @Override
    public void onComplete(Object obj) {
        org.telegram.ui.um umVar = (org.telegram.ui.um) this.f25086c;
        org.telegram.ui.ActionBar.p3 p3Var = (org.telegram.ui.ActionBar.p3) this.d;
        la0 la0Var = (la0) this.f25087e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((hg.a) pair.second).f14399a;
            org.telegram.ui.ActionBar.p3 p3Var2 = umVar.f50124f;
            if (p3Var2 != null && longValue == p3Var2.h(umVar.f50134q ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = umVar.f50126i;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i3 = p3Var.j(this.f25084a ? 1 : 0).settings.intensity;
                List list = ((hg.a) pair.second).f14400b;
                la0Var.R = list;
                long j10 = umVar.G.f51393lb;
                if (list != null) {
                    la0Var.S = new Random(j10).nextInt(la0Var.R.size());
                }
                la0Var.s(bitmap, i3);
                la0Var.t(this.f25085b);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                umVar.f50126i = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.qm(la0Var, 2));
                umVar.f50126i.setDuration(250L);
                umVar.f50126i.start();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    public r6(org.telegram.ui.um umVar, org.telegram.ui.ActionBar.p3 p3Var, boolean z10, la0 la0Var, int i3) {
        this.f25086c = umVar;
        this.d = p3Var;
        this.f25084a = z10;
        this.f25087e = la0Var;
        this.f25085b = i3;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }
}
