package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f16071a;
    public final Camera2Session.AnonymousClass2 f16072b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f16071a = i10;
        this.f16072b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f16071a) {
            case 0:
                this.f16072b.lambda$onConfigured$0();
                return;
            default:
                this.f16072b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
