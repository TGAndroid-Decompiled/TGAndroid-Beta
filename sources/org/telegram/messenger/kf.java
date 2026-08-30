package org.telegram.messenger;

import org.telegram.ui.xn;
import org.webrtc.TextureViewRenderer;
public final class kf implements Runnable {
    public final int f17679a;
    public final int f17680b;
    public final int f17681c;
    public final int d;
    public final int e;
    public final Object f17682f;

    public kf(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f17679a = i14;
        this.f17682f = obj;
        this.f17680b = i10;
        this.f17681c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f17679a) {
            case 0:
                ((MessagesStorage) this.f17682f).lambda$saveDiffParams$35(this.f17680b, this.f17681c, this.d, this.e);
                return;
            case 1:
                xn.r1((xn) this.f17682f, this.f17680b, this.f17681c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f17682f, this.f17680b, this.f17681c, this.d, this.e);
                return;
        }
    }
}
