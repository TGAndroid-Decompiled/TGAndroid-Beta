package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
public final class t62 extends View {
    public final byte a;

    public t62(Context context, byte b) {
        super(context);
        this.a = b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i = 0;
        float f = 0.0f;
        switch (this.a) {
            case 14:
                if (!ob6.a0) {
                    f = hl.L(20.0f);
                }
                float f2 = f;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (ob6.a0) {
                    i = hl.L(20.0f);
                }
                canvas.drawLine(f2, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, aob.j0);
                return;
            case 15:
                if (!ob6.a0) {
                    f = hl.L(20.0f);
                }
                float f3 = f;
                float measuredHeight2 = getMeasuredHeight() - 1;
                int measuredWidth2 = getMeasuredWidth();
                if (ob6.a0) {
                    i = hl.L(20.0f);
                }
                canvas.drawLine(f3, measuredHeight2, measuredWidth2 - i, getMeasuredHeight() - 1, aob.j0);
                return;
            case 16:
                if (!ob6.a0) {
                    f = hl.L(20.0f);
                }
                float f4 = f;
                float measuredHeight3 = getMeasuredHeight() - 1;
                int measuredWidth3 = getMeasuredWidth();
                if (ob6.a0) {
                    i = hl.L(20.0f);
                }
                canvas.drawLine(f4, measuredHeight3, measuredWidth3 - i, getMeasuredHeight() - 1, aob.j0);
                return;
            case 17:
                if (!ob6.a0) {
                    f = hl.L(20.0f);
                }
                float f5 = f;
                float measuredHeight4 = getMeasuredHeight() - 1;
                int measuredWidth4 = getMeasuredWidth();
                if (ob6.a0) {
                    i = hl.L(20.0f);
                }
                canvas.drawLine(f5, measuredHeight4, measuredWidth4 - i, getMeasuredHeight() - 1, aob.j0);
                return;
            case 27:
                super.onDraw(canvas);
                canvas.drawLine(0.0f, hl.L(14.0f), 2.0f, getMeasuredHeight() - hl.L(14.0f), aob.j0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z;
        float f;
        float f2 = 8.0f;
        switch (this.a) {
            case 1:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(6.0f), 1073741824));
                return;
            case 2:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (hl.q.y * 0.4f), 1073741824));
                return;
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(300.0f), 1073741824));
                return;
            case 4:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(60.0f), 1073741824));
                return;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(52.0f), 1073741824));
                return;
            case 6:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(4.0f), 1073741824));
                return;
            case 7:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(81.0f), 1073741824));
                return;
            case 8:
                Point point = hl.q;
                int i3 = point.x;
                int i4 = point.y;
                if (i3 < i4) {
                    z = true;
                } else {
                    z = false;
                }
                float f3 = i4;
                if (z) {
                    f = 0.56f;
                } else {
                    f = 0.3f;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (f3 * f), 1073741824));
                return;
            case 9:
                if (j95.u5) {
                    f2 = 0.0f;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(f2), 1073741824));
                return;
            case 10:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(5.0f), 1073741824));
                return;
            case 11:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(16.0f), 1073741824));
                return;
            case 12:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(52.0f), 1073741824));
                return;
            case 13:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(8.0f), 1073741824));
                return;
            case 14:
            case 15:
            case 16:
            case 17:
            case 27:
            default:
                super.onMeasure(i, i2);
                return;
            case 18:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(12.0f), 1073741824));
                return;
            case 19:
                setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(36.0f));
                return;
            case 20:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(68.0f), 1073741824));
                return;
            case 21:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(7.33f), 1073741824));
                return;
            case 22:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(16.0f), 1073741824));
                return;
            case 23:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(52.0f), 1073741824));
                return;
            case 24:
                super.onMeasure(i, i2);
                setPivotX(getMeasuredWidth() / 2);
                setPivotY(getMeasuredHeight());
                return;
            case 25:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(52.0f), 1073741824));
                return;
            case 26:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), 1073741824));
                return;
            case 28:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(4.0f), 1073741824));
                return;
        }
    }
}
