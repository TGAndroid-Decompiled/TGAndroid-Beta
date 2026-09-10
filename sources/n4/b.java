package n4;

import android.media.AudioAttributes;
public final class b extends l2.g {
    @Override
    public final l2.g J(int i10) {
        ((AudioAttributes.Builder) this.f12719b).setUsage(i10);
        return this;
    }

    @Override
    public final void W(int i10) {
        ((AudioAttributes.Builder) this.f12719b).setUsage(i10);
    }

    @Override
    public final a c() {
        return new a(((AudioAttributes.Builder) this.f12719b).build());
    }
}
