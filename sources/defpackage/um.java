package defpackage;

import android.graphics.drawable.Animatable;
public final class um extends mqd {
    public final byte a;
    public final Animatable b;

    public um(Animatable animatable, byte b) {
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
                ((mn) this.b).start();
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
                ((mn) this.b).stop();
                return;
        }
    }
}
