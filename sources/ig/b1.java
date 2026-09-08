package ig;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pr;
public final class b1 extends EditTextBoldCursor {
    public final h5 f12028b;
    public int f12029c;
    public final p6 d;
    public final e1 f12030e;

    public b1(e1 e1Var, Activity activity) {
        super(activity);
        this.f12030e = e1Var;
        this.f12028b = new h5(this);
        p6 p6Var = new p6(false, true, true, false);
        this.d = p6Var;
        p6Var.k(0.2f, 160L, pr.h);
        p6Var.t(AndroidUtilities.dp(15.33f));
        p6Var.setCallback(this);
        p6Var.f29312b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f12029c < 0) {
            i10 = j6.f20907p7;
        } else {
            i10 = j6.P5;
        }
        int a2 = this.f12028b.a(j6.v0(i10, this.f12030e.getResourceProvider()), false);
        p6 p6Var = this.d;
        p6Var.r(a2);
        p6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        p6Var.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        p6 p6Var = this.d;
        if (p6Var != null) {
            this.f12029c = 96 - charSequence.length();
            p6Var.b();
            String str = "";
            if (this.f12029c <= 12) {
                str = "" + this.f12029c;
            }
            p6Var.q(str, true, true);
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
