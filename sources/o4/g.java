package o4;

import android.os.SystemClock;
import java.util.List;
public final class g extends b5.c {
    public int f18854g;

    @Override
    public final int d() {
        return this.f18854g;
    }

    @Override
    public final void m(long j10, long j11, long j12, List list, l4.l[] lVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!f(this.f18854g, elapsedRealtime)) {
            return;
        }
        for (int i9 = this.f1444b - 1; i9 >= 0; i9--) {
            if (!f(i9, elapsedRealtime)) {
                this.f18854g = i9;
                return;
            }
        }
        throw new IllegalStateException();
    }

    @Override
    public final int p() {
        return 0;
    }

    @Override
    public final Object r() {
        return null;
    }
}
