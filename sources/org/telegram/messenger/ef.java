package org.telegram.messenger;

import org.telegram.ui.rn;
import org.webrtc.TextureViewRenderer;

public final class ef implements Runnable {

    public final int f20155a;

    public final int f20156b;

    public final int f20157c;
    public final int d;

    public final int f20158e;

    public final Object f20159f;

    public ef(Object obj, int i10, int i11, int i12, int i13, int i14) {
        this.f20155a = i14;
        this.f20159f = obj;
        this.f20156b = i10;
        this.f20157c = i11;
        this.d = i12;
        this.f20158e = i13;
    }

    @Override
    public final void run() {
        switch (this.f20155a) {
            case 0:
                ((MessagesStorage) this.f20159f).lambda$saveDiffParams$35(this.f20156b, this.f20157c, this.d, this.f20158e);
                break;
            case 1:
                rn.r1((rn) this.f20159f, this.f20156b, this.f20157c, this.d, this.f20158e);
                break;
            default:
                ((TextureViewRenderer) this.f20159f).lambda$onFrameResolutionChanged$0(this.f20156b, this.f20157c, this.d, this.f20158e);
                break;
        }
    }
}
