package org.telegram.messenger;
public final class o6 implements Runnable {
    public final int f17991a;
    public final MediaController f17992b;
    public final boolean f17993c;

    public o6(MediaController mediaController, boolean z4, int i10) {
        this.f17991a = i10;
        this.f17992b = mediaController;
        this.f17993c = z4;
    }

    @Override
    public final void run() {
        switch (this.f17991a) {
            case 0:
                this.f17992b.lambda$toggleRecordingPause$28(this.f17993c);
                return;
            default:
                this.f17992b.lambda$toggleRecordingPause$32(this.f17993c);
                return;
        }
    }
}
