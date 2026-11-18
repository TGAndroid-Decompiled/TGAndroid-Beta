package org.telegram.messenger;

import org.webrtc.TextureViewRenderer;
public final class er implements Runnable {
    public final int f23758a;
    public final int f23759b;
    public final int f23760c;
    public final int d;
    public final int f23761e;
    public final Object f23762f;

    public er(Object obj, int i7, int i10, int i11, int i12, int i13) {
        this.f23758a = i13;
        this.f23762f = obj;
        this.f23759b = i7;
        this.f23760c = i10;
        this.d = i11;
        this.f23761e = i12;
    }

    @Override
    public final void run() {
        switch (this.f23758a) {
            case 0:
                ((tr) this.f23762f).B1(this.f23759b, this.f23760c, this.d, this.f23761e);
                return;
            case 1:
                org.telegram.ui.bn.g0((org.telegram.ui.bn) this.f23762f, this.f23759b, this.f23760c, this.d, this.f23761e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f23762f, this.f23759b, this.f23760c, this.d, this.f23761e);
                return;
        }
    }
}
