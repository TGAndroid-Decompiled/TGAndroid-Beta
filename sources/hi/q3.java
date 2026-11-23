package hi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.i10;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.kr;
public final class q3 extends org.telegram.ui.ActionBar.w2 {
    public final p3 f15215m1;
    public ValueAnimator n1;
    public r1.g f15216o1;
    public Boolean f15217p1;
    public w10 f15218q1;

    public q3(Context context, org.telegram.ui.ActionBar.i6 i6Var, String str, float f10) {
        super(1, context, i6Var, false);
        P(-14737633);
        p3 p3Var = new p3(i10.f24637t0, context, new fi.b(), f10, str);
        this.f15215m1 = p3Var;
        p3Var.H.setVisibility(8);
        p3Var.setMultipleOnClick(false);
        p3Var.setOnBackClickListener(new n3(this, 0));
        p3Var.setOnSelectListener(new bi.b(this, 27));
        cu0 cu0Var = new cu0(context, null);
        this.f30226b = cu0Var;
        int i7 = this.f30261u0;
        cu0Var.setPadding(i7, 0, i7, 0);
        this.f30226b.addView(p3Var);
    }

    @Override
    public final boolean F() {
        return !this.f15215m1.f14906x;
    }

    public final void K0(boolean z10, n3 n3Var) {
        float height;
        p3 p3Var = this.f15215m1;
        float translationY = p3Var.getTranslationY();
        if (z10) {
            height = 0.0f;
        } else {
            height = (this.f30226b.getHeight() - p3Var.g()) + (org.telegram.messenger.g0.f24221n * 2.5f);
        }
        this.f15217p1 = Boolean.valueOf(z10);
        if (z10) {
            r1.g gVar = new r1.g(p3Var, r1.g.f56430p, height);
            this.f15216o1 = gVar;
            gVar.f56446m.a(0.75f);
            this.f15216o1.f56446m.b(350.0f);
            this.f15216o1.a(new o3(this, height, n3Var));
            this.f15216o1.h();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.n1 = ofFloat;
        ofFloat.addUpdateListener(new ah.g(this, 29));
        this.n1.addListener(new ah.l(5, this, n3Var));
        this.n1.setDuration(450L);
        this.n1.setInterpolator(kr.h);
        this.n1.start();
    }

    @Override
    public final void dismiss() {
        K0(false, new n3(this, 1));
        super.dismiss();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f15215m1.g()) {
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
