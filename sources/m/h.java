package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
public final class h extends w implements j {
    public final i d;

    public h(i iVar, Context context) {
        super(context, null, 2130968607);
        this.d = iVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        g7.m.a(this, getContentDescription());
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
    public final boolean setFrame(int i9, int i10, int i11, int i12) {
        boolean frame = super.setFrame(i9, i10, i11, i12);
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
