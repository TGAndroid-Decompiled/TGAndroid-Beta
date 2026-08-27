package org.telegram.messenger.camera;

public final class d implements Runnable {

    public final int f19910a;

    public final Camera2Session.AnonymousClass2 f19911b;

    public d(Camera2Session.AnonymousClass2 anonymousClass2, int i10) {
        this.f19910a = i10;
        this.f19911b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f19910a) {
            case 0:
                this.f19911b.lambda$onConfigured$0();
                break;
            default:
                this.f19911b.lambda$onConfigureFailed$1();
                break;
        }
    }
}
