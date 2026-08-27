package o4;

import d5.g0;
import d5.z;
import h3.s0;
import h3.t0;
import java.io.EOFException;
import java.util.Arrays;
import m3.w;

public final class p implements w {

    public static final t0 f19254f;

    public static final t0 f19255g;

    public final w f19256a;

    public final t0 f19257b;

    public t0 f19258c;
    public byte[] d;

    public int f19259e;

    static {
        s0 s0Var = new s0();
        s0Var.f8135o = "application/id3";
        f19254f = new t0(s0Var);
        s0 s0Var2 = new s0();
        s0Var2.f8135o = "application/x-emsg";
        f19255g = new t0(s0Var2);
    }

    public p(w wVar, int i10) {
        this.f19256a = wVar;
        if (i10 == 1) {
            this.f19257b = f19254f;
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException(i0.a.k(i10, "Unknown metadataType: "));
            }
            this.f19257b = f19255g;
        }
        this.d = new byte[0];
        this.f19259e = 0;
    }

    @Override
    public final void a(int i10, z zVar) {
        i0.a.a(this, zVar, i10);
    }

    @Override
    public final int b(com.google.android.exoplayer2.upstream.j jVar, int i10, boolean z10) throws EOFException {
        int i11 = this.f19259e + i10;
        byte[] bArr = this.d;
        if (bArr.length < i11) {
            this.d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        int i12 = jVar.read(this.d, this.f19259e, i10);
        if (i12 != -1) {
            this.f19259e += i12;
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override
    public final void c(t0 t0Var) {
        this.f19258c = t0Var;
        this.f19256a.c(this.f19257b);
    }

    @Override
    public final void d(int i10, z zVar) {
        int i11 = this.f19259e + i10;
        byte[] bArr = this.d;
        if (bArr.length < i11) {
            this.d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        zVar.c(this.f19259e, i10, this.d);
        this.f19259e += i10;
    }

    @Override
    public final void e(long j10, int i10, int i11, int i12, m3.v vVar) {
        this.f19258c.getClass();
        int i13 = this.f19259e - i12;
        z zVar = new z(Arrays.copyOfRange(this.d, i13 - i11, i13));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i13, bArr, 0, i12);
        this.f19259e = i12;
        String str = this.f19258c.B;
        t0 t0Var = this.f19257b;
        String str2 = t0Var.B;
        String str3 = t0Var.B;
        if (!g0.a(str, str2)) {
            if (!"application/x-emsg".equals(this.f19258c.B)) {
                d5.a.K("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f19258c.B);
                return;
            }
            b4.a aVarC = a4.b.c(zVar);
            t0 wrappedMetadataFormat = aVarC.getWrappedMetadataFormat();
            if (wrappedMetadataFormat == null || !g0.a(str3, wrappedMetadataFormat.B)) {
                d5.a.K("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + aVarC.getWrappedMetadataFormat());
                return;
            }
            byte[] wrappedMetadataBytes = aVarC.getWrappedMetadataBytes();
            wrappedMetadataBytes.getClass();
            zVar = new z(wrappedMetadataBytes);
        }
        int iA = zVar.a();
        w wVar = this.f19256a;
        wVar.a(iA, zVar);
        wVar.e(j10, i10, iA, i12, vVar);
    }
}
