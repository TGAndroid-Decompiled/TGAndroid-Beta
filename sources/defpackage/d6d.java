package defpackage;
public final class d6d implements g7d {
    public final byte a;

    public d6d(int i) {
        this.a = i;
    }

    @Override
    public final Class annotationType() {
        return g7d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g7d) {
                g7d g7dVar = (g7d) obj;
                if (this.a == g7dVar.zza() && y6d.a.equals(g7dVar.zzb())) {
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
        return (this.a ^ 14552422) + (y6d.a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + y6d.a + ')';
    }

    @Override
    public final int zza() {
        return this.a;
    }

    @Override
    public final y6d zzb() {
        return y6d.a;
    }
}
