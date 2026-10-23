package org.telegram.messenger;
public final class r6 implements Runnable {
    public final int f19383a;
    public final MediaController f19384b;
    public final boolean f19385c;

    public r6(MediaController mediaController, boolean z10, int i10) {
        this.f19383a = i10;
        this.f19384b = mediaController;
        this.f19385c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19383a) {
            case 0:
                this.f19384b.lambda$toggleRecordingPause$30(this.f19385c);
                return;
            default:
                this.f19384b.lambda$toggleRecordingPause$34(this.f19385c);
                return;
        }
    }
}
