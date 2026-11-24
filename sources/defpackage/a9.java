package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
public final class a9 extends lq implements c9 {
    public final b9 d;

    public a9(b9 b9Var, Context context) {
        super(context, null, 2130968607);
        this.d = b9Var;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        wxe.a(this, getContentDescription());
        setOnTouchListener(new w8(this, this));
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.d.l();
        return true;
    }

    @Override
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
