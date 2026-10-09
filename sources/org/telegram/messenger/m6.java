package org.telegram.messenger;
public final class m6 implements Runnable {
    public final int f18492a;
    public final MediaController f18493b;
    public final boolean f18494c;

    public m6(MediaController mediaController, boolean z10, int i10) {
        this.f18492a = i10;
        this.f18493b = mediaController;
        this.f18494c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18492a) {
            case 0:
                this.f18493b.lambda$toggleRecordingPause$28(this.f18494c);
                return;
            default:
                this.f18493b.lambda$toggleRecordingPause$32(this.f18494c);
                return;
        }
    }
}
