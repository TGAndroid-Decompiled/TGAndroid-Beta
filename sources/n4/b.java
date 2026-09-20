package n4;

import android.media.AudioAttributes;
public final class b extends ka.c {
    @Override
    public final a J() {
        return new a(((AudioAttributes.Builder) this.f13566b).build());
    }

    @Override
    public final ka.c k0(int i10) {
        ((AudioAttributes.Builder) this.f13566b).setUsage(i10);
        return this;
    }

    @Override
    public final void n0(int i10) {
        ((AudioAttributes.Builder) this.f13566b).setUsage(i10);
    }
}
