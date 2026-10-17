package ma;
public final class a implements e {
    public final int f16805a;

    public a(int i10) {
        this.f16805a = i10;
    }

    @Override
    public final Class annotationType() {
        return e.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                if (this.f16805a == ((a) ((e) obj)).f16805a) {
                    Object obj2 = d.f16808a;
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
        return (14552422 ^ this.f16805a) + (d.f16808a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f16805a + "intEncoding=" + d.f16808a + ')';
    }
}
