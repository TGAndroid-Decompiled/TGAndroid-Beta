package defpackage;
public final class bhb {
    public static final bhb e = new bhb(false, new ygb(Integer.MIN_VALUE, -2147483647), ehb.T, 0.0f);
    public final boolean a;
    public final ygb b;
    public final qgb c;
    public final float d;

    public bhb(boolean z, ygb ygbVar, qgb qgbVar, float f) {
        this.a = z;
        this.b = ygbVar;
        this.c = qgbVar;
        this.d = f;
    }

    public final qgb a(boolean z) {
        qgb qgbVar = ehb.T;
        qgb qgbVar2 = this.c;
        if (qgbVar2 != qgbVar) {
            return qgbVar2;
        }
        if (this.d == 0.0f) {
            if (z) {
                return ehb.U;
            }
            return ehb.V;
        }
        return ehb.W;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && bhb.class == obj.getClass()) {
                bhb bhbVar = (bhb) obj;
                if (this.c.equals(bhbVar.c) && this.b.equals(bhbVar.b)) {
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
