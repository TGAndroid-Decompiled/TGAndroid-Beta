package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mt;
public final class r5 extends mt {
    public final org.telegram.ui.Components.f5 f4037e2;
    public int f4038f2;
    public final org.telegram.ui.Components.m6 f4039g2;
    public final q6 f4040h2;

    public r5(q6 q6Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.f4040h2 = q6Var;
        this.f4037e2 = new org.telegram.ui.Components.f5(this);
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, true, true);
        this.f4039g2 = m6Var;
        m6Var.n(0.2f, 160L, lr.h);
        m6Var.w(org.telegram.messenger.g0.L(15.33f));
        m6Var.setCallback(this);
        m6Var.f37377b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        if (this.f4038f2 < 0) {
            i7 = org.telegram.ui.ActionBar.n6.f29617p7;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.P5;
        }
        int a10 = this.f4037e2.a(org.telegram.ui.ActionBar.n6.w0(i7, this.f4040h2.f4007f), false);
        org.telegram.ui.Components.m6 m6Var = this.f4039g2;
        m6Var.u(a10);
        m6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        m6Var.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        org.telegram.ui.Components.m6 m6Var = this.f4039g2;
        if (m6Var != null) {
            this.f4038f2 = 12 - charSequence.length();
            m6Var.a();
            String str = "";
            if (this.f4038f2 <= 4) {
                str = "" + this.f4038f2;
            }
            m6Var.t(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f4039g2 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
