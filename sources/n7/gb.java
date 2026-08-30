package n7;
public enum gb implements u {
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    TYPE_GMV(3);
    
    public final int f14443a;

    gb(int i10) {
        this.f14443a = i10;
    }

    @Override
    public final int zza() {
        return this.f14443a;
    }
}
