package h2;

import java.util.NoSuchElementException;
public final class s implements z3.b {
    public int f13812a;
    public int f13813b;
    public int f13814c;
    public int d;
    public Object f13815e;

    @Override
    public int a() {
        return -1;
    }

    @Override
    public int b() {
        return this.f13812a;
    }

    @Override
    public int c() {
        x xVar = (x) this.f13815e;
        int i7 = this.f13813b;
        if (i7 == 8) {
            return xVar.A();
        }
        if (i7 == 16) {
            return xVar.H();
        }
        int i10 = this.f13814c;
        this.f13814c = i10 + 1;
        if (i10 % 2 == 0) {
            int A = xVar.A();
            this.d = A;
            return (A & 240) >> 4;
        }
        return this.d & 15;
    }

    public long d() {
        int i7 = this.f13814c;
        if (i7 != 0) {
            int i10 = this.f13812a;
            long j3 = ((long[]) this.f13815e)[i10];
            this.f13812a = this.d & (i10 + 1);
            this.f13814c = i7 - 1;
            return j3;
        }
        throw new NoSuchElementException();
    }
}
