package a8;
public final class j0 implements n0 {
    public final int f496a;

    public j0(int i7) {
        this.f496a = i7;
    }

    @Override
    public final Class annotationType() {
        return n0.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n0) {
                if (this.f496a == ((j0) ((n0) obj)).f496a) {
                    Object obj2 = m0.f538a;
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
        return (this.f496a ^ 14552422) + (m0.f538a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f496a + "intEncoding=" + m0.f538a + ')';
    }
}
