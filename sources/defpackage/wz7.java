package defpackage;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class wz7 extends FrameLayout {
    public TextView a;
    public TextView b;
    public ImageView c;
    public boolean d;

    public final void a(String str, boolean z) {
        this.a.setText(str);
        this.b.setText("");
        this.d = z;
        setWillNotDraw(!z);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        if (this.d) {
            if (jb6.a0) {
                L = 0.0f;
            } else {
                L = gm.L(20.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (jb6.a0) {
                i = gm.L(20.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, cmb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(64.0f) + (this.d ? 1 : 0), 1073741824));
    }

    public void setChecked(boolean z) {
        int i;
        ImageView imageView = this.c;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        imageView.setVisibility(i);
    }

    public void setNeedDivider(boolean z) {
        this.d = z;
        setWillNotDraw(!z);
        invalidate();
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
