package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class os1 extends jw1 {
    public fg0 e;
    public int f;
    public final boolean h;
    public final yv1 n;

    public os1(yv1 yv1Var, Context context, boolean z) {
        super(context);
        this.n = yv1Var;
        this.h = z;
    }

    @Override
    public final void d() {
        int i;
        try {
            int themedColor = this.n.getThemedColor(cmb.mf);
            if (this.e != null) {
                Drawable background = getBackground();
                Drawable drawable = this.e;
                if (background == drawable) {
                    if (themedColor != this.f) {
                        cmb.F1(drawable, 436207615 & themedColor, true);
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
                i = gm.L(4.0f);
            } else {
                i = 0;
            }
            int i2 = i;
            fg0 W = cmb.W(gm.L(19.0f), themedColor & 436207615, i2, gm.L(3.0f), 0, gm.L(3.0f));
            this.e = W;
            setBackground(W);
            if (getImageView() != null) {
                getImageView().setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            this.f = themedColor;
            if (getTextView() == null) {
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void setEditButton(boolean z) {
        int i;
        super.setEditButton(z);
        if (this.h) {
            TextView textView = getTextView();
            if (z) {
                i = gm.L(116.0f);
            } else {
                i = Integer.MAX_VALUE;
            }
            textView.setMaxWidth(i);
        }
    }
}
