package defpackage;
public final class wad implements zbd {
    public final byte a;

    public wad(int i) {
        this.a = i;
    }

    @Override
    public final Class annotationType() {
        return zbd.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zbd) {
                zbd zbdVar = (zbd) obj;
                if (this.a == zbdVar.zza() && rbd.a.equals(zbdVar.zzb())) {
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
        return (this.a ^ 14552422) + (rbd.a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + rbd.a + ')';
    }

    @Override
    public final int zza() {
        return this.a;
    }

    @Override
    public final rbd zzb() {
        return rbd.a;
    }
}
