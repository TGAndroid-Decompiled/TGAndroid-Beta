package h2;

import java.util.NoSuchElementException;
public final class s implements z3.b {
    public int f14146a;
    public int f14147b;
    public int f14148c;
    public int d;
    public Object f14149e;

    @Override
    public int a() {
        return -1;
    }

    @Override
    public int b() {
        return this.f14146a;
    }

    @Override
    public int c() {
        x xVar = (x) this.f14149e;
        int i7 = this.f14147b;
        if (i7 == 8) {
            return xVar.A();
        }
        if (i7 == 16) {
            return xVar.H();
        }
        int i10 = this.f14148c;
        this.f14148c = i10 + 1;
        if (i10 % 2 == 0) {
            int A = xVar.A();
            this.d = A;
            return (A & 240) >> 4;
        }
        return this.d & 15;
    }

    public long d() {
        int i7 = this.f14148c;
        if (i7 != 0) {
            int i10 = this.f14146a;
            long j3 = ((long[]) this.f14149e)[i10];
            this.f14146a = this.d & (i10 + 1);
            this.f14148c = i7 - 1;
            return j3;
        }
        throw new NoSuchElementException();
    }
}
