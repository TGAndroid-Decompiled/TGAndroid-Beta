package na;
public final class a implements d {
    public final int f18742a;

    public a(int i10) {
        this.f18742a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f18742a == ((a) ((d) obj)).f18742a) {
                    Object obj2 = c.f18743a;
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
        return (14552422 ^ this.f18742a) + (c.f18743a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f18742a + "intEncoding=" + c.f18743a + ')';
    }
}
