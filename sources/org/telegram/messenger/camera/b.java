package org.telegram.messenger.camera;
public final class b implements Runnable {
    public final int f16076a;
    public final Camera2Session f16077b;
    public final Runnable f16078c;

    public b(Camera2Session camera2Session, Runnable runnable, int i10) {
        this.f16076a = i10;
        this.f16077b = camera2Session;
        this.f16078c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16076a) {
            case 0:
                this.f16077b.lambda$destroy$4(this.f16078c);
                return;
            default:
                this.f16077b.lambda$destroy$3(this.f16078c);
                return;
        }
    }
}
