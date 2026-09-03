package n7;
public final class s implements w {
    public final int f14704a;

    public s(int i10) {
        this.f14704a = i10;
    }

    @Override
    public final Class annotationType() {
        return w.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w) {
                if (this.f14704a == ((s) ((w) obj)).f14704a) {
                    Object obj2 = v.f14735a;
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
        return (this.f14704a ^ 14552422) + (v.f14735a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f14704a + "intEncoding=" + v.f14735a + ')';
    }
}
