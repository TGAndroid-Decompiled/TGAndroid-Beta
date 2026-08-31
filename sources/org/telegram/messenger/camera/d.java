package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f18358a;
    public final Camera2Session.AnonymousClass2 f18359b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f18358a = i10;
        this.f18359b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f18358a) {
            case 0:
                this.f18359b.lambda$onConfigured$0();
                return;
            default:
                this.f18359b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
