package n4;

import android.media.AudioAttributes;
import m.f3;
public final class b extends f3 {
    @Override
    public final a f() {
        return new a(((AudioAttributes.Builder) this.f15672b).build());
    }

    @Override
    public final f3 p(int i10) {
        ((AudioAttributes.Builder) this.f15672b).setUsage(i10);
        return this;
    }

    @Override
    public final void q(int i10) {
        ((AudioAttributes.Builder) this.f15672b).setUsage(i10);
    }
}
