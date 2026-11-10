package c8;
public enum db implements u {
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    TYPE_GMV(3);
    
    public final int f5436a;

    db(int i7) {
        this.f5436a = i7;
    }

    @Override
    public final int zza() {
        return this.f5436a;
    }
}
