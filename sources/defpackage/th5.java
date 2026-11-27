package defpackage;

import j$.util.Objects;
import java.io.EOFException;
import java.util.Arrays;
public final class th5 implements x1c {
    public static final ko4 f;
    public static final ko4 g;
    public final x1c a;
    public final ko4 b;
    public ko4 c;
    public byte[] d;
    public int e;

    static {
        jo4 jo4Var = new jo4();
        jo4Var.s = dg7.n("application/id3");
        f = new ko4(jo4Var);
        jo4 jo4Var2 = new jo4();
        jo4Var2.s = dg7.n("application/x-emsg");
        g = new ko4(jo4Var2);
    }

    public th5(x1c x1cVar, int i) {
        this.a = x1cVar;
        if (i != 1) {
            if (i == 3) {
                this.b = g;
            } else {
                lq5.j(uh9.k(i, "Unknown metadataType: "));
                throw null;
            }
        } else {
            this.b = f;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override
    public final void a(long j, int i, int i2, int i3, w1c w1cVar) {
        this.c.getClass();
        int i4 = this.e - i3;
        ey7 ey7Var = new ey7(Arrays.copyOfRange(this.d, i4 - i2, i4));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.e = i3;
        String str = this.c.t;
        ko4 ko4Var = this.b;
        String str2 = ko4Var.t;
        String str3 = ko4Var.t;
        if (!Objects.equals(str, str2)) {
            if ("application/x-emsg".equals(this.c.t)) {
                f54 c = rr.c(ey7Var);
                ko4 a = c.a();
                if (a != null && Objects.equals(str3, a.t)) {
                    byte[] c2 = c.c();
                    c2.getClass();
                    ey7Var = new ey7(c2);
                } else {
                    ko4 a2 = c.a();
                    efd.f("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + a2);
                    return;
                }
            } else {
                efd.f("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.c.t);
                return;
            }
        }
        int a3 = ey7Var.a();
        x1c x1cVar = this.a;
        x1cVar.e(a3, ey7Var);
        x1cVar.a(j, i, a3, 0, w1cVar);
    }

    @Override
    public final void b(ey7 ey7Var, int i, int i2) {
        int i3 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i3) {
            bArr = Arrays.copyOf(bArr, (i3 / 2) + i3);
            this.d = bArr;
        }
        ey7Var.k(this.e, i, bArr);
        this.e += i;
    }

    @Override
    public final int c(z63 z63Var, int i, boolean z) {
        int i2 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i2) {
            bArr = Arrays.copyOf(bArr, (i2 / 2) + i2);
            this.d = bArr;
        }
        int read = z63Var.read(bArr, this.e, i);
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        this.e += read;
        return read;
    }

    @Override
    public final void e(int i, ey7 ey7Var) {
        xnb.b(this, ey7Var, i);
    }

    @Override
    public final int f(z63 z63Var, int i, boolean z) {
        return c(z63Var, i, z);
    }

    @Override
    public final void g(ko4 ko4Var) {
        this.c = ko4Var;
        this.a.g(this.b);
    }

    @Override
    public final void d(long j) {
    }
}
