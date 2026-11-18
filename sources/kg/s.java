package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.m6;
public final class s extends EditTextBoldCursor {
    public final f5 M1;
    public int N1;
    public final m6 O1;
    public final i6 P1;

    public s(Context context, i6 i6Var) {
        super(context);
        this.P1 = i6Var;
        this.M1 = new f5(this);
        m6 m6Var = new m6(false, true, true);
        this.O1 = m6Var;
        m6Var.n(0.2f, 160L, lr.h);
        m6Var.w(org.telegram.messenger.g0.L(15.33f));
        m6Var.setCallback(this);
        m6Var.f37377b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        if (this.N1 < 0) {
            i7 = n6.f29615p7;
        } else {
            i7 = n6.P5;
        }
        int a10 = this.M1.a(n6.w0(i7, this.P1), false);
        m6 m6Var = this.O1;
        m6Var.u(a10);
        m6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        m6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), 1073741824));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        m6 m6Var = this.O1;
        if (m6Var != null) {
            this.N1 = 32 - charSequence.length();
            m6Var.a();
            String str = "";
            if (this.N1 <= 4) {
                str = "" + this.N1;
            }
            m6Var.t(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.O1 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
