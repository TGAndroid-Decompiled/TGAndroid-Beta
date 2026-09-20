package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f16059a;
    public final Camera2Session.AnonymousClass2 f16060b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f16059a = i10;
        this.f16060b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f16059a) {
            case 0:
                this.f16060b.lambda$onConfigured$0();
                return;
            default:
                this.f16060b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
