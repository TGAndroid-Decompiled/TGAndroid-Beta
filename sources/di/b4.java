package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pr;
public final class b4 extends org.telegram.ui.ActionBar.f3 {
    public final a4 f6970b;
    public ValueAnimator f6971c;
    public o1.k d;
    public Boolean f6972e;
    public Utilities.Callback f6973f;

    public b4(Context context, org.telegram.ui.ActionBar.f6 f6Var, String str, float f7) {
        super(1, context, f6Var, false);
        fixNavigationBar(-14737633);
        a4 a4Var = new a4(UserConfig.selectedAccount, context, new bi.b(), f7, str);
        this.f6970b = a4Var;
        a4Var.G.setVisibility(8);
        a4Var.setMultipleOnClick(false);
        a4Var.setOnBackClickListener(new y3(this, 0));
        a4Var.setOnSelectListener(new ci.u(this, 4));
        ov0 ov0Var = new ov0(context, null);
        this.containerView = ov0Var;
        int i10 = this.backgroundPaddingLeft;
        ov0Var.setPadding(i10, 0, i10, 0);
        this.containerView.addView(a4Var);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return !this.f6970b.f8407w;
    }

    @Override
    public final void dismiss() {
        n(false, new y3(this, 1));
        super.dismiss();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f6970b.g()) {
            dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void n(boolean z10, y3 y3Var) {
        float height;
        a4 a4Var = this.f6970b;
        float translationY = a4Var.getTranslationY();
        if (z10) {
            height = 0.0f;
        } else {
            height = (this.containerView.getHeight() - a4Var.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
        }
        this.f6972e = Boolean.valueOf(z10);
        if (z10) {
            o1.k kVar = new o1.k(a4Var, o1.h.f16834n, height);
            this.d = kVar;
            kVar.f16852u.a(0.75f);
            this.d.f16852u.b(350.0f);
            this.d.a(new z3(this, height, y3Var));
            this.d.f();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.f6971c = ofFloat;
        ofFloat.addUpdateListener(new ah.d0(this, 19));
        this.f6971c.addListener(new bi.t(3, this, y3Var));
        this.f6971c.setDuration(450L);
        this.f6971c.setInterpolator(pr.h);
        this.f6971c.start();
    }

    @Override
    public final void show() {
        super.show();
        n(true, null);
    }
}
