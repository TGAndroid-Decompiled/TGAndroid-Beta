package org.telegram.messenger;

import org.telegram.ui.eo;
import org.webrtc.TextureViewRenderer;
public final class of implements Runnable {
    public final int f15978a;
    public final int f15979b;
    public final int f15980c;
    public final int d;
    public final int e;
    public final Object f15981f;

    public of(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f15978a = i14;
        this.f15981f = obj;
        this.f15979b = i10;
        this.f15980c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f15978a) {
            case 0:
                ((MessagesStorage) this.f15981f).lambda$saveDiffParams$35(this.f15979b, this.f15980c, this.d, this.e);
                return;
            case 1:
                eo.r1((eo) this.f15981f, this.f15979b, this.f15980c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f15981f, this.f15979b, this.f15980c, this.d, this.e);
                return;
        }
    }
}
