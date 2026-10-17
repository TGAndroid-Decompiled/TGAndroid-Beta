package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f18040a;
    public final Camera2Session.AnonymousClass2 f18041b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f18040a = i10;
        this.f18041b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f18040a) {
            case 0:
                this.f18041b.lambda$onConfigured$0();
                return;
            default:
                this.f18041b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
