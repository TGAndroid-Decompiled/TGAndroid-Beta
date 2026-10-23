package org.telegram.messenger;

import org.telegram.ui.sn;
import org.webrtc.TextureViewRenderer;
public final class gf implements Runnable {
    public final int f18520a;
    public final int f18521b;
    public final int f18522c;
    public final int d;
    public final int e;
    public final Object f18523f;

    public gf(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f18520a = i14;
        this.f18523f = obj;
        this.f18521b = i10;
        this.f18522c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f18520a) {
            case 0:
                ((MessagesStorage) this.f18523f).lambda$saveDiffParams$35(this.f18521b, this.f18522c, this.d, this.e);
                return;
            case 1:
                sn.w1((sn) this.f18523f, this.f18521b, this.f18522c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f18523f, this.f18521b, this.f18522c, this.d, this.e);
                return;
        }
    }
}
