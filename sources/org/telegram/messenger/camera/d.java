package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f17523a;
    public final Camera2Session.AnonymousClass2 f17524b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f17523a = i10;
        this.f17524b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f17523a) {
            case 0:
                this.f17524b.lambda$onConfigured$0();
                return;
            default:
                this.f17524b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
