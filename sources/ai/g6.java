package ai;
public final class g6 {
    public float f1342a;
    public final int f1343b;
    public final int f1344c;

    public g6(float f7, int i10, int i11) {
        this.f1342a = f7;
        this.f1343b = i10;
        this.f1344c = i11;
    }

    public float a(int i10) {
        int i11 = this.f1343b;
        int i12 = this.f1344c;
        if (i12 == i10 && i11 == i10) {
            return 1.0f;
        }
        if (i12 == i10) {
            return this.f1342a;
        }
        if (i11 == i10) {
            return 1.0f - this.f1342a;
        }
        return 0.0f;
    }

    public boolean b(int i10) {
        if (this.f1343b != i10 && this.f1344c != i10) {
            return false;
        }
        return true;
    }

    public boolean c(int i10) {
        if (this.f1344c == i10) {
            return true;
        }
        return false;
    }

    public boolean d(int i10) {
        if (this.f1344c == i10) {
            return true;
        }
        return false;
    }

    public g6(int i10, int i11) {
        this.f1343b = i10;
        this.f1344c = i11;
    }
}
