package j7;
public final class s implements w {
    public final int f14089a;

    public s(int i9) {
        this.f14089a = i9;
    }

    @Override
    public final Class annotationType() {
        return w.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w) {
                if (this.f14089a == ((s) ((w) obj)).f14089a) {
                    Object obj2 = v.f14119a;
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
        return (this.f14089a ^ 14552422) + (v.f14119a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f14089a + "intEncoding=" + v.f14119a + ')';
    }
}
