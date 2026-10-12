package org.telegram.messenger;

import org.telegram.ui.fo;
import org.webrtc.TextureViewRenderer;
public final class hf implements Runnable {
    public final int f17421a;
    public final int f17422b;
    public final int f17423c;
    public final int d;
    public final int e;
    public final Object f17424f;

    public hf(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f17421a = i14;
        this.f17424f = obj;
        this.f17422b = i10;
        this.f17423c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f17421a) {
            case 0:
                ((MessagesStorage) this.f17424f).lambda$saveDiffParams$35(this.f17422b, this.f17423c, this.d, this.e);
                return;
            case 1:
                fo.w1((fo) this.f17424f, this.f17422b, this.f17423c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f17424f, this.f17422b, this.f17423c, this.d, this.e);
                return;
        }
    }
}
