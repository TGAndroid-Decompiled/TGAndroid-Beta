package f4;
public final class d {
    public final int f8860a;
    public final int f8861b;
    public float f8862c;

    public d(float f7, int i10, int i11) {
        this.f8862c = f7;
        this.f8860a = i10;
        this.f8861b = i11;
    }

    public float a(int i10) {
        int i11 = this.f8860a;
        int i12 = this.f8861b;
        if (i12 == i10 && i11 == i10) {
            return 1.0f;
        }
        if (i12 == i10) {
            return this.f8862c;
        }
        if (i11 == i10) {
            return 1.0f - this.f8862c;
        }
        return 0.0f;
    }

    public boolean b(int i10) {
        if (this.f8860a != i10 && this.f8861b != i10) {
            return false;
        }
        return true;
    }

    public boolean c(int i10) {
        if (this.f8861b == i10) {
            return true;
        }
        return false;
    }

    public boolean d(int i10) {
        if (this.f8861b == i10) {
            return true;
        }
        return false;
    }

    public d(int i10, int i11) {
        this.f8860a = i10;
        this.f8861b = i11;
    }
}
