package hg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.qr;
public final class r1 extends EditTextBoldCursor {
    public final f5 f10397b;
    public int f10398c;
    public final m6 d;
    public final e6 e;

    public r1(Context context, e6 e6Var) {
        super(context);
        this.e = e6Var;
        this.f10397b = new f5(this);
        m6 m6Var = new m6(false, true, true, false);
        this.d = m6Var;
        m6Var.k(0.2f, 160L, qr.h);
        m6Var.t(AndroidUtilities.dp(15.33f));
        m6Var.setCallback(this);
        m6Var.f26086b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f10398c < 0) {
            i10 = i6.f19056p7;
        } else {
            i10 = i6.P5;
        }
        int a2 = this.f10397b.a(i6.v0(i10, this.e), false);
        m6 m6Var = this.d;
        m6Var.r(a2);
        m6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        m6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        m6 m6Var = this.d;
        if (m6Var != null) {
            this.f10398c = 32 - charSequence.length();
            m6Var.b();
            String str = "";
            if (this.f10398c <= 4) {
                str = "" + this.f10398c;
            }
            m6Var.q(str, true, true);
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
