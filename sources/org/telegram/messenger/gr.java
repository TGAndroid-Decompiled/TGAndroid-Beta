package org.telegram.messenger;

import org.webrtc.TextureViewRenderer;
public final class gr implements Runnable {
    public final int f23900a;
    public final int f23901b;
    public final int f23902c;
    public final int d;
    public final int f23903e;
    public final Object f23904f;

    public gr(Object obj, int i7, int i10, int i11, int i12, int i13) {
        this.f23900a = i13;
        this.f23904f = obj;
        this.f23901b = i7;
        this.f23902c = i10;
        this.d = i11;
        this.f23903e = i12;
    }

    @Override
    public final void run() {
        switch (this.f23900a) {
            case 0:
                ((vr) this.f23904f).B1(this.f23901b, this.f23902c, this.d, this.f23903e);
                return;
            case 1:
                org.telegram.ui.an.g0((org.telegram.ui.an) this.f23904f, this.f23901b, this.f23902c, this.d, this.f23903e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f23904f, this.f23901b, this.f23902c, this.d, this.f23903e);
                return;
        }
    }
}
