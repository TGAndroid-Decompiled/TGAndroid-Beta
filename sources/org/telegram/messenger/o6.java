package org.telegram.messenger;
public final class o6 implements Runnable {
    public final int f19530a;
    public final MediaController f19531b;
    public final boolean f19532c;

    public o6(MediaController mediaController, boolean z4, int i10) {
        this.f19530a = i10;
        this.f19531b = mediaController;
        this.f19532c = z4;
    }

    @Override
    public final void run() {
        switch (this.f19530a) {
            case 0:
                this.f19531b.lambda$toggleRecordingPause$28(this.f19532c);
                return;
            default:
                this.f19531b.lambda$toggleRecordingPause$32(this.f19532c);
                return;
        }
    }
}
