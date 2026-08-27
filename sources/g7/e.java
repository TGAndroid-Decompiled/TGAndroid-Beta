package g7;

public final class e implements i {

    public final int f6448a;

    public e(int i10) {
        this.f6448a = i10;
    }

    @Override
    public final Class annotationType() {
        return i.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        if (this.f6448a != ((e) ((i) obj)).f6448a) {
            return false;
        }
        Object obj2 = h.f6491a;
        return obj2.equals(obj2);
    }

    @Override
    public final int hashCode() {
        return (this.f6448a ^ 14552422) + (h.f6491a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f6448a + "intEncoding=" + h.f6491a + ')';
    }
}
