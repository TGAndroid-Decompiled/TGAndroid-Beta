package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.qr;
public final class b4 extends org.telegram.ui.ActionBar.f3 {
    public final a4 f4389b;
    public ValueAnimator f4390c;
    public o1.k d;
    public Boolean e;
    public Utilities.Callback f4391f;

    public b4(Context context, org.telegram.ui.ActionBar.f6 f6Var, String str, float f7) {
        super(1, context, f6Var, false);
        fixNavigationBar(-14737633);
        a4 a4Var = new a4(UserConfig.selectedAccount, context, new ai.d(), f7, str);
        this.f4389b = a4Var;
        a4Var.G.setVisibility(8);
        a4Var.setMultipleOnClick(false);
        a4Var.setOnBackClickListener(new y3(this, 0));
        a4Var.setOnSelectListener(new bi.v(this, 4));
        aw0 aw0Var = new aw0(context, null);
        this.containerView = aw0Var;
        int i10 = this.backgroundPaddingLeft;
        aw0Var.setPadding(i10, 0, i10, 0);
        this.containerView.addView(a4Var);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return !this.f4389b.f5750w;
    }

    @Override
    public final void dismiss() {
        n(false, new y3(this, 1));
        super.dismiss();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f4389b.g()) {
            dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void n(boolean z10, y3 y3Var) {
        float height;
        a4 a4Var = this.f4389b;
        float translationY = a4Var.getTranslationY();
        if (z10) {
            height = 0.0f;
        } else {
            height = (this.containerView.getHeight() - a4Var.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
        }
        this.e = Boolean.valueOf(z10);
        if (z10) {
            o1.k kVar = new o1.k(a4Var, o1.h.f15505n, height);
            this.d = kVar;
            kVar.f15522u.a(0.75f);
            this.d.f15522u.b(350.0f);
            this.d.a(new z3(this, height, y3Var));
            this.d.f();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.f4390c = ofFloat;
        ofFloat.addUpdateListener(new ai.a(this, 18));
        this.f4390c.addListener(new ai.z(3, this, y3Var));
        this.f4390c.setDuration(450L);
        this.f4390c.setInterpolator(qr.h);
        this.f4390c.start();
    }

    @Override
    public final void show() {
        super.show();
        n(true, null);
    }
}
