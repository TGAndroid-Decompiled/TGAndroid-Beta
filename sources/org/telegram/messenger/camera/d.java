package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f15834a;
    public final Camera2Session.AnonymousClass2 f15835b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f15834a = i10;
        this.f15835b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f15834a) {
            case 0:
                this.f15835b.lambda$onConfigured$0();
                return;
            default:
                this.f15835b.lambda$onConfigureFailed$1();
                return;
        }
    }
}
