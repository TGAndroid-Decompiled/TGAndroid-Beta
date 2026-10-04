package i;

import android.graphics.drawable.Animatable;
import v7.f8;
public final class a extends f8 {
    public final int f11483a;
    public final Animatable f11484b;

    public a(Animatable animatable, int i10) {
        this.f11483a = i10;
        this.f11484b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f11483a) {
            case 0:
                this.f11484b.start();
                return;
            default:
                ((x4.d) this.f11484b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f11483a) {
            case 0:
                this.f11484b.stop();
                return;
            default:
                ((x4.d) this.f11484b).stop();
                return;
        }
    }
}
