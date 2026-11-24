package defpackage;
public final class vx implements et8 {
    public final byte a;

    public vx(int i) {
        this.a = i;
    }

    @Override
    public final Class annotationType() {
        return et8.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof et8) {
                et8 et8Var = (et8) obj;
                if (this.a == et8Var.tag() && dt8.a.equals(et8Var.intEncoding())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return (this.a ^ 14552422) + (dt8.a.hashCode() ^ 2041407134);
    }

    @Override
    public final dt8 intEncoding() {
        return dt8.a;
    }

    @Override
    public final int tag() {
        return this.a;
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + dt8.a + ')';
    }
}
