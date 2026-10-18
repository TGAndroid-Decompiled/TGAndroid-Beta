package o2;

import b2.v;
import b2.v0;
import b2.w;
import c3.i0;
import c3.j0;
import e2.x;
import j$.util.Objects;
import java.io.EOFException;
import java.util.Arrays;
public final class o implements j0 {
    public static final w f17635f;
    public static final w f17636g;
    public final j0 f17637a;
    public final w f17638b;
    public w f17639c;
    public byte[] d;
    public int e;

    static {
        v vVar = new v();
        vVar.f4079r = v0.n("application/id3");
        f17635f = new w(vVar);
        v vVar2 = new v();
        vVar2.f4079r = v0.n("application/x-emsg");
        f17636g = new w(vVar2);
    }

    public o(j0 j0Var, int i10) {
        this.f17637a = j0Var;
        if (i10 != 1) {
            if (i10 == 3) {
                this.f17638b = f17636g;
            } else {
                throw new IllegalArgumentException(i2.d.j(i10, "Unknown metadataType: "));
            }
        } else {
            this.f17638b = f17635f;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override
    public final int a(b2.o oVar, int i10, boolean z10) {
        return f(oVar, i10, z10);
    }

    @Override
    public final void b(w wVar) {
        this.f17639c = wVar;
        this.f17637a.b(this.f17638b);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, i0 i0Var) {
        this.f17639c.getClass();
        int i13 = this.e - i12;
        x xVar = new x(Arrays.copyOfRange(this.d, i13 - i11, i13));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i13, bArr, 0, i12);
        this.e = i12;
        String str = this.f17639c.f4132s;
        w wVar = this.f17638b;
        String str2 = wVar.f4132s;
        String str3 = wVar.f4132s;
        if (!Objects.equals(str, str2)) {
            if ("application/x-emsg".equals(this.f17639c.f4132s)) {
                n3.a c10 = m3.b.c(xVar);
                w a2 = c10.a();
                if (a2 != null && Objects.equals(str3, a2.f4132s)) {
                    byte[] c11 = c10.c();
                    c11.getClass();
                    xVar = new x(c11);
                } else {
                    w a10 = c10.a();
                    e2.a.l("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + a10);
                    return;
                }
            } else {
                e2.a.l("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f17639c.f4132s);
                return;
            }
        }
        int a11 = xVar.a();
        j0 j0Var = this.f17637a;
        j0Var.d(a11, xVar);
        j0Var.c(j10, i10, a11, 0, i0Var);
    }

    @Override
    public final void d(int i10, x xVar) {
        a1.g.a(this, xVar, i10);
    }

    @Override
    public final int f(b2.o oVar, int i10, boolean z10) {
        int i11 = this.e + i10;
        byte[] bArr = this.d;
        if (bArr.length < i11) {
            this.d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        int read = oVar.read(this.d, this.e, i10);
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
    public final void g(x xVar, int i10, int i11) {
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
