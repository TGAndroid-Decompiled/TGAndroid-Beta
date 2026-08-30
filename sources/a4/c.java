package a4;

import h5.d0;
import q5.g0;
import r3.n;
import r3.o;
import r3.s;
public final class c implements h {
    public long f56a;
    public long f57b;
    public Object f58c;
    public Object d;

    public c(long j10, int i10) {
        h5.a.i(((g5.a) this.f58c) == null);
        this.f56a = j10;
        this.f57b = j10 + i10;
    }

    @Override
    public long c(r3.l lVar) {
        long j10 = this.f57b;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f57b = -1L;
        return j11;
    }

    @Override
    public s k() {
        boolean z4;
        if (this.f56a != -1) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        return new n((o) this.f58c, this.f56a, 0);
    }

    @Override
    public void v(long j10) {
        long[] jArr = (long[]) ((g0) this.d).f42806b;
        this.f57b = jArr[d0.e(jArr, j10, true)];
    }

    public c(String str, byte[] bArr, long j10, long j11) {
        this.f58c = str;
        this.d = bArr;
        this.f56a = j10;
        this.f57b = j11;
    }
}
