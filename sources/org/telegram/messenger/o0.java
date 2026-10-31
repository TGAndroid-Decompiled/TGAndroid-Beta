package org.telegram.messenger;

import java.util.concurrent.TimeUnit;
public final class o0 {
    public final n0 f17206a;

    public o0(String str, long j10, int i10) {
        switch (i10) {
            case 1:
                TimeUnit timeUnit = TimeUnit.SECONDS;
                this.f17206a = new n0(str, j10);
                return;
            default:
                this.f17206a = new n0(str, j10);
                return;
        }
    }

    public long a(TimeUnit timeUnit) {
        return timeUnit.convert(this.f17206a.f17027c, TimeUnit.SECONDS);
    }
}
