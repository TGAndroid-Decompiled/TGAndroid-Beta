package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class iw9 extends EditTextBoldCursor {
    public final ll N1;
    public int O1;
    public final hn P1;
    public final vnb Q1;

    public iw9(Context context, vnb vnbVar) {
        super(context);
        this.Q1 = vnbVar;
        this.N1 = new ll(this);
        hn hnVar = new hn(false, true, true);
        this.P1 = hnVar;
        hnVar.n(0.2f, 160L, k43.h);
        hnVar.w(hl.L(15.33f));
        hnVar.setCallback(this);
        hnVar.b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        super.dispatchDraw(canvas);
        if (this.O1 < 0) {
            i = aob.p7;
        } else {
            i = aob.P5;
        }
        int a = this.N1.a(aob.v0(i, this.Q1), false);
        hn hnVar = this.P1;
        hnVar.u(a);
        hnVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        hnVar.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(36.0f), 1073741824));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String valueOf;
        super.onTextChanged(charSequence, i, i2, i3);
        hn hnVar = this.P1;
        if (hnVar != null) {
            this.O1 = 12 - charSequence.length();
            hnVar.a();
            if (this.O1 > 4) {
                valueOf = "";
            } else {
                valueOf = String.valueOf(this.O1);
            }
            hnVar.t(valueOf, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.P1 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
