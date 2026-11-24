package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class cr1 extends xu1 {
    public ff0 e;
    public int f;
    public final boolean h;
    public final mu1 n;

    public cr1(mu1 mu1Var, Context context, boolean z) {
        super(context);
        this.n = mu1Var;
        this.h = z;
    }

    @Override
    public final void d() {
        int i;
        try {
            int themedColor = this.n.getThemedColor(bkb.mf);
            if (this.e != null) {
                Drawable background = getBackground();
                Drawable drawable = this.e;
                if (background == drawable) {
                    if (themedColor != this.f) {
                        bkb.F1(drawable, 436207615 & themedColor, true);
                    }
                    if (getImageView() != null && (themedColor != this.f || getImageView().getColorFilter() == null)) {
                        getImageView().setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    }
                    this.f = themedColor;
                    if (getTextView() == null && getTextView().getCurrentTextColor() != themedColor) {
                        getTextView().setTextColor(themedColor);
                        return;
                    }
                }
            }
            if (this.h) {
                i = gl.L(4.0f);
            } else {
                i = 0;
            }
            int i2 = i;
            ff0 W = bkb.W(gl.L(19.0f), themedColor & 436207615, i2, gl.L(3.0f), 0, gl.L(3.0f));
            this.e = W;
            setBackground(W);
            if (getImageView() != null) {
                getImageView().setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            this.f = themedColor;
            if (getTextView() == null) {
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void setEditButton(boolean z) {
        int i;
        super.setEditButton(z);
        if (this.h) {
            TextView textView = getTextView();
            if (z) {
                i = gl.L(116.0f);
            } else {
                i = Integer.MAX_VALUE;
            }
            textView.setMaxWidth(i);
        }
    }
}
