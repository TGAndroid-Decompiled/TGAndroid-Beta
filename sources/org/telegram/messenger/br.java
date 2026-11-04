package org.telegram.messenger;

import org.webrtc.TextureViewRenderer;
public final class br implements Runnable {
    public final int f21873a;
    public final int f21874b;
    public final int f21875c;
    public final int d;
    public final int f21876e;
    public final Object f21877f;

    public br(Object obj, int i3, int i10, int i11, int i12, int i13) {
        this.f21873a = i13;
        this.f21877f = obj;
        this.f21874b = i3;
        this.f21875c = i10;
        this.d = i11;
        this.f21876e = i12;
    }

    @Override
    public final void run() {
        switch (this.f21873a) {
            case 0:
                ((qr) this.f21877f).B1(this.f21874b, this.f21875c, this.d, this.f21876e);
                return;
            case 1:
                org.telegram.ui.wm.f0((org.telegram.ui.wm) this.f21877f, this.f21874b, this.f21875c, this.d, this.f21876e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f21877f, this.f21874b, this.f21875c, this.d, this.f21876e);
                return;
        }
    }
}
