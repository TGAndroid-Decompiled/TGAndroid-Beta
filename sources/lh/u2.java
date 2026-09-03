package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.xt;
public final class u2 extends xt {
    public final org.telegram.ui.Components.c5 f13017c;
    public int d;
    public final j6 f13018e;
    public final x3 f13019f;

    public u2(x3 x3Var, Context context, g6 g6Var) {
        super(context, g6Var);
        this.f13019f = x3Var;
        this.f13017c = new org.telegram.ui.Components.c5(this);
        j6 j6Var = new j6(false, true, true, false);
        this.f13018e = j6Var;
        j6Var.k(0.2f, 160L, pr.h);
        j6Var.t(AndroidUtilities.dp(15.33f));
        j6Var.setCallback(this);
        j6Var.f27999b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.d < 0) {
            i10 = k6.f21878p7;
        } else {
            i10 = k6.P5;
        }
        int a2 = this.f13017c.a(k6.v0(i10, this.f13019f.f13104f), false);
        j6 j6Var = this.f13018e;
        j6Var.r(a2);
        j6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        j6Var.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        j6 j6Var = this.f13018e;
        if (j6Var != null) {
            this.d = 12 - charSequence.length();
            j6Var.b();
            String str = "";
            if (this.d <= 4) {
                str = "" + this.d;
            }
            j6Var.q(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f13018e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
