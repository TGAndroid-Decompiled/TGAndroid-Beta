package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f23406a;
    public final Camera2Session.AnonymousClass2 f23407b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i7) {
        this.f23406a = i7;
        this.f23407b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f23406a) {
            case 0:
                this.f23407b.lambda$onConfigured$0();
                return;
            default:
                this.f23407b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
