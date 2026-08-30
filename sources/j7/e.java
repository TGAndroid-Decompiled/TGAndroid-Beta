package j7;
public final class e implements i {
    public final int f8978a;

    public e(int i10) {
        this.f8978a = i10;
    }

    @Override
    public final Class annotationType() {
        return i.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i) {
                if (this.f8978a == ((e) ((i) obj)).f8978a) {
                    Object obj2 = h.f9020a;
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
        return (this.f8978a ^ 14552422) + (h.f9020a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f8978a + "intEncoding=" + h.f9020a + ')';
    }
}
