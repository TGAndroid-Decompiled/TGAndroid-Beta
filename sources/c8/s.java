package c8;
public final class s implements w {
    public final int f4940a;

    public s(int i7) {
        this.f4940a = i7;
    }

    @Override
    public final Class annotationType() {
        return w.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w) {
                if (this.f4940a == ((s) ((w) obj)).f4940a) {
                    Object obj2 = v.f5007a;
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
        return (this.f4940a ^ 14552422) + (v.f5007a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f4940a + "intEncoding=" + v.f5007a + ')';
    }
}
