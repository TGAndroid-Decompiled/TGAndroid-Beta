package c5;
public final class d {
    public final int f2105a;
    public final int f2106b;
    public float f2107c;

    public d(float f10, int i10, int i11) {
        this.f2107c = f10;
        this.f2105a = i10;
        this.f2106b = i11;
    }

    public float a(int i10) {
        int i11 = this.f2105a;
        int i12 = this.f2106b;
        if (i12 == i10 && i11 == i10) {
            return 1.0f;
        }
        if (i12 == i10) {
            return this.f2107c;
        }
        if (i11 == i10) {
            return 1.0f - this.f2107c;
        }
        return 0.0f;
    }

    public boolean b(int i10) {
        if (this.f2105a != i10 && this.f2106b != i10) {
            return false;
        }
        return true;
    }

    public boolean c(int i10) {
        if (this.f2106b == i10) {
            return true;
        }
        return false;
    }

    public boolean d(int i10) {
        if (this.f2106b == i10) {
            return true;
        }
        return false;
    }

    public d(int i10, int i11) {
        this.f2105a = i10;
        this.f2106b = i11;
    }
}
