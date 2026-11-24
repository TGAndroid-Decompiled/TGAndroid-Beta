package defpackage;
public final class ip5 implements ix9 {
    public final de a;
    public final de b;
    public long c;

    public ip5(long j, long[] jArr, long[] jArr2) {
        boolean z;
        de deVar;
        de deVar2;
        if (jArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        jte.f(z);
        int length = jArr2.length;
        if (length > 0 && jArr2[0] > 0) {
            int i = length + 1;
            deVar = new de(i, (byte) 9);
            this.a = deVar;
            deVar2 = new de(i, (byte) 9);
            this.b = deVar2;
            deVar.W(0L);
            deVar2.W(0L);
        } else {
            deVar = new de(length, (byte) 9);
            this.a = deVar;
            deVar2 = new de(length, (byte) 9);
            this.b = deVar2;
        }
        deVar.Y(jArr);
        deVar2.Y(jArr2);
        this.c = j;
    }

    @Override
    public final boolean c() {
        if (this.b.b > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final hx9 f(long j) {
        de deVar = this.b;
        if (deVar.b == 0) {
            kx9 kx9Var = kx9.c;
            return new hx9(kx9Var, kx9Var);
        }
        int c = hac.c(deVar, j);
        long g0 = deVar.g0(c);
        de deVar2 = this.a;
        kx9 kx9Var2 = new kx9(g0, deVar2.g0(c));
        if (g0 != j && c != deVar.b - 1) {
            int i = c + 1;
            return new hx9(kx9Var2, new kx9(deVar.g0(i), deVar2.g0(i)));
        }
        return new hx9(kx9Var2, kx9Var2);
    }

    @Override
    public final long h() {
        return this.c;
    }

    public final void i(long j, long j2) {
        de deVar = this.b;
        int i = deVar.b;
        de deVar2 = this.a;
        if (i == 0 && j > 0) {
            deVar2.W(0L);
            deVar.W(0L);
        }
        deVar2.W(j2);
        deVar.W(j);
    }
}
