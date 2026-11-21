package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f23315a;
    public final Camera2Session.AnonymousClass2 f23316b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i7) {
        this.f23315a = i7;
        this.f23316b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f23315a) {
            case 0:
                this.f23316b.lambda$onConfigured$0();
                return;
            default:
                this.f23316b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
