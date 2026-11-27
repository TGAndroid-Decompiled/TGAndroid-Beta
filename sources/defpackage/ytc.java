package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ytc extends EditTextBoldCursor {
    public final mm N1;
    public final mm O1;
    public float P1;
    public float Q1;
    public final duc R1;

    public ytc(duc ducVar, Context context) {
        super(context);
        this.R1 = ducVar;
        this.N1 = new mm(180L, this, k43.h);
        this.O1 = new mm(320L, this, duc.T);
        this.P1 = 1.0f;
    }

    @Override
    public final void n(Canvas canvas, GradientDrawable gradientDrawable) {
        gradientDrawable.setCornerRadius(hl.N(1.5f));
        int lineBaseline = getLayout().getLineBaseline(0);
        Rect bounds = gradientDrawable.getBounds();
        float f = lineBaseline;
        int round = Math.round(((bounds.top - lineBaseline) * this.P1) + f);
        int round2 = Math.round(((bounds.bottom - lineBaseline) * this.P1) + f);
        int i = bounds.left;
        int width = bounds.width();
        if (this.Q1 > 0.0f) {
            float f2 = i;
            i = Math.round((((((((getWidth() + getScrollX()) - getCompoundPaddingLeft()) - getCompoundPaddingRight()) - getPaint().measureText("0")) - width) - f2) * this.Q1) + f2);
        }
        gradientDrawable.setBounds(i, round, width + i, round2);
        gradientDrawable.draw(canvas);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ytc.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (i != i2) {
            this.R1.b();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getActionMasked() == 0) {
            this.R1.b();
            if (length() == 0) {
                z = true;
            } else {
                z = false;
            }
            this.O1.a(z);
        }
        return super.onTouchEvent(motionEvent);
    }
}
