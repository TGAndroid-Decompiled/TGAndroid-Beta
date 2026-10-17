package ai;
public final class g6 {
    public float f1363a;
    public final int f1364b;
    public final int f1365c;

    public g6(float f7, int i10, int i11) {
        this.f1363a = f7;
        this.f1364b = i10;
        this.f1365c = i11;
    }

    public float a(int i10) {
        int i11 = this.f1364b;
        int i12 = this.f1365c;
        if (i12 == i10 && i11 == i10) {
            return 1.0f;
        }
        if (i12 == i10) {
            return this.f1363a;
        }
        if (i11 == i10) {
            return 1.0f - this.f1363a;
        }
        return 0.0f;
    }

    public boolean b(int i10) {
        if (this.f1364b != i10 && this.f1365c != i10) {
            return false;
        }
        return true;
    }

    public boolean c(int i10) {
        if (this.f1365c == i10) {
            return true;
        }
        return false;
    }

    public boolean d(int i10) {
        if (this.f1365c == i10) {
            return true;
        }
        return false;
    }

    public g6(int i10, int i11) {
        this.f1364b = i10;
        this.f1365c = i11;
    }
}
