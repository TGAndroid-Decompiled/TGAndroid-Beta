package org.telegram.messenger;

import org.telegram.ui.sn;
import org.webrtc.TextureViewRenderer;
public final class df implements Runnable {
    public final int f18187a;
    public final int f18188b;
    public final int f18189c;
    public final int d;
    public final int e;
    public final Object f18190f;

    public df(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f18187a = i14;
        this.f18190f = obj;
        this.f18188b = i10;
        this.f18189c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f18187a) {
            case 0:
                ((MessagesStorage) this.f18190f).lambda$saveDiffParams$35(this.f18188b, this.f18189c, this.d, this.e);
                return;
            case 1:
                sn.w1((sn) this.f18190f, this.f18188b, this.f18189c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f18190f, this.f18188b, this.f18189c, this.d, this.e);
                return;
        }
    }
}
