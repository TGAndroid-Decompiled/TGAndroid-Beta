package org.telegram.messenger;

import org.telegram.ui.qn;
import org.webrtc.TextureViewRenderer;
public final class gf implements Runnable {
    public final int f18454a;
    public final int f18455b;
    public final int f18456c;
    public final int d;
    public final int e;
    public final Object f18457f;

    public gf(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f18454a = i14;
        this.f18457f = obj;
        this.f18455b = i10;
        this.f18456c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f18454a) {
            case 0:
                ((MessagesStorage) this.f18457f).lambda$saveDiffParams$35(this.f18455b, this.f18456c, this.d, this.e);
                return;
            case 1:
                qn.w1((qn) this.f18457f, this.f18455b, this.f18456c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f18457f, this.f18455b, this.f18456c, this.d, this.e);
                return;
        }
    }
}
