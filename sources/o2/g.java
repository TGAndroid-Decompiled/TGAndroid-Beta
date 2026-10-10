package o2;

import android.os.SystemClock;
import java.util.List;
public final class g extends x2.c {
    public int f16965g;

    @Override
    public final int c() {
        return this.f16965g;
    }

    @Override
    public final void k(long j3, long j10, long j11, List list, v2.l[] lVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!a(this.f16965g, elapsedRealtime)) {
            return;
        }
        for (int i10 = this.f50519b - 1; i10 >= 0; i10--) {
            if (!a(i10, elapsedRealtime)) {
                this.f16965g = i10;
                return;
            }
        }
        throw new IllegalStateException();
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final Object q() {
        return null;
    }
}
