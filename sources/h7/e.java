package h7;
public final class e implements i {
    public final int f7599a;

    public e(int i10) {
        this.f7599a = i10;
    }

    @Override
    public final Class annotationType() {
        return i.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i) {
                if (this.f7599a == ((e) ((i) obj)).f7599a) {
                    Object obj2 = h.f7632a;
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
        return (this.f7599a ^ 14552422) + (h.f7632a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f7599a + "intEncoding=" + h.f7632a + ')';
    }
}
