package i7;

public final class e0 implements h0 {

    public final int f10620a;

    public e0(int i10) {
        this.f10620a = i10;
    }

    @Override
    public final Class annotationType() {
        return h0.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        if (this.f10620a != ((e0) ((h0) obj)).f10620a) {
            return false;
        }
        Object obj2 = g0.f10644a;
        return obj2.equals(obj2);
    }

    @Override
    public final int hashCode() {
        return (this.f10620a ^ 14552422) + (g0.f10644a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f10620a + "intEncoding=" + g0.f10644a + ')';
    }
}
