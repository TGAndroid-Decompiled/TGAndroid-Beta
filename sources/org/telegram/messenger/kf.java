package org.telegram.messenger;

import org.telegram.ui.zn;
import org.webrtc.TextureViewRenderer;
public final class kf implements Runnable {
    public final int f17657a;
    public final int f17658b;
    public final int f17659c;
    public final int d;
    public final int e;
    public final Object f17660f;

    public kf(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f17657a = i14;
        this.f17660f = obj;
        this.f17658b = i10;
        this.f17659c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f17657a) {
            case 0:
                ((MessagesStorage) this.f17660f).lambda$saveDiffParams$35(this.f17658b, this.f17659c, this.d, this.e);
                return;
            case 1:
                zn.r1((zn) this.f17660f, this.f17658b, this.f17659c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f17660f, this.f17658b, this.f17659c, this.d, this.e);
                return;
        }
    }
}
