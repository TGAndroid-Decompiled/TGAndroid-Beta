package org.telegram.messenger;
public final class n6 implements Runnable {
    public final int f21030a;
    public final MediaController f21031b;
    public final boolean f21032c;

    public n6(MediaController mediaController, boolean z10, int i10) {
        this.f21030a = i10;
        this.f21031b = mediaController;
        this.f21032c = z10;
    }

    @Override
    public final void run() {
        switch (this.f21030a) {
            case 0:
                this.f21031b.lambda$toggleRecordingPause$28(this.f21032c);
                return;
            default:
                this.f21031b.lambda$toggleRecordingPause$32(this.f21032c);
                return;
        }
    }
}
