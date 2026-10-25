package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.r6;
public final class t extends EditTextBoldCursor {
    public final j5 f15831b;
    public int f15832c;
    public final r6 d;
    public final u6 e;

    public t(Context context, u6 u6Var) {
        super(context);
        this.e = u6Var;
        this.f15831b = new j5(this);
        r6 r6Var = new r6(false, true, true);
        this.d = r6Var;
        r6Var.n(0.2f, 160L, ds.h);
        r6Var.w(AndroidUtilities.dp(15.33f));
        r6Var.setCallback(this);
        r6Var.f32119b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f15832c < 0) {
            i10 = y6.f23579p7;
        } else {
            i10 = y6.P5;
        }
        int a2 = this.f15831b.a(y6.w0(i10, this.e), false);
        r6 r6Var = this.d;
        r6Var.u(a2);
        r6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        r6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        r6 r6Var = this.d;
        if (r6Var != null) {
            this.f15832c = 32 - charSequence.length();
            r6Var.a();
            String str = "";
            if (this.f15832c <= 4) {
                str = "" + this.f15832c;
            }
            r6Var.t(str, true, true);
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
