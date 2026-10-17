package o2;

import android.os.SystemClock;
import java.util.List;
public final class g extends x2.c {
    public int f17576g;

    @Override
    public final int c() {
        return this.f17576g;
    }

    @Override
    public final void k(long j10, long j11, long j12, List list, v2.m[] mVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!a(this.f17576g, elapsedRealtime)) {
            return;
        }
        for (int i10 = this.f49149b - 1; i10 >= 0; i10--) {
            if (!a(i10, elapsedRealtime)) {
                this.f17576g = i10;
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
