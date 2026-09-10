package gg;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.wr;
public final class f1 extends EditTextBoldCursor {
    public final g5 f8885b;
    public int f8886c;
    public final n6 d;
    public final k1 e;

    public f1(k1 k1Var, Activity activity) {
        super(activity);
        this.e = k1Var;
        this.f8885b = new g5(this);
        n6 n6Var = new n6(false, true, true, false);
        this.d = n6Var;
        n6Var.k(0.2f, 160L, wr.h);
        n6Var.t(AndroidUtilities.dp(15.33f));
        n6Var.setCallback(this);
        n6Var.f25425b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f8886c < 0) {
            i10 = j6.f18144p7;
        } else {
            i10 = j6.P5;
        }
        int a2 = this.f8885b.a(j6.v0(i10, this.e.getResourceProvider()), false);
        n6 n6Var = this.d;
        n6Var.r(a2);
        n6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        n6Var.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        n6 n6Var = this.d;
        if (n6Var != null) {
            this.f8886c = 96 - charSequence.length();
            n6Var.b();
            String str = "";
            if (this.f8886c <= 12) {
                str = "" + this.f8886c;
            }
            n6Var.q(str, true, true);
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
