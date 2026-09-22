package n4;

import android.media.AudioAttributes;
public final class b extends k2.e {
    @Override
    public final k2.e K(int i10) {
        ((AudioAttributes.Builder) this.f13244b).setUsage(i10);
        return this;
    }

    @Override
    public final void U(int i10) {
        ((AudioAttributes.Builder) this.f13244b).setUsage(i10);
    }

    @Override
    public final a g() {
        return new a(((AudioAttributes.Builder) this.f13244b).build());
    }
}
