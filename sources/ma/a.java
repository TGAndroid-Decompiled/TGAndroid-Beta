package ma;
public final class a implements e {
    public final int f16874a;

    public a(int i10) {
        this.f16874a = i10;
    }

    @Override
    public final Class annotationType() {
        return e.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                if (this.f16874a == ((a) ((e) obj)).f16874a) {
                    Object obj2 = d.f16877a;
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
        return (14552422 ^ this.f16874a) + (d.f16877a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f16874a + "intEncoding=" + d.f16877a + ')';
    }
}
