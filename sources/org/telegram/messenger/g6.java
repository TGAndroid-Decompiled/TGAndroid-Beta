package org.telegram.messenger;
public final class g6 implements Runnable {
    public final int f17293a;
    public final MediaController f17294b;
    public final boolean f17295c;

    public g6(MediaController mediaController, boolean z10, int i10) {
        this.f17293a = i10;
        this.f17294b = mediaController;
        this.f17295c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17293a) {
            case 0:
                this.f17294b.lambda$toggleRecordingPause$29(this.f17295c);
                return;
            default:
                this.f17294b.lambda$toggleRecordingPause$33(this.f17295c);
                return;
        }
    }
}
