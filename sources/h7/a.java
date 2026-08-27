package h7;

public final class a implements d {

    public final int f8292a;

    public a(int i10) {
        this.f8292a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        if (this.f8292a != ((a) ((d) obj)).f8292a) {
            return false;
        }
        Object obj2 = c.f8309a;
        return obj2.equals(obj2);
    }

    @Override
    public final int hashCode() {
        return (this.f8292a ^ 14552422) + (c.f8309a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f8292a + "intEncoding=" + c.f8309a + ')';
    }
}
