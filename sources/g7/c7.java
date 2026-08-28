package g7;
public enum c7 implements b {
    SOURCE_UNKNOWN(0),
    BITMAP(1),
    BYTEARRAY(2),
    BYTEBUFFER(3),
    FILEPATH(4),
    ANDROID_MEDIA_IMAGE(5);
    
    public final int f7147a;

    c7(int i9) {
        this.f7147a = i9;
    }

    @Override
    public final int zza() {
        return this.f7147a;
    }
}
