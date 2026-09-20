package e2;

import java.util.NoSuchElementException;
public final class q implements w3.c {
    public int f7922a;
    public int f7923b;
    public int f7924c;
    public int d;
    public Object e;

    @Override
    public int a() {
        return -1;
    }

    @Override
    public int b() {
        return this.f7922a;
    }

    @Override
    public int c() {
        v vVar = (v) this.e;
        int i10 = this.f7923b;
        if (i10 == 8) {
            return vVar.x();
        }
        if (i10 == 16) {
            return vVar.D();
        }
        int i11 = this.f7924c;
        this.f7924c = i11 + 1;
        if (i11 % 2 == 0) {
            int x10 = vVar.x();
            this.d = x10;
            return (x10 & 240) >> 4;
        }
        return this.d & 15;
    }

    public long d() {
        int i10 = this.f7924c;
        if (i10 != 0) {
            int i11 = this.f7922a;
            long j3 = ((long[]) this.e)[i11];
            this.f7922a = this.d & (i11 + 1);
            this.f7924c = i10 - 1;
            return j3;
        }
        throw new NoSuchElementException();
    }
}
