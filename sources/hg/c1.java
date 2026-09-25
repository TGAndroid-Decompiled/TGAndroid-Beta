package hg;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.rr;
public final class c1 extends EditTextBoldCursor {
    public final h5 f10221b;
    public int f10222c;
    public final o6 d;
    public final f1 e;

    public c1(f1 f1Var, Activity activity) {
        super(activity);
        this.e = f1Var;
        this.f10221b = new h5(this);
        o6 o6Var = new o6(false, true, true, false);
        this.d = o6Var;
        o6Var.k(0.2f, 160L, rr.h);
        o6Var.t(AndroidUtilities.dp(15.33f));
        o6Var.setCallback(this);
        o6Var.f26930b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f10222c < 0) {
            i10 = h6.f19280p7;
        } else {
            i10 = h6.P5;
        }
        int a2 = this.f10221b.a(h6.v0(i10, this.e.getResourceProvider()), false);
        o6 o6Var = this.d;
        o6Var.r(a2);
        o6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        o6Var.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        o6 o6Var = this.d;
        if (o6Var != null) {
            this.f10222c = 96 - charSequence.length();
            o6Var.b();
            String str = "";
            if (this.f10222c <= 12) {
                str = "" + this.f10222c;
            }
            o6Var.q(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.d && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
