package defpackage;
public final class eld implements mmd {
    public final byte a;

    public eld(int i) {
        this.a = i;
    }

    @Override
    public final Class annotationType() {
        return mmd.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mmd) {
                mmd mmdVar = (mmd) obj;
                if (this.a == mmdVar.zza() && gmd.a.equals(mmdVar.zzb())) {
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
        return (this.a ^ 14552422) + (gmd.a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + gmd.a + ')';
    }

    @Override
    public final int zza() {
        return this.a;
    }

    @Override
    public final gmd zzb() {
        return gmd.a;
    }
}
