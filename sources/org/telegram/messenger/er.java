package org.telegram.messenger;

import org.webrtc.TextureViewRenderer;
public final class er implements Runnable {
    public final int f23755a;
    public final int f23756b;
    public final int f23757c;
    public final int d;
    public final int f23758e;
    public final Object f23759f;

    public er(Object obj, int i7, int i10, int i11, int i12, int i13) {
        this.f23755a = i13;
        this.f23759f = obj;
        this.f23756b = i7;
        this.f23757c = i10;
        this.d = i11;
        this.f23758e = i12;
    }

    @Override
    public final void run() {
        switch (this.f23755a) {
            case 0:
                ((tr) this.f23759f).B1(this.f23756b, this.f23757c, this.d, this.f23758e);
                return;
            case 1:
                org.telegram.ui.bn.g0((org.telegram.ui.bn) this.f23759f, this.f23756b, this.f23757c, this.d, this.f23758e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f23759f, this.f23756b, this.f23757c, this.d, this.f23758e);
                return;
        }
    }
}
