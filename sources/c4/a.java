package c4;

import h9.i0;
import java.util.List;
public final class a {
    public final i0 f4372a;
    public final long f4373b;
    public final long f4374c;
    public final long d;

    public a(long j3, long j10, List list) {
        this.f4372a = i0.q(list);
        this.f4373b = j3;
        this.f4374c = j10;
        long j11 = -9223372036854775807L;
        if (j3 != -9223372036854775807L && j10 != -9223372036854775807L) {
            j11 = j3 + j10;
        }
        this.d = j11;
    }
}
