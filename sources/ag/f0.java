package ag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.w4;
public final class f0 extends EditTextBoldCursor {
    public final w4 G1;
    public int H1;
    public final e6 I1;
    public final p6 J1;

    public f0(Context context, p6 p6Var) {
        super(context);
        this.J1 = p6Var;
        this.G1 = new w4(this);
        e6 e6Var = new e6(false, true, true);
        this.I1 = e6Var;
        e6Var.n(0.2f, 160L, gr.h);
        e6Var.w(org.telegram.messenger.i0.L(15.33f));
        e6Var.setCallback(this);
        e6Var.f25744b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.H1 < 0) {
            i10 = t6.f21154p7;
        } else {
            i10 = t6.P5;
        }
        int a2 = this.G1.a(t6.w0(i10, this.J1), false);
        e6 e6Var = this.I1;
        e6Var.u(a2);
        e6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        e6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(36.0f), 1073741824));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        e6 e6Var = this.I1;
        if (e6Var != null) {
            this.H1 = 32 - charSequence.length();
            e6Var.a();
            String str = "";
            if (this.H1 <= 4) {
                str = "" + this.H1;
            }
            e6Var.t(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.I1 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
