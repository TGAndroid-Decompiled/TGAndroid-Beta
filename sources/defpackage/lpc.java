package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class lpc extends EditTextBoldCursor {
    public final lm M1;
    public final lm N1;
    public float O1;
    public float P1;
    public final ppc Q1;

    public lpc(ppc ppcVar, Context context) {
        super(context);
        this.Q1 = ppcVar;
        this.M1 = new lm(180L, this, s33.h);
        this.N1 = new lm(320L, this, ppc.T);
        this.O1 = 1.0f;
    }

    @Override
    public final void n(Canvas canvas, GradientDrawable gradientDrawable) {
        gradientDrawable.setCornerRadius(gl.N(1.5f));
        int lineBaseline = getLayout().getLineBaseline(0);
        Rect bounds = gradientDrawable.getBounds();
        float f = lineBaseline;
        int round = Math.round(((bounds.top - lineBaseline) * this.O1) + f);
        int round2 = Math.round(((bounds.bottom - lineBaseline) * this.O1) + f);
        int i = bounds.left;
        int width = bounds.width();
        if (this.P1 > 0.0f) {
            float f2 = i;
            i = Math.round((((((((getWidth() + getScrollX()) - getCompoundPaddingLeft()) - getCompoundPaddingRight()) - getPaint().measureText("0")) - width) - f2) * this.P1) + f2);
        }
        gradientDrawable.setBounds(i, round, width + i, round2);
        gradientDrawable.draw(canvas);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lpc.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (i != i2) {
            this.Q1.b();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getActionMasked() == 0) {
            this.Q1.b();
            if (length() == 0) {
                z = true;
            } else {
                z = false;
            }
            this.N1.a(z);
        }
        return super.onTouchEvent(motionEvent);
    }
}
