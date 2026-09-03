package j7;
public final class e implements i {
    public final int f8960a;

    public e(int i10) {
        this.f8960a = i10;
    }

    @Override
    public final Class annotationType() {
        return i.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i) {
                if (this.f8960a == ((e) ((i) obj)).f8960a) {
                    Object obj2 = h.f8994a;
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
        return (this.f8960a ^ 14552422) + (h.f8994a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f8960a + "intEncoding=" + h.f8994a + ')';
    }
}
