package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qr;
public final class b4 extends org.telegram.ui.ActionBar.f3 {
    public final a4 f4383b;
    public ValueAnimator f4384c;
    public o1.k d;
    public Boolean e;
    public Utilities.Callback f4385f;

    public b4(Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, float f7) {
        super(1, context, e6Var, false);
        fixNavigationBar(-14737633);
        a4 a4Var = new a4(UserConfig.selectedAccount, context, new ai.d(), f7, str);
        this.f4383b = a4Var;
        a4Var.G.setVisibility(8);
        a4Var.setMultipleOnClick(false);
        a4Var.setOnBackClickListener(new y3(this, 0));
        a4Var.setOnSelectListener(new bi.v(this, 4));
        pv0 pv0Var = new pv0(context, null);
        this.containerView = pv0Var;
        int i10 = this.backgroundPaddingLeft;
        pv0Var.setPadding(i10, 0, i10, 0);
        this.containerView.addView(a4Var);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return !this.f4383b.f5744w;
    }

    @Override
    public final void dismiss() {
        n(false, new y3(this, 1));
        super.dismiss();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f4383b.g()) {
            dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void n(boolean z10, y3 y3Var) {
        float height;
        a4 a4Var = this.f4383b;
        float translationY = a4Var.getTranslationY();
        if (z10) {
            height = 0.0f;
        } else {
            height = (this.containerView.getHeight() - a4Var.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
        }
        this.e = Boolean.valueOf(z10);
        if (z10) {
            o1.k kVar = new o1.k(a4Var, o1.h.f15334n, height);
            this.d = kVar;
            kVar.f15351u.a(0.75f);
            this.d.f15351u.b(350.0f);
            this.d.a(new z3(this, height, y3Var));
            this.d.f();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.f4384c = ofFloat;
        ofFloat.addUpdateListener(new ai.a(this, 18));
        this.f4384c.addListener(new ai.z(3, this, y3Var));
        this.f4384c.setDuration(450L);
        this.f4384c.setInterpolator(qr.h);
        this.f4384c.start();
    }

    @Override
    public final void show() {
        super.show();
        n(true, null);
    }
}
