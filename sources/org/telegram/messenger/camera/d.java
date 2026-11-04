package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;
public final class d implements Runnable {
    public final int f21961a;
    public final Camera2Session.AnonymousClass2 f21962b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i3) {
        this.f21961a = i3;
        this.f21962b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f21961a) {
            case 0:
                Camera2Session.AnonymousClass2.b(this.f21962b);
                return;
            default:
                Camera2Session.AnonymousClass2.a(this.f21962b);
                return;
        }
    }
}
