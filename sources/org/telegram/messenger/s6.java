package org.telegram.messenger;
public final class s6 implements Runnable {
    public final int f19457a;
    public final MediaController f19458b;
    public final boolean f19459c;

    public s6(MediaController mediaController, boolean z10, int i10) {
        this.f19457a = i10;
        this.f19458b = mediaController;
        this.f19459c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19457a) {
            case 0:
                this.f19458b.lambda$toggleRecordingPause$30(this.f19459c);
                return;
            default:
                this.f19458b.lambda$toggleRecordingPause$34(this.f19459c);
                return;
        }
    }
}
