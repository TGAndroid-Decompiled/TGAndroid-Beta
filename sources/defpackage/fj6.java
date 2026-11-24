package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public class fj6 extends FrameLayout {
    public final lka a;
    public final lka b;
    public final ImageView c;
    public boolean d;
    public int e;
    public int f;

    public fj6(Context context) {
        super(context);
        int i;
        this.e = 0;
        this.f = 71;
        lka lkaVar = new lka(context);
        this.a = lkaVar;
        anb.W(lkaVar, cmb.F6, null);
        lkaVar.setTextSize(16);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        lkaVar.setGravity(i);
        addView(lkaVar);
        lka lkaVar2 = new lka(context);
        this.b = lkaVar2;
        anb.W(lkaVar2, cmb.H6, null);
        lkaVar2.setTextSize(16);
        lkaVar2.setGravity(jb6.a0 ? 3 : 5);
        addView(lkaVar2);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        anb.s(imageView, cmb.l6, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView);
    }

    public final void a(int i, int i2) {
        lka lkaVar = this.a;
        anb.W(lkaVar, i2, null);
        lkaVar.setTag(Integer.valueOf(i2));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ImageView imageView = this.c;
        anb.s(imageView, i, null, mode);
        imageView.setTag(Integer.valueOf(i));
    }

    public final void b(int i, int i2, String str, boolean z) {
        this.a.l(str, false);
        this.b.setVisibility(4);
        int L = gm.L(i2);
        ImageView imageView = this.c;
        imageView.setPadding(0, L, 0, 0);
        imageView.setImageResource(i);
        this.d = z;
        setWillNotDraw(!z);
    }

    public int getFullHeight() {
        return gm.L(56.0f);
    }

    public lka getTextView() {
        return this.a;
    }

    public lka getValueTextView() {
        return this.b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        if (this.d) {
            int i = this.e;
            if (i != 0) {
                cmb.k0.setColor(cmb.w0(null, i, false));
            }
            float L = gm.L(this.f);
            float measuredHeight = getMeasuredHeight() - 1;
            float measuredWidth = getMeasuredWidth();
            float measuredHeight2 = getMeasuredHeight() - 1;
            if (this.e != 0) {
                paint = cmb.k0;
            } else {
                paint = cmb.j0;
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
        lka lkaVar = this.b;
        int textHeight = (i6 - lkaVar.getTextHeight()) / 2;
        if (jb6.a0) {
            i5 = gm.L(24.0f);
        } else {
            i5 = 0;
        }
        lkaVar.layout(i5, textHeight, lkaVar.getMeasuredWidth() + i5, lkaVar.getMeasuredHeight() + textHeight);
        lka lkaVar2 = this.a;
        int textHeight2 = (i6 - lkaVar2.getTextHeight()) / 2;
        if (!jb6.a0) {
            L = gm.L(this.f);
        } else {
            L = gm.L(24.0f);
        }
        lkaVar2.layout(L, textHeight2, lkaVar2.getMeasuredWidth() + L, lkaVar2.getMeasuredHeight() + textHeight2);
        int L2 = gm.L(9.0f);
        boolean z2 = jb6.a0;
        ImageView imageView = this.c;
        if (!z2) {
            measuredWidth = gm.L(21.0f);
        } else {
            measuredWidth = (i7 - imageView.getMeasuredWidth()) - gm.L(21.0f);
        }
        imageView.layout(measuredWidth, L2, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + L2);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int L = gm.L(48.0f);
        this.b.measure(wi8.f(24.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), 1073741824));
        this.a.measure(wi8.f(this.f + 24, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), 1073741824));
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
