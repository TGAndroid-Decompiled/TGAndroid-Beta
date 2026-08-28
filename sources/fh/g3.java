package fh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mt;
public final class g3 extends mt {
    public final org.telegram.ui.Components.b5 f6474c;
    public int d;
    public final org.telegram.ui.Components.i6 f6475e;
    public final j4 f6476f;

    public g3(j4 j4Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.f6476f = j4Var;
        this.f6474c = new org.telegram.ui.Components.b5(this);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.f6475e = i6Var;
        i6Var.k(0.2f, 160L, gr.h);
        i6Var.t(AndroidUtilities.dp(15.33f));
        i6Var.setCallback(this);
        i6Var.f29333b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i9;
        super.dispatchDraw(canvas);
        if (this.d < 0) {
            i9 = org.telegram.ui.ActionBar.f6.f23212p7;
        } else {
            i9 = org.telegram.ui.ActionBar.f6.P5;
        }
        int a2 = this.f6474c.a(org.telegram.ui.ActionBar.f6.v0(i9, this.f6476f.f6549f), false);
        org.telegram.ui.Components.i6 i6Var = this.f6475e;
        i6Var.r(a2);
        i6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        i6Var.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        super.onTextChanged(charSequence, i9, i10, i11);
        org.telegram.ui.Components.i6 i6Var = this.f6475e;
        if (i6Var != null) {
            this.d = 12 - charSequence.length();
            i6Var.b();
            String str = "";
            if (this.d <= 4) {
                str = "" + this.d;
            }
            i6Var.q(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f6475e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
