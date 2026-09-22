package org.telegram.messenger;

import org.telegram.ui.zn;
import org.webrtc.TextureViewRenderer;
public final class ff implements Runnable {
    public final int f16366a;
    public final int f16367b;
    public final int f16368c;
    public final int d;
    public final int e;
    public final Object f16369f;

    public ff(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f16366a = i14;
        this.f16369f = obj;
        this.f16367b = i10;
        this.f16368c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f16366a) {
            case 0:
                ((MessagesStorage) this.f16369f).lambda$saveDiffParams$35(this.f16367b, this.f16368c, this.d, this.e);
                return;
            case 1:
                zn.C0((zn) this.f16369f, this.f16367b, this.f16368c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f16369f, this.f16367b, this.f16368c, this.d, this.e);
                return;
        }
    }
}
