package di;
public final class b5 {
    public float f8249a;
    public final int f8250b;
    public final int f8251c;

    public b5(float f10, int i7, int i10) {
        this.f8249a = f10;
        this.f8250b = i7;
        this.f8251c = i10;
    }

    public float a(int i7) {
        int i10 = this.f8250b;
        int i11 = this.f8251c;
        if (i11 == i7 && i10 == i7) {
            return 1.0f;
        }
        if (i11 == i7) {
            return this.f8249a;
        }
        if (i10 == i7) {
            return 1.0f - this.f8249a;
        }
        return 0.0f;
    }

    public boolean b(int i7) {
        if (this.f8250b != i7 && this.f8251c != i7) {
            return false;
        }
        return true;
    }

    public boolean c(int i7) {
        if (this.f8251c == i7) {
            return true;
        }
        return false;
    }

    public boolean d(int i7) {
        if (this.f8251c == i7) {
            return true;
        }
        return false;
    }

    public b5(int i7, int i10) {
        this.f8250b = i7;
        this.f8251c = i10;
    }
}
