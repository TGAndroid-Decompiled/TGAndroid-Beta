package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f15097a;
    public final Camera2Session.AnonymousClass2 f15098b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f15097a = i10;
        this.f15098b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f15097a) {
            case 0:
                Camera2Session.AnonymousClass2.b(this.f15098b);
                return;
            default:
                Camera2Session.AnonymousClass2.a(this.f15098b);
                return;
        }
    }
}
