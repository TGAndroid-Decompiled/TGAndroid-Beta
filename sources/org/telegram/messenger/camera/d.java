package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f17267a;
    public final Camera2Session.AnonymousClass2 f17268b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f17267a = i10;
        this.f17268b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f17267a) {
            case 0:
                this.f17268b.lambda$onConfigured$0();
                return;
            default:
                this.f17268b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
