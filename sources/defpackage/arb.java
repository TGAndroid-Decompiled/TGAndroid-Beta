package defpackage;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class arb extends FrameLayout {
    public TextView a;
    public ImageView b;
    public boolean c;

    public final void a(String str, boolean z, boolean z2) {
        int i;
        this.a.setText(str);
        ImageView imageView = this.b;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        imageView.setVisibility(i);
        this.c = z2;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        if (this.c) {
            if (ob6.a0) {
                L = 0.0f;
            } else {
                L = hl.L(20.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (ob6.a0) {
                i = hl.L(20.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, aob.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f) + (this.c ? 1 : 0), 1073741824));
    }

    public void setTypeChecked(boolean z) {
        int i;
        ImageView imageView = this.b;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        imageView.setVisibility(i);
    }
}
