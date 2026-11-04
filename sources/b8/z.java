package b8;
public final class z implements e0 {
    public final int f3152a;

    public z(int i3) {
        this.f3152a = i3;
    }

    @Override
    public final Class annotationType() {
        return e0.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e0) {
                if (this.f3152a == ((z) ((e0) obj)).f3152a) {
                    Object obj2 = d0.f2532a;
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
        return (this.f3152a ^ 14552422) + (d0.f2532a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f3152a + "intEncoding=" + d0.f2532a + ')';
    }
}
