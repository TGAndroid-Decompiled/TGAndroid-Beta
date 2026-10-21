package org.telegram.messenger;
public final class h6 implements Runnable {
    public final int f18511a;
    public final MediaController f18512b;
    public final boolean f18513c;

    public h6(MediaController mediaController, boolean z10, int i10) {
        this.f18511a = i10;
        this.f18512b = mediaController;
        this.f18513c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18511a) {
            case 0:
                this.f18512b.lambda$toggleRecordingPause$29(this.f18513c);
                return;
            default:
                this.f18512b.lambda$toggleRecordingPause$33(this.f18513c);
                return;
        }
    }
}
