package defpackage;
public enum v4f implements thd {
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    TYPE_GMV(3);
    
    public final byte a;

    v4f(int i) {
        this.a = i;
    }

    @Override
    public final int zza() {
        return this.a;
    }
}
