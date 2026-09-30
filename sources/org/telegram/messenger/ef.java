package org.telegram.messenger;

import org.telegram.ui.wn;
import org.webrtc.TextureViewRenderer;
public final class ef implements Runnable {
    public final int f16314a;
    public final int f16315b;
    public final int f16316c;
    public final int d;
    public final int e;
    public final Object f16317f;

    public ef(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f16314a = i14;
        this.f16317f = obj;
        this.f16315b = i10;
        this.f16316c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f16314a) {
            case 0:
                ((MessagesStorage) this.f16317f).lambda$saveDiffParams$35(this.f16315b, this.f16316c, this.d, this.e);
                return;
            case 1:
                wn.B0((wn) this.f16317f, this.f16315b, this.f16316c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f16317f, this.f16315b, this.f16316c, this.d, this.e);
                return;
        }
    }
}
