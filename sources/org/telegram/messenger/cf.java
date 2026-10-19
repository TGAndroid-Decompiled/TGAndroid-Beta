package org.telegram.messenger;

import org.telegram.ui.qn;
import org.webrtc.TextureViewRenderer;
public final class cf implements Runnable {
    public final int f18106a;
    public final int f18107b;
    public final int f18108c;
    public final int d;
    public final int e;
    public final Object f18109f;

    public cf(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f18106a = i14;
        this.f18109f = obj;
        this.f18107b = i10;
        this.f18108c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f18106a) {
            case 0:
                ((MessagesStorage) this.f18109f).lambda$saveDiffParams$35(this.f18107b, this.f18108c, this.d, this.e);
                return;
            case 1:
                qn.w1((qn) this.f18109f, this.f18107b, this.f18108c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f18109f, this.f18107b, this.f18108c, this.d, this.e);
                return;
        }
    }
}
