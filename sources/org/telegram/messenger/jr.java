package org.telegram.messenger;

import org.webrtc.TextureViewRenderer;
public final class jr implements Runnable {
    public final int f23598a;
    public final int f23599b;
    public final int f23600c;
    public final int d;
    public final int f23601e;
    public final Object f23602f;

    public jr(Object obj, int i7, int i10, int i11, int i12, int i13) {
        this.f23598a = i13;
        this.f23602f = obj;
        this.f23599b = i7;
        this.f23600c = i10;
        this.d = i11;
        this.f23601e = i12;
    }

    @Override
    public final void run() {
        switch (this.f23598a) {
            case 0:
                ((yr) this.f23602f).B1(this.f23599b, this.f23600c, this.d, this.f23601e);
                return;
            case 1:
                org.telegram.ui.cn.g0((org.telegram.ui.cn) this.f23602f, this.f23599b, this.f23600c, this.d, this.f23601e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f23602f, this.f23599b, this.f23600c, this.d, this.f23601e);
                return;
        }
    }
}
