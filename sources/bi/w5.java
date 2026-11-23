package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.ot;
public final class w5 extends ot {
    public final org.telegram.ui.Components.g5 f4181e2;
    public int f4182f2;
    public final org.telegram.ui.Components.n6 f4183g2;
    public final v6 f4184h2;

    public w5(v6 v6Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.f4184h2 = v6Var;
        this.f4181e2 = new org.telegram.ui.Components.g5(this);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true);
        this.f4183g2 = n6Var;
        n6Var.n(0.2f, 160L, nr.h);
        n6Var.w(org.telegram.messenger.g0.L(15.33f));
        n6Var.setCallback(this);
        n6Var.f37751b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        if (this.f4182f2 < 0) {
            i7 = org.telegram.ui.ActionBar.m6.f29568p7;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.P5;
        }
        int a10 = this.f4181e2.a(org.telegram.ui.ActionBar.m6.w0(i7, this.f4184h2.f4152f), false);
        org.telegram.ui.Components.n6 n6Var = this.f4183g2;
        n6Var.u(a10);
        n6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        n6Var.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        org.telegram.ui.Components.n6 n6Var = this.f4183g2;
        if (n6Var != null) {
            this.f4182f2 = 12 - charSequence.length();
            n6Var.a();
            String str = "";
            if (this.f4182f2 <= 4) {
                str = "" + this.f4182f2;
            }
            n6Var.t(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f4183g2 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
