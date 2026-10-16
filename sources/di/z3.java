package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.ow0;
public final class z3 extends org.telegram.ui.ActionBar.e3 {
    public final y3 f8179b;
    public ValueAnimator f8180c;
    public o1.k d;
    public Boolean e;
    public Utilities.Callback f8181f;

    public z3(Context context, org.telegram.ui.ActionBar.c6 c6Var, String str, float f7) {
        super(1, context, c6Var, false);
        fixNavigationBar(-14737633);
        y3 y3Var = new y3(UserConfig.selectedAccount, context, new bi.b(), f7, str);
        this.f8179b = y3Var;
        y3Var.G.setVisibility(8);
        y3Var.setMultipleOnClick(false);
        y3Var.setOnBackClickListener(new w3(this, 0));
        y3Var.setOnSelectListener(new ci.u(this, 4));
        ow0 ow0Var = new ow0(context, null);
        this.containerView = ow0Var;
        int i10 = this.backgroundPaddingLeft;
        ow0Var.setPadding(i10, 0, i10, 0);
        this.containerView.addView(y3Var);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return !this.f8179b.f7996w;
    }

    @Override
    public final void dismiss() {
        o(false, new w3(this, 1));
        super.dismiss();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f8179b.g()) {
            dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void o(boolean z10, w3 w3Var) {
        float height;
        y3 y3Var = this.f8179b;
        float translationY = y3Var.getTranslationY();
        if (z10) {
            height = 0.0f;
        } else {
            height = (this.containerView.getHeight() - y3Var.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
        }
        this.e = Boolean.valueOf(z10);
        if (z10) {
            o1.k kVar = new o1.k(y3Var, o1.h.f16144n, height);
            this.d = kVar;
            kVar.f16161u.a(0.75f);
            this.d.f16161u.b(350.0f);
            this.d.a(new x3(this, height, w3Var));
            this.d.h();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.f8180c = ofFloat;
        ofFloat.addUpdateListener(new ah.c0(this, 19));
        this.f8180c.addListener(new bi.t(3, this, w3Var));
        this.f8180c.setDuration(450L);
        this.f8180c.setInterpolator(es.h);
        this.f8180c.start();
    }

    @Override
    public final void show() {
        super.show();
        o(true, null);
    }
}
