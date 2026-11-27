package defpackage;

import org.webrtc.VideoFrame;
public abstract class lmc {
    public static final int[] a;

    static {
        int[] iArr = new int[VideoFrame.TextureBuffer.Type.values().length];
        a = iArr;
        try {
            iArr[VideoFrame.TextureBuffer.Type.OES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[VideoFrame.TextureBuffer.Type.RGB.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
