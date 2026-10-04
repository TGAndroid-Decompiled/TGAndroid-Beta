package f4;
public final class d {
    public final int f9632a;
    public final int f9633b;
    public float f9634c;

    public d(float f7, int i10, int i11) {
        this.f9634c = f7;
        this.f9632a = i10;
        this.f9633b = i11;
    }

    public float a(int i10) {
        int i11 = this.f9632a;
        int i12 = this.f9633b;
        if (i12 == i10 && i11 == i10) {
            return 1.0f;
        }
        if (i12 == i10) {
            return this.f9634c;
        }
        if (i11 == i10) {
            return 1.0f - this.f9634c;
        }
        return 0.0f;
    }

    public boolean b(int i10) {
        if (this.f9632a != i10 && this.f9633b != i10) {
            return false;
        }
        return true;
    }

    public boolean c(int i10) {
        if (this.f9633b == i10) {
            return true;
        }
        return false;
    }

    public boolean d(int i10) {
        if (this.f9633b == i10) {
            return true;
        }
        return false;
    }

    public d(int i10, int i11) {
        this.f9632a = i10;
        this.f9633b = i11;
    }
}
