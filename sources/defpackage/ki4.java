package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
public final class ki4 extends ImageView implements li4 {
    @Override
    public void setInvert(float f) {
        setColorFilter(new PorterDuffColorFilter(bm2.f(f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
    }
}
