package c4;

import h9.i0;
import java.util.List;
public final class a {
    public final i0 f5267a;
    public final long f5268b;
    public final long f5269c;
    public final long d;

    public a(long j3, long j10, List list) {
        this.f5267a = i0.q(list);
        this.f5268b = j3;
        this.f5269c = j10;
        long j11 = -9223372036854775807L;
        if (j3 != -9223372036854775807L && j10 != -9223372036854775807L) {
            j11 = j3 + j10;
        }
        this.d = j11;
    }
}
