package h2;

import java.util.NoSuchElementException;
public final class s implements z3.b {
    public int f14148a;
    public int f14149b;
    public int f14150c;
    public int d;
    public Object f14151e;

    @Override
    public int a() {
        return -1;
    }

    @Override
    public int b() {
        return this.f14148a;
    }

    @Override
    public int c() {
        x xVar = (x) this.f14151e;
        int i7 = this.f14149b;
        if (i7 == 8) {
            return xVar.A();
        }
        if (i7 == 16) {
            return xVar.H();
        }
        int i10 = this.f14150c;
        this.f14150c = i10 + 1;
        if (i10 % 2 == 0) {
            int A = xVar.A();
            this.d = A;
            return (A & 240) >> 4;
        }
        return this.d & 15;
    }

    public long d() {
        int i7 = this.f14150c;
        if (i7 != 0) {
            int i10 = this.f14148a;
            long j3 = ((long[]) this.f14151e)[i10];
            this.f14148a = this.d & (i10 + 1);
            this.f14150c = i7 - 1;
            return j3;
        }
        throw new NoSuchElementException();
    }
}
