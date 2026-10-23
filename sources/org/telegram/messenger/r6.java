package org.telegram.messenger;
public final class r6 implements Runnable {
    public final int f19452a;
    public final MediaController f19453b;
    public final boolean f19454c;

    public r6(MediaController mediaController, boolean z10, int i10) {
        this.f19452a = i10;
        this.f19453b = mediaController;
        this.f19454c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19452a) {
            case 0:
                this.f19453b.lambda$toggleRecordingPause$30(this.f19454c);
                return;
            default:
                this.f19453b.lambda$toggleRecordingPause$34(this.f19454c);
                return;
        }
    }
}
