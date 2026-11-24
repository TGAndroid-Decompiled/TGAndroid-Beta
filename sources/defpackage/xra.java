package defpackage;
public final class xra {
    public final byte a;
    public final byte b;
    public float c;

    public xra(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final float a(int i) {
        byte b = this.b;
        byte b2 = this.a;
        if (b == i) {
            if (b2 == i) {
                return 1.0f;
            }
            return this.c;
        } else if (b2 == i) {
            return 1.0f - this.c;
        } else {
            return 0.0f;
        }
    }

    public final boolean b(int i) {
        if (this.a != i && this.b != i) {
            return false;
        }
        return true;
    }

    public final boolean c(int i) {
        if (this.b == i) {
            return true;
        }
        return false;
    }

    public final boolean d(int i) {
        if (this.b == i) {
            return true;
        }
        return false;
    }
}
