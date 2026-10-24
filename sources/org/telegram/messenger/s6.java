package org.telegram.messenger;
public final class s6 implements Runnable {
    public final int f19526a;
    public final MediaController f19527b;
    public final boolean f19528c;

    public s6(MediaController mediaController, boolean z10, int i10) {
        this.f19526a = i10;
        this.f19527b = mediaController;
        this.f19528c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19526a) {
            case 0:
                this.f19527b.lambda$toggleRecordingPause$30(this.f19528c);
                return;
            default:
                this.f19527b.lambda$toggleRecordingPause$34(this.f19528c);
                return;
        }
    }
}
