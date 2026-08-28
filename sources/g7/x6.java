package g7;
public enum x6 implements b {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    JPEG(8),
    BITMAP(4),
    CM_SAMPLE_BUFFER_REF(5),
    UI_IMAGE(6),
    CV_PIXEL_BUFFER_REF(9);
    
    public final int f7406a;

    x6(int i9) {
        this.f7406a = i9;
    }

    @Override
    public final int zza() {
        return this.f7406a;
    }
}
