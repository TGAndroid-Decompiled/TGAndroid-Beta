package hi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.m10;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.st0;
public final class h3 extends org.telegram.ui.ActionBar.u2 {
    public final g3 f14368m1;
    public ValueAnimator n1;
    public r1.g f14369o1;
    public Boolean f14370p1;
    public z10 f14371q1;

    public h3(Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, float f10) {
        super(1, context, e6Var, false);
        P(-14737633);
        g3 g3Var = new g3(m10.f24940t0, context, new fi.b(), f10, str);
        this.f14368m1 = g3Var;
        g3Var.H.setVisibility(8);
        g3Var.setMultipleOnClick(false);
        g3Var.setOnBackClickListener(new e3(this, 0));
        g3Var.setOnSelectListener(new bi.b(this, 28));
        st0 st0Var = new st0(context, null);
        this.f29682b = st0Var;
        int i7 = this.f29717u0;
        st0Var.setPadding(i7, 0, i7, 0);
        this.f29682b.addView(g3Var);
    }

    @Override
    public final boolean H() {
        return !this.f14368m1.f14118x;
    }

    public final void J0(boolean z10, e3 e3Var) {
        float height;
        g3 g3Var = this.f14368m1;
        float translationY = g3Var.getTranslationY();
        if (z10) {
            height = 0.0f;
        } else {
            height = (this.f29682b.getHeight() - g3Var.g()) + (org.telegram.messenger.g0.f23606n * 2.5f);
        }
        this.f14370p1 = Boolean.valueOf(z10);
        if (z10) {
            r1.g gVar = new r1.g(g3Var, r1.g.f55732p, height);
            this.f14369o1 = gVar;
            gVar.f55748m.a(0.75f);
            this.f14369o1.f55748m.b(350.0f);
            this.f14369o1.a(new f3(this, height, e3Var));
            this.f14369o1.h();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.n1 = ofFloat;
        ofFloat.addUpdateListener(new ah.h(this, 29));
        this.n1.addListener(new ah.l(5, this, e3Var));
        this.n1.setDuration(450L);
        this.n1.setInterpolator(er.h);
        this.n1.start();
    }

    @Override
    public final void dismiss() {
        J0(false, new e3(this, 1));
        super.dismiss();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f14368m1.g()) {
            dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void show() {
        super.show();
        J0(true, null);
    }
}
