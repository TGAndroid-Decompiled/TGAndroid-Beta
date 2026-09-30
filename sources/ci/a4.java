package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.tr;
public final class a4 extends org.telegram.ui.ActionBar.e3 {
    public final z3 f4346b;
    public ValueAnimator f4347c;
    public o1.k d;
    public Boolean e;
    public Utilities.Callback f4348f;

    public a4(Context context, org.telegram.ui.ActionBar.d6 d6Var, String str, float f7) {
        super(1, context, d6Var, false);
        fixNavigationBar(-14737633);
        z3 z3Var = new z3(UserConfig.selectedAccount, context, new ai.d(), f7, str);
        this.f4346b = z3Var;
        z3Var.G.setVisibility(8);
        z3Var.setMultipleOnClick(false);
        z3Var.setOnBackClickListener(new x3(this, 0));
        z3Var.setOnSelectListener(new bi.v(this, 4));
        dw0 dw0Var = new dw0(context, null);
        this.containerView = dw0Var;
        int i10 = this.backgroundPaddingLeft;
        dw0Var.setPadding(i10, 0, i10, 0);
        this.containerView.addView(z3Var);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return !this.f4346b.f5732w;
    }

    @Override
    public final void dismiss() {
        n(false, new x3(this, 1));
        super.dismiss();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f4346b.g()) {
            dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void n(boolean z10, x3 x3Var) {
        float height;
        z3 z3Var = this.f4346b;
        float translationY = z3Var.getTranslationY();
        if (z10) {
            height = 0.0f;
        } else {
            height = (this.containerView.getHeight() - z3Var.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
        }
        this.e = Boolean.valueOf(z10);
        if (z10) {
            o1.k kVar = new o1.k(z3Var, o1.h.f15532n, height);
            this.d = kVar;
            kVar.f15549u.a(0.75f);
            this.d.f15549u.b(350.0f);
            this.d.a(new y3(this, height, x3Var));
            this.d.f();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.f4347c = ofFloat;
        ofFloat.addUpdateListener(new ai.a(this, 18));
        this.f4347c.addListener(new ai.z(3, this, x3Var));
        this.f4347c.setDuration(450L);
        this.f4347c.setInterpolator(tr.h);
        this.f4347c.start();
    }

    @Override
    public final void show() {
        super.show();
        n(true, null);
    }
}
