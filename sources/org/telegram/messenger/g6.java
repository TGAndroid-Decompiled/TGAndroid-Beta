package org.telegram.messenger;
public final class g6 implements Runnable {
    public final int f16989a;
    public final MediaController f16990b;
    public final boolean f16991c;

    public g6(MediaController mediaController, boolean z10, int i10) {
        this.f16989a = i10;
        this.f16990b = mediaController;
        this.f16991c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16989a) {
            case 0:
                this.f16990b.lambda$toggleRecordingPause$29(this.f16991c);
                return;
            default:
                this.f16990b.lambda$toggleRecordingPause$33(this.f16991c);
                return;
        }
    }
}
