package m3;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import d5.f0;
public class o implements t {
    public final int f17245a;
    public final long f17246b;
    public final Object f17247c;

    public o(Object obj, long j10, int i9) {
        this.f17245a = i9;
        this.f17247c = obj;
        this.f17246b = j10;
    }

    @Override
    public final boolean e() {
        switch (this.f17245a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override
    public final s h(long j10) {
        long j11;
        switch (this.f17245a) {
            case 0:
                FlacStreamMetadata flacStreamMetadata = (FlacStreamMetadata) this.f17247c;
                d5.a.j(flacStreamMetadata.seekTable);
                p pVar = flacStreamMetadata.seekTable;
                long[] jArr = pVar.f17248a;
                long[] jArr2 = pVar.f17249b;
                int e10 = f0.e(jArr, flacStreamMetadata.getSampleNumber(j10), false);
                long j12 = 0;
                if (e10 == -1) {
                    j11 = 0;
                } else {
                    j11 = jArr[e10];
                }
                if (e10 != -1) {
                    j12 = jArr2[e10];
                }
                int i9 = flacStreamMetadata.sampleRate;
                long j13 = (j11 * 1000000) / i9;
                long j14 = this.f17246b;
                u uVar = new u(j13, j12 + j14);
                if (j13 != j10 && e10 != jArr.length - 1) {
                    int i10 = e10 + 1;
                    return new s(uVar, new u((jArr[i10] * 1000000) / i9, j14 + jArr2[i10]));
                }
                return new s(uVar, uVar);
            case 1:
                return (s) this.f17247c;
            default:
                o3.b bVar = (o3.b) this.f17247c;
                s b10 = bVar.f18816g[0].b(j10);
                int i11 = 1;
                while (true) {
                    o3.e[] eVarArr = bVar.f18816g;
                    if (i11 < eVarArr.length) {
                        s b11 = eVarArr[i11].b(j10);
                        if (b11.f17256a.f17260b < b10.f17256a.f17260b) {
                            b10 = b11;
                        }
                        i11++;
                    } else {
                        return b10;
                    }
                }
        }
    }

    @Override
    public final long i() {
        switch (this.f17245a) {
            case 0:
                return ((FlacStreamMetadata) this.f17247c).getDurationUs();
            case 1:
                return this.f17246b;
            default:
                return this.f17246b;
        }
    }

    public o(long j10) {
        this(j10, 0L);
        this.f17245a = 1;
    }

    public o(long j10, long j11) {
        this.f17245a = 1;
        this.f17246b = j10;
        u uVar = j11 == 0 ? u.f17258c : new u(0L, j11);
        this.f17247c = new s(uVar, uVar);
    }
}
