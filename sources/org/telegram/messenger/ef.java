package org.telegram.messenger;

import org.telegram.ui.co;
import org.webrtc.TextureViewRenderer;
public final class ef implements Runnable {
    public final int f17572a;
    public final int f17573b;
    public final int f17574c;
    public final int d;
    public final int f17575e;
    public final Object f17576f;

    public ef(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f17572a = i14;
        this.f17576f = obj;
        this.f17573b = i10;
        this.f17574c = i11;
        this.d = i12;
        this.f17575e = i13;
    }

    @Override
    public final void run() {
        switch (this.f17572a) {
            case 0:
                ((MessagesStorage) this.f17576f).lambda$saveDiffParams$35(this.f17573b, this.f17574c, this.d, this.f17575e);
                return;
            case 1:
                co.r1((co) this.f17576f, this.f17573b, this.f17574c, this.d, this.f17575e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f17576f, this.f17573b, this.f17574c, this.d, this.f17575e);
                return;
        }
    }
}
