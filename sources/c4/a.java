package c4;

import h9.i0;
import java.util.List;
public final class a {
    public final i0 f5272a;
    public final long f5273b;
    public final long f5274c;
    public final long d;

    public a(long j3, long j10, List list) {
        this.f5272a = i0.q(list);
        this.f5273b = j3;
        this.f5274c = j10;
        long j11 = -9223372036854775807L;
        if (j3 != -9223372036854775807L && j10 != -9223372036854775807L) {
            j11 = j3 + j10;
        }
        this.d = j11;
    }
}
