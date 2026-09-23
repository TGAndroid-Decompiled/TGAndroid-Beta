package org.telegram.messenger;

import org.telegram.ui.xn;
import org.webrtc.TextureViewRenderer;
public final class ef implements Runnable {
    public final int f16035a;
    public final int f16036b;
    public final int f16037c;
    public final int d;
    public final int e;
    public final Object f16038f;

    public ef(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f16035a = i14;
        this.f16038f = obj;
        this.f16036b = i10;
        this.f16037c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f16035a) {
            case 0:
                ((MessagesStorage) this.f16038f).lambda$saveDiffParams$35(this.f16036b, this.f16037c, this.d, this.e);
                return;
            case 1:
                xn.r1((xn) this.f16038f, this.f16036b, this.f16037c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f16038f, this.f16036b, this.f16037c, this.d, this.e);
                return;
        }
    }
}
