package ma;
public final class a implements e {
    public final int f16812a;

    public a(int i10) {
        this.f16812a = i10;
    }

    @Override
    public final Class annotationType() {
        return e.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                if (this.f16812a == ((a) ((e) obj)).f16812a) {
                    Object obj2 = d.f16815a;
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
        return (14552422 ^ this.f16812a) + (d.f16815a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f16812a + "intEncoding=" + d.f16815a + ')';
    }
}
