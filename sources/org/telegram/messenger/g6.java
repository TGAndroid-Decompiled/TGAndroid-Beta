package org.telegram.messenger;
public final class g6 implements Runnable {
    public final int f17654a;
    public final MediaController f17655b;
    public final boolean f17656c;

    public g6(MediaController mediaController, boolean z10, int i10) {
        this.f17654a = i10;
        this.f17655b = mediaController;
        this.f17656c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17654a) {
            case 0:
                this.f17655b.lambda$toggleRecordingPause$29(this.f17656c);
                return;
            default:
                this.f17655b.lambda$toggleRecordingPause$33(this.f17656c);
                return;
        }
    }
}
