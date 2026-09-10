package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
public final class g extends v implements i {
    public final h d;

    public g(h hVar, Context context) {
        super(context, null, 2130968607);
        this.d = hVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        w7.p.a(this, getContentDescription());
        setOnTouchListener(new l.b(this, this));
    }

    @Override
    public final boolean a() {
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
    public final boolean setFrame(int i10, int i11, int i12, int i13) {
        boolean frame = super.setFrame(i10, i11, i12, i13);
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
