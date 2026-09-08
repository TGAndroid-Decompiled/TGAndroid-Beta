package f4;
public final class d {
    public final int f9284a;
    public final int f9285b;
    public float f9286c;

    public d(float f7, int i10, int i11) {
        this.f9286c = f7;
        this.f9284a = i10;
        this.f9285b = i11;
    }

    public float a(int i10) {
        int i11 = this.f9284a;
        int i12 = this.f9285b;
        if (i12 == i10 && i11 == i10) {
            return 1.0f;
        }
        if (i12 == i10) {
            return this.f9286c;
        }
        if (i11 == i10) {
            return 1.0f - this.f9286c;
        }
        return 0.0f;
    }

    public boolean b(int i10) {
        if (this.f9284a != i10 && this.f9285b != i10) {
            return false;
        }
        return true;
    }

    public boolean c(int i10) {
        if (this.f9285b == i10) {
            return true;
        }
        return false;
    }

    public boolean d(int i10) {
        if (this.f9285b == i10) {
            return true;
        }
        return false;
    }

    public d(int i10, int i11) {
        this.f9284a = i10;
        this.f9285b = i11;
    }
}
