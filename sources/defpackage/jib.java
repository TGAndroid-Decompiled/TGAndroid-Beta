package defpackage;

import android.graphics.Path;
public final class jib extends Path {
    public float a;

    @Override
    public final void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
        super.addRect(f, f2, f3, f4, direction);
        if (f4 > this.a) {
            this.a = f4;
        }
    }

    @Override
    public final void reset() {
        super.reset();
        this.a = 0.0f;
    }
}
