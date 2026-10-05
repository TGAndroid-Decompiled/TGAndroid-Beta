package n4;

import android.media.AudioAttributes;
public final class b extends k2.e {
    @Override
    public final a a() {
        return new a(((AudioAttributes.Builder) this.f14389b).build());
    }

    @Override
    public final k2.e m(int i10) {
        ((AudioAttributes.Builder) this.f14389b).setUsage(i10);
        return this;
    }

    @Override
    public final void o(int i10) {
        ((AudioAttributes.Builder) this.f14389b).setUsage(i10);
    }
}
