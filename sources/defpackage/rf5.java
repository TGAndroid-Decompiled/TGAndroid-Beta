package defpackage;

import j$.util.Objects;
import java.io.EOFException;
import java.util.Arrays;
public final class rf5 implements wxb {
    public static final fm4 f;
    public static final fm4 g;
    public final wxb a;
    public final fm4 b;
    public fm4 c;
    public byte[] d;
    public int e;

    static {
        em4 em4Var = new em4();
        em4Var.s = ud7.n("application/id3");
        f = new fm4(em4Var);
        em4 em4Var2 = new em4();
        em4Var2.s = ud7.n("application/x-emsg");
        g = new fm4(em4Var2);
    }

    public rf5(wxb wxbVar, int i) {
        this.a = wxbVar;
        if (i != 1) {
            if (i == 3) {
                this.b = g;
            } else {
                w26.j(de9.k(i, "Unknown metadataType: "));
                throw null;
            }
        } else {
            this.b = f;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override
    public final void a(long j, int i, int i2, int i3, vxb vxbVar) {
        this.c.getClass();
        int i4 = this.e - i3;
        xu7 xu7Var = new xu7(Arrays.copyOfRange(this.d, i4 - i2, i4));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.e = i3;
        String str = this.c.t;
        fm4 fm4Var = this.b;
        String str2 = fm4Var.t;
        String str3 = fm4Var.t;
        if (!Objects.equals(str, str2)) {
            if ("application/x-emsg".equals(this.c.t)) {
                j44 c = qr.c(xu7Var);
                fm4 a = c.a();
                if (a != null && Objects.equals(str3, a.t)) {
                    byte[] c2 = c.c();
                    c2.getClass();
                    xu7Var = new xu7(c2);
                } else {
                    fm4 a2 = c.a();
                    lad.f("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + a2);
                    return;
                }
            } else {
                lad.f("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.c.t);
                return;
            }
        }
        int a3 = xu7Var.a();
        wxb wxbVar = this.a;
        wxbVar.e(a3, xu7Var);
        wxbVar.a(j, i, a3, 0, vxbVar);
    }

    @Override
    public final void b(xu7 xu7Var, int i, int i2) {
        int i3 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i3) {
            bArr = Arrays.copyOf(bArr, (i3 / 2) + i3);
            this.d = bArr;
        }
        xu7Var.k(this.e, i, bArr);
        this.e += i;
    }

    @Override
    public final int c(g63 g63Var, int i, boolean z) {
        int i2 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i2) {
            bArr = Arrays.copyOf(bArr, (i2 / 2) + i2);
            this.d = bArr;
        }
        int read = g63Var.read(bArr, this.e, i);
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
    public final void e(int i, xu7 xu7Var) {
        yjb.b(this, xu7Var, i);
    }

    @Override
    public final int f(g63 g63Var, int i, boolean z) {
        return c(g63Var, i, z);
    }

    @Override
    public final void g(fm4 fm4Var) {
        this.c = fm4Var;
        this.a.g(this.b);
    }

    @Override
    public final void d(long j) {
    }
}
