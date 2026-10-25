package org.telegram.messenger;
public final class t6 implements Runnable {
    public final int f21300a;
    public final MediaController f21301b;
    public final boolean f21302c;

    public t6(MediaController mediaController, boolean z10, int i10) {
        this.f21300a = i10;
        this.f21301b = mediaController;
        this.f21302c = z10;
    }

    @Override
    public final void run() {
        switch (this.f21300a) {
            case 0:
                this.f21301b.lambda$toggleRecordingPause$30(this.f21302c);
                return;
            default:
                this.f21301b.lambda$toggleRecordingPause$34(this.f21302c);
                return;
        }
    }
}
