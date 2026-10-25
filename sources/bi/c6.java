package bi;
public final class c6 {
    public float f4430a;
    public final int f4431b;
    public final int f4432c;

    public c6(float f7, int i10, int i11) {
        this.f4430a = f7;
        this.f4431b = i10;
        this.f4432c = i11;
    }

    public float a(int i10) {
        int i11 = this.f4431b;
        int i12 = this.f4432c;
        if (i12 == i10 && i11 == i10) {
            return 1.0f;
        }
        if (i12 == i10) {
            return this.f4430a;
        }
        if (i11 == i10) {
            return 1.0f - this.f4430a;
        }
        return 0.0f;
    }

    public boolean b(int i10) {
        if (this.f4431b != i10 && this.f4432c != i10) {
            return false;
        }
        return true;
    }

    public boolean c(int i10) {
        if (this.f4432c == i10) {
            return true;
        }
        return false;
    }

    public boolean d(int i10) {
        if (this.f4432c == i10) {
            return true;
        }
        return false;
    }

    public c6(int i10, int i11) {
        this.f4431b = i10;
        this.f4432c = i11;
    }
}
