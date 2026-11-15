package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f22819a;
    public final Camera2Session.AnonymousClass2 f22820b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i7) {
        this.f22819a = i7;
        this.f22820b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f22819a) {
            case 0:
                this.f22820b.lambda$onConfigured$0();
                return;
            default:
                this.f22820b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
