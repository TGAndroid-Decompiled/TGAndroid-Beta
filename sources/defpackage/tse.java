package defpackage;
public enum tse implements yjd {
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    TYPE_GMV(3);
    
    public final byte a;

    tse(int i) {
        this.a = i;
    }

    @Override
    public final int zza() {
        return this.a;
    }
}
