package a4;

import a8.la;
import f3.b0;
import f3.p;
import f3.t;
import f3.u;
import h2.l0;
public final class c implements h {
    public long f158a;
    public long f159b;
    public Object f160c;
    public Object d;

    public c(long j3, int i7) {
        la.p(((b3.a) this.f160c) == null);
        this.f158a = j3;
        this.f159b = j3 + i7;
    }

    @Override
    public b0 f() {
        boolean z10;
        if (this.f158a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.p(z10);
        return new t((u) this.f160c, this.f158a, 0);
    }

    @Override
    public long m0(p pVar) {
        long j3 = this.f159b;
        if (j3 < 0) {
            return -1L;
        }
        long j10 = -(j3 + 2);
        this.f159b = -1L;
        return j10;
    }

    @Override
    public void v0(long j3) {
        long[] jArr = (long[]) ((wf.b) this.d).f59711b;
        this.f159b = jArr[l0.f(jArr, j3, true)];
    }

    public c(String str, byte[] bArr, long j3, long j10) {
        this.f160c = str;
        this.d = bArr;
        this.f158a = j3;
        this.f159b = j10;
    }
}
