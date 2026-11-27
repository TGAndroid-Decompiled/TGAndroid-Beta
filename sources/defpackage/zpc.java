package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zpc extends EditTextBoldCursor {
    public int N1;
    public final ll O1;
    public final hn P1;
    public final vnb Q1;

    public zpc(Context context, vnb vnbVar) {
        super(context);
        this.Q1 = vnbVar;
        this.N1 = 960;
        this.O1 = new ll(this);
        hn hnVar = new hn(false, true, true);
        this.P1 = hnVar;
        hnVar.n(0.2f, 160L, k43.h);
        hnVar.w(hl.L(15.33f));
        hnVar.b = 5;
        hnVar.setCallback(this);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        super.dispatchDraw(canvas);
        if (this.N1 <= 0) {
            i = aob.p7;
        } else {
            i = aob.P5;
        }
        int a = this.O1.a(aob.v0(i, this.Q1), false);
        hn hnVar = this.P1;
        hnVar.u(a);
        int scrollX = getScrollX();
        int L = hl.L(48.0f) + ((getWidth() + scrollX) - getPaddingRight());
        int height = getHeight() + getScrollY();
        hnVar.setBounds(L - hl.L(48.0f), height - Math.min(hl.L(44.0f), getHeight()), L, height);
        hnVar.draw(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), getScrollY(), (getWidth() + getScrollX()) - getPaddingRight(), getHeight() + getScrollY());
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String str;
        super.onTextChanged(charSequence, i, i2, i3);
        hn hnVar = this.P1;
        if (hnVar == null) {
            return;
        }
        this.N1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
        hnVar.a();
        int i4 = this.N1;
        if (i4 <= 100) {
            str = Integer.toString(i4);
        } else {
            str = "";
        }
        hnVar.t(str, isAttachedToWindow(), true);
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.P1 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
