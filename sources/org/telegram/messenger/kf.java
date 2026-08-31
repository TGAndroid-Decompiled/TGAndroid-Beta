package org.telegram.messenger;

import org.telegram.ui.xn;
import org.webrtc.TextureViewRenderer;
public final class kf implements Runnable {
    public final int f19177a;
    public final int f19178b;
    public final int f19179c;
    public final int d;
    public final int f19180e;
    public final Object f19181f;

    public kf(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f19177a = i14;
        this.f19181f = obj;
        this.f19178b = i10;
        this.f19179c = i11;
        this.d = i12;
        this.f19180e = i13;
    }

    @Override
    public final void run() {
        switch (this.f19177a) {
            case 0:
                ((MessagesStorage) this.f19181f).lambda$saveDiffParams$35(this.f19178b, this.f19179c, this.d, this.f19180e);
                return;
            case 1:
                xn.r1((xn) this.f19181f, this.f19178b, this.f19179c, this.d, this.f19180e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f19181f, this.f19178b, this.f19179c, this.d, this.f19180e);
                return;
        }
    }
}
