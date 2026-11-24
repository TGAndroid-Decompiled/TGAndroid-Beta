package defpackage;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
public final class u7b implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final m8b b;

    public u7b(m8b m8bVar, byte b) {
        this.a = b;
        this.b = m8bVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        y28 currentPeerView;
        byte b = this.a;
        m8b m8bVar = this.b;
        switch (b) {
            case 0:
                m8bVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m8bVar.l();
                a8b a8bVar = m8bVar.s;
                if (a8bVar != null) {
                    a8bVar.invalidate();
                }
                t76 t76Var = m8bVar.B0;
                if (t76Var != null) {
                    t76Var.F((1.0f - m8bVar.W) * m8bVar.V);
                    return;
                }
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m8bVar.V = floatValue;
                b8b b8bVar = m8bVar.w;
                if (b8bVar != null && floatValue > 0.6f && qg5.c && b8bVar.a) {
                    b8bVar.a(false);
                }
                t76 t76Var2 = m8bVar.B0;
                if (t76Var2 != null) {
                    t76Var2.F((1.0f - m8bVar.W) * m8bVar.V);
                }
                m8bVar.l();
                a8b a8bVar2 = m8bVar.s;
                if (a8bVar2 != null) {
                    a8bVar2.invalidate();
                    return;
                }
                return;
            case 2:
                m8bVar.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m8bVar.e0 = Utilities.i(m8bVar.a0 / gl.L(200.0f), 1.0f, 0.0f);
                c8b c8bVar = m8bVar.o0;
                if (c8bVar == null) {
                    currentPeerView = null;
                } else {
                    currentPeerView = c8bVar.getCurrentPeerView();
                }
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    return;
                }
                return;
            default:
                m8bVar.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m8bVar.w.invalidate();
                return;
        }
    }
}
