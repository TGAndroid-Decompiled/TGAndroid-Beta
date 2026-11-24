package defpackage;
public enum wue implements amd {
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    TYPE_GMV(3);
    
    public final byte a;

    wue(int i) {
        this.a = i;
    }

    @Override
    public final int zza() {
        return this.a;
    }
}
