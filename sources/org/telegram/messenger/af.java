package org.telegram.messenger;

import org.telegram.ui.qn;
import org.webrtc.TextureViewRenderer;
public final class af implements Runnable {
    public final int f19737a;
    public final int f19738b;
    public final int f19739c;
    public final int d;
    public final int f19740e;
    public final Object f19741f;

    public af(Object obj, int i9, int i10, int i11, int i12, int i13) {
        this.f19737a = i13;
        this.f19741f = obj;
        this.f19738b = i9;
        this.f19739c = i10;
        this.d = i11;
        this.f19740e = i12;
    }

    @Override
    public final void run() {
        switch (this.f19737a) {
            case 0:
                MessagesStorage.I((MessagesStorage) this.f19741f, this.f19738b, this.f19739c, this.d, this.f19740e);
                return;
            case 1:
                qn.r1((qn) this.f19741f, this.f19738b, this.f19739c, this.d, this.f19740e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f19741f, this.f19738b, this.f19739c, this.d, this.f19740e);
                return;
        }
    }
}
