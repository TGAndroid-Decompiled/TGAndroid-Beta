package org.telegram.messenger;

import org.telegram.ui.bo;
import org.webrtc.TextureViewRenderer;
public final class ff implements Runnable {
    public final int f16127a;
    public final int f16128b;
    public final int f16129c;
    public final int d;
    public final int e;
    public final Object f16130f;

    public ff(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f16127a = i14;
        this.f16130f = obj;
        this.f16128b = i10;
        this.f16129c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f16127a) {
            case 0:
                ((MessagesStorage) this.f16130f).lambda$saveDiffParams$35(this.f16128b, this.f16129c, this.d, this.e);
                return;
            case 1:
                bo.r1((bo) this.f16130f, this.f16128b, this.f16129c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f16130f, this.f16128b, this.f16129c, this.d, this.e);
                return;
        }
    }
}
