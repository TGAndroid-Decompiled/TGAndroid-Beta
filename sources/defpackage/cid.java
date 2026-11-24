package defpackage;
public final class cid implements ikd {
    public final short a;

    public cid(int i) {
        this.a = i;
    }

    @Override
    public final Class annotationType() {
        return ikd.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ikd) {
                ikd ikdVar = (ikd) obj;
                if (this.a == ikdVar.zza() && bkd.a.equals(ikdVar.zzb())) {
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
        return (this.a ^ 14552422) + (bkd.a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + bkd.a + ')';
    }

    @Override
    public final int zza() {
        return this.a;
    }

    @Override
    public final bkd zzb() {
        return bkd.a;
    }
}
