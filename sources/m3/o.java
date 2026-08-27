package m3;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import d5.g0;

public class o implements t {

    public final int f17621a;

    public final long f17622b;

    public final Object f17623c;

    public o(Object obj, long j10, int i10) {
        this.f17621a = i10;
        this.f17623c = obj;
        this.f17622b = j10;
    }

    @Override
    public final boolean e() {
        switch (this.f17621a) {
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
        switch (this.f17621a) {
            case 0:
                FlacStreamMetadata flacStreamMetadata = (FlacStreamMetadata) this.f17623c;
                d5.a.j(flacStreamMetadata.seekTable);
                p pVar = flacStreamMetadata.seekTable;
                long[] jArr = pVar.f17624a;
                long[] jArr2 = pVar.f17625b;
                int iE = g0.e(jArr, flacStreamMetadata.getSampleNumber(j10), false);
                long j11 = iE == -1 ? 0L : jArr[iE];
                long j12 = iE != -1 ? jArr2[iE] : 0L;
                int i10 = flacStreamMetadata.sampleRate;
                long j13 = (j11 * 1000000) / ((long) i10);
                long j14 = this.f17622b;
                u uVar = new u(j13, j12 + j14);
                if (j13 == j10 || iE == jArr.length - 1) {
                    return new s(uVar, uVar);
                }
                int i11 = iE + 1;
                return new s(uVar, new u((jArr[i11] * 1000000) / ((long) i10), j14 + jArr2[i11]));
            case 1:
                return (s) this.f17623c;
            default:
                o3.b bVar = (o3.b) this.f17623c;
                s sVarB = bVar.f19163g[0].b(j10);
                int i12 = 1;
                while (true) {
                    o3.e[] eVarArr = bVar.f19163g;
                    if (i12 >= eVarArr.length) {
                        return sVarB;
                    }
                    s sVarB2 = eVarArr[i12].b(j10);
                    if (sVarB2.f17632a.f17636b < sVarB.f17632a.f17636b) {
                        sVarB = sVarB2;
                    }
                    i12++;
                }
                break;
        }
    }

    @Override
    public final long i() {
        switch (this.f17621a) {
            case 0:
                return ((FlacStreamMetadata) this.f17623c).getDurationUs();
            case 1:
                return this.f17622b;
            default:
                return this.f17622b;
        }
    }

    public o(long j10) {
        this(j10, 0L);
        this.f17621a = 1;
    }

    public o(long j10, long j11) {
        this.f17621a = 1;
        this.f17622b = j10;
        u uVar = j11 == 0 ? u.f17634c : new u(0L, j11);
        this.f17623c = new s(uVar, uVar);
    }
}
