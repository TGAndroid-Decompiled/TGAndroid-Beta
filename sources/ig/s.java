package ig;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.p6;
public final class s extends EditTextBoldCursor {
    public final i5 f13005b;
    public int f13006c;
    public final p6 d;
    public final d6 e;

    public s(Context context, d6 d6Var) {
        super(context);
        this.e = d6Var;
        this.f13005b = new i5(this);
        p6 p6Var = new p6(false, true, true);
        this.d = p6Var;
        p6Var.n(0.2f, 160L, bs.h);
        p6Var.w(AndroidUtilities.dp(15.33f));
        p6Var.setCallback(this);
        p6Var.f29225b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f13006c < 0) {
            i10 = h6.f21211p7;
        } else {
            i10 = h6.P5;
        }
        int a2 = this.f13005b.a(h6.w0(i10, this.e), false);
        p6 p6Var = this.d;
        p6Var.u(a2);
        p6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        p6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        p6 p6Var = this.d;
        if (p6Var != null) {
            this.f13006c = 32 - charSequence.length();
            p6Var.a();
            String str = "";
            if (this.f13006c <= 4) {
                str = "" + this.f13006c;
            }
            p6Var.t(str, true, true);
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
