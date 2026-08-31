package j7;
public final class e implements i {
    public final int f9590a;

    public e(int i10) {
        this.f9590a = i10;
    }

    @Override
    public final Class annotationType() {
        return i.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i) {
                if (this.f9590a == ((e) ((i) obj)).f9590a) {
                    Object obj2 = h.f9625a;
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
        return (this.f9590a ^ 14552422) + (h.f9625a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f9590a + "intEncoding=" + h.f9625a + ')';
    }
}
