package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.yw0;
public final class z3 extends org.telegram.ui.ActionBar.e3 {
    public final y3 f6414b;
    public ValueAnimator f6415c;
    public o1.k d;
    public Boolean f6416e;
    public Utilities.Callback f6417f;

    public z3(Context context, org.telegram.ui.ActionBar.c6 c6Var, String str, float f7) {
        super(1, context, c6Var, false);
        fixNavigationBar(-14737633);
        y3 y3Var = new y3(UserConfig.selectedAccount, context, new ai.d(), f7, str);
        this.f6414b = y3Var;
        y3Var.G.setVisibility(8);
        y3Var.setMultipleOnClick(false);
        y3Var.setOnBackClickListener(new w3(this, 0));
        y3Var.setOnSelectListener(new bi.v(this, 4));
        yw0 yw0Var = new yw0(context, null);
        this.containerView = yw0Var;
        int i10 = this.backgroundPaddingLeft;
        yw0Var.setPadding(i10, 0, i10, 0);
        this.containerView.addView(y3Var);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return !this.f6414b.f6143w;
    }

    @Override
    public final void dismiss() {
        p(false, new w3(this, 1));
        super.dismiss();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f6414b.g()) {
            dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void p(boolean z10, w3 w3Var) {
        float height;
        y3 y3Var = this.f6414b;
        float translationY = y3Var.getTranslationY();
        if (z10) {
            height = 0.0f;
        } else {
            height = (this.containerView.getHeight() - y3Var.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
        }
        this.f6416e = Boolean.valueOf(z10);
        if (z10) {
            o1.k kVar = new o1.k(y3Var, o1.h.f16673n, height);
            this.d = kVar;
            kVar.f16691u.a(0.75f);
            this.d.f16691u.b(350.0f);
            this.d.a(new x3(this, height, w3Var));
            this.d.h();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.f6415c = ofFloat;
        ofFloat.addUpdateListener(new ai.a(this, 18));
        this.f6415c.addListener(new ai.z(3, this, w3Var));
        this.f6415c.setDuration(450L);
        this.f6415c.setInterpolator(js.h);
        this.f6415c.start();
    }

    @Override
    public final void show() {
        super.show();
        p(true, null);
    }
}
