package la;
public final class a implements e {
    public final int f13932a;

    public a(int i10) {
        this.f13932a = i10;
    }

    @Override
    public final Class annotationType() {
        return e.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                if (this.f13932a == ((a) ((e) obj)).f13932a) {
                    Object obj2 = d.f13935a;
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
        return (14552422 ^ this.f13932a) + (d.f13935a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f13932a + "intEncoding=" + d.f13935a + ')';
    }
}
