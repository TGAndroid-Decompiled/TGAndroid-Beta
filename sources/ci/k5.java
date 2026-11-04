package ci;
public final class k5 {
    public float f5380a;
    public final int f5381b;
    public final int f5382c;

    public k5(float f10, int i3, int i10) {
        this.f5380a = f10;
        this.f5381b = i3;
        this.f5382c = i10;
    }

    public float a(int i3) {
        int i10 = this.f5381b;
        int i11 = this.f5382c;
        if (i11 == i3 && i10 == i3) {
            return 1.0f;
        }
        if (i11 == i3) {
            return this.f5380a;
        }
        if (i10 == i3) {
            return 1.0f - this.f5380a;
        }
        return 0.0f;
    }

    public boolean b(int i3) {
        if (this.f5381b != i3 && this.f5382c != i3) {
            return false;
        }
        return true;
    }

    public boolean c(int i3) {
        if (this.f5382c == i3) {
            return true;
        }
        return false;
    }

    public boolean d(int i3) {
        if (this.f5382c == i3) {
            return true;
        }
        return false;
    }

    public k5(int i3, int i10) {
        this.f5381b = i3;
        this.f5382c = i10;
    }
}
