package org.telegram.messenger;

import org.telegram.ui.zn;
import org.webrtc.TextureViewRenderer;
public final class ff implements Runnable {
    public final int f16311a;
    public final int f16312b;
    public final int f16313c;
    public final int d;
    public final int e;
    public final Object f16314f;

    public ff(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f16311a = i14;
        this.f16314f = obj;
        this.f16312b = i10;
        this.f16313c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f16311a) {
            case 0:
                ((MessagesStorage) this.f16314f).lambda$saveDiffParams$35(this.f16312b, this.f16313c, this.d, this.e);
                return;
            case 1:
                zn.C0((zn) this.f16314f, this.f16312b, this.f16313c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f16314f, this.f16312b, this.f16313c, this.d, this.e);
                return;
        }
    }
}
