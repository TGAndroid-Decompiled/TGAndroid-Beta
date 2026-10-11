package e2;

import java.util.NoSuchElementException;
public final class q implements w3.c {
    public int f8568a;
    public int f8569b;
    public int f8570c;
    public int d;
    public Object f8571e;

    @Override
    public int a() {
        return -1;
    }

    @Override
    public int b() {
        return this.f8568a;
    }

    @Override
    public int c() {
        v vVar = (v) this.f8571e;
        int i10 = this.f8569b;
        if (i10 == 8) {
            return vVar.x();
        }
        if (i10 == 16) {
            return vVar.D();
        }
        int i11 = this.f8570c;
        this.f8570c = i11 + 1;
        if (i11 % 2 == 0) {
            int x10 = vVar.x();
            this.d = x10;
            return (x10 & 240) >> 4;
        }
        return this.d & 15;
    }

    public long d() {
        int i10 = this.f8570c;
        if (i10 != 0) {
            int i11 = this.f8568a;
            long j3 = ((long[]) this.f8571e)[i11];
            this.f8568a = this.d & (i11 + 1);
            this.f8570c = i10 - 1;
            return j3;
        }
        throw new NoSuchElementException();
    }
}
