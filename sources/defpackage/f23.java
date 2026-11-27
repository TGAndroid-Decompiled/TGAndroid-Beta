package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class f23 extends FrameLayout {
    public final ema a;
    public final ImageView b;
    public boolean c;
    public byte d;

    public f23(int i, vnb vnbVar, Context context) {
        super(context);
        int i2;
        this.d = i;
        ema emaVar = new ema(context);
        this.a = emaVar;
        emaVar.setTextSize(16);
        if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        emaVar.setGravity(i2);
        int i3 = aob.o6;
        yob.W(emaVar, i3, vnbVar);
        emaVar.setTag(Integer.valueOf(i3));
        addView(emaVar);
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
            canvas.drawLine(hl.L(this.d), getMeasuredHeight() - 1, hl.L(23.0f) + getMeasuredWidth(), getMeasuredHeight(), aob.j0);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int L;
        int measuredWidth;
        float f2;
        int i5 = i3 - i;
        ema emaVar = this.a;
        int textHeight = ((i4 - i2) - emaVar.getTextHeight()) / 2;
        boolean z2 = ob6.a0;
        ImageView imageView = this.b;
        if (z2) {
            int measuredWidth2 = getMeasuredWidth() - emaVar.getMeasuredWidth();
            if (imageView.getVisibility() == 0) {
                f2 = this.d;
            } else {
                f2 = 25.0f;
            }
            L = measuredWidth2 - hl.L(f2);
        } else {
            if (imageView.getVisibility() == 0) {
                f = this.d;
            } else {
                f = 25.0f;
            }
            L = hl.L(f);
        }
        emaVar.layout(L, textHeight, emaVar.getMeasuredWidth() + L, emaVar.getMeasuredHeight() + textHeight);
        if (!ob6.a0) {
            measuredWidth = (hl.L(this.d) - imageView.getMeasuredWidth()) / 2;
        } else {
            measuredWidth = (i5 - imageView.getMeasuredWidth()) - hl.L(25.0f);
        }
        imageView.layout(measuredWidth, 0, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        Typeface typeface = hl.a;
        this.a.measure(ik8.f(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), 1073741824));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), 1073741824));
        setMeasuredDimension(size, hl.L(50.0f));
    }
}
