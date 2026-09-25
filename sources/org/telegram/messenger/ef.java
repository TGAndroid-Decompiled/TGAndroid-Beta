package org.telegram.messenger;

import org.telegram.ui.wn;
import org.webrtc.TextureViewRenderer;
public final class ef implements Runnable {
    public final int f16289a;
    public final int f16290b;
    public final int f16291c;
    public final int d;
    public final int e;
    public final Object f16292f;

    public ef(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f16289a = i14;
        this.f16292f = obj;
        this.f16290b = i10;
        this.f16291c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f16289a) {
            case 0:
                ((MessagesStorage) this.f16292f).lambda$saveDiffParams$35(this.f16290b, this.f16291c, this.d, this.e);
                return;
            case 1:
                wn.B0((wn) this.f16292f, this.f16290b, this.f16291c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f16292f, this.f16290b, this.f16291c, this.d, this.e);
                return;
        }
    }
}
