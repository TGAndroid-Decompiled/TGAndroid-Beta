package i;

import android.graphics.drawable.Animatable;
import v7.v7;
public final class a extends v7 {
    public final int f7726a;
    public final Animatable f7727b;

    public a(Animatable animatable, int i10) {
        this.f7726a = i10;
        this.f7727b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f7726a) {
            case 0:
                this.f7727b.start();
                return;
            default:
                ((x4.d) this.f7727b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f7726a) {
            case 0:
                this.f7727b.stop();
                return;
            default:
                ((x4.d) this.f7727b).stop();
                return;
        }
    }
}
