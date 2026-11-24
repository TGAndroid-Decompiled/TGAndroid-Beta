package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class y23 extends FrameLayout {
    public final lka a;
    public final ImageView b;
    public boolean c;
    public byte d;

    public y23(int i, ylb ylbVar, Context context) {
        super(context);
        int i2;
        this.d = i;
        lka lkaVar = new lka(context);
        this.a = lkaVar;
        lkaVar.setTextSize(16);
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        lkaVar.setGravity(i2);
        int i3 = cmb.n6;
        anb.W(lkaVar, i3, ylbVar);
        lkaVar.setTag(Integer.valueOf(i3));
        addView(lkaVar);
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
            canvas.drawLine(gm.L(this.d), getMeasuredHeight() - 1, gm.L(23.0f) + getMeasuredWidth(), getMeasuredHeight(), cmb.j0);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int L;
        int measuredWidth;
        float f2;
        int i5 = i3 - i;
        lka lkaVar = this.a;
        int textHeight = ((i4 - i2) - lkaVar.getTextHeight()) / 2;
        boolean z2 = jb6.a0;
        ImageView imageView = this.b;
        if (z2) {
            int measuredWidth2 = getMeasuredWidth() - lkaVar.getMeasuredWidth();
            if (imageView.getVisibility() == 0) {
                f2 = this.d;
            } else {
                f2 = 25.0f;
            }
            L = measuredWidth2 - gm.L(f2);
        } else {
            if (imageView.getVisibility() == 0) {
                f = this.d;
            } else {
                f = 25.0f;
            }
            L = gm.L(f);
        }
        lkaVar.layout(L, textHeight, lkaVar.getMeasuredWidth() + L, lkaVar.getMeasuredHeight() + textHeight);
        if (!jb6.a0) {
            measuredWidth = (gm.L(this.d) - imageView.getMeasuredWidth()) / 2;
        } else {
            measuredWidth = (i5 - imageView.getMeasuredWidth()) - gm.L(25.0f);
        }
        imageView.layout(measuredWidth, 0, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        Typeface typeface = gm.a;
        this.a.measure(wi8.f(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), 1073741824));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), 1073741824));
        setMeasuredDimension(size, gm.L(50.0f));
    }
}
