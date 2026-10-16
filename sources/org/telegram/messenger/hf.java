package org.telegram.messenger;

import org.telegram.ui.fo;
import org.webrtc.TextureViewRenderer;
public final class hf implements Runnable {
    public final int f17118a;
    public final int f17119b;
    public final int f17120c;
    public final int d;
    public final int e;
    public final Object f17121f;

    public hf(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f17118a = i14;
        this.f17121f = obj;
        this.f17119b = i10;
        this.f17120c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f17118a) {
            case 0:
                ((MessagesStorage) this.f17121f).lambda$saveDiffParams$35(this.f17119b, this.f17120c, this.d, this.e);
                return;
            case 1:
                fo.w1((fo) this.f17121f, this.f17119b, this.f17120c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f17121f, this.f17119b, this.f17120c, this.d, this.e);
                return;
        }
    }
}
