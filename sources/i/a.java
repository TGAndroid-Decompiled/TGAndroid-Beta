package i;

import a8.qc;
import android.graphics.drawable.Animatable;
public final class a extends qc {
    public final int f13410a;
    public final Animatable f13411b;

    public a(Animatable animatable, int i10) {
        this.f13410a = i10;
        this.f13411b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f13410a) {
            case 0:
                this.f13411b.start();
                return;
            default:
                ((y4.d) this.f13411b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f13410a) {
            case 0:
                this.f13411b.stop();
                return;
            default:
                ((y4.d) this.f13411b).stop();
                return;
        }
    }
}
