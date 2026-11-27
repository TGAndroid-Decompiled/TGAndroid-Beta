package defpackage;
public final class tnd implements bpd {
    public final byte a;

    public tnd(int i) {
        this.a = i;
    }

    @Override
    public final Class annotationType() {
        return bpd.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bpd) {
                bpd bpdVar = (bpd) obj;
                if (this.a == bpdVar.zza() && vod.a.equals(bpdVar.zzb())) {
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
        return (this.a ^ 14552422) + (vod.a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + vod.a + ')';
    }

    @Override
    public final int zza() {
        return this.a;
    }

    @Override
    public final vod zzb() {
        return vod.a;
    }
}
