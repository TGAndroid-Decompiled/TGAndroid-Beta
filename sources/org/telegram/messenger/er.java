package org.telegram.messenger;

import org.webrtc.TextureViewRenderer;
public final class er implements Runnable {
    public final int f23860a;
    public final int f23861b;
    public final int f23862c;
    public final int d;
    public final int f23863e;
    public final Object f23864f;

    public er(Object obj, int i7, int i10, int i11, int i12, int i13) {
        this.f23860a = i13;
        this.f23864f = obj;
        this.f23861b = i7;
        this.f23862c = i10;
        this.d = i11;
        this.f23863e = i12;
    }

    @Override
    public final void run() {
        switch (this.f23860a) {
            case 0:
                ((tr) this.f23864f).B1(this.f23861b, this.f23862c, this.d, this.f23863e);
                return;
            case 1:
                org.telegram.ui.bn.g0((org.telegram.ui.bn) this.f23864f, this.f23861b, this.f23862c, this.d, this.f23863e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f23864f, this.f23861b, this.f23862c, this.d, this.f23863e);
                return;
        }
    }
}
