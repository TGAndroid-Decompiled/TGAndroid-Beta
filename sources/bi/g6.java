package bi;
public final class g6 {
    public float f3939a;
    public final int f3940b;
    public final int f3941c;

    public g6(float f10, int i7, int i10) {
        this.f3939a = f10;
        this.f3940b = i7;
        this.f3941c = i10;
    }

    public float a(int i7) {
        int i10 = this.f3940b;
        int i11 = this.f3941c;
        if (i11 == i7 && i10 == i7) {
            return 1.0f;
        }
        if (i11 == i7) {
            return this.f3939a;
        }
        if (i10 == i7) {
            return 1.0f - this.f3939a;
        }
        return 0.0f;
    }

    public boolean b(int i7) {
        if (this.f3940b != i7 && this.f3941c != i7) {
            return false;
        }
        return true;
    }

    public boolean c(int i7) {
        if (this.f3941c == i7) {
            return true;
        }
        return false;
    }

    public boolean d(int i7) {
        if (this.f3941c == i7) {
            return true;
        }
        return false;
    }

    public g6(int i7, int i10) {
        this.f3940b = i7;
        this.f3941c = i10;
    }
}
