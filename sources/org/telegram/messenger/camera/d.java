package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f22823a;
    public final Camera2Session.AnonymousClass2 f22824b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i7) {
        this.f22823a = i7;
        this.f22824b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f22823a) {
            case 0:
                this.f22824b.lambda$onConfigured$0();
                return;
            default:
                this.f22824b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
