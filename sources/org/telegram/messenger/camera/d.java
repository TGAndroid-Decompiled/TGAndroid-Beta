package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f17337a;
    public final Camera2Session.AnonymousClass2 f17338b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f17337a = i10;
        this.f17338b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f17337a) {
            case 0:
                this.f17338b.lambda$onConfigured$0();
                return;
            default:
                this.f17338b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
