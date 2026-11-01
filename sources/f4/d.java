package f4;
public final class d {
    public final int f6824a;
    public final int f6825b;
    public float f6826c;

    public d(float f7, int i10, int i11) {
        this.f6826c = f7;
        this.f6824a = i10;
        this.f6825b = i11;
    }

    public float a(int i10) {
        int i11 = this.f6824a;
        int i12 = this.f6825b;
        if (i12 == i10 && i11 == i10) {
            return 1.0f;
        }
        if (i12 == i10) {
            return this.f6826c;
        }
        if (i11 == i10) {
            return 1.0f - this.f6826c;
        }
        return 0.0f;
    }

    public boolean b(int i10) {
        if (this.f6824a != i10 && this.f6825b != i10) {
            return false;
        }
        return true;
    }

    public boolean c(int i10) {
        if (this.f6825b == i10) {
            return true;
        }
        return false;
    }

    public boolean d(int i10) {
        if (this.f6825b == i10) {
            return true;
        }
        return false;
    }

    public d(int i10, int i11) {
        this.f6824a = i10;
        this.f6825b = i11;
    }
}
