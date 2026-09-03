package org.telegram.messenger;

import org.telegram.ui.xn;
import org.webrtc.TextureViewRenderer;
public final class kf implements Runnable {
    public final int f19179a;
    public final int f19180b;
    public final int f19181c;
    public final int d;
    public final int f19182e;
    public final Object f19183f;

    public kf(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f19179a = i14;
        this.f19183f = obj;
        this.f19180b = i10;
        this.f19181c = i11;
        this.d = i12;
        this.f19182e = i13;
    }

    @Override
    public final void run() {
        switch (this.f19179a) {
            case 0:
                ((MessagesStorage) this.f19183f).lambda$saveDiffParams$35(this.f19180b, this.f19181c, this.d, this.f19182e);
                return;
            case 1:
                xn.r1((xn) this.f19183f, this.f19180b, this.f19181c, this.d, this.f19182e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f19183f, this.f19180b, this.f19181c, this.d, this.f19182e);
                return;
        }
    }
}
