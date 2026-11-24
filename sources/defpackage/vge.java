package defpackage;
public enum vge implements x7d {
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    TYPE_GMV(3);
    
    public final byte a;

    vge(int i) {
        this.a = i;
    }

    @Override
    public final int zza() {
        return this.a;
    }
}
