package o2;

import b2.w;
import b2.w0;
import b2.x;
import c3.h0;
import c3.i0;
import j$.util.Objects;
import java.io.EOFException;
import java.util.Arrays;
public final class o implements i0 {
    public static final x f16234f;
    public static final x f16235g;
    public final i0 f16236a;
    public final x f16237b;
    public x f16238c;
    public byte[] d;
    public int e;

    static {
        w wVar = new w();
        wVar.f2470r = w0.n("application/id3");
        f16234f = new x(wVar);
        w wVar2 = new w();
        wVar2.f2470r = w0.n("application/x-emsg");
        f16235g = new x(wVar2);
    }

    public o(i0 i0Var, int i10) {
        this.f16236a = i0Var;
        if (i10 != 1) {
            if (i10 == 3) {
                this.f16237b = f16235g;
            } else {
                throw new IllegalArgumentException(i2.d.j(i10, "Unknown metadataType: "));
            }
        } else {
            this.f16237b = f16234f;
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
        this.f16238c = xVar;
        this.f16236a.b(this.f16237b);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, h0 h0Var) {
        this.f16238c.getClass();
        int i13 = this.e - i12;
        e2.x xVar = new e2.x(Arrays.copyOfRange(this.d, i13 - i11, i13));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i13, bArr, 0, i12);
        this.e = i12;
        String str = this.f16238c.f2523s;
        x xVar2 = this.f16237b;
        String str2 = xVar2.f2523s;
        String str3 = xVar2.f2523s;
        if (!Objects.equals(str, str2)) {
            if ("application/x-emsg".equals(this.f16238c.f2523s)) {
                n3.a c10 = m3.b.c(xVar);
                x a2 = c10.a();
                if (a2 != null && Objects.equals(str3, a2.f2523s)) {
                    byte[] c11 = c10.c();
                    c11.getClass();
                    xVar = new e2.x(c11);
                } else {
                    x a10 = c10.a();
                    e2.a.l("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + a10);
                    return;
                }
            } else {
                e2.a.l("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f16238c.f2523s);
                return;
            }
        }
        int a11 = xVar.a();
        i0 i0Var = this.f16236a;
        i0Var.d(a11, xVar);
        i0Var.c(j10, i10, a11, 0, h0Var);
    }

    @Override
    public final void d(int i10, e2.x xVar) {
        a1.g.a(this, xVar, i10);
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
