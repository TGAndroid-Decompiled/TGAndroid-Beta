package org.telegram.messenger;
public final class o6 implements Runnable {
    public final int f19532a;
    public final MediaController f19533b;
    public final boolean f19534c;

    public o6(MediaController mediaController, boolean z4, int i10) {
        this.f19532a = i10;
        this.f19533b = mediaController;
        this.f19534c = z4;
    }

    @Override
    public final void run() {
        switch (this.f19532a) {
            case 0:
                this.f19533b.lambda$toggleRecordingPause$28(this.f19534c);
                return;
            default:
                this.f19533b.lambda$toggleRecordingPause$32(this.f19534c);
                return;
        }
    }
}
