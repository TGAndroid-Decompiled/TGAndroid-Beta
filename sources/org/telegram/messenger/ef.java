package org.telegram.messenger;

import org.telegram.ui.co;
import org.webrtc.TextureViewRenderer;
public final class ef implements Runnable {
    public final int f17599a;
    public final int f17600b;
    public final int f17601c;
    public final int d;
    public final int f17602e;
    public final Object f17603f;

    public ef(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f17599a = i14;
        this.f17603f = obj;
        this.f17600b = i10;
        this.f17601c = i11;
        this.d = i12;
        this.f17602e = i13;
    }

    @Override
    public final void run() {
        switch (this.f17599a) {
            case 0:
                ((MessagesStorage) this.f17603f).lambda$saveDiffParams$35(this.f17600b, this.f17601c, this.d, this.f17602e);
                return;
            case 1:
                co.r1((co) this.f17603f, this.f17600b, this.f17601c, this.d, this.f17602e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f17603f, this.f17600b, this.f17601c, this.d, this.f17602e);
                return;
        }
    }
}
