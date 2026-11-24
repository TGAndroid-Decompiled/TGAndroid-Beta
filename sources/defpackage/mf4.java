package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public final class mf4 extends FrameLayout implements tjb {
    public jia a;
    public ImageView b;
    public fm2 c;
    public int d;
    public int e;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.M6));
        hashSet.add(Integer.valueOf(bkb.j7));
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L;
        int measuredWidth;
        ImageView imageView = this.b;
        int i5 = i3 - i;
        jia jiaVar = this.a;
        int textHeight = ((i4 - i2) - jiaVar.getTextHeight()) / 2;
        float f = 23.0f;
        if (k96.a0) {
            int measuredWidth2 = getMeasuredWidth() - jiaVar.getMeasuredWidth();
            if (imageView.getVisibility() == 0) {
                f = 64.0f;
            }
            L = measuredWidth2 - gl.L(f);
        } else {
            if (imageView.getVisibility() == 0) {
                f = 64.0f;
            }
            L = gl.L(f);
        }
        jiaVar.layout(L, textHeight, jiaVar.getMeasuredWidth() + L, jiaVar.getMeasuredHeight() + textHeight);
        if (!k96.a0) {
            measuredWidth = gl.L(20.0f);
        } else {
            measuredWidth = (i5 - imageView.getMeasuredWidth()) - gl.L(20.0f);
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

    @Override
    public final void updateColors() {
        ImageView imageView = this.b;
        if (imageView != null) {
            try {
                if (imageView.getDrawable() instanceof fm2) {
                    fm2 fm2Var = (fm2) imageView.getDrawable();
                    int w0 = bkb.w0(null, bkb.M6, false);
                    int w02 = bkb.w0(null, bkb.j7, false);
                    if (fm2Var != this.c || w0 != this.d || w02 != this.e) {
                        this.c = fm2Var;
                        this.d = w0;
                        this.e = w02;
                        Drawable drawable = fm2Var.a;
                        if (drawable != null) {
                            drawable.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.MULTIPLY));
                        }
                        Drawable drawable2 = fm2Var.b;
                        if (drawable2 != null) {
                            drawable2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                        }
                        imageView.invalidate();
                    }
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }
}
