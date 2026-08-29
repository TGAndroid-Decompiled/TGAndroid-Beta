package a5;
public final class d {
    public final int f162a;
    public final int f163b;
    public float f164c;

    public d(float f9, int i10, int i11) {
        this.f164c = f9;
        this.f162a = i10;
        this.f163b = i11;
    }

    public float a(int i10) {
        int i11 = this.f162a;
        int i12 = this.f163b;
        if (i12 == i10 && i11 == i10) {
            return 1.0f;
        }
        if (i12 == i10) {
            return this.f164c;
        }
        if (i11 == i10) {
            return 1.0f - this.f164c;
        }
        return 0.0f;
    }

    public boolean b(int i10) {
        if (this.f162a != i10 && this.f163b != i10) {
            return false;
        }
        return true;
    }

    public boolean c(int i10) {
        if (this.f163b == i10) {
            return true;
        }
        return false;
    }

    public boolean d(int i10) {
        if (this.f163b == i10) {
            return true;
        }
        return false;
    }

    public d(int i10, int i11) {
        this.f162a = i10;
        this.f163b = i11;
    }
}
