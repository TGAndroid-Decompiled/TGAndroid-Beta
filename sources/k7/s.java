package k7;

public final class s implements w {

    public final int f14943a;

    public s(int i10) {
        this.f14943a = i10;
    }

    @Override
    public final Class annotationType() {
        return w.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        if (this.f14943a != ((s) ((w) obj)).f14943a) {
            return false;
        }
        Object obj2 = v.f14973a;
        return obj2.equals(obj2);
    }

    @Override
    public final int hashCode() {
        return (this.f14943a ^ 14552422) + (v.f14973a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f14943a + "intEncoding=" + v.f14973a + ')';
    }
}
