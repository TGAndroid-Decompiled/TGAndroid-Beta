package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f16931a;
    public final Camera2Session f16932b;
    public final Runnable f16933c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f16931a = i10;
        this.f16932b = camera2Session;
        this.f16933c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16931a) {
            case 0:
                this.f16932b.lambda$destroy$4(this.f16933c);
                return;
            default:
                this.f16932b.lambda$destroy$3(this.f16933c);
                return;
        }
    }
}
