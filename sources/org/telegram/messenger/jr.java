package org.telegram.messenger;

import org.webrtc.TextureViewRenderer;
public final class jr implements Runnable {
    public final int f23594a;
    public final int f23595b;
    public final int f23596c;
    public final int d;
    public final int f23597e;
    public final Object f23598f;

    public jr(Object obj, int i7, int i10, int i11, int i12, int i13) {
        this.f23594a = i13;
        this.f23598f = obj;
        this.f23595b = i7;
        this.f23596c = i10;
        this.d = i11;
        this.f23597e = i12;
    }

    @Override
    public final void run() {
        switch (this.f23594a) {
            case 0:
                ((yr) this.f23598f).B1(this.f23595b, this.f23596c, this.d, this.f23597e);
                return;
            case 1:
                org.telegram.ui.cn.g0((org.telegram.ui.cn) this.f23598f, this.f23595b, this.f23596c, this.d, this.f23597e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f23598f, this.f23595b, this.f23596c, this.d, this.f23597e);
                return;
        }
    }
}
