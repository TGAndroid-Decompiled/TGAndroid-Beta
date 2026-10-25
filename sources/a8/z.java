package a8;
public final class z implements e0 {
    public final int f998a;

    public z(int i10) {
        this.f998a = i10;
    }

    @Override
    public final Class annotationType() {
        return e0.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e0) {
                if (this.f998a == ((z) ((e0) obj)).f998a) {
                    Object obj2 = d0.f398a;
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
        return (this.f998a ^ 14552422) + (d0.f398a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f998a + "intEncoding=" + d0.f398a + ')';
    }
}
