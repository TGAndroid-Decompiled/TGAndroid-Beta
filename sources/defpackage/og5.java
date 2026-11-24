package defpackage;

import android.os.SystemClock;
import java.util.List;
public final class og5 extends vh0 {
    public int h;

    @Override
    public final void b(long j, long j2, long j3, List list, em6[] em6VarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!a(this.h, elapsedRealtime)) {
            return;
        }
        for (int i = this.b - 1; i >= 0; i--) {
            if (!a(i, elapsedRealtime)) {
                this.h = i;
                return;
            }
        }
        rjb.h();
    }

    @Override
    public final int d() {
        return this.h;
    }

    @Override
    public final int p() {
        return 0;
    }

    @Override
    public final Object s() {
        return null;
    }
}
