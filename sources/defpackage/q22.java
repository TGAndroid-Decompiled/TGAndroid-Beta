package defpackage;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class q22 extends zya {
    public final byte L = 1;
    public final Object M;

    public q22(qvb qvbVar, Context context, pi4 pi4Var) {
        super(context, pi4Var, 0, null);
        this.M = qvbVar;
    }

    @Override
    public final void e(boolean z, boolean z2) {
        switch (this.L) {
            case 2:
                super.e(z, z2);
                qvb qvbVar = (qvb) this.M;
                ttb ttbVar = qvbVar.n;
                float f = 1.0f;
                if (z2) {
                    ViewPropertyAnimator animate = ((TextView) ttbVar.d).animate();
                    if (z) {
                        f = 0.0f;
                    }
                    animate.alpha(f).start();
                    return;
                }
                ((TextView) ttbVar.d).animate().cancel();
                TextView textView = (TextView) qvbVar.n.d;
                if (z) {
                    f = 0.0f;
                }
                textView.setAlpha(f);
                return;
            default:
                super.e(z, z2);
                return;
        }
    }

    @Override
    public final float getTranslationY() {
        switch (this.L) {
            case 0:
                return super.getTranslationY() - ((d32) this.M).N;
            default:
                return super.getTranslationY();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.L) {
            case 1:
                g0a g0aVar = ((c0a) this.M).d;
                super.onMeasure(i, ug8.f(g0aVar.e, g0aVar.n - g0aVar.r.getPaddingTop(), 1073741824));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void setTranslationY(float f) {
        switch (this.L) {
            case 0:
                super.setTranslationY(f + ((d32) this.M).N);
                return;
            default:
                super.setTranslationY(f);
                return;
        }
    }

    public q22(int i, f53 f53Var, c0a c0aVar, Context context) {
        super(context, null, i, f53Var);
        this.M = c0aVar;
    }

    public q22(d32 d32Var, Context context, pi4 pi4Var, wjb wjbVar) {
        super(context, pi4Var, 1, wjbVar);
        this.M = d32Var;
    }
}
