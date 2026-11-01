package o2;

import b2.v0;
import b2.w;
import b2.x;
import c3.i0;
import c3.j0;
import c3.k0;
import j$.util.Objects;
import java.io.EOFException;
import java.util.Arrays;
public final class o implements k0 {
    public static final x f14033f;
    public static final x f14034g;
    public final k0 f14035a;
    public final x f14036b;
    public x f14037c;
    public byte[] d;
    public int e;

    static {
        w wVar = new w();
        wVar.f2370r = v0.n("application/id3");
        f14033f = new x(wVar);
        w wVar2 = new w();
        wVar2.f2370r = v0.n("application/x-emsg");
        f14034g = new x(wVar2);
    }

    public o(k0 k0Var, int i10) {
        this.f14035a = k0Var;
        if (i10 != 1) {
            if (i10 == 3) {
                this.f14036b = f14034g;
            } else {
                throw new IllegalArgumentException(i0.a.i(i10, "Unknown metadataType: "));
            }
        } else {
            this.f14036b = f14033f;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override
    public final int a(b2.p pVar, int i10, boolean z10) {
        return f(pVar, i10, z10);
    }

    @Override
    public final void b(x xVar) {
        this.f14037c = xVar;
        this.f14035a.b(this.f14036b);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, j0 j0Var) {
        this.f14037c.getClass();
        int i13 = this.e - i12;
        e2.x xVar = new e2.x(Arrays.copyOfRange(this.d, i13 - i11, i13));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i13, bArr, 0, i12);
        this.e = i12;
        String str = this.f14037c.f2423s;
        x xVar2 = this.f14036b;
        String str2 = xVar2.f2423s;
        String str3 = xVar2.f2423s;
        if (!Objects.equals(str, str2)) {
            if ("application/x-emsg".equals(this.f14037c.f2423s)) {
                n3.a c10 = m3.b.c(xVar);
                x a2 = c10.a();
                if (a2 != null && Objects.equals(str3, a2.f2423s)) {
                    byte[] c11 = c10.c();
                    c11.getClass();
                    xVar = new e2.x(c11);
                } else {
                    x a10 = c10.a();
                    e2.a.l("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + a10);
                    return;
                }
            } else {
                e2.a.l("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f14037c.f2423s);
                return;
            }
        }
        int a11 = xVar.a();
        k0 k0Var = this.f14035a;
        k0Var.d(a11, xVar);
        k0Var.c(j10, i10, a11, 0, j0Var);
    }

    @Override
    public final void d(int i10, e2.x xVar) {
        i0.a(this, xVar, i10);
    }

    @Override
    public final int f(b2.p pVar, int i10, boolean z10) {
        int i11 = this.e + i10;
        byte[] bArr = this.d;
        if (bArr.length < i11) {
            this.d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        int read = pVar.read(this.d, this.e, i10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        this.e += read;
        return read;
    }

    @Override
    public final void g(e2.x xVar, int i10, int i11) {
        int i12 = this.e + i10;
        byte[] bArr = this.d;
        if (bArr.length < i12) {
            this.d = Arrays.copyOf(bArr, (i12 / 2) + i12);
        }
        xVar.k(this.e, i10, this.d);
        this.e += i10;
    }

    @Override
    public final void e(long j10) {
    }
}
