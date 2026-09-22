package e2;

import java.util.NoSuchElementException;
public final class q implements w3.b {
    public int f7919a;
    public int f7920b;
    public int f7921c;
    public int d;
    public Object e;

    @Override
    public int a() {
        return -1;
    }

    @Override
    public int b() {
        return this.f7919a;
    }

    @Override
    public int c() {
        v vVar = (v) this.e;
        int i10 = this.f7920b;
        if (i10 == 8) {
            return vVar.x();
        }
        if (i10 == 16) {
            return vVar.D();
        }
        int i11 = this.f7921c;
        this.f7921c = i11 + 1;
        if (i11 % 2 == 0) {
            int x10 = vVar.x();
            this.d = x10;
            return (x10 & 240) >> 4;
        }
        return this.d & 15;
    }

    public long d() {
        int i10 = this.f7921c;
        if (i10 != 0) {
            int i11 = this.f7919a;
            long j3 = ((long[]) this.e)[i11];
            this.f7919a = this.d & (i11 + 1);
            this.f7921c = i10 - 1;
            return j3;
        }
        throw new NoSuchElementException();
    }
}
