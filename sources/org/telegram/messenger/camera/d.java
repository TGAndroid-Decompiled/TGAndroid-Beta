package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f19942a;
    public final Camera2Session.AnonymousClass2 f19943b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i9) {
        this.f19942a = i9;
        this.f19943b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f19942a) {
            case 0:
                this.f19943b.lambda$onConfigured$0();
                return;
            default:
                this.f19943b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
