package ei;

import ai.me;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.jw0;
public final class u3 extends org.telegram.ui.ActionBar.f3 {
    public final t3 f9886b;
    public ValueAnimator f9887c;
    public o1.k d;
    public Boolean e;
    public Utilities.Callback f9888f;

    public u3(Context context, org.telegram.ui.ActionBar.d6 d6Var, String str, float f7) {
        super(1, context, d6Var, false);
        fixNavigationBar(-14737633);
        t3 t3Var = new t3(UserConfig.selectedAccount, context, new ci.b(), f7, str);
        this.f9886b = t3Var;
        t3Var.G.setVisibility(8);
        t3Var.setMultipleOnClick(false);
        t3Var.setOnBackClickListener(new r3(this, 0));
        t3Var.setOnSelectListener(new ai.q(this, 15));
        jw0 jw0Var = new jw0(context, null);
        this.containerView = jw0Var;
        int i10 = this.backgroundPaddingLeft;
        jw0Var.setPadding(i10, 0, i10, 0);
        this.containerView.addView(t3Var);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return !this.f9886b.f9638w;
    }

    @Override
    public final void dismiss() {
        o(false, new r3(this, 1));
        super.dismiss();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f9886b.g()) {
            dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void o(boolean z10, r3 r3Var) {
        float height;
        t3 t3Var = this.f9886b;
        float translationY = t3Var.getTranslationY();
        if (z10) {
            height = 0.0f;
        } else {
            height = (this.containerView.getHeight() - t3Var.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
        }
        this.e = Boolean.valueOf(z10);
        if (z10) {
            o1.k kVar = new o1.k(t3Var, o1.h.f17541n, height);
            this.d = kVar;
            kVar.f17558u.a(0.75f);
            this.d.f17558u.b(350.0f);
            this.d.a(new s3(this, height, r3Var));
            this.d.h();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.f9887c = ofFloat;
        ofFloat.addUpdateListener(new ah.c0(this, 26));
        this.f9887c.addListener(new me(4, this, r3Var));
        this.f9887c.setDuration(450L);
        this.f9887c.setInterpolator(bs.h);
        this.f9887c.start();
    }

    @Override
    public final void show() {
        super.show();
        o(true, null);
    }
}
