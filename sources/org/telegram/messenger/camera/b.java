package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f19778a;
    public final Camera2Session f19779b;
    public final Runnable f19780c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f19778a = i10;
        this.f19779b = camera2Session;
        this.f19780c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19778a) {
            case 0:
                this.f19779b.lambda$destroy$4(this.f19780c);
                return;
            default:
                this.f19779b.lambda$destroy$3(this.f19780c);
                return;
        }
    }
}
