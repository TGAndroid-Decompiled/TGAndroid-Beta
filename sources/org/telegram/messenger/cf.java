package org.telegram.messenger;

import org.telegram.ui.sn;
import org.webrtc.TextureViewRenderer;
public final class cf implements Runnable {
    public final int f18109a;
    public final int f18110b;
    public final int f18111c;
    public final int d;
    public final int e;
    public final Object f18112f;

    public cf(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f18109a = i14;
        this.f18112f = obj;
        this.f18110b = i10;
        this.f18111c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f18109a) {
            case 0:
                ((MessagesStorage) this.f18112f).lambda$saveDiffParams$35(this.f18110b, this.f18111c, this.d, this.e);
                return;
            case 1:
                sn.w1((sn) this.f18112f, this.f18110b, this.f18111c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f18112f, this.f18110b, this.f18111c, this.d, this.e);
                return;
        }
    }
}
