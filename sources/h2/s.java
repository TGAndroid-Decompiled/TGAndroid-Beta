package h2;

import java.util.NoSuchElementException;
public final class s implements z3.b {
    public int f13846a;
    public int f13847b;
    public int f13848c;
    public int d;
    public Object f13849e;

    @Override
    public int a() {
        return -1;
    }

    @Override
    public int b() {
        return this.f13846a;
    }

    @Override
    public int c() {
        x xVar = (x) this.f13849e;
        int i7 = this.f13847b;
        if (i7 == 8) {
            return xVar.A();
        }
        if (i7 == 16) {
            return xVar.H();
        }
        int i10 = this.f13848c;
        this.f13848c = i10 + 1;
        if (i10 % 2 == 0) {
            int A = xVar.A();
            this.d = A;
            return (A & 240) >> 4;
        }
        return this.d & 15;
    }

    public long d() {
        int i7 = this.f13848c;
        if (i7 != 0) {
            int i10 = this.f13846a;
            long j3 = ((long[]) this.f13849e)[i10];
            this.f13846a = this.d & (i10 + 1);
            this.f13848c = i7 - 1;
            return j3;
        }
        throw new NoSuchElementException();
    }
}
