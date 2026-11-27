package defpackage;

import android.graphics.ColorFilter;
import android.graphics.drawable.DrawableWrapper;
public final class mx0 extends DrawableWrapper {
    public ColorFilter a;

    @Override
    public final ColorFilter getColorFilter() {
        return this.a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a = colorFilter;
        super.setColorFilter(colorFilter);
    }
}
