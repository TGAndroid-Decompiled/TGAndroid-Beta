package c4;

import h9.i0;
import java.util.List;
public final class a {
    public final i0 f4091a;
    public final long f4092b;
    public final long f4093c;
    public final long d;

    public a(long j3, long j10, List list) {
        this.f4091a = i0.q(list);
        this.f4092b = j3;
        this.f4093c = j10;
        long j11 = -9223372036854775807L;
        if (j3 != -9223372036854775807L && j10 != -9223372036854775807L) {
            j11 = j3 + j10;
        }
        this.d = j11;
    }
}
