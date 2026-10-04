package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.tr;
public final class a4 extends org.telegram.ui.ActionBar.f3 {
    public final z3 f4691b;
    public ValueAnimator f4692c;
    public o1.k d;
    public Boolean f4693e;
    public Utilities.Callback f4694f;

    public a4(Context context, org.telegram.ui.ActionBar.d6 d6Var, String str, float f7) {
        super(1, context, d6Var, false);
        fixNavigationBar(-14737633);
        z3 z3Var = new z3(UserConfig.selectedAccount, context, new ai.d(), f7, str);
        this.f4691b = z3Var;
        z3Var.G.setVisibility(8);
        z3Var.setMultipleOnClick(false);
        z3Var.setOnBackClickListener(new x3(this, 0));
        z3Var.setOnSelectListener(new bi.v(this, 4));
        lw0 lw0Var = new lw0(context, null);
        this.containerView = lw0Var;
        int i10 = this.backgroundPaddingLeft;
        lw0Var.setPadding(i10, 0, i10, 0);
        this.containerView.addView(z3Var);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return !this.f4691b.f6224w;
    }

    @Override
    public final void dismiss() {
        n(false, new x3(this, 1));
        super.dismiss();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f4691b.g()) {
            dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void n(boolean z10, x3 x3Var) {
        float height;
        z3 z3Var = this.f4691b;
        float translationY = z3Var.getTranslationY();
        if (z10) {
            height = 0.0f;
        } else {
            height = (this.containerView.getHeight() - z3Var.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
        }
        this.f4693e = Boolean.valueOf(z10);
        if (z10) {
            o1.k kVar = new o1.k(z3Var, o1.h.f16966n, height);
            this.d = kVar;
            kVar.f16984u.a(0.75f);
            this.d.f16984u.b(350.0f);
            this.d.a(new y3(this, height, x3Var));
            this.d.f();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.f4692c = ofFloat;
        ofFloat.addUpdateListener(new ai.a(this, 18));
        this.f4692c.addListener(new ai.z(3, this, x3Var));
        this.f4692c.setDuration(450L);
        this.f4692c.setInterpolator(tr.h);
        this.f4692c.start();
    }

    @Override
    public final void show() {
        super.show();
        n(true, null);
    }
}
