package org.telegram.messenger;

import org.telegram.ui.eo;
import org.webrtc.TextureViewRenderer;
public final class hf implements Runnable {
    public final int f17805a;
    public final int f17806b;
    public final int f17807c;
    public final int d;
    public final int f17808e;
    public final Object f17809f;

    public hf(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f17805a = i14;
        this.f17809f = obj;
        this.f17806b = i10;
        this.f17807c = i11;
        this.d = i12;
        this.f17808e = i13;
    }

    @Override
    public final void run() {
        switch (this.f17805a) {
            case 0:
                ((MessagesStorage) this.f17809f).lambda$saveDiffParams$35(this.f17806b, this.f17807c, this.d, this.f17808e);
                return;
            case 1:
                eo.w1((eo) this.f17809f, this.f17806b, this.f17807c, this.d, this.f17808e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f17809f, this.f17806b, this.f17807c, this.d, this.f17808e);
                return;
        }
    }
}
