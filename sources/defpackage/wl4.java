package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
public final class wl4 extends ViewGroup {
    public final xl4 a;

    public wl4(xl4 xl4Var, Activity activity) {
        super(activity);
        this.a = xl4Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        int i2;
        xl4 xl4Var = this.a;
        boolean z = xl4Var.d;
        if (z && aob.k3 != null) {
            if (z) {
                i = hl.L(3.0f);
            } else {
                i = 0;
            }
            aob.k3.setAlpha(255);
            aob.k3.setBounds(i - hl.L(2.0f), i - hl.L(1.0f), hl.L(2.0f) + (xl4Var.A - i), hl.L(2.0f) + (xl4Var.B - i));
            aob.k3.draw(canvas);
            Paint paint = aob.S1;
            if (paint != null) {
                paint.setColor(aob.w0(null, aob.ra, false));
                canvas.drawCircle(xl4Var.A / 2.0f, xl4Var.B / 2.0f, ((i2 - (i << 1)) / 2.0f) - hl.L(0.5f), aob.S1);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        xl4 xl4Var = this.a;
        if (xl4Var.d) {
            super.draw(canvas);
            return;
        }
        canvas.save();
        canvas.scale(xl4Var.A / xl4Var.k.getWidth(), xl4Var.B / xl4Var.k.getHeight());
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        xl4 xl4Var = this.a;
        if (xl4Var.d) {
            i5 = hl.L(3.0f);
        } else {
            i5 = 0;
        }
        xl4Var.k.layout(i5, i5, xl4Var.A - i5, xl4Var.B - i5);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        xl4 xl4Var = this.a;
        if (xl4Var.d) {
            i3 = hl.L(3.0f);
        } else {
            i3 = 0;
        }
        int i4 = i3 << 1;
        xl4Var.k.measure(View.MeasureSpec.makeMeasureSpec(xl4Var.A - i4, 1073741824), View.MeasureSpec.makeMeasureSpec(xl4Var.B - i4, 1073741824));
    }
}
