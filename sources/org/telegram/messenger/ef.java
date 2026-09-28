package org.telegram.messenger;

import org.telegram.ui.wn;
import org.webrtc.TextureViewRenderer;
public final class ef implements Runnable {
    public final int f16297a;
    public final int f16298b;
    public final int f16299c;
    public final int d;
    public final int e;
    public final Object f16300f;

    public ef(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f16297a = i14;
        this.f16300f = obj;
        this.f16298b = i10;
        this.f16299c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f16297a) {
            case 0:
                ((MessagesStorage) this.f16300f).lambda$saveDiffParams$35(this.f16298b, this.f16299c, this.d, this.e);
                return;
            case 1:
                wn.B0((wn) this.f16300f, this.f16298b, this.f16299c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f16300f, this.f16298b, this.f16299c, this.d, this.e);
                return;
        }
    }
}
