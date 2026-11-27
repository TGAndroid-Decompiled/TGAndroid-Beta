package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.Button;
public final class si extends in {
    public final byte s;

    public si(Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(context, z, z2, z3, z4, z5);
        this.s = (byte) 5;
    }

    @Override
    public final CharSequence getAccessibilityClassName() {
        switch (this.s) {
            case 0:
                return Button.class.getName();
            case 1:
            default:
                return super.getAccessibilityClassName();
            case 2:
                return Button.class.getName();
        }
    }

    @Override
    public final int getBaseline() {
        switch (this.s) {
            case 5:
                return Math.round((getHeight() - getDrawable().e) / 2.0f) - getPaint().getFontMetricsInt().ascent;
            default:
                return super.getBaseline();
        }
    }

    @Override
    public final void invalidate() {
        switch (this.s) {
            case 3:
                if (!ri5.b(this)) {
                    super.invalidate();
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.s) {
            case 4:
                canvas.save();
                canvas.translate(hl.L(17.0f), 0.0f);
                super.onDraw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.s) {
            case 1:
                super.onMeasure(i, i2);
                setPivotX(getMeasuredWidth());
                return;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.q.x, Integer.MIN_VALUE), i2);
                setMeasuredDimension(View.resolveSize((int) Math.ceil(getDrawable().c()), i), getMeasuredHeight());
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    public si(Context context, boolean z, boolean z2, boolean z3, byte b) {
        super(context, z, z2, z3);
        this.s = b;
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        switch (this.s) {
            case 3:
                if (ri5.b(this)) {
                    return;
                }
                super.invalidate(i, i2, i3, i4);
                return;
            default:
                super.invalidate(i, i2, i3, i4);
                return;
        }
    }
}
