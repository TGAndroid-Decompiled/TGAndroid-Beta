package l7;
public final class s implements w {
    public final int f14948a;

    public s(int i10) {
        this.f14948a = i10;
    }

    @Override
    public final Class annotationType() {
        return w.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w) {
                if (this.f14948a == ((s) ((w) obj)).f14948a) {
                    Object obj2 = v.f14978a;
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
        return (this.f14948a ^ 14552422) + (v.f14978a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f14948a + "intEncoding=" + v.f14978a + ')';
    }
}
