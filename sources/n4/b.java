package n4;

import android.media.AudioAttributes;
public final class b extends ka.c {
    @Override
    public final a G() {
        return new a(((AudioAttributes.Builder) this.f13552b).build());
    }

    @Override
    public final ka.c k0(int i10) {
        ((AudioAttributes.Builder) this.f13552b).setUsage(i10);
        return this;
    }

    @Override
    public final void p0(int i10) {
        ((AudioAttributes.Builder) this.f13552b).setUsage(i10);
    }
}
