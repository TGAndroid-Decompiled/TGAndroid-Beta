package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f18055a;
    public final Camera2Session.AnonymousClass2 f18056b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f18055a = i10;
        this.f18056b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f18055a) {
            case 0:
                this.f18056b.lambda$onConfigured$0();
                return;
            default:
                this.f18056b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
