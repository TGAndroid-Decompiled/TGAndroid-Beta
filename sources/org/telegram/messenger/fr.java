package org.telegram.messenger;

import org.webrtc.TextureViewRenderer;
public final class fr implements Runnable {
    public final int f23539a;
    public final int f23540b;
    public final int f23541c;
    public final int d;
    public final int f23542e;
    public final Object f23543f;

    public fr(Object obj, int i7, int i10, int i11, int i12, int i13) {
        this.f23539a = i13;
        this.f23543f = obj;
        this.f23540b = i7;
        this.f23541c = i10;
        this.d = i11;
        this.f23542e = i12;
    }

    @Override
    public final void run() {
        switch (this.f23539a) {
            case 0:
                ((vr) this.f23543f).B1(this.f23540b, this.f23541c, this.d, this.f23542e);
                return;
            case 1:
                org.telegram.ui.an.g0((org.telegram.ui.an) this.f23543f, this.f23540b, this.f23541c, this.d, this.f23542e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f23543f, this.f23540b, this.f23541c, this.d, this.f23542e);
                return;
        }
    }
}
