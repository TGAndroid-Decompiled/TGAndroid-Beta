package defpackage;

import android.graphics.drawable.Animatable;
public final class tm extends wld {
    public final byte a;
    public final Animatable b;

    public tm(Animatable animatable, byte b) {
        this.a = b;
        this.b = animatable;
    }

    @Override
    public final void c() {
        switch (this.a) {
            case 0:
                this.b.start();
                return;
            default:
                ((ln) this.b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.a) {
            case 0:
                this.b.stop();
                return;
            default:
                ((ln) this.b).stop();
                return;
        }
    }
}
