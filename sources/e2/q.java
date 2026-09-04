package e2;

import java.util.NoSuchElementException;
public final class q implements w3.b {
    public int f8774a;
    public int f8775b;
    public int f8776c;
    public int d;
    public Object f8777e;

    @Override
    public int a() {
        return -1;
    }

    @Override
    public int b() {
        return this.f8774a;
    }

    @Override
    public int c() {
        v vVar = (v) this.f8777e;
        int i10 = this.f8775b;
        if (i10 == 8) {
            return vVar.x();
        }
        if (i10 == 16) {
            return vVar.D();
        }
        int i11 = this.f8776c;
        this.f8776c = i11 + 1;
        if (i11 % 2 == 0) {
            int x10 = vVar.x();
            this.d = x10;
            return (x10 & 240) >> 4;
        }
        return this.d & 15;
    }

    public long d() {
        int i10 = this.f8776c;
        if (i10 != 0) {
            int i11 = this.f8774a;
            long j3 = ((long[]) this.f8777e)[i11];
            this.f8774a = this.d & (i11 + 1);
            this.f8776c = i10 - 1;
            return j3;
        }
        throw new NoSuchElementException();
    }
}
