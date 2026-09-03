package k7;
public final class a implements d {
    public final int f9737a;

    public a(int i10) {
        this.f9737a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f9737a == ((a) ((d) obj)).f9737a) {
                    Object obj2 = c.f9752a;
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
        return (this.f9737a ^ 14552422) + (c.f9752a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f9737a + "intEncoding=" + c.f9752a + ')';
    }
}
