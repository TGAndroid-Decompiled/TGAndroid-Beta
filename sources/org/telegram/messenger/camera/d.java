package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f18046a;
    public final Camera2Session.AnonymousClass2 f18047b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f18046a = i10;
        this.f18047b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f18046a) {
            case 0:
                this.f18047b.lambda$onConfigured$0();
                return;
            default:
                this.f18047b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
