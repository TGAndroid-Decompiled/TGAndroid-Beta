package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f23290a;
    public final Camera2Session.AnonymousClass2 f23291b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i7) {
        this.f23290a = i7;
        this.f23291b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f23290a) {
            case 0:
                Camera2Session.AnonymousClass2.b(this.f23291b);
                return;
            default:
                Camera2Session.AnonymousClass2.a(this.f23291b);
                return;
        }
    }
}
