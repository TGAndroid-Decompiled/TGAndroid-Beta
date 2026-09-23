package i;

import android.graphics.drawable.Animatable;
import v7.f8;
public final class a extends f8 {
    public final int f10534a;
    public final Animatable f10535b;

    public a(Animatable animatable, int i10) {
        this.f10534a = i10;
        this.f10535b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f10534a) {
            case 0:
                this.f10535b.start();
                return;
            default:
                ((x4.d) this.f10535b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f10534a) {
            case 0:
                this.f10535b.stop();
                return;
            default:
                ((x4.d) this.f10535b).stop();
                return;
        }
    }
}
