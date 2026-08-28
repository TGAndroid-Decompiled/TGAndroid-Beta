package h7;
public final class e0 implements h0 {
    public final int f9911a;

    public e0(int i9) {
        this.f9911a = i9;
    }

    @Override
    public final Class annotationType() {
        return h0.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h0) {
                if (this.f9911a == ((e0) ((h0) obj)).f9911a) {
                    Object obj2 = g0.f9935a;
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
        return (this.f9911a ^ 14552422) + (g0.f9935a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f9911a + "intEncoding=" + g0.f9935a + ')';
    }
}
