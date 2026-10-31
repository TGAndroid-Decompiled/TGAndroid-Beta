package org.telegram.messenger;

import org.webrtc.TextureViewRenderer;
public final class qr implements Runnable {
    public final int f17614a;
    public final int f17615b;
    public final int f17616c;
    public final int d;
    public final int e;
    public final Object f17617f;

    public qr(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f17614a = i14;
        this.f17617f = obj;
        this.f17615b = i10;
        this.f17616c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f17614a) {
            case 0:
                ((hs) this.f17617f).B1(this.f17615b, this.f17616c, this.d, this.e);
                return;
            case 1:
                org.telegram.ui.un.z1((org.telegram.ui.un) this.f17617f, this.f17615b, this.f17616c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f17617f, this.f17615b, this.f17616c, this.d, this.e);
                return;
        }
    }
}
