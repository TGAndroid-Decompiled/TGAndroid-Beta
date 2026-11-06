package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f21758a;
    public final Camera2Session.AnonymousClass2 f21759b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i7) {
        this.f21758a = i7;
        this.f21759b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f21758a) {
            case 0:
                this.f21759b.lambda$onConfigured$0();
                return;
            default:
                this.f21759b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
