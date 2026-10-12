package n4;

import android.media.AudioAttributes;
public final class b extends k2.g0 {
    @Override
    public final a c() {
        return new a(((AudioAttributes.Builder) this.f14466b).build());
    }

    @Override
    public final k2.g0 g(int i10) {
        ((AudioAttributes.Builder) this.f14466b).setUsage(i10);
        return this;
    }

    @Override
    public final void h(int i10) {
        ((AudioAttributes.Builder) this.f14466b).setUsage(i10);
    }
}
