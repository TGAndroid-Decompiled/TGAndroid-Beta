package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f16921a;
    public final Camera2Session.AnonymousClass2 f16922b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f16921a = i10;
        this.f16922b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f16921a) {
            case 0:
                this.f16922b.lambda$onConfigured$0();
                return;
            default:
                this.f16922b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
