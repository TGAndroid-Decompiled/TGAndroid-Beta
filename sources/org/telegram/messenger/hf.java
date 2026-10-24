package org.telegram.messenger;

import org.telegram.ui.sn;
import org.webrtc.TextureViewRenderer;
public final class hf implements Runnable {
    public final int f18596a;
    public final int f18597b;
    public final int f18598c;
    public final int d;
    public final int e;
    public final Object f18599f;

    public hf(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f18596a = i14;
        this.f18599f = obj;
        this.f18597b = i10;
        this.f18598c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f18596a) {
            case 0:
                ((MessagesStorage) this.f18599f).lambda$saveDiffParams$35(this.f18597b, this.f18598c, this.d, this.e);
                return;
            case 1:
                sn.w1((sn) this.f18599f, this.f18597b, this.f18598c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f18599f, this.f18597b, this.f18598c, this.d, this.e);
                return;
        }
    }
}
