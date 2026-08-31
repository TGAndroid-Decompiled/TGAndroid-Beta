package n7;
public final class s implements w {
    public final int f15719a;

    public s(int i10) {
        this.f15719a = i10;
    }

    @Override
    public final Class annotationType() {
        return w.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w) {
                if (this.f15719a == ((s) ((w) obj)).f15719a) {
                    Object obj2 = v.f15750a;
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
        return (this.f15719a ^ 14552422) + (v.f15750a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f15719a + "intEncoding=" + v.f15750a + ')';
    }
}
