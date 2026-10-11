package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f17557a;
    public final Camera2Session.AnonymousClass2 f17558b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f17557a = i10;
        this.f17558b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f17557a) {
            case 0:
                this.f17558b.lambda$onConfigured$0();
                return;
            default:
                this.f17558b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
