package org.telegram.messenger;
public final class g6 implements Runnable {
    public final int f18427a;
    public final MediaController f18428b;
    public final boolean f18429c;

    public g6(MediaController mediaController, boolean z10, int i10) {
        this.f18427a = i10;
        this.f18428b = mediaController;
        this.f18429c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18427a) {
            case 0:
                this.f18428b.lambda$toggleRecordingPause$29(this.f18429c);
                return;
            default:
                this.f18428b.lambda$toggleRecordingPause$33(this.f18429c);
                return;
        }
    }
}
