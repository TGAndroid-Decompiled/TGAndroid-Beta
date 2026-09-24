package e2;

import java.util.NoSuchElementException;
public final class q implements w3.c {
    public int f7904a;
    public int f7905b;
    public int f7906c;
    public int d;
    public Object e;

    @Override
    public int a() {
        return -1;
    }

    @Override
    public int b() {
        return this.f7904a;
    }

    @Override
    public int c() {
        v vVar = (v) this.e;
        int i10 = this.f7905b;
        if (i10 == 8) {
            return vVar.x();
        }
        if (i10 == 16) {
            return vVar.D();
        }
        int i11 = this.f7906c;
        this.f7906c = i11 + 1;
        if (i11 % 2 == 0) {
            int x10 = vVar.x();
            this.d = x10;
            return (x10 & 240) >> 4;
        }
        return this.d & 15;
    }

    public long d() {
        int i10 = this.f7906c;
        if (i10 != 0) {
            int i11 = this.f7904a;
            long j3 = ((long[]) this.e)[i11];
            this.f7904a = this.d & (i11 + 1);
            this.f7906c = i10 - 1;
            return j3;
        }
        throw new NoSuchElementException();
    }
}
