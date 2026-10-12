package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f16959a;
    public final Camera2Session.AnonymousClass2 f16960b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f16959a = i10;
        this.f16960b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f16959a) {
            case 0:
                this.f16960b.lambda$onConfigured$0();
                return;
            default:
                this.f16960b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
