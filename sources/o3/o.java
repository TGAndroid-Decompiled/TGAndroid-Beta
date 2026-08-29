package o3;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import f5.d0;
public class o implements t {
    public final int f19104a;
    public final long f19105b;
    public final Object f19106c;

    public o(Object obj, long j10, int i10) {
        this.f19104a = i10;
        this.f19106c = obj;
        this.f19105b = j10;
    }

    @Override
    public final boolean c() {
        switch (this.f19104a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override
    public final s g(long j10) {
        long j11;
        switch (this.f19104a) {
            case 0:
                FlacStreamMetadata flacStreamMetadata = (FlacStreamMetadata) this.f19106c;
                f5.a.j(flacStreamMetadata.seekTable);
                p pVar = flacStreamMetadata.seekTable;
                long[] jArr = pVar.f19107a;
                long[] jArr2 = pVar.f19108b;
                int e10 = d0.e(jArr, flacStreamMetadata.getSampleNumber(j10), false);
                long j12 = 0;
                if (e10 == -1) {
                    j11 = 0;
                } else {
                    j11 = jArr[e10];
                }
                if (e10 != -1) {
                    j12 = jArr2[e10];
                }
                int i10 = flacStreamMetadata.sampleRate;
                long j13 = (j11 * 1000000) / i10;
                long j14 = this.f19105b;
                u uVar = new u(j13, j12 + j14);
                if (j13 != j10 && e10 != jArr.length - 1) {
                    int i11 = e10 + 1;
                    return new s(uVar, new u((jArr[i11] * 1000000) / i10, j14 + jArr2[i11]));
                }
                return new s(uVar, uVar);
            case 1:
                return (s) this.f19106c;
            default:
                q3.b bVar = (q3.b) this.f19106c;
                s b10 = bVar.f46223g[0].b(j10);
                int i12 = 1;
                while (true) {
                    q3.e[] eVarArr = bVar.f46223g;
                    if (i12 < eVarArr.length) {
                        s b11 = eVarArr[i12].b(j10);
                        if (b11.f19115a.f19119b < b10.f19115a.f19119b) {
                            b10 = b11;
                        }
                        i12++;
                    } else {
                        return b10;
                    }
                }
        }
    }

    @Override
    public final long h() {
        switch (this.f19104a) {
            case 0:
                return ((FlacStreamMetadata) this.f19106c).getDurationUs();
            case 1:
                return this.f19105b;
            default:
                return this.f19105b;
        }
    }

    public o(long j10) {
        this(j10, 0L);
        this.f19104a = 1;
    }

    public o(long j10, long j11) {
        this.f19104a = 1;
        this.f19105b = j10;
        u uVar = j11 == 0 ? u.f19117c : new u(0L, j11);
        this.f19106c = new s(uVar, uVar);
    }
}
