package j4;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
public final class v0 implements v3.g {
    public long f13588a;
    public long f13589b;
    public Object f13590c;
    public Object d;

    public v0(long j10, int i9) {
        d5.a.i(((com.google.android.exoplayer2.upstream.a) this.f13590c) == null);
        this.f13588a = j10;
        this.f13589b = j10 + i9;
    }

    @Override
    public m3.t D() {
        boolean z10;
        if (this.f13588a != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.i(z10);
        return new m3.o((FlacStreamMetadata) this.f13590c, this.f13588a, 0);
    }

    @Override
    public void O(long j10) {
        long[] jArr = ((m3.p) this.d).f17248a;
        this.f13589b = jArr[d5.f0.e(jArr, j10, true)];
    }

    @Override
    public long b(m3.l lVar) {
        long j10 = this.f13589b;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f13589b = -1L;
        return j11;
    }

    public v0(String str, byte[] bArr, long j10, long j11) {
        this.f13590c = str;
        this.d = bArr;
        this.f13588a = j10;
        this.f13589b = j11;
    }
}
