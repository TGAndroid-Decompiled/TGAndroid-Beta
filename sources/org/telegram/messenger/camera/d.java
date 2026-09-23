package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f15828a;
    public final Camera2Session.AnonymousClass2 f15829b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f15828a = i10;
        this.f15829b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f15828a) {
            case 0:
                this.f15829b.lambda$onConfigured$0();
                return;
            default:
                this.f15829b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
