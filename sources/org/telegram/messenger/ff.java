package org.telegram.messenger;

import org.telegram.ui.zn;
import org.webrtc.TextureViewRenderer;
public final class ff implements Runnable {
    public final int f16351a;
    public final int f16352b;
    public final int f16353c;
    public final int d;
    public final int e;
    public final Object f16354f;

    public ff(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f16351a = i14;
        this.f16354f = obj;
        this.f16352b = i10;
        this.f16353c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f16351a) {
            case 0:
                ((MessagesStorage) this.f16354f).lambda$saveDiffParams$35(this.f16352b, this.f16353c, this.d, this.e);
                return;
            case 1:
                zn.C0((zn) this.f16354f, this.f16352b, this.f16353c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f16354f, this.f16352b, this.f16353c, this.d, this.e);
                return;
        }
    }
}
