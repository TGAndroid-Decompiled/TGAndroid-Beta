package org.telegram.messenger;

import org.telegram.ui.co;
import org.webrtc.TextureViewRenderer;
public final class ff implements Runnable {
    public final int f17685a;
    public final int f17686b;
    public final int f17687c;
    public final int d;
    public final int f17688e;
    public final Object f17689f;

    public ff(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f17685a = i14;
        this.f17689f = obj;
        this.f17686b = i10;
        this.f17687c = i11;
        this.d = i12;
        this.f17688e = i13;
    }

    @Override
    public final void run() {
        switch (this.f17685a) {
            case 0:
                ((MessagesStorage) this.f17689f).lambda$saveDiffParams$35(this.f17686b, this.f17687c, this.d, this.f17688e);
                return;
            case 1:
                co.r1((co) this.f17689f, this.f17686b, this.f17687c, this.d, this.f17688e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f17689f, this.f17686b, this.f17687c, this.d, this.f17688e);
                return;
        }
    }
}
