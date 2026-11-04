package i;

import android.graphics.drawable.Animatable;
import b8.qc;
public final class a extends qc {
    public final int f14452a;
    public final Animatable f14453b;

    public a(Animatable animatable, int i3) {
        this.f14452a = i3;
        this.f14453b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f14452a) {
            case 0:
                this.f14453b.start();
                return;
            default:
                ((z4.d) this.f14453b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f14452a) {
            case 0:
                this.f14453b.stop();
                return;
            default:
                ((z4.d) this.f14453b).stop();
                return;
        }
    }
}
