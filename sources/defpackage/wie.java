package defpackage;
public enum wie implements z9d {
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    TYPE_GMV(3);
    
    public final byte a;

    wie(int i) {
        this.a = i;
    }

    @Override
    public final int zza() {
        return this.a;
    }
}
