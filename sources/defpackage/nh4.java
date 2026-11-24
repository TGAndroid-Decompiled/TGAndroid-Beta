package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public final class nh4 extends FrameLayout implements vlb {
    public lka a;
    public ImageView b;
    public sn2 c;
    public int d;
    public int e;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.M6));
        hashSet.add(Integer.valueOf(cmb.j7));
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L;
        int measuredWidth;
        ImageView imageView = this.b;
        int i5 = i3 - i;
        lka lkaVar = this.a;
        int textHeight = ((i4 - i2) - lkaVar.getTextHeight()) / 2;
        float f = 23.0f;
        if (jb6.a0) {
            int measuredWidth2 = getMeasuredWidth() - lkaVar.getMeasuredWidth();
            if (imageView.getVisibility() == 0) {
                f = 64.0f;
            }
            L = measuredWidth2 - gm.L(f);
        } else {
            if (imageView.getVisibility() == 0) {
                f = 64.0f;
            }
            L = gm.L(f);
        }
        lkaVar.layout(L, textHeight, lkaVar.getMeasuredWidth() + L, lkaVar.getMeasuredHeight() + textHeight);
        if (!jb6.a0) {
            measuredWidth = gm.L(20.0f);
        } else {
            measuredWidth = (i5 - imageView.getMeasuredWidth()) - gm.L(20.0f);
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

    @Override
    public final void updateColors() {
        ImageView imageView = this.b;
        if (imageView != null) {
            try {
                if (imageView.getDrawable() instanceof sn2) {
                    sn2 sn2Var = (sn2) imageView.getDrawable();
                    int w0 = cmb.w0(null, cmb.M6, false);
                    int w02 = cmb.w0(null, cmb.j7, false);
                    if (sn2Var != this.c || w0 != this.d || w02 != this.e) {
                        this.c = sn2Var;
                        this.d = w0;
                        this.e = w02;
                        Drawable drawable = sn2Var.a;
                        if (drawable != null) {
                            drawable.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.MULTIPLY));
                        }
                        Drawable drawable2 = sn2Var.b;
                        if (drawable2 != null) {
                            drawable2.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                        }
                        imageView.invalidate();
                    }
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }
}
