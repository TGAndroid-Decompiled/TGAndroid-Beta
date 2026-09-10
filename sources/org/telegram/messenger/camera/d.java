package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f14870a;
    public final Camera2Session.AnonymousClass2 f14871b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f14870a = i10;
        this.f14871b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f14870a) {
            case 0:
                this.f14871b.lambda$onConfigured$0();
                return;
            default:
                this.f14871b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
