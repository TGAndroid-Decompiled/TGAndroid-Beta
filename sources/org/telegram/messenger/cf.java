package org.telegram.messenger;

import org.telegram.ui.sn;
import org.webrtc.TextureViewRenderer;
public final class cf implements Runnable {
    public final int f18094a;
    public final int f18095b;
    public final int f18096c;
    public final int d;
    public final int e;
    public final Object f18097f;

    public cf(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f18094a = i14;
        this.f18097f = obj;
        this.f18095b = i10;
        this.f18096c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f18094a) {
            case 0:
                ((MessagesStorage) this.f18097f).lambda$saveDiffParams$35(this.f18095b, this.f18096c, this.d, this.e);
                return;
            case 1:
                sn.w1((sn) this.f18097f, this.f18095b, this.f18096c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f18097f, this.f18095b, this.f18096c, this.d, this.e);
                return;
        }
    }
}
