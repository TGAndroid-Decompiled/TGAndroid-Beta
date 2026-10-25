package org.telegram.messenger;

import org.telegram.ui.un;
import org.webrtc.TextureViewRenderer;
public final class cf implements Runnable {
    public final int f19828a;
    public final int f19829b;
    public final int f19830c;
    public final int d;
    public final int e;
    public final Object f19831f;

    public cf(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f19828a = i14;
        this.f19831f = obj;
        this.f19829b = i10;
        this.f19830c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f19828a) {
            case 0:
                ((MessagesStorage) this.f19831f).lambda$saveDiffParams$35(this.f19829b, this.f19830c, this.d, this.e);
                return;
            case 1:
                un.G0((un) this.f19831f, this.f19829b, this.f19830c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f19831f, this.f19829b, this.f19830c, this.d, this.e);
                return;
        }
    }
}
