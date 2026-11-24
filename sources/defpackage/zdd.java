package defpackage;
public final class zdd extends qdd {
    public final ou8 a;

    public zdd(ou8 ou8Var) {
        this.a = ou8Var;
    }

    @Override
    public final Object a() {
        return this.a;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zdd) {
            return this.a.equals(((zdd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return tb4.y("Optional.of(", this.a.toString(), ")");
    }
}
