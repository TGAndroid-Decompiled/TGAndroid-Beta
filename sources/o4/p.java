package o4;

import d5.f0;
import d5.y;
import h3.s0;
import h3.t0;
import j3.r0;
import java.io.EOFException;
import java.util.Arrays;
import m3.w;
public final class p implements w {
    public static final t0 f18907f;
    public static final t0 f18908g;
    public final w f18909a;
    public final t0 f18910b;
    public t0 f18911c;
    public byte[] d;
    public int f18912e;

    static {
        s0 s0Var = new s0();
        s0Var.f9705o = "application/id3";
        f18907f = new t0(s0Var);
        s0 s0Var2 = new s0();
        s0Var2.f9705o = "application/x-emsg";
        f18908g = new t0(s0Var2);
    }

    public p(w wVar, int i9) {
        this.f18909a = wVar;
        if (i9 != 1) {
            if (i9 == 3) {
                this.f18910b = f18908g;
            } else {
                throw new IllegalArgumentException(r0.l(i9, "Unknown metadataType: "));
            }
        } else {
            this.f18910b = f18907f;
        }
        this.d = new byte[0];
        this.f18912e = 0;
    }

    @Override
    public final void a(int i9, y yVar) {
        r0.a(this, yVar, i9);
    }

    @Override
    public final int b(com.google.android.exoplayer2.upstream.j jVar, int i9, boolean z10) {
        int i10 = this.f18912e + i9;
        byte[] bArr = this.d;
        if (bArr.length < i10) {
            this.d = Arrays.copyOf(bArr, (i10 / 2) + i10);
        }
        int read = jVar.read(this.d, this.f18912e, i9);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        this.f18912e += read;
        return read;
    }

    @Override
    public final void c(t0 t0Var) {
        this.f18911c = t0Var;
        this.f18909a.c(this.f18910b);
    }

    @Override
    public final void d(int i9, y yVar) {
        int i10 = this.f18912e + i9;
        byte[] bArr = this.d;
        if (bArr.length < i10) {
            this.d = Arrays.copyOf(bArr, (i10 / 2) + i10);
        }
        yVar.c(this.f18912e, i9, this.d);
        this.f18912e += i9;
    }

    @Override
    public final void e(long j10, int i9, int i10, int i11, m3.v vVar) {
        this.f18911c.getClass();
        int i12 = this.f18912e - i11;
        y yVar = new y(Arrays.copyOfRange(this.d, i12 - i10, i12));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i12, bArr, 0, i11);
        this.f18912e = i11;
        String str = this.f18911c.B;
        t0 t0Var = this.f18910b;
        String str2 = t0Var.B;
        String str3 = t0Var.B;
        if (!f0.a(str, str2)) {
            if ("application/x-emsg".equals(this.f18911c.B)) {
                b4.a c10 = a4.b.c(yVar);
                t0 wrappedMetadataFormat = c10.getWrappedMetadataFormat();
                if (wrappedMetadataFormat != null && f0.a(str3, wrappedMetadataFormat.B)) {
                    byte[] wrappedMetadataBytes = c10.getWrappedMetadataBytes();
                    wrappedMetadataBytes.getClass();
                    yVar = new y(wrappedMetadataBytes);
                } else {
                    t0 wrappedMetadataFormat2 = c10.getWrappedMetadataFormat();
                    d5.a.K("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + wrappedMetadataFormat2);
                    return;
                }
            } else {
                d5.a.K("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f18911c.B);
                return;
            }
        }
        int a2 = yVar.a();
        w wVar = this.f18909a;
        wVar.a(a2, yVar);
        wVar.e(j10, i9, a2, i11, vVar);
    }
}
