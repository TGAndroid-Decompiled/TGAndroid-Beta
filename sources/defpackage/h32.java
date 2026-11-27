package defpackage;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class h32 extends z2b {
    public final byte L = 1;
    public final Object M;

    public h32(tzb tzbVar, Context context, tk4 tk4Var) {
        super(context, tk4Var, 0, null);
        this.M = tzbVar;
    }

    @Override
    public final void e(boolean z, boolean z2) {
        switch (this.L) {
            case 2:
                super.e(z, z2);
                tzb tzbVar = (tzb) this.M;
                uxb uxbVar = tzbVar.n;
                float f = 1.0f;
                if (z2) {
                    ViewPropertyAnimator animate = ((TextView) uxbVar.d).animate();
                    if (z) {
                        f = 0.0f;
                    }
                    animate.alpha(f).start();
                    return;
                }
                ((TextView) uxbVar.d).animate().cancel();
                TextView textView = (TextView) tzbVar.n.d;
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
                return super.getTranslationY() - ((u32) this.M).N;
            default:
                return super.getTranslationY();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.L) {
            case 1:
                z3a z3aVar = ((v3a) this.M).d;
                super.onMeasure(i, ik8.f(z3aVar.e, z3aVar.n - z3aVar.r.getPaddingTop(), 1073741824));
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
                super.setTranslationY(f + ((u32) this.M).N);
                return;
            default:
                super.setTranslationY(f);
                return;
        }
    }

    public h32(int i, x53 x53Var, v3a v3aVar, Context context) {
        super(context, null, i, x53Var);
        this.M = v3aVar;
    }

    public h32(u32 u32Var, Context context, tk4 tk4Var, vnb vnbVar) {
        super(context, tk4Var, 1, vnbVar);
        this.M = u32Var;
    }
}
