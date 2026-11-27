package defpackage;

import android.os.SystemClock;
import java.util.List;
public final class qg5 extends wg0 {
    public int h;

    @Override
    public final void b(long j, long j2, long j3, List list, gm6[] gm6VarArr) {
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
        grb.g();
    }

    @Override
    public final int d() {
        return this.h;
    }

    @Override
    public final int o() {
        return 0;
    }

    @Override
    public final Object r() {
        return null;
    }
}
