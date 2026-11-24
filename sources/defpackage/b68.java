package defpackage;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.Components.Switch;
public final class b68 extends FrameLayout {
    public TextView a;
    public TextView b;
    public ImageView c;
    public Switch d;
    public boolean e;

    @Override
    public final void invalidate() {
        super.invalidate();
        Switch r0 = this.d;
        if (r0 != null) {
            r0.invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        if (this.e) {
            if (jb6.a0) {
                L = 0.0f;
            } else {
                L = gm.L(70.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (jb6.a0) {
                i = gm.L(70.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, cmb.j0);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int L = gm.L(13.0f) + this.a.getMeasuredHeight();
        TextView textView = this.b;
        textView.layout(textView.getLeft(), L, textView.getRight(), textView.getMeasuredHeight() + L);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        TextView textView = this.a;
        measureChildWithMargins(textView, i, 0, i2, 0);
        TextView textView2 = this.b;
        measureChildWithMargins(textView2, i, 0, i2, 0);
        measureChildWithMargins(this.c, i, 0, i2, 0);
        Switch r7 = this.d;
        if (r7 != null) {
            measureChildWithMargins(r7, i, 0, i2, 0);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), kt6.e(20.0f, textView2.getMeasuredHeight() + textView.getMeasuredHeight(), gm.L(64.0f)) + (this.e ? 1 : 0));
    }

    public void setChecked(boolean z) {
        Switch r1 = this.d;
        if (r1 != null) {
            r1.c(z, true);
        }
    }
}
