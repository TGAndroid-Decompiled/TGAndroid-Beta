package g2;

import java.util.NoSuchElementException;
public final class t implements y3.c {
    public int f11907a;
    public int f11908b;
    public int f11909c;
    public int d;
    public Object f11910e;

    @Override
    public int a() {
        return -1;
    }

    @Override
    public int b() {
        return this.f11907a;
    }

    @Override
    public int c() {
        y yVar = (y) this.f11910e;
        int i3 = this.f11908b;
        if (i3 == 8) {
            return yVar.A();
        }
        if (i3 == 16) {
            return yVar.H();
        }
        int i10 = this.f11909c;
        this.f11909c = i10 + 1;
        if (i10 % 2 == 0) {
            int A = yVar.A();
            this.d = A;
            return (A & 240) >> 4;
        }
        return this.d & 15;
    }

    public long d() {
        int i3 = this.f11909c;
        if (i3 != 0) {
            int i10 = this.f11907a;
            long j10 = ((long[]) this.f11910e)[i10];
            this.f11907a = this.d & (i10 + 1);
            this.f11909c = i3 - 1;
            return j10;
        }
        throw new NoSuchElementException();
    }
}
