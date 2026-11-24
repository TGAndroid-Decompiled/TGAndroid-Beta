package defpackage;
public final class d9d implements kad {
    public final byte a;

    public d9d(int i) {
        this.a = i;
    }

    @Override
    public final Class annotationType() {
        return kad.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kad) {
                kad kadVar = (kad) obj;
                if (this.a == kadVar.zza() && ead.a.equals(kadVar.zzb())) {
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
        return (this.a ^ 14552422) + (ead.a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + ead.a + ')';
    }

    @Override
    public final int zza() {
        return this.a;
    }

    @Override
    public final ead zzb() {
        return ead.a;
    }
}
