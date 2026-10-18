package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f18042a;
    public final Camera2Session.AnonymousClass2 f18043b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f18042a = i10;
        this.f18043b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f18042a) {
            case 0:
                this.f18043b.lambda$onConfigured$0();
                return;
            default:
                this.f18043b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
