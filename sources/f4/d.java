package f4;
public final class d {
    public final int f7757a;
    public final int f7758b;
    public float f7759c;

    public d(float f7, int i10, int i11) {
        this.f7759c = f7;
        this.f7757a = i10;
        this.f7758b = i11;
    }

    public float a(int i10) {
        int i11 = this.f7757a;
        int i12 = this.f7758b;
        if (i12 == i10 && i11 == i10) {
            return 1.0f;
        }
        if (i12 == i10) {
            return this.f7759c;
        }
        if (i11 == i10) {
            return 1.0f - this.f7759c;
        }
        return 0.0f;
    }

    public boolean b(int i10) {
        if (this.f7757a != i10 && this.f7758b != i10) {
            return false;
        }
        return true;
    }

    public boolean c(int i10) {
        if (this.f7758b == i10) {
            return true;
        }
        return false;
    }

    public boolean d(int i10) {
        if (this.f7758b == i10) {
            return true;
        }
        return false;
    }

    public d(int i10, int i11) {
        this.f7757a = i10;
        this.f7758b = i11;
    }
}
