package org.telegram.messenger;

import org.telegram.ui.yn;
import org.webrtc.TextureViewRenderer;
public final class ef implements Runnable {
    public final int f17770a;
    public final int f17771b;
    public final int f17772c;
    public final int d;
    public final int f17773e;
    public final Object f17774f;

    public ef(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f17770a = i14;
        this.f17774f = obj;
        this.f17771b = i10;
        this.f17772c = i11;
        this.d = i12;
        this.f17773e = i13;
    }

    @Override
    public final void run() {
        switch (this.f17770a) {
            case 0:
                ((MessagesStorage) this.f17774f).lambda$saveDiffParams$35(this.f17771b, this.f17772c, this.d, this.f17773e);
                return;
            case 1:
                yn.s1((yn) this.f17774f, this.f17771b, this.f17772c, this.d, this.f17773e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f17774f, this.f17771b, this.f17772c, this.d, this.f17773e);
                return;
        }
    }
}
