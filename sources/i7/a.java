package i7;
public final class a implements d {
    public final int f8257a;

    public a(int i10) {
        this.f8257a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f8257a == ((a) ((d) obj)).f8257a) {
                    Object obj2 = c.f8275a;
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
        return (this.f8257a ^ 14552422) + (c.f8275a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f8257a + "intEncoding=" + c.f8275a + ')';
    }
}
