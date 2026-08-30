package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.vt;
public final class v2 extends vt {
    public final org.telegram.ui.Components.c5 f10895c;
    public int d;
    public final j6 e;
    public final x3 f10896f;

    public v2(x3 x3Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f10896f = x3Var;
        this.f10895c = new org.telegram.ui.Components.c5(this);
        j6 j6Var = new j6(false, true, true, false);
        this.e = j6Var;
        j6Var.k(0.2f, 160L, nr.h);
        j6Var.t(AndroidUtilities.dp(15.33f));
        j6Var.setCallback(this);
        j6Var.f25884b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.d < 0) {
            i10 = org.telegram.ui.ActionBar.j6.f20122p7;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.P5;
        }
        int a2 = this.f10895c.a(org.telegram.ui.ActionBar.j6.v0(i10, this.f10896f.f10942f), false);
        j6 j6Var = this.e;
        j6Var.r(a2);
        j6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        j6Var.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        j6 j6Var = this.e;
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
        if (drawable != this.e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
