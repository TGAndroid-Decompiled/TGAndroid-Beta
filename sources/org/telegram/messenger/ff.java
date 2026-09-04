package org.telegram.messenger;

import org.telegram.ui.co;
import org.webrtc.TextureViewRenderer;
public final class ff implements Runnable {
    public final int f17658a;
    public final int f17659b;
    public final int f17660c;
    public final int d;
    public final int f17661e;
    public final Object f17662f;

    public ff(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f17658a = i14;
        this.f17662f = obj;
        this.f17659b = i10;
        this.f17660c = i11;
        this.d = i12;
        this.f17661e = i13;
    }

    @Override
    public final void run() {
        switch (this.f17658a) {
            case 0:
                ((MessagesStorage) this.f17662f).lambda$saveDiffParams$35(this.f17659b, this.f17660c, this.d, this.f17661e);
                return;
            case 1:
                co.r1((co) this.f17662f, this.f17659b, this.f17660c, this.d, this.f17661e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f17662f, this.f17659b, this.f17660c, this.d, this.f17661e);
                return;
        }
    }
}
