package k7;
public final class a implements d {
    public final int f10478a;

    public a(int i10) {
        this.f10478a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f10478a == ((a) ((d) obj)).f10478a) {
                    Object obj2 = c.f10495a;
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
        return (this.f10478a ^ 14552422) + (c.f10495a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f10478a + "intEncoding=" + c.f10495a + ')';
    }
}
