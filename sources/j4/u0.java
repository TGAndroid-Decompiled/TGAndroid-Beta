package j4;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;

public final class u0 implements v3.g {

    public long f12685a;

    public long f12686b;

    public Object f12687c;
    public Object d;

    public u0(long j10, int i10) {
        d5.a.i(((com.google.android.exoplayer2.upstream.a) this.f12687c) == null);
        this.f12685a = j10;
        this.f12686b = j10 + ((long) i10);
    }

    @Override
    public void A(long j10) {
        long[] jArr = ((m3.p) this.d).f17624a;
        this.f12686b = jArr[d5.g0.e(jArr, j10, true)];
    }

    @Override
    public long b(m3.l lVar) {
        long j10 = this.f12686b;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f12686b = -1L;
        return j11;
    }

    @Override
    public m3.t l() {
        d5.a.i(this.f12685a != -1);
        return new m3.o((FlacStreamMetadata) this.f12687c, this.f12685a, 0);
    }

    public u0(String str, byte[] bArr, long j10, long j11) {
        this.f12687c = str;
        this.d = bArr;
        this.f12685a = j10;
        this.f12686b = j11;
    }
}
