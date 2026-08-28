package gh;
public final class l4 {
    public float f8488a;
    public final int f8489b;
    public final int f8490c;

    public l4(float f10, int i9, int i10) {
        this.f8488a = f10;
        this.f8489b = i9;
        this.f8490c = i10;
    }

    public float a(int i9) {
        int i10 = this.f8489b;
        int i11 = this.f8490c;
        if (i11 == i9 && i10 == i9) {
            return 1.0f;
        }
        if (i11 == i9) {
            return this.f8488a;
        }
        if (i10 == i9) {
            return 1.0f - this.f8488a;
        }
        return 0.0f;
    }

    public boolean b(int i9) {
        if (this.f8489b != i9 && this.f8490c != i9) {
            return false;
        }
        return true;
    }

    public boolean c(int i9) {
        if (this.f8490c == i9) {
            return true;
        }
        return false;
    }

    public boolean d(int i9) {
        if (this.f8490c == i9) {
            return true;
        }
        return false;
    }

    public l4(int i9, int i10) {
        this.f8489b = i9;
        this.f8490c = i10;
    }
}
