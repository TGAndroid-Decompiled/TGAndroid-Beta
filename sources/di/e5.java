package di;
public final class e5 {
    public float f8700a;
    public final int f8701b;
    public final int f8702c;

    public e5(float f10, int i7, int i10) {
        this.f8700a = f10;
        this.f8701b = i7;
        this.f8702c = i10;
    }

    public float a(int i7) {
        int i10 = this.f8701b;
        int i11 = this.f8702c;
        if (i11 == i7 && i10 == i7) {
            return 1.0f;
        }
        if (i11 == i7) {
            return this.f8700a;
        }
        if (i10 == i7) {
            return 1.0f - this.f8700a;
        }
        return 0.0f;
    }

    public boolean b(int i7) {
        if (this.f8701b != i7 && this.f8702c != i7) {
            return false;
        }
        return true;
    }

    public boolean c(int i7) {
        if (this.f8702c == i7) {
            return true;
        }
        return false;
    }

    public boolean d(int i7) {
        if (this.f8702c == i7) {
            return true;
        }
        return false;
    }

    public e5(int i7, int i10) {
        this.f8701b = i7;
        this.f8702c = i10;
    }
}
