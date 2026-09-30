package f4;
public final class d {
    public final int f8869a;
    public final int f8870b;
    public float f8871c;

    public d(float f7, int i10, int i11) {
        this.f8871c = f7;
        this.f8869a = i10;
        this.f8870b = i11;
    }

    public float a(int i10) {
        int i11 = this.f8869a;
        int i12 = this.f8870b;
        if (i12 == i10 && i11 == i10) {
            return 1.0f;
        }
        if (i12 == i10) {
            return this.f8871c;
        }
        if (i11 == i10) {
            return 1.0f - this.f8871c;
        }
        return 0.0f;
    }

    public boolean b(int i10) {
        if (this.f8869a != i10 && this.f8870b != i10) {
            return false;
        }
        return true;
    }

    public boolean c(int i10) {
        if (this.f8870b == i10) {
            return true;
        }
        return false;
    }

    public boolean d(int i10) {
        if (this.f8870b == i10) {
            return true;
        }
        return false;
    }

    public d(int i10, int i11) {
        this.f8869a = i10;
        this.f8870b = i11;
    }
}
