package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f18106a;
    public final Camera2Session.AnonymousClass2 f18107b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f18106a = i10;
        this.f18107b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f18106a) {
            case 0:
                this.f18107b.lambda$onConfigured$0();
                return;
            default:
                this.f18107b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
