package org.telegram.messenger;

import org.telegram.ui.xn;
import org.webrtc.TextureViewRenderer;
public final class ef implements Runnable {
    public final int f16283a;
    public final int f16284b;
    public final int f16285c;
    public final int d;
    public final int e;
    public final Object f16286f;

    public ef(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f16283a = i14;
        this.f16286f = obj;
        this.f16284b = i10;
        this.f16285c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f16283a) {
            case 0:
                ((MessagesStorage) this.f16286f).lambda$saveDiffParams$35(this.f16284b, this.f16285c, this.d, this.e);
                return;
            case 1:
                xn.B0((xn) this.f16286f, this.f16284b, this.f16285c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f16286f, this.f16284b, this.f16285c, this.d, this.e);
                return;
        }
    }
}
