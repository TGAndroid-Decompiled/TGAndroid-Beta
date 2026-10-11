package org.telegram.messenger;
public final class m6 implements Runnable {
    public final int f18530a;
    public final MediaController f18531b;
    public final boolean f18532c;

    public m6(MediaController mediaController, boolean z10, int i10) {
        this.f18530a = i10;
        this.f18531b = mediaController;
        this.f18532c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18530a) {
            case 0:
                this.f18531b.lambda$toggleRecordingPause$28(this.f18532c);
                return;
            default:
                this.f18531b.lambda$toggleRecordingPause$32(this.f18532c);
                return;
        }
    }
}
