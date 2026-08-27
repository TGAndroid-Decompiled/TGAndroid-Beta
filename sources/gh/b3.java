package gh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.lt;

public final class b3 extends lt {

    public final org.telegram.ui.Components.b5 f7169c;
    public int d;

    public final org.telegram.ui.Components.i6 f7170e;

    public final d4 f7171f;

    public b3(d4 d4Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.f7171f = d4Var;
        this.f7169c = new org.telegram.ui.Components.b5(this);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.f7170e = i6Var;
        i6Var.k(0.2f, 160L, er.h);
        i6Var.t(AndroidUtilities.dp(15.33f));
        i6Var.setCallback(this);
        i6Var.f29239b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int iA = this.f7169c.a(org.telegram.ui.ActionBar.g6.v0(this.d < 0 ? org.telegram.ui.ActionBar.g6.f23269p7 : org.telegram.ui.ActionBar.g6.P5, this.f7171f.f7201f), false);
        org.telegram.ui.Components.i6 i6Var = this.f7170e;
        i6Var.r(iA);
        i6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        i6Var.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        org.telegram.ui.Components.i6 i6Var = this.f7170e;
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
        return drawable == this.f7170e || super.verifyDrawable(drawable);
    }
}
