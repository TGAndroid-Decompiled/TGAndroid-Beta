package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public class ij6 extends FrameLayout {
    public final ema a;
    public final ema b;
    public final ImageView c;
    public boolean d;
    public int e;
    public int f;

    public ij6(Context context) {
        super(context);
        int i;
        this.e = 0;
        this.f = 71;
        ema emaVar = new ema(context);
        this.a = emaVar;
        yob.W(emaVar, aob.G6, null);
        emaVar.setTextSize(16);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        emaVar.setGravity(i);
        addView(emaVar);
        ema emaVar2 = new ema(context);
        this.b = emaVar2;
        yob.W(emaVar2, aob.I6, null);
        emaVar2.setTextSize(16);
        emaVar2.setGravity(ob6.a0 ? 3 : 5);
        addView(emaVar2);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        yob.s(imageView, aob.m6, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView);
    }

    public final void a(int i, int i2) {
        ema emaVar = this.a;
        yob.W(emaVar, i2, null);
        emaVar.setTag(Integer.valueOf(i2));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ImageView imageView = this.c;
        yob.s(imageView, i, null, mode);
        imageView.setTag(Integer.valueOf(i));
    }

    public final void b(int i, int i2, String str, boolean z) {
        this.a.l(str, false);
        this.b.setVisibility(4);
        int L = hl.L(i2);
        ImageView imageView = this.c;
        imageView.setPadding(0, L, 0, 0);
        imageView.setImageResource(i);
        this.d = z;
        setWillNotDraw(!z);
    }

    public int getFullHeight() {
        return hl.L(56.0f);
    }

    public ema getTextView() {
        return this.a;
    }

    public ema getValueTextView() {
        return this.b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        if (this.d) {
            int i = this.e;
            if (i != 0) {
                aob.k0.setColor(aob.w0(null, i, false));
            }
            float L = hl.L(this.f);
            float measuredHeight = getMeasuredHeight() - 1;
            float measuredWidth = getMeasuredWidth();
            float measuredHeight2 = getMeasuredHeight() - 1;
            if (this.e != 0) {
                paint = aob.k0;
            } else {
                paint = aob.j0;
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
        ema emaVar = this.b;
        int textHeight = (i6 - emaVar.getTextHeight()) / 2;
        if (ob6.a0) {
            i5 = hl.L(24.0f);
        } else {
            i5 = 0;
        }
        emaVar.layout(i5, textHeight, emaVar.getMeasuredWidth() + i5, emaVar.getMeasuredHeight() + textHeight);
        ema emaVar2 = this.a;
        int textHeight2 = (i6 - emaVar2.getTextHeight()) / 2;
        if (!ob6.a0) {
            L = hl.L(this.f);
        } else {
            L = hl.L(24.0f);
        }
        emaVar2.layout(L, textHeight2, emaVar2.getMeasuredWidth() + L, emaVar2.getMeasuredHeight() + textHeight2);
        int L2 = hl.L(9.0f);
        boolean z2 = ob6.a0;
        ImageView imageView = this.c;
        if (!z2) {
            measuredWidth = hl.L(21.0f);
        } else {
            measuredWidth = (i7 - imageView.getMeasuredWidth()) - hl.L(21.0f);
        }
        imageView.layout(measuredWidth, L2, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + L2);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int L = hl.L(48.0f);
        this.b.measure(ik8.f(24.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), 1073741824));
        this.a.measure(ik8.f(this.f + 24, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), 1073741824));
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
