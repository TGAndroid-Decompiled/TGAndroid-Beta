package c8;
public final class s implements w {
    public final int f5836a;

    public s(int i7) {
        this.f5836a = i7;
    }

    @Override
    public final Class annotationType() {
        return w.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w) {
                if (this.f5836a == ((s) ((w) obj)).f5836a) {
                    Object obj2 = v.f5903a;
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
        return (this.f5836a ^ 14552422) + (v.f5903a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f5836a + "intEncoding=" + v.f5903a + ')';
    }
}
