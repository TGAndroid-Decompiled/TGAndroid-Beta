package org.telegram.messenger;

import org.telegram.ui.wn;
import org.webrtc.TextureViewRenderer;
public final class gf implements Runnable {
    public final int f20169a;
    public final int f20170b;
    public final int f20171c;
    public final int d;
    public final int e;
    public final Object f20172f;

    public gf(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f20169a = i14;
        this.f20172f = obj;
        this.f20170b = i10;
        this.f20171c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f20169a) {
            case 0:
                ((MessagesStorage) this.f20172f).lambda$saveDiffParams$35(this.f20170b, this.f20171c, this.d, this.e);
                return;
            case 1:
                wn.x1((wn) this.f20172f, this.f20170b, this.f20171c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f20172f, this.f20170b, this.f20171c, this.d, this.e);
                return;
        }
    }
}
