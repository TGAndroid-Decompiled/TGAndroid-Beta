package lh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;

public final class p2 extends ImageView implements q2 {
    @Override
    public void setInvert(float f10) {
        setColorFilter(new PorterDuffColorFilter(i0.b.d(f10, -1, -16777216), PorterDuff.Mode.MULTIPLY));
    }
}
