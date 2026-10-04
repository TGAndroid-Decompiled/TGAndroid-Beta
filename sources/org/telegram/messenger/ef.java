package org.telegram.messenger;

import org.telegram.ui.yn;
import org.webrtc.TextureViewRenderer;
public final class ef implements Runnable {
    public final int f17764a;
    public final int f17765b;
    public final int f17766c;
    public final int d;
    public final int f17767e;
    public final Object f17768f;

    public ef(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f17764a = i14;
        this.f17768f = obj;
        this.f17765b = i10;
        this.f17766c = i11;
        this.d = i12;
        this.f17767e = i13;
    }

    @Override
    public final void run() {
        switch (this.f17764a) {
            case 0:
                ((MessagesStorage) this.f17768f).lambda$saveDiffParams$35(this.f17765b, this.f17766c, this.d, this.f17767e);
                return;
            case 1:
                yn.s1((yn) this.f17768f, this.f17765b, this.f17766c, this.d, this.f17767e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f17768f, this.f17765b, this.f17766c, this.d, this.f17767e);
                return;
        }
    }
}
