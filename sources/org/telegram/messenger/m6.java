package org.telegram.messenger;
public final class m6 implements Runnable {
    public final int f18496a;
    public final MediaController f18497b;
    public final boolean f18498c;

    public m6(MediaController mediaController, boolean z10, int i10) {
        this.f18496a = i10;
        this.f18497b = mediaController;
        this.f18498c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18496a) {
            case 0:
                this.f18497b.lambda$toggleRecordingPause$28(this.f18498c);
                return;
            default:
                this.f18497b.lambda$toggleRecordingPause$32(this.f18498c);
                return;
        }
    }
}
