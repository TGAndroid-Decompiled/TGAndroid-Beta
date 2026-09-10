package bi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.wr;
public final class t4 extends org.telegram.ui.ActionBar.h3 {
    public final s4 f3674b;
    public ValueAnimator f3675c;
    public o1.k d;
    public Boolean e;
    public Utilities.Callback f3676f;

    public t4(Context context, org.telegram.ui.ActionBar.f6 f6Var, String str, float f7) {
        super(1, context, f6Var, false);
        fixNavigationBar(-14737633);
        s4 s4Var = new s4(UserConfig.selectedAccount, context, new zh.b(), f7, str);
        this.f3674b = s4Var;
        s4Var.G.setVisibility(8);
        s4Var.setMultipleOnClick(false);
        s4Var.setOnBackClickListener(new q4(this, 0));
        s4Var.setOnSelectListener(new ai.c0(this, 4));
        aw0 aw0Var = new aw0(context, null);
        this.containerView = aw0Var;
        int i10 = this.backgroundPaddingLeft;
        aw0Var.setPadding(i10, 0, i10, 0);
        this.containerView.addView(s4Var);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return !this.f3674b.f3384w;
    }

    @Override
    public final void dismiss() {
        n(false, new q4(this, 1));
        super.dismiss();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f3674b.g()) {
            dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void n(boolean z10, q4 q4Var) {
        float height;
        s4 s4Var = this.f3674b;
        float translationY = s4Var.getTranslationY();
        if (z10) {
            height = 0.0f;
        } else {
            height = (this.containerView.getHeight() - s4Var.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
        }
        this.e = Boolean.valueOf(z10);
        if (z10) {
            o1.k kVar = new o1.k(s4Var, o1.h.f14117n, height);
            this.d = kVar;
            kVar.f14134u.a(0.75f);
            this.d.f14134u.b(350.0f);
            this.d.a(new r4(this, height, q4Var));
            this.d.f();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
        this.f3675c = ofFloat;
        ofFloat.addUpdateListener(new ai.a(this, 4));
        this.f3675c.addListener(new u3(1, this, q4Var));
        this.f3675c.setDuration(450L);
        this.f3675c.setInterpolator(wr.h);
        this.f3675c.start();
    }

    @Override
    public final void show() {
        super.show();
        n(true, null);
    }
}
