package f4;
public final class d {
    public final int f8874a;
    public final int f8875b;
    public float f8876c;

    public d(float f7, int i10, int i11) {
        this.f8876c = f7;
        this.f8874a = i10;
        this.f8875b = i11;
    }

    public float a(int i10) {
        int i11 = this.f8874a;
        int i12 = this.f8875b;
        if (i12 == i10 && i11 == i10) {
            return 1.0f;
        }
        if (i12 == i10) {
            return this.f8876c;
        }
        if (i11 == i10) {
            return 1.0f - this.f8876c;
        }
        return 0.0f;
    }

    public boolean b(int i10) {
        if (this.f8874a != i10 && this.f8875b != i10) {
            return false;
        }
        return true;
    }

    public boolean c(int i10) {
        if (this.f8875b == i10) {
            return true;
        }
        return false;
    }

    public boolean d(int i10) {
        if (this.f8875b == i10) {
            return true;
        }
        return false;
    }

    public d(int i10, int i11) {
        this.f8874a = i10;
        this.f8875b = i11;
    }
}
