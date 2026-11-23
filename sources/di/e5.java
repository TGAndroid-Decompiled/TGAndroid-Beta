package di;
public final class e5 {
    public float f8739a;
    public final int f8740b;
    public final int f8741c;

    public e5(float f10, int i7, int i10) {
        this.f8739a = f10;
        this.f8740b = i7;
        this.f8741c = i10;
    }

    public float a(int i7) {
        int i10 = this.f8740b;
        int i11 = this.f8741c;
        if (i11 == i7 && i10 == i7) {
            return 1.0f;
        }
        if (i11 == i7) {
            return this.f8739a;
        }
        if (i10 == i7) {
            return 1.0f - this.f8739a;
        }
        return 0.0f;
    }

    public boolean b(int i7) {
        if (this.f8740b != i7 && this.f8741c != i7) {
            return false;
        }
        return true;
    }

    public boolean c(int i7) {
        if (this.f8741c == i7) {
            return true;
        }
        return false;
    }

    public boolean d(int i7) {
        if (this.f8741c == i7) {
            return true;
        }
        return false;
    }

    public e5(int i7, int i10) {
        this.f8740b = i7;
        this.f8741c = i10;
    }
}
