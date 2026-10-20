package org.telegram.messenger;

import org.telegram.ui.qn;
import org.webrtc.TextureViewRenderer;
public final class ef implements Runnable {
    public final int f18283a;
    public final int f18284b;
    public final int f18285c;
    public final int d;
    public final int e;
    public final Object f18286f;

    public ef(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f18283a = i14;
        this.f18286f = obj;
        this.f18284b = i10;
        this.f18285c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f18283a) {
            case 0:
                ((MessagesStorage) this.f18286f).lambda$saveDiffParams$35(this.f18284b, this.f18285c, this.d, this.e);
                return;
            case 1:
                qn.w1((qn) this.f18286f, this.f18284b, this.f18285c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f18286f, this.f18284b, this.f18285c, this.d, this.e);
                return;
        }
    }
}
