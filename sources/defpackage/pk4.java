package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
public final class pk4 extends ImageView implements qk4 {
    @Override
    public void setInvert(float f) {
        setColorFilter(new PorterDuffColorFilter(vm2.f(f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
    }
}
