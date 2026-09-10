package la;
public final class a implements e {
    public final int f12827a;

    public a(int i10) {
        this.f12827a = i10;
    }

    @Override
    public final Class annotationType() {
        return e.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                if (this.f12827a == ((a) ((e) obj)).f12827a) {
                    Object obj2 = d.f12830a;
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
        return (14552422 ^ this.f12827a) + (d.f12830a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f12827a + "intEncoding=" + d.f12830a + ')';
    }
}
