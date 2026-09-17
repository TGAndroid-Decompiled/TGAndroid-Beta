package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f17382a;
    public final Camera2Session.AnonymousClass2 f17383b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f17382a = i10;
        this.f17383b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f17382a) {
            case 0:
                this.f17383b.lambda$onConfigured$0();
                return;
            default:
                this.f17383b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
