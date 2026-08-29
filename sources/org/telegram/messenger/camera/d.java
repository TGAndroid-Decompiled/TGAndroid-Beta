package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f19898a;
    public final Camera2Session.AnonymousClass2 f19899b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f19898a = i10;
        this.f19899b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f19898a) {
            case 0:
                this.f19899b.lambda$onConfigured$0();
                return;
            default:
                this.f19899b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
