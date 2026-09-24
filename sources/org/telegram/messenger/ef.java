package org.telegram.messenger;

import org.telegram.ui.wn;
import org.webrtc.TextureViewRenderer;
public final class ef implements Runnable {
    public final int f16274a;
    public final int f16275b;
    public final int f16276c;
    public final int d;
    public final int e;
    public final Object f16277f;

    public ef(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f16274a = i14;
        this.f16277f = obj;
        this.f16275b = i10;
        this.f16276c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f16274a) {
            case 0:
                ((MessagesStorage) this.f16277f).lambda$saveDiffParams$35(this.f16275b, this.f16276c, this.d, this.e);
                return;
            case 1:
                wn.B0((wn) this.f16277f, this.f16275b, this.f16276c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f16277f, this.f16275b, this.f16276c, this.d, this.e);
                return;
        }
    }
}
