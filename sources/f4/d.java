package f4;
public final class d {
    public final int f6823a;
    public final int f6824b;
    public float f6825c;

    public d(float f7, int i10, int i11) {
        this.f6825c = f7;
        this.f6823a = i10;
        this.f6824b = i11;
    }

    public float a(int i10) {
        int i11 = this.f6823a;
        int i12 = this.f6824b;
        if (i12 == i10 && i11 == i10) {
            return 1.0f;
        }
        if (i12 == i10) {
            return this.f6825c;
        }
        if (i11 == i10) {
            return 1.0f - this.f6825c;
        }
        return 0.0f;
    }

    public boolean b(int i10) {
        if (this.f6823a != i10 && this.f6824b != i10) {
            return false;
        }
        return true;
    }

    public boolean c(int i10) {
        if (this.f6824b == i10) {
            return true;
        }
        return false;
    }

    public boolean d(int i10) {
        if (this.f6824b == i10) {
            return true;
        }
        return false;
    }

    public d(int i10, int i11) {
        this.f6823a = i10;
        this.f6824b = i11;
    }
}
