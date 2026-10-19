package ai;
public final class h6 {
    public float f1423a;
    public final int f1424b;
    public final int f1425c;

    public h6(float f7, int i10, int i11) {
        this.f1423a = f7;
        this.f1424b = i10;
        this.f1425c = i11;
    }

    public float a(int i10) {
        int i11 = this.f1424b;
        int i12 = this.f1425c;
        if (i12 == i10 && i11 == i10) {
            return 1.0f;
        }
        if (i12 == i10) {
            return this.f1423a;
        }
        if (i11 == i10) {
            return 1.0f - this.f1423a;
        }
        return 0.0f;
    }

    public boolean b(int i10) {
        if (this.f1424b != i10 && this.f1425c != i10) {
            return false;
        }
        return true;
    }

    public boolean c(int i10) {
        if (this.f1425c == i10) {
            return true;
        }
        return false;
    }

    public boolean d(int i10) {
        if (this.f1425c == i10) {
            return true;
        }
        return false;
    }

    public h6(int i10, int i11) {
        this.f1424b = i10;
        this.f1425c = i11;
    }
}
