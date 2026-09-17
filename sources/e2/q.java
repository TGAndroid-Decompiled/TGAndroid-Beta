package e2;

import java.util.NoSuchElementException;
public final class q implements w3.b {
    public int f8802a;
    public int f8803b;
    public int f8804c;
    public int d;
    public Object f8805e;

    @Override
    public int a() {
        return -1;
    }

    @Override
    public int b() {
        return this.f8802a;
    }

    @Override
    public int c() {
        v vVar = (v) this.f8805e;
        int i10 = this.f8803b;
        if (i10 == 8) {
            return vVar.x();
        }
        if (i10 == 16) {
            return vVar.D();
        }
        int i11 = this.f8804c;
        this.f8804c = i11 + 1;
        if (i11 % 2 == 0) {
            int x10 = vVar.x();
            this.d = x10;
            return (x10 & 240) >> 4;
        }
        return this.d & 15;
    }

    public long d() {
        int i10 = this.f8804c;
        if (i10 != 0) {
            int i11 = this.f8802a;
            long j3 = ((long[]) this.f8805e)[i11];
            this.f8802a = this.d & (i11 + 1);
            this.f8804c = i10 - 1;
            return j3;
        }
        throw new NoSuchElementException();
    }
}
