package defpackage;
public enum oke implements w6d {
    SOURCE_UNKNOWN(0),
    BITMAP(1),
    BYTEARRAY(2),
    BYTEBUFFER(3),
    FILEPATH(4),
    ANDROID_MEDIA_IMAGE(5);
    
    public final byte a;

    oke(int i) {
        this.a = i;
    }

    @Override
    public final int zza() {
        return this.a;
    }
}
