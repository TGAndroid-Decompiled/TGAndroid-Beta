package fi;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
public final class o2 extends ImageView implements p2 {
    @Override
    public void setInvert(float f7) {
        setColorFilter(new PorterDuffColorFilter(i0.a.f(f7, -1, -16777216), PorterDuff.Mode.MULTIPLY));
    }
}
