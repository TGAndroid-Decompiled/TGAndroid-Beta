package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.MediaController;
public final class ae0 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final Object b;

    public ae0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        float f;
        float f2;
        float f3;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((kb0) obj).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 1:
                gr0 gr0Var = (gr0) obj;
                gr0Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gr0Var.f.invalidate();
                return;
            case 2:
                mu1 mu1Var = (mu1) obj;
                mu1Var.Ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mu1Var.m1.invalidate();
                return;
            case 3:
                pk2 pk2Var = (pk2) obj;
                pk2Var.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pk2Var.p.invalidate();
                return;
            case 4:
                cj3 cj3Var = (cj3) obj;
                cj3Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view2 = cj3Var.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 5:
                cp3 cp3Var = (cp3) obj;
                cp3Var.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cp3Var.I = true;
                cp3Var.invalidate();
                return;
            case 6:
                ns9 ns9Var = ((ir5) obj).e.n1;
                int i = ns9Var.D1;
                if (i != -1 && (view = ns9Var.E1) != null) {
                    ns9Var.l1(i, view);
                    ns9Var.invalidate();
                    return;
                }
                return;
            case 7:
                ((es5) obj).y = valueAnimator.getAnimatedFraction();
                return;
            case 8:
                MediaController mediaController = (MediaController) obj;
                mediaController.Q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mediaController.m0();
                return;
            case 9:
                qa7 qa7Var = (qa7) obj;
                qa7Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qa7Var.invalidate();
                for (int i2 = 0; i2 < 2; i2++) {
                    qa7Var.c[i2].setTranslationX(gl.U1(qa7Var.e, 0, -gl.L(62.0f)));
                    qa7Var.c[i2].setVisibility(0);
                    TextView textView = qa7Var.c[i2];
                    float f4 = 0.0f;
                    if (i2 == 0) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    if (i2 == 1) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    textView.setAlpha(gl.R1(f, f2, qa7Var.e));
                    qa7Var.d[i2].setTranslationX(gl.U1(qa7Var.e, 0, -gl.L(62.0f)));
                    qa7Var.d[i2].setVisibility(0);
                    TextView textView2 = qa7Var.d[i2];
                    if (i2 == 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    if (i2 == 1) {
                        f4 = 1.0f;
                    }
                    textView2.setAlpha(gl.R1(f3, f4, qa7Var.e));
                }
                return;
            case 10:
                ah8 ah8Var = (ah8) obj;
                ah8Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ah8Var.e();
                return;
            case 11:
                ((xg8) obj).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 12:
                nz9 nz9Var = (nz9) obj;
                nz9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nz9Var.invalidate();
                return;
            case 13:
                qfa qfaVar = (qfa) obj;
                qfaVar.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qfaVar.invalidate();
                return;
            case 14:
                ima imaVar = (ima) obj;
                imaVar.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                imaVar.I = true;
                imaVar.invalidate();
                return;
            case 15:
                ((qmb) obj).z0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                wec wecVar = (wec) obj;
                View[] viewArr = wecVar.e;
                if (wecVar.y) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    wecVar.c = abs;
                    mec mecVar = wecVar.N;
                    if (mecVar != null) {
                        mecVar.f(abs, wecVar.d, wecVar.b);
                    }
                }
                wecVar.x(false);
                return;
            default:
                pfc pfcVar = (pfc) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pfcVar.K = floatValue;
                ofc ofcVar = pfcVar.j0;
                if (ofcVar != null) {
                    ((rfc) ofcVar).b.e0.d(pfcVar.Q, floatValue);
                }
                pfcVar.invalidate();
                return;
        }
    }
}
