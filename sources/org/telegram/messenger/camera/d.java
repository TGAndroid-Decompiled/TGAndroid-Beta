package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f23220a;
    public final Camera2Session.AnonymousClass2 f23221b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i7) {
        this.f23220a = i7;
        this.f23221b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f23220a) {
            case 0:
                this.f23221b.lambda$onConfigured$0();
                return;
            default:
                this.f23221b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
