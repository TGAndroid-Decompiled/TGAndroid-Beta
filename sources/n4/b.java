package n4;

import android.media.AudioAttributes;
public final class b extends ka.c {
    @Override
    public final a a() {
        return new a(((AudioAttributes.Builder) this.f13554b).build());
    }

    @Override
    public final ka.c i(int i10) {
        ((AudioAttributes.Builder) this.f13554b).setUsage(i10);
        return this;
    }

    @Override
    public final void j(int i10) {
        ((AudioAttributes.Builder) this.f13554b).setUsage(i10);
    }
}
