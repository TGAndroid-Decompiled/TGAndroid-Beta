package defpackage;
public final class bgd implements gid {
    public final short a;

    public bgd(int i) {
        this.a = i;
    }

    @Override
    public final Class annotationType() {
        return gid.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gid) {
                gid gidVar = (gid) obj;
                if (this.a == gidVar.zza() && aid.a.equals(gidVar.zzb())) {
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
        return (this.a ^ 14552422) + (aid.a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + aid.a + ')';
    }

    @Override
    public final int zza() {
        return this.a;
    }

    @Override
    public final aid zzb() {
        return aid.a;
    }
}
