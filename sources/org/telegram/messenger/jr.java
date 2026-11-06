package org.telegram.messenger;

import org.webrtc.TextureViewRenderer;
public final class jr implements Runnable {
    public final int f23575a;
    public final int f23576b;
    public final int f23577c;
    public final int d;
    public final int f23578e;
    public final Object f23579f;

    public jr(Object obj, int i7, int i10, int i11, int i12, int i13) {
        this.f23575a = i13;
        this.f23579f = obj;
        this.f23576b = i7;
        this.f23577c = i10;
        this.d = i11;
        this.f23578e = i12;
    }

    @Override
    public final void run() {
        switch (this.f23575a) {
            case 0:
                ((yr) this.f23579f).B1(this.f23576b, this.f23577c, this.d, this.f23578e);
                return;
            case 1:
                org.telegram.ui.an.f0((org.telegram.ui.an) this.f23579f, this.f23576b, this.f23577c, this.d, this.f23578e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f23579f, this.f23576b, this.f23577c, this.d, this.f23578e);
                return;
        }
    }
}
