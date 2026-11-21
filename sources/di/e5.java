package di;
public final class e5 {
    public float f8736a;
    public final int f8737b;
    public final int f8738c;

    public e5(float f10, int i7, int i10) {
        this.f8736a = f10;
        this.f8737b = i7;
        this.f8738c = i10;
    }

    public float a(int i7) {
        int i10 = this.f8737b;
        int i11 = this.f8738c;
        if (i11 == i7 && i10 == i7) {
            return 1.0f;
        }
        if (i11 == i7) {
            return this.f8736a;
        }
        if (i10 == i7) {
            return 1.0f - this.f8736a;
        }
        return 0.0f;
    }

    public boolean b(int i7) {
        if (this.f8737b != i7 && this.f8738c != i7) {
            return false;
        }
        return true;
    }

    public boolean c(int i7) {
        if (this.f8738c == i7) {
            return true;
        }
        return false;
    }

    public boolean d(int i7) {
        if (this.f8738c == i7) {
            return true;
        }
        return false;
    }

    public e5(int i7, int i10) {
        this.f8737b = i7;
        this.f8738c = i10;
    }
}
