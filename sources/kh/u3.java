package kh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.xu0;
public final class u3 extends org.telegram.ui.ActionBar.f3 {
    public final t3 f16138b;
    public ValueAnimator f16139c;
    public o1.j d;
    public Boolean f16140e;
    public Utilities.Callback f16141f;

    public u3(Context context, org.telegram.ui.ActionBar.b6 b6Var, String str, float f10) {
        super(context, b6Var, false, false);
        fixNavigationBar(-14737633);
        t3 t3Var = new t3(UserConfig.selectedAccount, context, new ih.b(), f10, str);
        this.f16138b = t3Var;
        t3Var.C.setVisibility(8);
        t3Var.setMultipleOnClick(false);
        t3Var.setOnBackClickListener(new r3(this, 0));
        t3Var.setOnSelectListener(new bh.c(this, 27));
        xu0 xu0Var = new xu0(context, null);
        this.containerView = xu0Var;
        int i9 = this.backgroundPaddingLeft;
        xu0Var.setPadding(i9, 0, i9, 0);
        this.containerView.addView(t3Var);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return !this.f16138b.f15871w;
    }

    @Override
    public final void dismiss() {
        n(false, new r3(this, 1));
        super.dismiss();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f16138b.g()) {
            dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void n(boolean z10, r3 r3Var) {
        float height;
        t3 t3Var = this.f16138b;
        float translationY = t3Var.getTranslationY();
        if (z10) {
            height = 0.0f;
        } else {
            height = (this.containerView.getHeight() - t3Var.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
        }
        this.f16140e = Boolean.valueOf(z10);
        if (z10) {
            o1.j jVar = new o1.j(t3Var, o1.h.f18783n, height);
            this.d = jVar;
            jVar.f18800u.a(0.75f);
            this.d.f18800u.b(350.0f);
            this.d.a(new s3(this, height, r3Var));
            this.d.f();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.f16139c = ofFloat;
        ofFloat.addUpdateListener(new bg.b(this, 28));
        this.f16139c.addListener(new fg.j(5, this, r3Var));
        this.f16139c.setDuration(450L);
        this.f16139c.setInterpolator(gr.h);
        this.f16139c.start();
    }

    @Override
    public final void show() {
        super.show();
        n(true, null);
    }
}
