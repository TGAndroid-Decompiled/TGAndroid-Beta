package gi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.h10;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.xq;
public final class h3 extends org.telegram.ui.ActionBar.t2 {
    public final g3 f12871j1;
    public ValueAnimator k1;
    public q1.g f12872l1;
    public Boolean m1;
    public u10 f12873n1;

    public h3(Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, float f10) {
        super(1, context, e6Var, false);
        O(-14737633);
        g3 g3Var = new g3(h10.f22829t0, context, new ei.b(), f10, str);
        this.f12871j1 = g3Var;
        g3Var.H.setVisibility(8);
        g3Var.setMultipleOnClick(false);
        g3Var.setOnBackClickListener(new e3(this, 0));
        g3Var.setOnSelectListener(new ai.c(this, 28));
        qt0 qt0Var = new qt0(context, null);
        this.f28586b = qt0Var;
        int i3 = this.f28618u0;
        qt0Var.setPadding(i3, 0, i3, 0);
        this.f28586b.addView(g3Var);
    }

    @Override
    public final boolean G() {
        return !this.f12871j1.f12578x;
    }

    public final void J0(boolean z10, e3 e3Var) {
        float height;
        g3 g3Var = this.f12871j1;
        float translationY = g3Var.getTranslationY();
        if (z10) {
            height = 0.0f;
        } else {
            height = (this.f28586b.getHeight() - g3Var.g()) + (org.telegram.messenger.g0.f22603n * 2.5f);
        }
        this.m1 = Boolean.valueOf(z10);
        if (z10) {
            q1.g gVar = new q1.g(g3Var, q1.g.f53637p, height);
            this.f12872l1 = gVar;
            gVar.f53653m.a(0.75f);
            this.f12872l1.f53653m.b(350.0f);
            this.f12872l1.a(new f3(this, height, e3Var));
            this.f12872l1.h();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.k1 = ofFloat;
        ofFloat.addUpdateListener(new bh.f(this, 29));
        this.k1.addListener(new bh.j(5, this, e3Var));
        this.k1.setDuration(450L);
        this.k1.setInterpolator(xq.h);
        this.k1.start();
    }

    @Override
    public final void dismiss() {
        J0(false, new e3(this, 1));
        super.dismiss();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f12871j1.g()) {
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
