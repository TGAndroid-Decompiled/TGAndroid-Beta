package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f21804a;
    public final Camera2Session.AnonymousClass2 f21805b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i7) {
        this.f21804a = i7;
        this.f21805b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f21804a) {
            case 0:
                Camera2Session.AnonymousClass2.b(this.f21805b);
                return;
            default:
                Camera2Session.AnonymousClass2.a(this.f21805b);
                return;
        }
    }
}
