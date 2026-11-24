package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class m13 extends FrameLayout {
    public final jia a;
    public final ImageView b;
    public boolean c;
    public byte d;

    public m13(int i, wjb wjbVar, Context context) {
        super(context);
        int i2;
        this.d = i;
        jia jiaVar = new jia(context);
        this.a = jiaVar;
        jiaVar.setTextSize(16);
        if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        jiaVar.setGravity(i2);
        int i3 = bkb.n6;
        zkb.W(jiaVar, i3, wjbVar);
        jiaVar.setTag(Integer.valueOf(i3));
        addView(jiaVar);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c) {
            canvas.drawLine(gl.L(this.d), getMeasuredHeight() - 1, gl.L(23.0f) + getMeasuredWidth(), getMeasuredHeight(), bkb.j0);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int L;
        int measuredWidth;
        float f2;
        int i5 = i3 - i;
        jia jiaVar = this.a;
        int textHeight = ((i4 - i2) - jiaVar.getTextHeight()) / 2;
        boolean z2 = k96.a0;
        ImageView imageView = this.b;
        if (z2) {
            int measuredWidth2 = getMeasuredWidth() - jiaVar.getMeasuredWidth();
            if (imageView.getVisibility() == 0) {
                f2 = this.d;
            } else {
                f2 = 25.0f;
            }
            L = measuredWidth2 - gl.L(f2);
        } else {
            if (imageView.getVisibility() == 0) {
                f = this.d;
            } else {
                f = 25.0f;
            }
            L = gl.L(f);
        }
        jiaVar.layout(L, textHeight, jiaVar.getMeasuredWidth() + L, jiaVar.getMeasuredHeight() + textHeight);
        if (!k96.a0) {
            measuredWidth = (gl.L(this.d) - imageView.getMeasuredWidth()) / 2;
        } else {
            measuredWidth = (i5 - imageView.getMeasuredWidth()) - gl.L(25.0f);
        }
        imageView.layout(measuredWidth, 0, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        Typeface typeface = gl.a;
        this.a.measure(ug8.f(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), 1073741824));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), 1073741824));
        setMeasuredDimension(size, gl.L(50.0f));
    }
}
