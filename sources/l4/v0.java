package l4;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
public final class v0 implements x3.g {
    public long f14447a;
    public long f14448b;
    public Object f14449c;
    public Object d;

    public v0(long j10, int i10) {
        f5.a.i(((com.google.android.exoplayer2.upstream.a) this.f14449c) == null);
        this.f14447a = j10;
        this.f14448b = j10 + i10;
    }

    @Override
    public long i(o3.l lVar) {
        long j10 = this.f14448b;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f14448b = -1L;
        return j11;
    }

    @Override
    public o3.t v() {
        boolean z10;
        if (this.f14447a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.i(z10);
        return new o3.o((FlacStreamMetadata) this.f14449c, this.f14447a, 0);
    }

    @Override
    public void z(long j10) {
        long[] jArr = ((o3.p) this.d).f19107a;
        this.f14448b = jArr[f5.d0.e(jArr, j10, true)];
    }

    public v0(String str, byte[] bArr, long j10, long j11) {
        this.f14449c = str;
        this.d = bArr;
        this.f14447a = j10;
        this.f14448b = j11;
    }
}
