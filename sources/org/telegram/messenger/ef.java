package org.telegram.messenger;

import org.telegram.ui.zn;
import org.webrtc.TextureViewRenderer;
public final class ef implements Runnable {
    public final int f17761a;
    public final int f17762b;
    public final int f17763c;
    public final int d;
    public final int f17764e;
    public final Object f17765f;

    public ef(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f17761a = i14;
        this.f17765f = obj;
        this.f17762b = i10;
        this.f17763c = i11;
        this.d = i12;
        this.f17764e = i13;
    }

    @Override
    public final void run() {
        switch (this.f17761a) {
            case 0:
                ((MessagesStorage) this.f17765f).lambda$saveDiffParams$35(this.f17762b, this.f17763c, this.d, this.f17764e);
                return;
            case 1:
                zn.w1((zn) this.f17765f, this.f17762b, this.f17763c, this.d, this.f17764e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f17765f, this.f17762b, this.f17763c, this.d, this.f17764e);
                return;
        }
    }
}
