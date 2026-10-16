package ig;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.r6;
public final class r1 extends EditTextBoldCursor {
    public final j5 f11622b;
    public int f11623c;
    public final r6 d;
    public final c6 e;

    public r1(Context context, c6 c6Var) {
        super(context);
        this.e = c6Var;
        this.f11622b = new j5(this);
        r6 r6Var = new r6(false, true, true);
        this.d = r6Var;
        r6Var.n(0.2f, 160L, es.h);
        r6Var.w(AndroidUtilities.dp(15.33f));
        r6Var.setCallback(this);
        r6Var.f28435b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f11623c < 0) {
            i10 = g6.f19822p7;
        } else {
            i10 = g6.P5;
        }
        int a2 = this.f11622b.a(g6.w0(i10, this.e), false);
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
            this.f11623c = 32 - charSequence.length();
            r6Var.a();
            String str = "";
            if (this.f11623c <= 4) {
                str = "" + this.f11623c;
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
