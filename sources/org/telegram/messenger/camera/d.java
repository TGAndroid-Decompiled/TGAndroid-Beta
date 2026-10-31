package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f14933a;
    public final Camera2Session.AnonymousClass2 f14934b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f14933a = i10;
        this.f14934b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f14933a) {
            case 0:
                this.f14934b.lambda$onConfigured$0();
                return;
            default:
                this.f14934b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
