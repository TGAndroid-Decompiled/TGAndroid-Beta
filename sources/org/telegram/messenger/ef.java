package org.telegram.messenger;

import org.telegram.ui.zn;
import org.webrtc.TextureViewRenderer;
public final class ef implements Runnable {
    public final int f17797a;
    public final int f17798b;
    public final int f17799c;
    public final int d;
    public final int f17800e;
    public final Object f17801f;

    public ef(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f17797a = i14;
        this.f17801f = obj;
        this.f17798b = i10;
        this.f17799c = i11;
        this.d = i12;
        this.f17800e = i13;
    }

    @Override
    public final void run() {
        switch (this.f17797a) {
            case 0:
                ((MessagesStorage) this.f17801f).lambda$saveDiffParams$35(this.f17798b, this.f17799c, this.d, this.f17800e);
                return;
            case 1:
                zn.w1((zn) this.f17801f, this.f17798b, this.f17799c, this.d, this.f17800e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f17801f, this.f17798b, this.f17799c, this.d, this.f17800e);
                return;
        }
    }
}
