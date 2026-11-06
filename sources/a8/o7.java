package a8;
public enum o7 implements l0 {
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
    
    public final int f568a;

    o7(int i7) {
        this.f568a = i7;
    }

    @Override
    public final int zza() {
        return this.f568a;
    }
}
