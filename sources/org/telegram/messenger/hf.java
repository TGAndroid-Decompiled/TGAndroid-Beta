package org.telegram.messenger;

import org.telegram.ui.tn;
import org.webrtc.TextureViewRenderer;
public final class hf implements Runnable {
    public final int f20459a;
    public final int f20460b;
    public final int f20461c;
    public final int d;
    public final int f20462e;
    public final Object f20463f;

    public hf(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f20459a = i14;
        this.f20463f = obj;
        this.f20460b = i10;
        this.f20461c = i11;
        this.d = i12;
        this.f20462e = i13;
    }

    @Override
    public final void run() {
        switch (this.f20459a) {
            case 0:
                ((MessagesStorage) this.f20463f).lambda$saveDiffParams$35(this.f20460b, this.f20461c, this.d, this.f20462e);
                return;
            case 1:
                tn.r1((tn) this.f20463f, this.f20460b, this.f20461c, this.d, this.f20462e);
                return;
            default:
                TextureViewRenderer.a((TextureViewRenderer) this.f20463f, this.f20460b, this.f20461c, this.d, this.f20462e);
                return;
        }
    }
}
