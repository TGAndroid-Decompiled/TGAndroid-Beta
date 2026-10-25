package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import bi.ce;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.vw0;
public final class s3 extends org.telegram.ui.ActionBar.k3 {
    public final r3 f11581b;
    public ValueAnimator f11582c;
    public o1.j d;
    public Boolean e;
    public Utilities.Callback f11583f;

    public s3(Context context, org.telegram.ui.ActionBar.u6 u6Var, String str, float f7) {
        super(1, context, u6Var, false);
        fixNavigationBar(-14737633);
        r3 r3Var = new r3(UserConfig.selectedAccount, context, new di.b(), f7, str);
        this.f11581b = r3Var;
        r3Var.G.setVisibility(8);
        r3Var.setMultipleOnClick(false);
        r3Var.setOnBackClickListener(new p3(this, 0));
        r3Var.setOnSelectListener(new ai.e(this, 18));
        vw0 vw0Var = new vw0(context, null);
        this.containerView = vw0Var;
        int i10 = this.backgroundPaddingLeft;
        vw0Var.setPadding(i10, 0, i10, 0);
        this.containerView.addView(r3Var);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return !this.f11581b.f11352w;
    }

    @Override
    public final void dismiss() {
        n(false, new p3(this, 1));
        super.dismiss();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f11581b.g()) {
            dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void n(boolean z10, p3 p3Var) {
        float height;
        r3 r3Var = this.f11581b;
        float translationY = r3Var.getTranslationY();
        if (z10) {
            height = 0.0f;
        } else {
            height = (this.containerView.getHeight() - r3Var.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
        }
        this.e = Boolean.valueOf(z10);
        if (z10) {
            o1.j jVar = new o1.j(r3Var, o1.h.f18953n, height);
            this.d = jVar;
            jVar.f18969u.a(0.75f);
            this.d.f18969u.b(350.0f);
            this.d.a(new q3(this, height, p3Var));
            this.d.h();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.f11582c = ofFloat;
        ofFloat.addUpdateListener(new ai.g0(this, 28));
        this.f11582c.addListener(new ce(4, this, p3Var));
        this.f11582c.setDuration(450L);
        this.f11582c.setInterpolator(ds.h);
        this.f11582c.start();
    }

    @Override
    public final void show() {
        super.show();
        n(true, null);
    }
}
