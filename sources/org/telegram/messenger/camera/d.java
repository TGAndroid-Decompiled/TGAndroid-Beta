package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f16097a;
    public final Camera2Session.AnonymousClass2 f16098b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f16097a = i10;
        this.f16098b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f16097a) {
            case 0:
                this.f16098b.lambda$onConfigured$0();
                return;
            default:
                this.f16098b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
