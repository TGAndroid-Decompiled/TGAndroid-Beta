package hh;

public final class j4 {

    public float f9524a;

    public final int f9525b;

    public final int f9526c;

    public j4(float f10, int i10, int i11) {
        this.f9524a = f10;
        this.f9525b = i10;
        this.f9526c = i11;
    }

    public float a(int i10) {
        int i11 = this.f9525b;
        int i12 = this.f9526c;
        if (i12 == i10 && i11 == i10) {
            return 1.0f;
        }
        if (i12 == i10) {
            return this.f9524a;
        }
        if (i11 == i10) {
            return 1.0f - this.f9524a;
        }
        return 0.0f;
    }

    public boolean b(int i10) {
        return this.f9525b == i10 || this.f9526c == i10;
    }

    public boolean c(int i10) {
        return this.f9526c == i10;
    }

    public boolean d(int i10) {
        return this.f9526c == i10;
    }

    public j4(int i10, int i11) {
        this.f9525b = i10;
        this.f9526c = i11;
    }
}
