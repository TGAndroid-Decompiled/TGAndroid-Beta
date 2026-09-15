package i;

import android.graphics.drawable.Animatable;
import v7.f8;
public final class a extends f8 {
    public final int f10546a;
    public final Animatable f10547b;

    public a(Animatable animatable, int i10) {
        this.f10546a = i10;
        this.f10547b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f10546a) {
            case 0:
                this.f10547b.start();
                return;
            default:
                ((x4.d) this.f10547b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f10546a) {
            case 0:
                this.f10547b.stop();
                return;
            default:
                ((x4.d) this.f10547b).stop();
                return;
        }
    }
}
