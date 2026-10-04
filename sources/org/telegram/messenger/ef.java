package org.telegram.messenger;

import org.telegram.ui.yn;
import org.webrtc.TextureViewRenderer;
public final class ef implements Runnable {
    public final int f17765a;
    public final int f17766b;
    public final int f17767c;
    public final int d;
    public final int f17768e;
    public final Object f17769f;

    public ef(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f17765a = i14;
        this.f17769f = obj;
        this.f17766b = i10;
        this.f17767c = i11;
        this.d = i12;
        this.f17768e = i13;
    }

    @Override
    public final void run() {
        switch (this.f17765a) {
            case 0:
                ((MessagesStorage) this.f17769f).lambda$saveDiffParams$35(this.f17766b, this.f17767c, this.d, this.f17768e);
                return;
            case 1:
                yn.s1((yn) this.f17769f, this.f17766b, this.f17767c, this.d, this.f17768e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f17769f, this.f17766b, this.f17767c, this.d, this.f17768e);
                return;
        }
    }
}
