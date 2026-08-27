package org.telegram.messenger.camera;

public final class a implements Runnable {

    public final int f19903a;

    public final Camera2Session f19904b;

    public a(Camera2Session camera2Session, int i10) {
        this.f19903a = i10;
        this.f19904b = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.f19903a) {
            case 0:
                this.f19904b.lambda$new$0();
                break;
            default:
                this.f19904b.lambda$checkOpen$2();
                break;
        }
    }
}
