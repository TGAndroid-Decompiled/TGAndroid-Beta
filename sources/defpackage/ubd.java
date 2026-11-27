package defpackage;
public final class ubd implements bdd {
    public final byte a;

    public ubd(int i) {
        this.a = i;
    }

    @Override
    public final Class annotationType() {
        return bdd.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bdd) {
                bdd bddVar = (bdd) obj;
                if (this.a == bddVar.zza() && vcd.a.equals(bddVar.zzb())) {
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
        return (this.a ^ 14552422) + (vcd.a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + vcd.a + ')';
    }

    @Override
    public final int zza() {
        return this.a;
    }

    @Override
    public final vcd zzb() {
        return vcd.a;
    }
}
