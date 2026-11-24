package defpackage;

import org.webrtc.TextureViewRenderer;
public final class gc7 implements Runnable {
    public final byte a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Object f;

    public gc7(Object obj, int i, int i2, int i3, int i4, byte b) {
        this.a = b;
        this.f = obj;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.e;
        int i2 = this.d;
        int i3 = this.c;
        int i4 = this.b;
        Object obj = this.f;
        switch (b) {
            case 0:
                ((ad7) obj).y1(i4, i3, i2, i);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) obj, i4, i3, i2, i);
                return;
        }
    }
}
