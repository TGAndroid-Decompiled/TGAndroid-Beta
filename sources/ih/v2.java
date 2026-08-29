package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.st;
public final class v2 extends st {
    public final org.telegram.ui.Components.f5 f9457c;
    public int d;
    public final n6 f9458e;
    public final x3 f9459f;

    public v2(x3 x3Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.f9459f = x3Var;
        this.f9457c = new org.telegram.ui.Components.f5(this);
        n6 n6Var = new n6(false, true, true, false);
        this.f9458e = n6Var;
        n6Var.k(0.2f, 160L, jr.h);
        n6Var.t(AndroidUtilities.dp(15.33f));
        n6Var.setCallback(this);
        n6Var.f30862b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.d < 0) {
            i10 = g6.f23279p7;
        } else {
            i10 = g6.P5;
        }
        int a2 = this.f9457c.a(g6.v0(i10, this.f9459f.f9505f), false);
        n6 n6Var = this.f9458e;
        n6Var.r(a2);
        n6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        n6Var.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        n6 n6Var = this.f9458e;
        if (n6Var != null) {
            this.d = 12 - charSequence.length();
            n6Var.b();
            String str = "";
            if (this.d <= 4) {
                str = "" + this.d;
            }
            n6Var.q(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f9458e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
