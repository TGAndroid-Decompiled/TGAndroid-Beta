package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class lnc extends EditTextBoldCursor {
    public int M1;
    public final km N1;
    public final ho O1;
    public final ylb P1;

    public lnc(Context context, ylb ylbVar) {
        super(context);
        this.P1 = ylbVar;
        this.M1 = 960;
        this.N1 = new km(this);
        ho hoVar = new ho(false, true, true);
        this.O1 = hoVar;
        hoVar.n(0.2f, 160L, d53.h);
        hoVar.w(gm.L(15.33f));
        hoVar.b = 5;
        hoVar.setCallback(this);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        super.dispatchDraw(canvas);
        if (this.M1 <= 0) {
            i = cmb.o7;
        } else {
            i = cmb.O5;
        }
        int a = this.N1.a(cmb.v0(i, this.P1), false);
        ho hoVar = this.O1;
        hoVar.u(a);
        int scrollX = getScrollX();
        int L = gm.L(48.0f) + ((getWidth() + scrollX) - getPaddingRight());
        int height = getHeight() + getScrollY();
        hoVar.setBounds(L - gm.L(48.0f), height - Math.min(gm.L(44.0f), getHeight()), L, height);
        hoVar.draw(canvas);
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
        ho hoVar = this.O1;
        if (hoVar == null) {
            return;
        }
        this.M1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
        hoVar.a();
        int i4 = this.M1;
        if (i4 <= 100) {
            str = Integer.toString(i4);
        } else {
            str = "";
        }
        hoVar.t(str, isAttachedToWindow(), true);
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.O1 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
