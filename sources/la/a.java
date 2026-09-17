package la;
public final class a implements e {
    public final int f15347a;

    public a(int i10) {
        this.f15347a = i10;
    }

    @Override
    public final Class annotationType() {
        return e.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                if (this.f15347a == ((a) ((e) obj)).f15347a) {
                    Object obj2 = d.f15350a;
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
        return (14552422 ^ this.f15347a) + (d.f15350a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f15347a + "intEncoding=" + d.f15350a + ')';
    }
}
