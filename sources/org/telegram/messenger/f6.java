package org.telegram.messenger;
public final class f6 implements Runnable {
    public final int f18343a;
    public final MediaController f18344b;
    public final boolean f18345c;

    public f6(MediaController mediaController, boolean z10, int i10) {
        this.f18343a = i10;
        this.f18344b = mediaController;
        this.f18345c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18343a) {
            case 0:
                this.f18344b.lambda$toggleRecordingPause$29(this.f18345c);
                return;
            default:
                this.f18344b.lambda$toggleRecordingPause$33(this.f18345c);
                return;
        }
    }
}
