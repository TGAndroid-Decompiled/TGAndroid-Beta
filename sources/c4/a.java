package c4;

import h9.i0;
import java.util.List;
public final class a {
    public final i0 f5269a;
    public final long f5270b;
    public final long f5271c;
    public final long d;

    public a(long j3, long j10, List list) {
        this.f5269a = i0.q(list);
        this.f5270b = j3;
        this.f5271c = j10;
        long j11 = -9223372036854775807L;
        if (j3 != -9223372036854775807L && j10 != -9223372036854775807L) {
            j11 = j3 + j10;
        }
        this.d = j11;
    }
}
