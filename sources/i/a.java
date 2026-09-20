package i;

import android.graphics.drawable.Animatable;
import v7.g8;
public final class a extends g8 {
    public final int f10552a;
    public final Animatable f10553b;

    public a(Animatable animatable, int i10) {
        this.f10552a = i10;
        this.f10553b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f10552a) {
            case 0:
                this.f10553b.start();
                return;
            default:
                ((x4.d) this.f10553b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f10552a) {
            case 0:
                this.f10553b.stop();
                return;
            default:
                ((x4.d) this.f10553b).stop();
                return;
        }
    }
}
