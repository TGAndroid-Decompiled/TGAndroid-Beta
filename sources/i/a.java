package i;

import android.graphics.drawable.Animatable;
import v7.v7;
public final class a extends v7 {
    public final int f7725a;
    public final Animatable f7726b;

    public a(Animatable animatable, int i10) {
        this.f7725a = i10;
        this.f7726b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f7725a) {
            case 0:
                this.f7726b.start();
                return;
            default:
                ((x4.d) this.f7726b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f7725a) {
            case 0:
                this.f7726b.stop();
                return;
            default:
                ((x4.d) this.f7726b).stop();
                return;
        }
    }
}
