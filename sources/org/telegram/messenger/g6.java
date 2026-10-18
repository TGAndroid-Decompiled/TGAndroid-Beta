package org.telegram.messenger;
public final class g6 implements Runnable {
    public final int f18424a;
    public final MediaController f18425b;
    public final boolean f18426c;

    public g6(MediaController mediaController, boolean z10, int i10) {
        this.f18424a = i10;
        this.f18425b = mediaController;
        this.f18426c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18424a) {
            case 0:
                this.f18425b.lambda$toggleRecordingPause$29(this.f18426c);
                return;
            default:
                this.f18425b.lambda$toggleRecordingPause$33(this.f18426c);
                return;
        }
    }
}
