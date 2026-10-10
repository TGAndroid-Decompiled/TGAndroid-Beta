package org.telegram.messenger;

import org.telegram.ui.zn;
import org.webrtc.TextureViewRenderer;
public final class ef implements Runnable {
    public final int f17763a;
    public final int f17764b;
    public final int f17765c;
    public final int d;
    public final int f17766e;
    public final Object f17767f;

    public ef(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f17763a = i14;
        this.f17767f = obj;
        this.f17764b = i10;
        this.f17765c = i11;
        this.d = i12;
        this.f17766e = i13;
    }

    @Override
    public final void run() {
        switch (this.f17763a) {
            case 0:
                ((MessagesStorage) this.f17767f).lambda$saveDiffParams$35(this.f17764b, this.f17765c, this.d, this.f17766e);
                return;
            case 1:
                zn.w1((zn) this.f17767f, this.f17764b, this.f17765c, this.d, this.f17766e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f17767f, this.f17764b, this.f17765c, this.d, this.f17766e);
                return;
        }
    }
}
