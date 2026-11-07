package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f21764a;
    public final Camera2Session.AnonymousClass2 f21765b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i7) {
        this.f21764a = i7;
        this.f21765b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f21764a) {
            case 0:
                Camera2Session.AnonymousClass2.b(this.f21765b);
                return;
            default:
                Camera2Session.AnonymousClass2.a(this.f21765b);
                return;
        }
    }
}
