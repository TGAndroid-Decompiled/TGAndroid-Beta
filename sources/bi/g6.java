package bi;
public final class g6 {
    public float f3942a;
    public final int f3943b;
    public final int f3944c;

    public g6(float f10, int i7, int i10) {
        this.f3942a = f10;
        this.f3943b = i7;
        this.f3944c = i10;
    }

    public float a(int i7) {
        int i10 = this.f3943b;
        int i11 = this.f3944c;
        if (i11 == i7 && i10 == i7) {
            return 1.0f;
        }
        if (i11 == i7) {
            return this.f3942a;
        }
        if (i10 == i7) {
            return 1.0f - this.f3942a;
        }
        return 0.0f;
    }

    public boolean b(int i7) {
        if (this.f3943b != i7 && this.f3944c != i7) {
            return false;
        }
        return true;
    }

    public boolean c(int i7) {
        if (this.f3944c == i7) {
            return true;
        }
        return false;
    }

    public boolean d(int i7) {
        if (this.f3944c == i7) {
            return true;
        }
        return false;
    }

    public g6(int i7, int i10) {
        this.f3943b = i7;
        this.f3944c = i10;
    }
}
