package defpackage;

import org.webrtc.RendererCommon;
public abstract class omc {
    public static final int[] a;

    static {
        int[] iArr = new int[RendererCommon.ScalingType.values().length];
        a = iArr;
        try {
            iArr[RendererCommon.ScalingType.SCALE_ASPECT_FIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[RendererCommon.ScalingType.SCALE_ASPECT_FILL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[RendererCommon.ScalingType.SCALE_ASPECT_BALANCED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
