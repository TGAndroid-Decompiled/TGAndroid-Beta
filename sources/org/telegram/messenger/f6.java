package org.telegram.messenger;
public final class f6 implements Runnable {
    public final int f18351a;
    public final MediaController f18352b;
    public final boolean f18353c;

    public f6(MediaController mediaController, boolean z10, int i10) {
        this.f18351a = i10;
        this.f18352b = mediaController;
        this.f18353c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18351a) {
            case 0:
                this.f18352b.lambda$toggleRecordingPause$29(this.f18353c);
                return;
            default:
                this.f18352b.lambda$toggleRecordingPause$33(this.f18353c);
                return;
        }
    }
}
