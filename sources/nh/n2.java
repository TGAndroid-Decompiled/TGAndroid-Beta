package nh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
public final class n2 extends ImageView implements o2 {
    @Override
    public void setInvert(float f9) {
        setColorFilter(new PorterDuffColorFilter(i0.a.d(f9, -1, -16777216), PorterDuff.Mode.MULTIPLY));
    }
}
