package l7;
public final class e0 implements h0 {
    public final int f11560a;

    public e0(int i10) {
        this.f11560a = i10;
    }

    @Override
    public final Class annotationType() {
        return h0.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h0) {
                if (this.f11560a == ((e0) ((h0) obj)).f11560a) {
                    Object obj2 = g0.f11578a;
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
        return (this.f11560a ^ 14552422) + (g0.f11578a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f11560a + "intEncoding=" + g0.f11578a + ')';
    }
}
