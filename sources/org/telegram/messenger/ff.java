package org.telegram.messenger;

import org.telegram.ui.bo;
import org.webrtc.TextureViewRenderer;
public final class ff implements Runnable {
    public final int f16142a;
    public final int f16143b;
    public final int f16144c;
    public final int d;
    public final int e;
    public final Object f16145f;

    public ff(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f16142a = i14;
        this.f16145f = obj;
        this.f16143b = i10;
        this.f16144c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f16142a) {
            case 0:
                ((MessagesStorage) this.f16145f).lambda$saveDiffParams$35(this.f16143b, this.f16144c, this.d, this.e);
                return;
            case 1:
                bo.r1((bo) this.f16145f, this.f16143b, this.f16144c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f16145f, this.f16143b, this.f16144c, this.d, this.e);
                return;
        }
    }
}
