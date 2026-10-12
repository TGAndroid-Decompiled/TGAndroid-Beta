package org.telegram.messenger;

import org.telegram.ui.eo;
import org.webrtc.TextureViewRenderer;
public final class hf implements Runnable {
    public final int f17804a;
    public final int f17805b;
    public final int f17806c;
    public final int d;
    public final int f17807e;
    public final Object f17808f;

    public hf(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f17804a = i14;
        this.f17808f = obj;
        this.f17805b = i10;
        this.f17806c = i11;
        this.d = i12;
        this.f17807e = i13;
    }

    @Override
    public final void run() {
        switch (this.f17804a) {
            case 0:
                ((MessagesStorage) this.f17808f).lambda$saveDiffParams$35(this.f17805b, this.f17806c, this.d, this.f17807e);
                return;
            case 1:
                eo.w1((eo) this.f17808f, this.f17805b, this.f17806c, this.d, this.f17807e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f17808f, this.f17805b, this.f17806c, this.d, this.f17807e);
                return;
        }
    }
}
