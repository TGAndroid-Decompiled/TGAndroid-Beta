package defpackage;
public final class cjd implements kkd {
    public final byte a;

    public cjd(int i) {
        this.a = i;
    }

    @Override
    public final Class annotationType() {
        return kkd.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kkd) {
                kkd kkdVar = (kkd) obj;
                if (this.a == kkdVar.zza() && ekd.a.equals(kkdVar.zzb())) {
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
        return (this.a ^ 14552422) + (ekd.a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + ekd.a + ')';
    }

    @Override
    public final int zza() {
        return this.a;
    }

    @Override
    public final ekd zzb() {
        return ekd.a;
    }
}
