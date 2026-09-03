package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f18360a;
    public final Camera2Session.AnonymousClass2 f18361b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f18360a = i10;
        this.f18361b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f18360a) {
            case 0:
                this.f18361b.lambda$onConfigured$0();
                return;
            default:
                this.f18361b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
