package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
public class t1 extends LinearLayout {
    public final byte a;

    public t1(Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 9:
                super(context);
                setWillNotDraw(false);
                return;
            default:
                setOrientation(1);
                setPadding(gl.L(16.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                int i = bkb.F6;
                zkb.X(textView, i, null);
                textView.setTypeface(gl.o());
                textView.setText(k96.M0(2131754944, null));
                addView(textView);
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 14.0f);
                zkb.X(textView2, i, null);
                textView2.setText(gl.T2(k96.M0(2131754946, null)));
                addView(textView2, nme.q(-1, -2, 0.0f, 0, 0, 0, 0, 0));
                TextView textView3 = new TextView(context);
                textView3.setTextSize(1, 14.0f);
                zkb.X(textView3, i, null);
                textView3.setText(gl.T2(k96.M0(2131754945, null)));
                addView(textView3, nme.q(-1, -2, 0.0f, 0, 0, 24, 0, 0));
                return;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 9:
                return super.drawChild(canvas, view, j);
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 9:
                super.onLayout(z, i, i2, i3, i4);
                if (getParent() instanceof tu9) {
                    ((tu9) getParent()).invalidate();
                    return;
                }
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
                return;
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
                return;
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
                return;
            case 4:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
                return;
            case 5:
            case 6:
            case 8:
            case 9:
            default:
                super.onMeasure(i, i2);
                return;
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(220.0f), View.MeasureSpec.getSize(i)), View.MeasureSpec.getMode(i)), i2);
                return;
            case 10:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(400.0f), View.MeasureSpec.getSize(i)), 1073741824), i2);
                return;
            case 11:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), gl.L(600.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), gl.L(800.0f)), 1073741824));
                return;
            case 12:
                super.onMeasure(i, i2);
                setPivotY(0.0f);
                setPivotX(0.0f);
                return;
            case 13:
                super.onMeasure(i, i2);
                setPivotY(0.0f);
                setPivotX(getMeasuredWidth());
                return;
        }
    }

    public t1(byte b, Context context, boolean z) {
        super(context);
        this.a = b;
    }
}
