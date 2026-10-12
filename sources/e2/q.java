package e2;

import java.util.NoSuchElementException;
public final class q implements w3.b {
    public int f8566a;
    public int f8567b;
    public int f8568c;
    public int d;
    public Object f8569e;

    @Override
    public int a() {
        return -1;
    }

    @Override
    public int b() {
        return this.f8566a;
    }

    @Override
    public int c() {
        v vVar = (v) this.f8569e;
        int i10 = this.f8567b;
        if (i10 == 8) {
            return vVar.x();
        }
        if (i10 == 16) {
            return vVar.D();
        }
        int i11 = this.f8568c;
        this.f8568c = i11 + 1;
        if (i11 % 2 == 0) {
            int x10 = vVar.x();
            this.d = x10;
            return (x10 & 240) >> 4;
        }
        return this.d & 15;
    }

    public long d() {
        int i10 = this.f8568c;
        if (i10 != 0) {
            int i11 = this.f8566a;
            long j3 = ((long[]) this.f8569e)[i11];
            this.f8566a = this.d & (i11 + 1);
            this.f8568c = i10 - 1;
            return j3;
        }
        throw new NoSuchElementException();
    }
}
