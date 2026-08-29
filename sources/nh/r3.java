package nh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.jr;
public final class r3 extends org.telegram.ui.ActionBar.f3 {
    public final q3 f18508b;
    public ValueAnimator f18509c;
    public o1.k d;
    public Boolean f18510e;
    public Utilities.Callback f18511f;

    public r3(Context context, org.telegram.ui.ActionBar.c6 c6Var, String str, float f9) {
        super(context, c6Var, false, false);
        fixNavigationBar(-14737633);
        q3 q3Var = new q3(UserConfig.selectedAccount, context, new lh.b(), f9, str);
        this.f18508b = q3Var;
        q3Var.C.setVisibility(8);
        q3Var.setMultipleOnClick(false);
        q3Var.setOnBackClickListener(new o3(this, 0));
        q3Var.setOnSelectListener(new bg.t1(this, 28));
        hv0 hv0Var = new hv0(context, null);
        this.containerView = hv0Var;
        int i10 = this.backgroundPaddingLeft;
        hv0Var.setPadding(i10, 0, i10, 0);
        this.containerView.addView(q3Var);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return !this.f18508b.f18180w;
    }

    @Override
    public final void dismiss() {
        n(false, new o3(this, 1));
        super.dismiss();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f18508b.g()) {
            dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void n(boolean z10, o3 o3Var) {
        float height;
        q3 q3Var = this.f18508b;
        float translationY = q3Var.getTranslationY();
        if (z10) {
            height = 0.0f;
        } else {
            height = (this.containerView.getHeight() - q3Var.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
        }
        this.f18510e = Boolean.valueOf(z10);
        if (z10) {
            o1.k kVar = new o1.k(q3Var, o1.i.f19028n, height);
            this.d = kVar;
            kVar.f19045u.a(0.75f);
            this.d.f19045u.b(350.0f);
            this.d.a(new p3(this, height, o3Var));
            this.d.f();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.f18509c = ofFloat;
        ofFloat.addUpdateListener(new lh.d5(this, 7));
        this.f18509c.addListener(new bg.c3(8, this, o3Var));
        this.f18509c.setDuration(450L);
        this.f18509c.setInterpolator(jr.h);
        this.f18509c.start();
    }

    @Override
    public final void show() {
        super.show();
        n(true, null);
    }
}
