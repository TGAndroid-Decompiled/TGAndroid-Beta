package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class j51 extends EditTextBoldCursor {
    public final km M1;
    public int N1;
    public final ho O1;
    public final ylb P1;

    public j51(Activity activity, ylb ylbVar) {
        super(activity);
        this.P1 = ylbVar;
        this.M1 = new km(this);
        ho hoVar = new ho(false, true, true);
        this.O1 = hoVar;
        hoVar.n(0.2f, 160L, d53.h);
        hoVar.w(gm.L(15.33f));
        hoVar.setCallback(this);
        hoVar.b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        super.dispatchDraw(canvas);
        if (this.N1 < 0) {
            i = cmb.o7;
        } else {
            i = cmb.O5;
        }
        int a = this.M1.a(cmb.v0(i, this.P1), false);
        ho hoVar = this.O1;
        hoVar.u(a);
        hoVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        hoVar.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(36.0f), 1073741824));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String valueOf;
        super.onTextChanged(charSequence, i, i2, i3);
        ho hoVar = this.O1;
        if (hoVar != null) {
            this.N1 = 32 - charSequence.length();
            hoVar.a();
            if (this.N1 > 4) {
                valueOf = "";
            } else {
                valueOf = String.valueOf(this.N1);
            }
            hoVar.t(valueOf, true, true);
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
