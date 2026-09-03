package a4;

import h5.d0;
import q5.c0;
import r3.n;
import r3.o;
import r3.s;
public final class c implements h {
    public long f60a;
    public long f61b;
    public Object f62c;
    public Object d;

    public c(long j10, int i10) {
        h5.a.i(((g5.a) this.f62c) == null);
        this.f60a = j10;
        this.f61b = j10 + i10;
    }

    @Override
    public long c(r3.l lVar) {
        long j10 = this.f61b;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f61b = -1L;
        return j11;
    }

    @Override
    public s h() {
        boolean z4;
        if (this.f60a != -1) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        return new n((o) this.f62c, this.f60a, 0);
    }

    @Override
    public void u(long j10) {
        long[] jArr = (long[]) ((c0) this.d).f44559c;
        this.f61b = jArr[d0.e(jArr, j10, true)];
    }

    public c(String str, byte[] bArr, long j10, long j11) {
        this.f62c = str;
        this.d = bArr;
        this.f60a = j10;
        this.f61b = j11;
    }
}
