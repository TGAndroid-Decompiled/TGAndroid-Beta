package o2;

import b2.r0;
import c3.g0;
import c3.h0;
import e2.v;
import j$.util.Objects;
import java.io.EOFException;
import java.util.Arrays;
public final class o implements h0 {
    public static final b2.s f16929f;
    public static final b2.s f16930g;
    public final h0 f16931a;
    public final b2.s f16932b;
    public b2.s f16933c;
    public byte[] d;
    public int f16934e;

    static {
        b2.r rVar = new b2.r();
        rVar.f2339q = r0.n("application/id3");
        f16929f = new b2.s(rVar);
        b2.r rVar2 = new b2.r();
        rVar2.f2339q = r0.n("application/x-emsg");
        f16930g = new b2.s(rVar2);
    }

    public o(h0 h0Var, int i10) {
        this.f16931a = h0Var;
        if (i10 != 1) {
            if (i10 == 3) {
                this.f16932b = f16930g;
            } else {
                throw new IllegalArgumentException(i2.g.i(i10, "Unknown metadataType: "));
            }
        } else {
            this.f16932b = f16929f;
        }
        this.d = new byte[0];
        this.f16934e = 0;
    }

    @Override
    public final int a(b2.k kVar, int i10, boolean z10) {
        return e(kVar, i10, z10);
    }

    @Override
    public final void b(b2.s sVar) {
        this.f16933c = sVar;
        this.f16931a.b(this.f16932b);
    }

    @Override
    public final void c(long j3, int i10, int i11, int i12, g0 g0Var) {
        this.f16933c.getClass();
        int i13 = this.f16934e - i12;
        v vVar = new v(Arrays.copyOfRange(this.d, i13 - i11, i13));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i13, bArr, 0, i12);
        this.f16934e = i12;
        String str = this.f16933c.f2397r;
        b2.s sVar = this.f16932b;
        String str2 = sVar.f2397r;
        String str3 = sVar.f2397r;
        if (!Objects.equals(str, str2)) {
            if ("application/x-emsg".equals(this.f16933c.f2397r)) {
                n3.a c10 = m3.b.c(vVar);
                b2.s a2 = c10.a();
                if (a2 != null && Objects.equals(str3, a2.f2397r)) {
                    byte[] c11 = c10.c();
                    c11.getClass();
                    vVar = new v(c11);
                } else {
                    b2.s a10 = c10.a();
                    e2.a.n("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + a10);
                    return;
                }
            } else {
                e2.a.n("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f16933c.f2397r);
                return;
            }
        }
        int a11 = vVar.a();
        h0 h0Var = this.f16931a;
        h0Var.d(a11, vVar);
        h0Var.c(j3, i10, a11, 0, g0Var);
    }

    @Override
    public final void d(int i10, v vVar) {
        a4.a.a(this, vVar, i10);
    }

    @Override
    public final int e(b2.k kVar, int i10, boolean z10) {
        int i11 = this.f16934e + i10;
        byte[] bArr = this.d;
        if (bArr.length < i11) {
            this.d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        int read = kVar.read(this.d, this.f16934e, i10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        this.f16934e += read;
        return read;
    }

    @Override
    public final void f(v vVar, int i10, int i11) {
        int i12 = this.f16934e + i10;
        byte[] bArr = this.d;
        if (bArr.length < i12) {
            this.d = Arrays.copyOf(bArr, (i12 / 2) + i12);
        }
        vVar.h(this.f16934e, i10, this.d);
        this.f16934e += i10;
    }
}
