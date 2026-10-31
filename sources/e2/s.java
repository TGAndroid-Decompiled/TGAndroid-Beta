package e2;

import java.util.NoSuchElementException;
public final class s implements w3.b {
    public int f6194a;
    public int f6195b;
    public int f6196c;
    public int d;
    public Object e;

    @Override
    public int a() {
        return -1;
    }

    @Override
    public int b() {
        return this.f6194a;
    }

    @Override
    public int c() {
        x xVar = (x) this.e;
        int i10 = this.f6195b;
        if (i10 == 8) {
            return xVar.A();
        }
        if (i10 == 16) {
            return xVar.H();
        }
        int i11 = this.f6196c;
        this.f6196c = i11 + 1;
        if (i11 % 2 == 0) {
            int A = xVar.A();
            this.d = A;
            return (A & 240) >> 4;
        }
        return this.d & 15;
    }

    public long d() {
        int i10 = this.f6196c;
        if (i10 != 0) {
            int i11 = this.f6194a;
            long j10 = ((long[]) this.e)[i11];
            this.f6194a = this.d & (i11 + 1);
            this.f6196c = i10 - 1;
            return j10;
        }
        throw new NoSuchElementException();
    }
}
