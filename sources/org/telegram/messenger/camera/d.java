package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f16086a;
    public final Camera2Session.AnonymousClass2 f16087b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f16086a = i10;
        this.f16087b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f16086a) {
            case 0:
                this.f16087b.lambda$onConfigured$0();
                return;
            default:
                this.f16087b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
