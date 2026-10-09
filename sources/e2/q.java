package e2;

import java.util.NoSuchElementException;
public final class q implements w3.c {
    public int f8569a;
    public int f8570b;
    public int f8571c;
    public int d;
    public Object f8572e;

    @Override
    public int a() {
        return -1;
    }

    @Override
    public int b() {
        return this.f8569a;
    }

    @Override
    public int c() {
        v vVar = (v) this.f8572e;
        int i10 = this.f8570b;
        if (i10 == 8) {
            return vVar.x();
        }
        if (i10 == 16) {
            return vVar.D();
        }
        int i11 = this.f8571c;
        this.f8571c = i11 + 1;
        if (i11 % 2 == 0) {
            int x10 = vVar.x();
            this.d = x10;
            return (x10 & 240) >> 4;
        }
        return this.d & 15;
    }

    public long d() {
        int i10 = this.f8571c;
        if (i10 != 0) {
            int i11 = this.f8569a;
            long j3 = ((long[]) this.f8572e)[i11];
            this.f8569a = this.d & (i11 + 1);
            this.f8571c = i10 - 1;
            return j3;
        }
        throw new NoSuchElementException();
    }
}
