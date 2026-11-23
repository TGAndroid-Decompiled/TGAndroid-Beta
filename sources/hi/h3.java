package hi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.k10;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.nr;
public final class h3 extends org.telegram.ui.ActionBar.w2 {
    public final g3 f14675m1;
    public ValueAnimator n1;
    public r1.g f14676o1;
    public Boolean f14677p1;
    public y10 f14678q1;

    public h3(Context context, org.telegram.ui.ActionBar.h6 h6Var, String str, float f10) {
        super(1, context, h6Var, false);
        P(-14737633);
        g3 g3Var = new g3(k10.f24932t0, context, new fi.b(), f10, str);
        this.f14675m1 = g3Var;
        g3Var.H.setVisibility(8);
        g3Var.setMultipleOnClick(false);
        g3Var.setOnBackClickListener(new e3(this, 0));
        g3Var.setOnSelectListener(new bi.b(this, 27));
        du0 du0Var = new du0(context, null);
        this.f30142b = du0Var;
        int i7 = this.f30177u0;
        du0Var.setPadding(i7, 0, i7, 0);
        this.f30142b.addView(g3Var);
    }

    @Override
    public final boolean G() {
        return !this.f14675m1.f14352x;
    }

    public final void K0(boolean z10, e3 e3Var) {
        float height;
        g3 g3Var = this.f14675m1;
        float translationY = g3Var.getTranslationY();
        if (z10) {
            height = 0.0f;
        } else {
            height = (this.f30142b.getHeight() - g3Var.g()) + (org.telegram.messenger.g0.f24005n * 2.5f);
        }
        this.f14677p1 = Boolean.valueOf(z10);
        if (z10) {
            r1.g gVar = new r1.g(g3Var, r1.g.f56317p, height);
            this.f14676o1 = gVar;
            gVar.f56333m.a(0.75f);
            this.f14676o1.f56333m.b(350.0f);
            this.f14676o1.a(new f3(this, height, e3Var));
            this.f14676o1.h();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.n1 = ofFloat;
        ofFloat.addUpdateListener(new ah.g(this, 29));
        this.n1.addListener(new ah.l(5, this, e3Var));
        this.n1.setDuration(450L);
        this.n1.setInterpolator(nr.h);
        this.n1.start();
    }

    @Override
    public final void dismiss() {
        K0(false, new e3(this, 1));
        super.dismiss();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f14675m1.g()) {
            dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void show() {
        super.show();
        K0(true, null);
    }
}
