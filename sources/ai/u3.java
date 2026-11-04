package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xs;
public final class u3 extends xs {
    public final org.telegram.ui.Components.x4 Z1;
    public int f1008a2;
    public final org.telegram.ui.Components.g6 f1009b2;
    public final u4 c2;

    public u3(u4 u4Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.c2 = u4Var;
        this.Z1 = new org.telegram.ui.Components.x4(this);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.f1009b2 = g6Var;
        g6Var.n(0.2f, 160L, xq.h);
        g6Var.w(org.telegram.messenger.g0.L(15.33f));
        g6Var.setCallback(this);
        g6Var.f33983b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i3;
        super.dispatchDraw(canvas);
        if (this.f1008a2 < 0) {
            i3 = org.telegram.ui.ActionBar.k6.f28102p7;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.P5;
        }
        int a10 = this.Z1.a(org.telegram.ui.ActionBar.k6.w0(i3, this.c2.f1014f), false);
        org.telegram.ui.Components.g6 g6Var = this.f1009b2;
        g6Var.u(a10);
        g6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        g6Var.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        super.onTextChanged(charSequence, i3, i10, i11);
        org.telegram.ui.Components.g6 g6Var = this.f1009b2;
        if (g6Var != null) {
            this.f1008a2 = 12 - charSequence.length();
            g6Var.a();
            String str = "";
            if (this.f1008a2 <= 4) {
                str = "" + this.f1008a2;
            }
            g6Var.t(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f1009b2 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
