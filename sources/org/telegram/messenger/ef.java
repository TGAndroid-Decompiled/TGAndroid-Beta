package org.telegram.messenger;

import org.telegram.ui.zn;
import org.webrtc.TextureViewRenderer;
public final class ef implements Runnable {
    public final int f17759a;
    public final int f17760b;
    public final int f17761c;
    public final int d;
    public final int f17762e;
    public final Object f17763f;

    public ef(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f17759a = i14;
        this.f17763f = obj;
        this.f17760b = i10;
        this.f17761c = i11;
        this.d = i12;
        this.f17762e = i13;
    }

    @Override
    public final void run() {
        switch (this.f17759a) {
            case 0:
                ((MessagesStorage) this.f17763f).lambda$saveDiffParams$35(this.f17760b, this.f17761c, this.d, this.f17762e);
                return;
            case 1:
                zn.w1((zn) this.f17763f, this.f17760b, this.f17761c, this.d, this.f17762e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f17763f, this.f17760b, this.f17761c, this.d, this.f17762e);
                return;
        }
    }
}
