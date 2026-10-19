package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f18045a;
    public final Camera2Session.AnonymousClass2 f18046b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f18045a = i10;
        this.f18046b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f18045a) {
            case 0:
                this.f18046b.lambda$onConfigured$0();
                return;
            default:
                this.f18046b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
