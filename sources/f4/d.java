package f4;
public final class d {
    public final int f9256a;
    public final int f9257b;
    public float f9258c;

    public d(float f7, int i10, int i11) {
        this.f9258c = f7;
        this.f9256a = i10;
        this.f9257b = i11;
    }

    public float a(int i10) {
        int i11 = this.f9256a;
        int i12 = this.f9257b;
        if (i12 == i10 && i11 == i10) {
            return 1.0f;
        }
        if (i12 == i10) {
            return this.f9258c;
        }
        if (i11 == i10) {
            return 1.0f - this.f9258c;
        }
        return 0.0f;
    }

    public boolean b(int i10) {
        if (this.f9256a != i10 && this.f9257b != i10) {
            return false;
        }
        return true;
    }

    public boolean c(int i10) {
        if (this.f9257b == i10) {
            return true;
        }
        return false;
    }

    public boolean d(int i10) {
        if (this.f9257b == i10) {
            return true;
        }
        return false;
    }

    public d(int i10, int i11) {
        this.f9256a = i10;
        this.f9257b = i11;
    }
}
