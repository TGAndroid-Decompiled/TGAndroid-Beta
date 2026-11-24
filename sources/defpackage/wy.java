package defpackage;
public final class wy implements fv8 {
    public final byte a;

    public wy(int i) {
        this.a = i;
    }

    @Override
    public final Class annotationType() {
        return fv8.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fv8) {
                fv8 fv8Var = (fv8) obj;
                if (this.a == fv8Var.tag() && ev8.a.equals(fv8Var.intEncoding())) {
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
        return (this.a ^ 14552422) + (ev8.a.hashCode() ^ 2041407134);
    }

    @Override
    public final ev8 intEncoding() {
        return ev8.a;
    }

    @Override
    public final int tag() {
        return this.a;
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + ev8.a + ')';
    }
}
