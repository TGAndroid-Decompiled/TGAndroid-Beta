package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.xq;
public final class j3 extends org.telegram.ui.ActionBar.v2 {
    public final i3 f12221i1;
    public ValueAnimator f12222j1;
    public r1.g f12223k1;
    public Boolean l1;
    public c20 f12224m1;

    public j3(Context context, org.telegram.ui.ActionBar.f6 f6Var, String str, float f10) {
        super(1, context, f6Var, false);
        O(-14737633);
        i3 i3Var = new i3(p10.f24470s0, context, new di.b(), f10, str);
        this.f12221i1 = i3Var;
        i3Var.G.setVisibility(8);
        i3Var.setMultipleOnClick(false);
        i3Var.setOnBackClickListener(new g3(this, 0));
        i3Var.setOnSelectListener(new ai.e(this, 18));
        rt0 rt0Var = new rt0(context, null);
        this.f28619b = rt0Var;
        int i7 = this.f28649t0;
        rt0Var.setPadding(i7, 0, i7, 0);
        this.f28619b.addView(i3Var);
    }

    @Override
    public final boolean G() {
        return !this.f12221i1.f11974x;
    }

    public final void J0(boolean z9, g3 g3Var) {
        float height;
        i3 i3Var = this.f12221i1;
        float translationY = i3Var.getTranslationY();
        if (z9) {
            height = 0.0f;
        } else {
            height = (this.f28619b.getHeight() - i3Var.g()) + (org.telegram.messenger.g0.f22558n * 2.5f);
        }
        this.l1 = Boolean.valueOf(z9);
        if (z9) {
            r1.g gVar = new r1.g(i3Var, r1.g.f54251p, height);
            this.f12223k1 = gVar;
            gVar.f54267m.a(0.75f);
            this.f12223k1.f54267m.b(350.0f);
            this.f12223k1.a(new h3(this, height, g3Var));
            this.f12223k1.h();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.f12222j1 = ofFloat;
        ofFloat.addUpdateListener(new ah.h(this, 28));
        this.f12222j1.addListener(new ah.l(5, this, g3Var));
        this.f12222j1.setDuration(450L);
        this.f12222j1.setInterpolator(xq.h);
        this.f12222j1.start();
    }

    @Override
    public final void dismiss() {
        J0(false, new g3(this, 1));
        super.dismiss();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f12221i1.g()) {
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
