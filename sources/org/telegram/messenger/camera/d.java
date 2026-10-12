package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f17266a;
    public final Camera2Session.AnonymousClass2 f17267b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f17266a = i10;
        this.f17267b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f17266a) {
            case 0:
                this.f17267b.lambda$onConfigured$0();
                return;
            default:
                this.f17267b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
