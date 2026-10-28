package na;
public final class a implements d {
    public final int f18741a;

    public a(int i10) {
        this.f18741a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f18741a == ((a) ((d) obj)).f18741a) {
                    Object obj2 = c.f18742a;
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
        return (14552422 ^ this.f18741a) + (c.f18742a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f18741a + "intEncoding=" + c.f18742a + ')';
    }
}
