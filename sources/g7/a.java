package g7;
public final class a implements d {
    public final int f7121a;

    public a(int i9) {
        this.f7121a = i9;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f7121a == ((a) ((d) obj)).f7121a) {
                    Object obj2 = c.f7137a;
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
        return (this.f7121a ^ 14552422) + (c.f7137a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f7121a + "intEncoding=" + c.f7137a + ')';
    }
}
