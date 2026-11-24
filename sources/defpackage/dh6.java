package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public class dh6 extends FrameLayout {
    public final jia a;
    public final jia b;
    public final ImageView c;
    public boolean d;
    public int e;
    public int f;

    public dh6(Context context) {
        super(context);
        int i;
        this.e = 0;
        this.f = 71;
        jia jiaVar = new jia(context);
        this.a = jiaVar;
        zkb.W(jiaVar, bkb.F6, null);
        jiaVar.setTextSize(16);
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        jiaVar.setGravity(i);
        addView(jiaVar);
        jia jiaVar2 = new jia(context);
        this.b = jiaVar2;
        zkb.W(jiaVar2, bkb.H6, null);
        jiaVar2.setTextSize(16);
        jiaVar2.setGravity(k96.a0 ? 3 : 5);
        addView(jiaVar2);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        zkb.s(imageView, bkb.l6, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView);
    }

    public final void a(int i, int i2) {
        jia jiaVar = this.a;
        zkb.W(jiaVar, i2, null);
        jiaVar.setTag(Integer.valueOf(i2));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ImageView imageView = this.c;
        zkb.s(imageView, i, null, mode);
        imageView.setTag(Integer.valueOf(i));
    }

    public final void b(int i, int i2, String str, boolean z) {
        this.a.l(str, false);
        this.b.setVisibility(4);
        int L = gl.L(i2);
        ImageView imageView = this.c;
        imageView.setPadding(0, L, 0, 0);
        imageView.setImageResource(i);
        this.d = z;
        setWillNotDraw(!z);
    }

    public int getFullHeight() {
        return gl.L(56.0f);
    }

    public jia getTextView() {
        return this.a;
    }

    public jia getValueTextView() {
        return this.b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        if (this.d) {
            int i = this.e;
            if (i != 0) {
                bkb.k0.setColor(bkb.w0(null, i, false));
            }
            float L = gl.L(this.f);
            float measuredHeight = getMeasuredHeight() - 1;
            float measuredWidth = getMeasuredWidth();
            float measuredHeight2 = getMeasuredHeight() - 1;
            if (this.e != 0) {
                paint = bkb.k0;
            } else {
                paint = bkb.j0;
            }
            canvas.drawLine(L, measuredHeight, measuredWidth, measuredHeight2, paint);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int L;
        int measuredWidth;
        int i6 = i4 - i2;
        int i7 = i3 - i;
        jia jiaVar = this.b;
        int textHeight = (i6 - jiaVar.getTextHeight()) / 2;
        if (k96.a0) {
            i5 = gl.L(24.0f);
        } else {
            i5 = 0;
        }
        jiaVar.layout(i5, textHeight, jiaVar.getMeasuredWidth() + i5, jiaVar.getMeasuredHeight() + textHeight);
        jia jiaVar2 = this.a;
        int textHeight2 = (i6 - jiaVar2.getTextHeight()) / 2;
        if (!k96.a0) {
            L = gl.L(this.f);
        } else {
            L = gl.L(24.0f);
        }
        jiaVar2.layout(L, textHeight2, jiaVar2.getMeasuredWidth() + L, jiaVar2.getMeasuredHeight() + textHeight2);
        int L2 = gl.L(9.0f);
        boolean z2 = k96.a0;
        ImageView imageView = this.c;
        if (!z2) {
            measuredWidth = gl.L(21.0f);
        } else {
            measuredWidth = (i7 - imageView.getMeasuredWidth()) - gl.L(21.0f);
        }
        imageView.layout(measuredWidth, L2, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + L2);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int L = gl.L(48.0f);
        this.b.measure(ug8.f(24.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), 1073741824));
        this.a.measure(ug8.f(this.f + 24, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), 1073741824));
        this.c.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        setMeasuredDimension(size, getFullHeight() + (this.d ? 1 : 0));
    }

    public void setDividerColor(int i) {
        this.e = i;
    }

    public void setTextColor(int i) {
        this.a.setTextColor(i);
    }

    public void setTextLeft(int i) {
        this.f = i;
        requestLayout();
    }
}
