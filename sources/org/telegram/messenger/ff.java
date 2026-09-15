package org.telegram.messenger;

import org.telegram.ui.bo;
import org.webrtc.TextureViewRenderer;
public final class ff implements Runnable {
    public final int f16133a;
    public final int f16134b;
    public final int f16135c;
    public final int d;
    public final int e;
    public final Object f16136f;

    public ff(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f16133a = i14;
        this.f16136f = obj;
        this.f16134b = i10;
        this.f16135c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f16133a) {
            case 0:
                ((MessagesStorage) this.f16136f).lambda$saveDiffParams$35(this.f16134b, this.f16135c, this.d, this.e);
                return;
            case 1:
                bo.r1((bo) this.f16136f, this.f16134b, this.f16135c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f16136f, this.f16134b, this.f16135c, this.d, this.e);
                return;
        }
    }
}
