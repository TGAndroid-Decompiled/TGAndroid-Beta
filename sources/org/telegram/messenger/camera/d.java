package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f15847a;
    public final Camera2Session.AnonymousClass2 f15848b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f15847a = i10;
        this.f15848b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f15847a) {
            case 0:
                this.f15848b.lambda$onConfigured$0();
                return;
            default:
                this.f15848b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
