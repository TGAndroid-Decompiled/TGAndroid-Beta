package org.telegram.messenger;
public final class u6 implements Runnable {
    public final int f21381a;
    public final MediaController f21382b;
    public final boolean f21383c;

    public u6(MediaController mediaController, boolean z10, int i10) {
        this.f21381a = i10;
        this.f21382b = mediaController;
        this.f21383c = z10;
    }

    @Override
    public final void run() {
        switch (this.f21381a) {
            case 0:
                this.f21382b.lambda$toggleRecordingPause$30(this.f21383c);
                return;
            default:
                this.f21382b.lambda$toggleRecordingPause$34(this.f21383c);
                return;
        }
    }
}
