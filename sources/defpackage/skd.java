package defpackage;
public final class skd implements xmd {
    public final short a;

    public skd(int i) {
        this.a = i;
    }

    @Override
    public final Class annotationType() {
        return xmd.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xmd) {
                xmd xmdVar = (xmd) obj;
                if (this.a == xmdVar.zza() && rmd.a.equals(xmdVar.zzb())) {
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
        return (this.a ^ 14552422) + (rmd.a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + rmd.a + ')';
    }

    @Override
    public final int zza() {
        return this.a;
    }

    @Override
    public final rmd zzb() {
        return rmd.a;
    }
}
