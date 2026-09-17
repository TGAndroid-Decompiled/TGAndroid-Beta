package n4;

import android.media.AudioAttributes;
public final class b extends mg.n {
    @Override
    public final a d() {
        return new a(((AudioAttributes.Builder) this.f16319b).build());
    }

    @Override
    public final mg.n x(int i10) {
        ((AudioAttributes.Builder) this.f16319b).setUsage(i10);
        return this;
    }

    @Override
    public final void z(int i10) {
        ((AudioAttributes.Builder) this.f16319b).setUsage(i10);
    }
}
