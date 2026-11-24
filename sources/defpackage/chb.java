package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public final class chb extends FrameLayout {
    public static Paint d;
    public static final int[] e = {-1031100, -29183, -12769, -8792480, -12521994, -12140801, -2984711, -45162, -4473925};
    public static final int[] f = {-65536, -29183, -256, -16711936, -16711681, -16776961, -2984711, -65281, -1};
    public final TextView a;
    public boolean b;
    public int c;

    public chb(Context context, wjb wjbVar) {
        super(context);
        int i;
        if (d == null) {
            d = new Paint(1);
        }
        TextView textView = new TextView(context);
        this.a = textView;
        zkb.X(textView, bkb.F6, wjbVar);
        ug8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i | 16);
        addView(textView, nme.d(-1, -1.0f, (k96.a0 ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(ArrayList arrayList, boolean z) {
        float f2;
        float f3;
        setEnabled(z);
        float f4 = 0.5f;
        TextView textView = this.a;
        if (arrayList != null) {
            if (z) {
                f3 = 1.0f;
            } else {
                f3 = 0.5f;
            }
            float[] fArr = {f3};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(textView, property, fArr));
            if (z) {
                f4 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(this, property, f4));
            return;
        }
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.5f;
        }
        textView.setAlpha(f2);
        if (z) {
            f4 = 1.0f;
        }
        setAlpha(f4);
    }

    public final void b(int i, String str, boolean z) {
        boolean z2;
        this.a.setText(str);
        this.b = z;
        this.c = i;
        if (!z && i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        setWillNotDraw(z2);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int measuredWidth;
        float L;
        int i;
        if (this.b) {
            if (k96.a0) {
                L = 0.0f;
            } else {
                L = gl.L(20.0f);
            }
            float f2 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth2 = getMeasuredWidth();
            if (k96.a0) {
                i = gl.L(20.0f);
            } else {
                i = 0;
            }
            canvas2 = canvas;
            canvas2.drawLine(f2, measuredHeight, measuredWidth2 - i, getMeasuredHeight() - 1, bkb.j0);
        } else {
            canvas2 = canvas;
        }
        int i2 = this.c;
        if (i2 != 0) {
            d.setColor(i2);
            if (k96.a0) {
                measuredWidth = gl.L(33.0f);
            } else {
                measuredWidth = getMeasuredWidth() - gl.L(33.0f);
            }
            canvas2.drawCircle(measuredWidth, getMeasuredHeight() / 2, gl.L(10.0f), d);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f) + (this.b ? 1 : 0), 1073741824));
    }
}
