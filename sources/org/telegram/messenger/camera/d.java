package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f23287a;
    public final Camera2Session.AnonymousClass2 f23288b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i7) {
        this.f23287a = i7;
        this.f23288b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f23287a) {
            case 0:
                this.f23288b.lambda$onConfigured$0();
                return;
            default:
                this.f23288b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
