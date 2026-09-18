package la;
public final class a implements e {
    public final int f14088a;

    public a(int i10) {
        this.f14088a = i10;
    }

    @Override
    public final Class annotationType() {
        return e.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                if (this.f14088a == ((a) ((e) obj)).f14088a) {
                    Object obj2 = d.f14091a;
                    if (obj2.equals(obj2)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return (14552422 ^ this.f14088a) + (d.f14091a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f14088a + "intEncoding=" + d.f14091a + ')';
    }
}
