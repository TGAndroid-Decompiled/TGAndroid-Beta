package org.telegram.messenger;

import org.webrtc.TextureViewRenderer;
public final class rr implements Runnable {
    public final int f17960a;
    public final int f17961b;
    public final int f17962c;
    public final int d;
    public final int e;
    public final Object f17963f;

    public rr(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f17960a = i14;
        this.f17963f = obj;
        this.f17961b = i10;
        this.f17962c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f17960a) {
            case 0:
                ((is) this.f17963f).B1(this.f17961b, this.f17962c, this.d, this.e);
                return;
            case 1:
                org.telegram.ui.un.m0((org.telegram.ui.un) this.f17963f, this.f17961b, this.f17962c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f17963f, this.f17961b, this.f17962c, this.d, this.e);
                return;
        }
    }
}
