package lh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.zu0;

public final class t3 extends org.telegram.ui.ActionBar.e3 {

    public final s3 f16844b;

    public ValueAnimator f16845c;
    public o1.j d;

    public Boolean f16846e;

    public Utilities.Callback f16847f;

    public t3(Context context, org.telegram.ui.ActionBar.c6 c6Var, String str, float f10) {
        super(context, c6Var, false, false);
        fixNavigationBar(-14737633);
        s3 s3Var = new s3(UserConfig.selectedAccount, context, new jh.b(), f10, str);
        this.f16844b = s3Var;
        s3Var.C.setVisibility(8);
        s3Var.setMultipleOnClick(false);
        s3Var.setOnBackClickListener(new q3(this, 0));
        s3Var.setOnSelectListener(new ch.c(this, 27));
        zu0 zu0Var = new zu0(context, null);
        this.containerView = zu0Var;
        int i10 = this.backgroundPaddingLeft;
        zu0Var.setPadding(i10, 0, i10, 0);
        this.containerView.addView(s3Var);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return !this.f16844b.f16520w;
    }

    @Override
    public final void dismiss() {
        n(false, new q3(this, 1));
        super.dismiss();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.f16844b.g()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        dismiss();
        return true;
    }

    public final void n(boolean z10, q3 q3Var) {
        s3 s3Var = this.f16844b;
        float translationY = s3Var.getTranslationY();
        float height = z10 ? 0.0f : (this.containerView.getHeight() - s3Var.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
        this.f16846e = Boolean.valueOf(z10);
        if (z10) {
            o1.j jVar = new o1.j(s3Var, o1.h.f19130n, height);
            this.d = jVar;
            jVar.f19147u.a(0.75f);
            this.d.f19147u.b(350.0f);
            this.d.a(new r3(this, height, q3Var));
            this.d.f();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(translationY, height);
        this.f16845c = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new m2(this, 1));
        this.f16845c.addListener(new ag.x1(7, this, q3Var));
        this.f16845c.setDuration(450L);
        this.f16845c.setInterpolator(er.h);
        this.f16845c.start();
    }

    @Override
    public final void show() {
        super.show();
        n(true, null);
    }
}
