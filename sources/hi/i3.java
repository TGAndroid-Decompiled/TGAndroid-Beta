package hi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.j10;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.lr;
public final class i3 extends org.telegram.ui.ActionBar.x2 {
    public final h3 f14754m1;
    public ValueAnimator n1;
    public r1.g f14755o1;
    public Boolean f14756p1;
    public x10 f14757q1;

    public i3(Context context, org.telegram.ui.ActionBar.i6 i6Var, String str, float f10) {
        super(1, context, i6Var, false);
        P(-14737633);
        h3 h3Var = new h3(j10.f24770t0, context, new fi.b(), f10, str);
        this.f14754m1 = h3Var;
        h3Var.H.setVisibility(8);
        h3Var.setMultipleOnClick(false);
        h3Var.setOnBackClickListener(new f3(this, 0));
        h3Var.setOnSelectListener(new bi.b(this, 27));
        au0 au0Var = new au0(context, null);
        this.f30190b = au0Var;
        int i7 = this.f30225u0;
        au0Var.setPadding(i7, 0, i7, 0);
        this.f30190b.addView(h3Var);
    }

    @Override
    public final boolean G() {
        return !this.f14754m1.f14552x;
    }

    public final void K0(boolean z10, f3 f3Var) {
        float height;
        h3 h3Var = this.f14754m1;
        float translationY = h3Var.getTranslationY();
        if (z10) {
            height = 0.0f;
        } else {
            height = (this.f30190b.getHeight() - h3Var.g()) + (org.telegram.messenger.g0.f24113n * 2.5f);
        }
        this.f14756p1 = Boolean.valueOf(z10);
        if (z10) {
            r1.g gVar = new r1.g(h3Var, r1.g.f56307p, height);
            this.f14755o1 = gVar;
            gVar.f56323m.a(0.75f);
            this.f14755o1.f56323m.b(350.0f);
            this.f14755o1.a(new g3(this, height, f3Var));
            this.f14755o1.h();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.n1 = ofFloat;
        ofFloat.addUpdateListener(new ah.g(this, 29));
        this.n1.addListener(new ah.l(5, this, f3Var));
        this.n1.setDuration(450L);
        this.n1.setInterpolator(lr.h);
        this.n1.start();
    }

    @Override
    public final void dismiss() {
        K0(false, new f3(this, 1));
        super.dismiss();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f14754m1.g()) {
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
