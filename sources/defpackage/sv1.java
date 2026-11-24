package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.List;
import java.util.Random;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class sv1 implements ResultCallback, ee {
    public final int a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public sv1(wv1 wv1Var, tz3 tz3Var, boolean z, ah7 ah7Var, int i) {
        this.c = wv1Var;
        this.d = tz3Var;
        this.b = z;
        this.e = ah7Var;
        this.a = i;
    }

    @Override
    public final void onComplete(Object obj) {
        wv1 wv1Var = (wv1) this.c;
        tz3 tz3Var = (tz3) this.d;
        ah7 ah7Var = (ah7) this.e;
        Pair pair = (Pair) obj;
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = ((osc) pair.second).a;
            tz3 tz3Var2 = wv1Var.f;
            if (tz3Var2 != null && longValue == tz3Var2.h(wv1Var.q ? 1 : 0) && bitmap != null) {
                ValueAnimator valueAnimator = wv1Var.i;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int i = tz3Var.j(this.b ? 1 : 0).settings.intensity;
                List list = ((osc) pair.second).b;
                ah7Var.R = list;
                long j = wv1Var.G.ob;
                if (list != null) {
                    ah7Var.S = new Random(j).nextInt(ah7Var.R.size());
                }
                ah7Var.r(i, bitmap);
                ah7Var.s(this.a);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                wv1Var.i = ofFloat;
                ofFloat.addUpdateListener(new rv1(ah7Var, (byte) 2));
                wv1Var.i.setDuration(250L);
                wv1Var.i.start();
            }
        }
    }

    @Override
    public final void r(he heVar, int i) {
        String charSequence;
        e94 e94Var = (e94) this.c;
        a94 a94Var = (a94) this.d;
        k47 k47Var = (k47) this.e;
        if (a94Var.getText().toString().length() > this.a) {
            gm.z3(a94Var);
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {a94Var.getText()};
        tL_textWithEntities.entities = hs6.d0(e94Var.a).Y(charSequenceArr, true, true);
        CharSequence charSequence2 = charSequenceArr[0];
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        e94Var.a(k47Var, tL_textWithEntities, this.b);
        heVar.dismiss();
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
    }

    public sv1(e94 e94Var, a94 a94Var, int i, k47 k47Var, boolean z) {
        this.c = e94Var;
        this.d = a94Var;
        this.a = i;
        this.e = k47Var;
        this.b = z;
    }

    @Override
    public final void onError(Throwable th) {
    }
}
