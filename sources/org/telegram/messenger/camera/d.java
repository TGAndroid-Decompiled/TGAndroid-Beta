package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f18111a;
    public final Camera2Session.AnonymousClass2 f18112b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f18111a = i10;
        this.f18112b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f18111a) {
            case 0:
                this.f18112b.lambda$onConfigured$0();
                return;
            default:
                this.f18112b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
