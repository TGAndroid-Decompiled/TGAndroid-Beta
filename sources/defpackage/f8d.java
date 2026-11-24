package defpackage;
public final class f8d implements i9d {
    public final byte a;

    public f8d(int i) {
        this.a = i;
    }

    @Override
    public final Class annotationType() {
        return i9d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i9d) {
                i9d i9dVar = (i9d) obj;
                if (this.a == i9dVar.zza() && a9d.a.equals(i9dVar.zzb())) {
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
        return (this.a ^ 14552422) + (a9d.a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + a9d.a + ')';
    }

    @Override
    public final int zza() {
        return this.a;
    }

    @Override
    public final a9d zzb() {
        return a9d.a;
    }
}
