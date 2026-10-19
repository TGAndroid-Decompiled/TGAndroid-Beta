package org.telegram.messenger;

import org.telegram.ui.qn;
import org.webrtc.TextureViewRenderer;
public final class df implements Runnable {
    public final int f18190a;
    public final int f18191b;
    public final int f18192c;
    public final int d;
    public final int e;
    public final Object f18193f;

    public df(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f18190a = i14;
        this.f18193f = obj;
        this.f18191b = i10;
        this.f18192c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void run() {
        switch (this.f18190a) {
            case 0:
                ((MessagesStorage) this.f18193f).lambda$saveDiffParams$35(this.f18191b, this.f18192c, this.d, this.e);
                return;
            case 1:
                qn.w1((qn) this.f18193f, this.f18191b, this.f18192c, this.d, this.e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f18193f, this.f18191b, this.f18192c, this.d, this.e);
                return;
        }
    }
}
