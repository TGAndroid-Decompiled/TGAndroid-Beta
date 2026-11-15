package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ft;
public final class j3 extends ft {
    public final org.telegram.ui.Components.x4 f3626e2;
    public int f3627f2;
    public final org.telegram.ui.Components.g6 f3628g2;
    public final i4 f3629h2;

    public j3(i4 i4Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f3629h2 = i4Var;
        this.f3626e2 = new org.telegram.ui.Components.x4(this);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.f3628g2 = g6Var;
        g6Var.n(0.2f, 160L, er.h);
        g6Var.w(org.telegram.messenger.g0.L(15.33f));
        g6Var.setCallback(this);
        g6Var.f34829b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        if (this.f3627f2 < 0) {
            i7 = org.telegram.ui.ActionBar.j6.f29070p7;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.P5;
        }
        int a10 = this.f3626e2.a(org.telegram.ui.ActionBar.j6.w0(i7, this.f3629h2.f3611f), false);
        org.telegram.ui.Components.g6 g6Var = this.f3628g2;
        g6Var.u(a10);
        g6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        g6Var.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        org.telegram.ui.Components.g6 g6Var = this.f3628g2;
        if (g6Var != null) {
            this.f3627f2 = 12 - charSequence.length();
            g6Var.a();
            String str = "";
            if (this.f3627f2 <= 4) {
                str = "" + this.f3627f2;
            }
            g6Var.t(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f3628g2 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
