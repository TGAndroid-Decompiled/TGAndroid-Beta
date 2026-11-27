package defpackage;
public final class wx implements nw8 {
    public final byte a;

    public wx(int i) {
        this.a = i;
    }

    @Override
    public final Class annotationType() {
        return nw8.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof nw8) {
                nw8 nw8Var = (nw8) obj;
                if (this.a == nw8Var.tag() && mw8.a.equals(nw8Var.intEncoding())) {
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
        return (this.a ^ 14552422) + (mw8.a.hashCode() ^ 2041407134);
    }

    @Override
    public final mw8 intEncoding() {
        return mw8.a;
    }

    @Override
    public final int tag() {
        return this.a;
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + mw8.a + ')';
    }
}
