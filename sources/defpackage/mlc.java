package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class mlc extends EditTextBoldCursor {
    public int M1;
    public final kl N1;
    public final gn O1;
    public final wjb P1;

    public mlc(Context context, wjb wjbVar) {
        super(context);
        this.P1 = wjbVar;
        this.M1 = 960;
        this.N1 = new kl(this);
        gn gnVar = new gn(false, true, true);
        this.O1 = gnVar;
        gnVar.n(0.2f, 160L, s33.h);
        gnVar.w(gl.L(15.33f));
        gnVar.b = 5;
        gnVar.setCallback(this);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        super.dispatchDraw(canvas);
        if (this.M1 <= 0) {
            i = bkb.o7;
        } else {
            i = bkb.O5;
        }
        int a = this.N1.a(bkb.v0(i, this.P1), false);
        gn gnVar = this.O1;
        gnVar.u(a);
        int scrollX = getScrollX();
        int L = gl.L(48.0f) + ((getWidth() + scrollX) - getPaddingRight());
        int height = getHeight() + getScrollY();
        gnVar.setBounds(L - gl.L(48.0f), height - Math.min(gl.L(44.0f), getHeight()), L, height);
        gnVar.draw(canvas);
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
        gn gnVar = this.O1;
        if (gnVar == null) {
            return;
        }
        this.M1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
        gnVar.a();
        int i4 = this.M1;
        if (i4 <= 100) {
            str = Integer.toString(i4);
        } else {
            str = "";
        }
        gnVar.t(str, isAttachedToWindow(), true);
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
