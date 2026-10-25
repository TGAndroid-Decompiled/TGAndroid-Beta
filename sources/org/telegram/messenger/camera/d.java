package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f19783a;
    public final Camera2Session.AnonymousClass2 f19784b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f19783a = i10;
        this.f19784b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f19783a) {
            case 0:
                this.f19784b.lambda$onConfigured$0();
                return;
            default:
                this.f19784b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
