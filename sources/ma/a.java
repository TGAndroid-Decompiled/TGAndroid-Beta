package ma;
public final class a implements e {
    public final int f15718a;

    public a(int i10) {
        this.f15718a = i10;
    }

    @Override
    public final Class annotationType() {
        return e.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                if (this.f15718a == ((a) ((e) obj)).f15718a) {
                    Object obj2 = d.f15721a;
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
        return (14552422 ^ this.f15718a) + (d.f15721a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f15718a + "intEncoding=" + d.f15721a + ')';
    }
}
