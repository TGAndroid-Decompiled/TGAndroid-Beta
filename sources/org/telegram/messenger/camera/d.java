package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f23256a;
    public final Camera2Session.AnonymousClass2 f23257b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i7) {
        this.f23256a = i7;
        this.f23257b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f23256a) {
            case 0:
                this.f23257b.lambda$onConfigured$0();
                return;
            default:
                this.f23257b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
