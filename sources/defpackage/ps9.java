package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ps9 extends EditTextBoldCursor {
    public final kl M1;
    public int N1;
    public final gn O1;
    public final wjb P1;

    public ps9(Context context, wjb wjbVar) {
        super(context);
        this.P1 = wjbVar;
        this.M1 = new kl(this);
        gn gnVar = new gn(false, true, true);
        this.O1 = gnVar;
        gnVar.n(0.2f, 160L, s33.h);
        gnVar.w(gl.L(15.33f));
        gnVar.setCallback(this);
        gnVar.b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        super.dispatchDraw(canvas);
        if (this.N1 < 0) {
            i = bkb.o7;
        } else {
            i = bkb.O5;
        }
        int a = this.M1.a(bkb.v0(i, this.P1), false);
        gn gnVar = this.O1;
        gnVar.u(a);
        gnVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        gnVar.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(36.0f), 1073741824));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String valueOf;
        super.onTextChanged(charSequence, i, i2, i3);
        gn gnVar = this.O1;
        if (gnVar != null) {
            this.N1 = 12 - charSequence.length();
            gnVar.a();
            if (this.N1 > 4) {
                valueOf = "";
            } else {
                valueOf = String.valueOf(this.N1);
            }
            gnVar.t(valueOf, true, true);
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
