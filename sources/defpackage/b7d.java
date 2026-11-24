package defpackage;
public final class b7d implements i8d {
    public final byte a;

    public b7d(int i) {
        this.a = i;
    }

    @Override
    public final Class annotationType() {
        return i8d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i8d) {
                i8d i8dVar = (i8d) obj;
                if (this.a == i8dVar.zza() && c8d.a.equals(i8dVar.zzb())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return (this.a ^ 14552422) + (c8d.a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + c8d.a + ')';
    }

    @Override
    public final int zza() {
        return this.a;
    }

    @Override
    public final c8d zzb() {
        return c8d.a;
    }
}
