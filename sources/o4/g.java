package o4;

import android.os.SystemClock;
import java.util.List;

public final class g extends b5.c {

    public int f19201g;

    @Override
    public final int d() {
        return this.f19201g;
    }

    @Override
    public final void m(long j10, long j11, long j12, List list, l4.l[] lVarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (f(this.f19201g, jElapsedRealtime)) {
            for (int i10 = this.f1932b - 1; i10 >= 0; i10--) {
                if (!f(i10, jElapsedRealtime)) {
                    this.f19201g = i10;
                    return;
                }
            }
            throw new IllegalStateException();
        }
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
