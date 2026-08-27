package i;

import android.graphics.drawable.Animatable;
import g7.v7;

public final class a extends v7 {

    public final int f10446a;

    public final Animatable f10447b;

    public a(Animatable animatable, int i10) {
        this.f10446a = i10;
        this.f10447b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f10446a) {
            case 0:
                this.f10447b.start();
                break;
            default:
                ((k2.d) this.f10447b).start();
                break;
        }
    }

    @Override
    public final void d() {
        switch (this.f10446a) {
            case 0:
                this.f10447b.stop();
                break;
            default:
                ((k2.d) this.f10447b).stop();
                break;
        }
    }
}
