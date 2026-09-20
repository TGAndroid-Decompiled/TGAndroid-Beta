package la;
public final class a implements e {
    public final int f14127a;

    public a(int i10) {
        this.f14127a = i10;
    }

    @Override
    public final Class annotationType() {
        return e.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                if (this.f14127a == ((a) ((e) obj)).f14127a) {
                    Object obj2 = d.f14130a;
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
        return (14552422 ^ this.f14127a) + (d.f14130a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f14127a + "intEncoding=" + d.f14130a + ')';
    }
}
