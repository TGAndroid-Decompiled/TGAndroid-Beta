package org.telegram.messenger;

import org.webrtc.TextureViewRenderer;
public final class jr implements Runnable {
    public final int f23582a;
    public final int f23583b;
    public final int f23584c;
    public final int d;
    public final int f23585e;
    public final Object f23586f;

    public jr(Object obj, int i7, int i10, int i11, int i12, int i13) {
        this.f23582a = i13;
        this.f23586f = obj;
        this.f23583b = i7;
        this.f23584c = i10;
        this.d = i11;
        this.f23585e = i12;
    }

    @Override
    public final void run() {
        switch (this.f23582a) {
            case 0:
                ((yr) this.f23586f).B1(this.f23583b, this.f23584c, this.d, this.f23585e);
                return;
            case 1:
                org.telegram.ui.an.f0((org.telegram.ui.an) this.f23586f, this.f23583b, this.f23584c, this.d, this.f23585e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f23586f, this.f23583b, this.f23584c, this.d, this.f23585e);
                return;
        }
    }
}
