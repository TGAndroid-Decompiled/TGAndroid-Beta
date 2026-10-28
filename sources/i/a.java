package i;

import a8.qc;
import android.graphics.drawable.Animatable;
public final class a extends qc {
    public final int f13409a;
    public final Animatable f13410b;

    public a(Animatable animatable, int i10) {
        this.f13409a = i10;
        this.f13410b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f13409a) {
            case 0:
                this.f13410b.start();
                return;
            default:
                ((y4.d) this.f13410b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f13409a) {
            case 0:
                this.f13410b.stop();
                return;
            default:
                ((y4.d) this.f13410b).stop();
                return;
        }
    }
}
