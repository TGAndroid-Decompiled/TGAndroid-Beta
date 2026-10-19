package org.telegram.messenger;
public final class f6 implements Runnable {
    public final int f18348a;
    public final MediaController f18349b;
    public final boolean f18350c;

    public f6(MediaController mediaController, boolean z10, int i10) {
        this.f18348a = i10;
        this.f18349b = mediaController;
        this.f18350c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18348a) {
            case 0:
                this.f18349b.lambda$toggleRecordingPause$29(this.f18350c);
                return;
            default:
                this.f18349b.lambda$toggleRecordingPause$33(this.f18350c);
                return;
        }
    }
}
