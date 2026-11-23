package org.telegram.messenger;

import org.webrtc.TextureViewRenderer;
public final class fr implements Runnable {
    public final int f23928a;
    public final int f23929b;
    public final int f23930c;
    public final int d;
    public final int f23931e;
    public final Object f23932f;

    public fr(Object obj, int i7, int i10, int i11, int i12, int i13) {
        this.f23928a = i13;
        this.f23932f = obj;
        this.f23929b = i7;
        this.f23930c = i10;
        this.d = i11;
        this.f23931e = i12;
    }

    @Override
    public final void run() {
        switch (this.f23928a) {
            case 0:
                ((ur) this.f23932f).B1(this.f23929b, this.f23930c, this.d, this.f23931e);
                return;
            case 1:
                org.telegram.ui.bn.g0((org.telegram.ui.bn) this.f23932f, this.f23929b, this.f23930c, this.d, this.f23931e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f23932f, this.f23929b, this.f23930c, this.d, this.f23931e);
                return;
        }
    }
}
