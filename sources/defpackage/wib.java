package defpackage;
public final class wib {
    public static final wib e = new wib(false, new tib(Integer.MIN_VALUE, -2147483647), zib.T, 0.0f);
    public final boolean a;
    public final tib b;
    public final lib c;
    public final float d;

    public wib(boolean z, tib tibVar, lib libVar, float f) {
        this.a = z;
        this.b = tibVar;
        this.c = libVar;
        this.d = f;
    }

    public final lib a(boolean z) {
        lib libVar = zib.T;
        lib libVar2 = this.c;
        if (libVar2 != libVar) {
            return libVar2;
        }
        if (this.d == 0.0f) {
            if (z) {
                return zib.U;
            }
            return zib.V;
        }
        return zib.W;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && wib.class == obj.getClass()) {
                wib wibVar = (wib) obj;
                if (this.c.equals(wibVar.c) && this.b.equals(wibVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
