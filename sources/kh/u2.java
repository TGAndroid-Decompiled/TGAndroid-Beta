package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.ut;
public final class u2 extends ut {
    public final org.telegram.ui.Components.c5 f10974c;
    public int d;
    public final j6 e;
    public final w3 f10975f;

    public u2(w3 w3Var, Context context, f6 f6Var) {
        super(context, f6Var);
        this.f10975f = w3Var;
        this.f10974c = new org.telegram.ui.Components.c5(this);
        j6 j6Var = new j6(false, true, true, false);
        this.e = j6Var;
        j6Var.k(0.2f, 160L, mr.h);
        j6Var.t(AndroidUtilities.dp(15.33f));
        j6Var.setCallback(this);
        j6Var.f25847b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.d < 0) {
            i10 = org.telegram.ui.ActionBar.j6.f20097p7;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.P5;
        }
        int a2 = this.f10974c.a(org.telegram.ui.ActionBar.j6.v0(i10, this.f10975f.f11018f), false);
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
